package com.test.java.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws Exception {
		
		// 요구사항 : 이메일 주소를 입력받아 아이디와 도메인을 각각 추출하시오.
		
		/* 설계
		1. 이메일 입력받기 > String 값으로 입력받기
		2. @의 기준으로 앞뒤 자르기 > split 활용 (2개 배열로 저장)
		3. 배열 출력	
		*/
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이메일 : ");
		String email = reader.readLine();
		
		// @기준으로 잘라서 배열에 넣기
		String[] info = email.split("@");
		
		// 출력하기
		System.out.printf("아이디 : %s\n", info[0]);
		System.out.printf("도메인 : %s\n", info[1]);
	}
}
