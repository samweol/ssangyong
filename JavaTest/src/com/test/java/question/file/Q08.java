package com.test.java.question.file;

import java.io.File;

public class Q08 {

	private static int fileCount = 0;
	private static int dirCount = 0;
	
	public static void main(String[] args) {
		
		//요구사항 : 내용물이 있는 'delete'폴더를 삭제하시오.
		//조건
		//- 재귀 메소드 사용
		//- 삭제된 파일과 자식 폴더 개수를 출력하시오.
		
		File dir = new File("C:\\class\\파일_디렉토리_문제\\폴더 삭제\\delete");
		
		if(dir.exists()) {
			deleteFile(dir);
			System.out.println("폴더를 삭제했습니다.");
			System.out.printf("삭제된 폴더는 %d개이고, 파일은 %d개입니다.", dirCount, fileCount);
		}
	}

	private static void deleteFile(File dir) {
		
		//1. 파일 목록 가져오기
		File[] list = dir.listFiles();
		
		for(File subfile : list) {
			if(subfile.isFile()) {
				subfile.delete(); //파일이면 지우기
				fileCount++; //지운 파일 개수 카운팅
			}
		}
		
		for(File subdir : list) {
			if(subdir.isDirectory()) {
				dirCount++;
				deleteFile(subdir);
			}
		}
	}
}
