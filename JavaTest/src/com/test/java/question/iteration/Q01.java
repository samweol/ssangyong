package com.test.java.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws Exception {
		// 요구사항 : 사용자의 이름과 인사할 횟수를 입력 받아 출력하시오.
		
		// 1. 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 : ");
		String name = reader.readLine();
		System.out.print("횟수 : ");
		int time = Integer.parseInt(reader.readLine());
		
		// for문 작성하기 + 출력하기
		for(int i=0; i<time; i++) {
			System.out.printf("%s님 안녕하세요~\n", name);
		}
	}
}
