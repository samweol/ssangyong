package com.test.java.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws Exception {
		
		// 요구사항 : 파일명 10개를 입력받아 각 확장자별로 총 개수를 출력하시오.
		// 조건 : 확장자는 다음으로 제한한다.
		// - mp3, jpg, java, hwp, doc
		/* 설계
		- 입력받기 (10번 받아야하므로 for문이나 while문 사용)
		- 뒤에서부터 찾아서 .의 위치 찾기 >lastIndexOf 활용
		- 그 위치부터 contains을 활용하여 문자가 있을 때마다 count 더하기
		- 출력하기		
		*/
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] file = new String[10]; // 입력받을 배열을 생성해서 안에 넣기
		
		// 변수 생성
		int mp3Count = 0;
		int jpgCount = 0;
		int javaCount = 0;
		int hwpCount = 0;
		int docCount = 0;
		
		for(int i=0; i<10; i++) { //10회
			System.out.print("파일명 : ");		
			file[i] = reader.readLine();
			
			// 확장자명 위치 찾기
			int index = file[i].lastIndexOf(".");
			String extension = file[i].substring(index);
//			System.out.println(extension);
			if(extension.equals(".mp3")) {
				mp3Count++;
			} else if(extension.equals(".jpg")) {
				jpgCount++;
			} else if(extension.equals(".java")) {
				javaCount++;
			} else if(extension.equals(".hwp")) {
				hwpCount++;
			} else if(extension.equals(".doc")) {
				docCount++;
			}
		}
		System.out.printf("mp3 : %d개\n", mp3Count);
		System.out.printf("jpg : %d개\n", jpgCount);
		System.out.printf("java : %d개\n", javaCount);
		System.out.printf("hwp : %d개\n", hwpCount);
		System.out.printf("doc : %d개\n", docCount);
	}
}
