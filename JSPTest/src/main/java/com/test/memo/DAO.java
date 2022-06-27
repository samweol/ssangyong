package com.test.memo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

//*** DAO의 업무 메소드는 하나의 업무 메소드에서는 하나의 업무만 진행한다.
public class DAO {

	private Connection conn;
	private Statement stat;
	private PreparedStatement pstat;
	private ResultSet rs;
	
	//생성자에서 서버 연결 > 이게 편함, 이때 꼭 열어야하는 것은 아님
	public DAO() {
		
		conn = DBUtil.open();
	}

	//AddOk 라는 서블릿이 입력받은 데이터(dto)를 줄테니 insert 해주세요
	public int add(DTO dto) {
		
		try {
			String sql = "insert into tblMemo (seq, subject, content, name, pw, regdate) values (seqMemo.nextVal, ?, ?, ?, ?, default)";
			
			//반환값 없는 쿼리니까 pstat > 대신 변수를 설정해야하는 경우
			pstat = conn.prepareStatement(sql);
			
			pstat.setString(1, dto.getSubject());
			pstat.setString(2, dto.getContent());
			pstat.setString(3, dto.getName());
			pstat.setString(4, dto.getPw());
			
			//반영된 열의 갯수를 돌려준다.
			return pstat.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	//List 서블릿이 메모 목록 주세요
	public ArrayList<DTO> list() {
		try {
			String sql = "select * from tblMemo order by seq desc";
			
			//변수가 없으므로 pstat 가 아닌 stat 사용
			stat = conn.createStatement();
			
			//반환값이 있으니까 rs사용
			rs = stat.executeQuery(sql);
			
			//찾아온 데이터를 ArrayList에 넣을거임
			ArrayList<DTO> list = new ArrayList<DTO>();
			
			while(rs.next()) {
				//레코드 1줄 > DTO 1개
				DTO dto = new DTO();
				
				dto.setSeq(rs.getString("seq"));
				dto.setSubject(rs.getString("subject"));
				dto.setContent(rs.getString("content"));
				dto.setName(rs.getString("name"));
				dto.setRegdate(rs.getString("regdate"));
				
				//옮겨담기
				list.add(dto);
			}
			
			return list;
		} catch (Exception e) {
			System.out.println("DAO.list");
			e.printStackTrace();
		}
		return null;
	}

	//Edit 서블릿이 메모 번호를 줄테니 레코드 전체를 주세요
	public DTO get(String seq) {
		
		try {
			String sql= "select * from tblMemo where seq = ?";
			
			pstat =conn.prepareStatement(sql);
			
			pstat.setString(1, seq);
			
			//반환값이 있음
			rs = pstat.executeQuery();
			
			//값이 하나이기때문에 ArrayList가 아니라 DTO 하나를 반환
			DTO dto = new DTO();
			
			if(rs.next()) {
				dto.setSeq(rs.getString("seq"));
				dto.setSubject(rs.getString("subject"));
				dto.setContent(rs.getString("content"));
				dto.setName(rs.getString("name"));
				dto.setRegdate(rs.getString("regdate"));
				
				
			}
			
			return dto;
		} catch (Exception e) {
			System.out.println("DAO.get");
			e.printStackTrace();
		}
		return null;
	}

	//EditOk 서블릿에서 
	public int edit(DTO dto) {
		
		try {
			
			String sql = "update tblMemo set subject = ?, content =?, name=? where seq = ?";
			
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, dto.getSubject());
			pstat.setString(2, dto.getContent());
			pstat.setString(3, dto.getName());
			pstat.setString(4, dto.getSeq());
			
			return pstat.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("DAO.edit");
			e.printStackTrace();
		}
		return 0;
	}

	//EditOk 서블릿이 메모 번호와 입력 암호를 줄테니 이게 맞는건지 확인해주세요
	public boolean check(DTO dto) {
		
		try {
			
			String sql = "select count(*) as cnt from tblMemo where seq = ? and pw = ?";
			
			pstat = conn.prepareStatement(sql);
			
			pstat.setString(1, dto.getSeq());
			pstat.setString(2, dto.getPw());
			
			if(rs.next()) {
				return rs.getInt("cnt") == 1 ? true: false;
			}
			
		} catch (Exception e) {
			System.out.println("DAO.check");
			e.printStackTrace();
		}
		return false;
	}
}
