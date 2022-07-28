package com.test.spring;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Service
public class BoardServiceImpl implements BoardService {

	private BoardDAO dao;
	
	@Autowired
	public BoardServiceImpl(BoardDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public int write(HttpServletRequest req, String title) {
		
		//게시판 글쓰기
		int result = dao.add(title);
		
		//글 번호 받아오기
		int seq = dao.getSeq();
		
		
		MultipartHttpServletRequest multi = (MultipartHttpServletRequest)req;
		
		//파일이 복수로 넘어와도 첫번째 파일만 넘겨준다
		//MultipartFile file = multi.getFile("attachlist");
		//System.out.println(file.getOriginalFilename());
		
		List<MultipartFile> files = multi.getFiles("attachlist");
		String path = req.getRealPath("resources/files");
		
		//System.out.println(path);
		
		//List<FileDTO> flist = new ArrayList<FileDTO>();
		
		for(MultipartFile file : files) {			
			
			//System.out.println(file.getOriginalFilename());
			
			String filename = getFileName(path, file.getOriginalFilename());
			
			File tempfile = new File(path + "\\" + filename);
			
			try {
				file.transferTo(tempfile);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			FileDTO fdto = new FileDTO();
			
			fdto.setFilename(filename);
			fdto.setFilesize(file.getSize() + "");
			fdto.setMimetype(file.getContentType());
			fdto.setBseq(seq + "");
			
			dao.addFile(fdto);
			
			//flist.add(fdto);
		}
		return 0;
		
	}
	

	private String getFileName(String path, String filename) {
	
	//저장폴더의 파일명을 중복되지 않게 만들기
	//path = "resources/files/"
	//filename = "파일이름"
	
	int n = 1; //인덱싱 숫자
	int index = filename.lastIndexOf(".");
	
	String tempName = filename.substring(0, index); //파일이름
	String tempExt = filename.substring(index); //확장자
	
	while(true) {
		
		File file = new File(path + "\\" + filename); //files/파일이름.png
		
		if(file.exists()) {
			//있다. > 중복 > 파일 변경
			
			filename = tempName + "_" + n + tempExt; //파일이름_1.png
			n++;
					
		} else {
			//없다. > 파일명 사용 가능
			return filename;
		}
		
		}
	}
}
