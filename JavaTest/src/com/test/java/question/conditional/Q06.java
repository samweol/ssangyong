package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws Exception {
//		
//		System.out.println((int)'a');
//		System.out.println((int)'z');
//		System.out.println((int)'A');
//		System.out.println((int)'Z');
		// 요구사항 : 영문자 1개를 입력받아 대/소문자 변환을 한 뒤 출력하시오.
		changeAlphabet();
	}

	private static void changeAlphabet() throws Exception {
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자 : ");
		char input = (reader.readLine()).charAt(0);
		int alphabet = input;
		// 조건문 작성하기
		if (alphabet>=65 && alphabet <= 90 || alphabet >=97 && alphabet <= 122 ) {
			if (alphabet >= 97 && alphabet <= 122) {
				int alphabetBig = alphabet - 32;
				System.out.printf("'%c'의 대문자는 '%c'입니다.\n", alphabet, alphabetBig);
			} else {
				int alphabetSmall = alphabet + 32;
				System.out.printf("'%c'의 소문자는 '%c'입니다.\n", alphabet, alphabetSmall);
			}
			
		} else {
			System.out.println("영문자만 입력하시오.");
		}
	}
}
