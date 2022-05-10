package com.test.java.question.file;

import java.io.File;

public class Q10 {

	public static void main(String[] args) {
		String path = "C:\\class\\파일_디렉토리_문제\\직원";
		File file = new File(path);
		
		if(file.exists()) {
			createDir(file);
			System.out.println("분류가 완료되었습니다.");
		}

	}

	public static void createDir(File file) {
		File[] list = file.listFiles();
		for(File f : list) {
			if(f.isFile()) {
				String[] tmp = f.getName().split("_");
				String dirPath = file + "\\" + tmp[0] + "\\" + tmp[1];
				File dir = new File(dirPath);
				dir.mkdirs();
				
				String filePath = dirPath + "\\" + f.getName();
				File moveFile = new File(filePath);
				f.renameTo(moveFile);
			}
		}//for
	}//createDir

}
