package com.test.java.question.file;

import java.io.File;
import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		
		//요구사항 : 지정한 폴더의 특정 파일(확장자)만을 출력하시오.
		//조건
		//- 확장자 대소문자 구분없이 검색 가능
		
		//입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("폴더 : ");
		String path = sc.next();
		
		System.out.print("확장자 : ");
		String type = sc.next();
		
		sc.close();
		
		//객체 만들기
		File file = new File(path);
		
		//리스트 받아오기
		File[] list = file.listFiles();
		
		//for문으로 파일 중에서 확장자 명과 일치하는 친구 찾기
		for(File f : list) {
			if(f.isFile()) {
				int index = f.getName().lastIndexOf(type);
				if(index != -1) {
					System.out.println(f.getName());
				}
			}
		}
	}
}
