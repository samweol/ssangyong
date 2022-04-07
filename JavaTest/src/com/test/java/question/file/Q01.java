package com.test.java.question.file;

import java.io.File;
import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		
		//요구사항 : 파일의 경로를 입력받아 파일 정보를 출력하시오.
		//조건
		//- 파일 크기 단위 변환 출력(소수이하 1자리까지) : B, KB, MB, GB, TB
		
		Scanner sc = new Scanner(System.in);
		System.out.print("파일 경로 : ");
		String path = sc.next();
		sc.close();
		
		File file = new File(path);
		
		// 파일 이름
		String name = file.getName();
		
		// 파일 종류
		int index = name.lastIndexOf(".");
		String type = name.substring(index+1);
		
		// 파일 크기
		long size = file.length();
		String unit = "";
		
		// 단위
		if(size < 1024) {
			unit = "B";
		} else if (size >= 1024) {
			size = size / 1024;
			unit = "KB";
		} else if (size >= 1024*1024) {
			size = size / (1024*1024);
			unit = "MB";
		} else if(size >= 1024*1024*1024) {
			size = size / (1024*1024*1024);
			unit = "GB";
		} else if(size >= 1024*1024*1024*1024) {
			size = size / (1024*1024*1024*1024);
			unit = "TB";
		}
		
		// 출력
		System.out.printf("파일명 : %s\n", name);
		System.out.printf("종류 : %s 파일\n", type);
		System.out.printf("파일 크기 : %d%s\n", size, unit);

	}
}
