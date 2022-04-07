package com.test.java.question.file;

import java.io.File;

public class Q04 {

	public static void main(String[] args) {
		
		//요구사항 : 음악 파일이 100개 있다. 파일명 앞에 일련 번호를 붙이시오.
		//조건
		//- '001'부터 3자리 형식으로 붙이시오.
		
		File file = new File("C:\\class\\파일_디렉토리_문제\\음악 파일\\Music");
		
		//파일 리스트 받아오기
		File[] list = file.listFiles();
		
		//for문으로 이름 변경하기
		int num = 1;
		for(File f : list) {
			String change = String.format("[%03d]", num++);
			File file2 = new File("C:\\class\\파일_디렉토리_문제\\음악 파일\\Music\\" + change + f.getName());
			f.renameTo(file2);
		}
		
	}
}
