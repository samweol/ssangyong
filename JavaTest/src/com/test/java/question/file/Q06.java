package com.test.java.question.file;

import java.io.File;

public class Q06 {

	public static void main(String[] args) {
		
		//요구사항 : 파일의 크기가 0byte인 파일만 삭제하시오.
		
		File file = new File("C:\\class\\파일_디렉토리_문제\\파일 제거");
		
		File[] list = file.listFiles();
		int count = 0;
		for(File f : list) {
			if(f.length() == 0) {
				f.delete();
				count++;
			}
		}
		
		System.out.printf("총 %d개의 파일을 삭제했습니다.", count);
				
	}
}
