package com.test.java.question.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q08 {

	public static void main(String[] args) throws IOException {
		
		// 요구사항: 사과 나무가 있다. 사과 나무 씨앗을 심을 날로부터 특정 시간이 흘렀을 때 사과 총 몇개가 열리는지 구하는 메소드를 선언하시오.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 맑은 날 입력 받기
		System.out.print("맑은 날 : \n");
		String sunnyInput = reader.readLine();
		int sunny = Integer.parseInt(sunnyInput);
		
		// 흐린 날 입력 받기
		System.out.print("흐린 날 : \n");
		String foggyInput = reader.readLine();
		int foggy = Integer.parseInt(foggyInput);
		
		// 메소드 호출
		int result = getApple(sunny, foggy);
		System.out.printf("사과가 총 %d개 열렸습니다.\n", result);
	} // main
	
	// 메소드 선언
	public static int getApple(int sunny, int foggy) {
		
		/* 조건
		- 사과 나무를 처음 심었을 때 나무의 길이 : 0m
		- 맑은 날 사과 나무의 성장률 : 5cm
		- 흐린 날 사과 나무의 성장률 : 2cm
		- 사과 나무는 길이가 1m 넘는 시점부터 사과가 열린다.
		- 1m 넘는 시점부터 10cm 자랄 때마다 사과가 1개씩 열린다. 
		*/
		
		// 필요한 변수 설정 (나무길이, 사과)
		int tree = 0;
		int apple = 0;
		
		// 날씨에 따라 길이 늘리기
		tree = 5 * sunny + 2 * foggy;
		
		// 사과 갯수 구하는 식
		apple = (tree <100)? 0 : (tree - 100) / 10;
		return apple;
	}
} // class
