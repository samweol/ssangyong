package com.test.java.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws Exception {
		
		// 요구사항 : 문장을 입력받아 역순으로 출력하시오.
		/* 설계
		1. 문장 입력 받기
		2. 입력받은 문장을 한 글자씩 배열로 넣기 (for문 사용)
		3. 배열을 역순으로 출력하기
		*/
		
//		m1(); //charAt활용
//		m2(); //subString활용
		
		
	}

	private static void m2() throws Exception {
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문장 입력 : ");
		String input = reader.readLine();
		String[] sentence = new String[input.length()];
		
		// 배열에 넣기
		for(int i=0; i<input.length(); i++) {
			sentence[i] = input.substring(i, i+1);
		}
		
		// 출력하기
		System.out.print("\"");
		for(int i=sentence.length-1; i>=0; i--) {
			System.out.printf("%s", sentence[i]);
		}
		System.out.print("\"");
	}

	private static void m1() throws Exception {
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				
		System.out.print("문장 입력 : ");
		String input = reader.readLine();
		char[] sentence = new char[input.length()];
		// 배열에 넣기
		for(int i=0; i<input.length(); i++) {
			sentence[i] = input.charAt(i);
		}
				
		// 출력하기
		System.out.print("\"");
		for(int i=sentence.length-1; i>=0; i--) {
			System.out.printf("%c", sentence[i]);
		}
		System.out.print("\"");
		
		
	}
}
