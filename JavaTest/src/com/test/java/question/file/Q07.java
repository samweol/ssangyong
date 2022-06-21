package com.test.java.question.file;

import java.io.File;

public class Q07 {

	public static void main(String[] args) {
		
		//요구사항 : MusicA폴더와 MusicB폴더를 서로 비교해서 양쪽 폴더에 모두 존재하는 파일만을 출력하시오.
		//조건
		//- 중복 파일을 찾아내시오.
		
		File file1 = new File("C:\\class\\파일_디렉토리_문제\\동일 파일\\MusicA");
		File file2 = new File("C:\\class\\파일_디렉토리_문제\\동일 파일\\MusicB");
		
		File[] list1 = file1.listFiles();
		File[] list2 = file2.listFiles();
		
		for(File f : list1) {
			for(File f2 : list2) {
				if(f.getName().equals(f2.getName())) {
					System.out.println(f.getName());
				}
				
			}
		}
	}
}
