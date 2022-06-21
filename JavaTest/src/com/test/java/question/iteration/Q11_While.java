package com.test.java.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11_While {

	public static void main(String[] args) throws Exception {
		
		// 요구사항 : 숫자를 10개 입력받아 한글로 변환 후 출력하시오.
		// 조건 : 1~9 까지만 입력하시오.
		
		/* 설계
			1. 숫자를 입력받기 > while문을 사용하여 반복 > 횟수받기
			2. 숫자를 한글로 변환하기 > 조건문을 활용하기
		*/
		
		// 입력받기
		
		int count = 1;
		String answer = "";
		while(count<=10) {
			
			System.out.print("숫자 : ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String num = reader.readLine(); // 연산이 필요없으므로 String으로 바로 받기
			if(num.equals("1")||num.equals("2")||num.equals("3")||num.equals("4")||num.equals("5")||num.equals("6")||num.equals("7")||num.equals("8")||num.equals("9")) {
				count ++;
				// 조건문 작성 -> switch 문으로도 사용 가능
				if(num.equals("1")) {
					answer += "일";
				} else if(num.equals("2")) {
					answer += "이";
				} else if(num.equals("3")) {
					answer += "삼";
				} else if(num.equals("4")) {
					answer += "사";
				} else if(num.equals("5")) {
					answer += "오";
				} else if(num.equals("6")) {
					answer += "육";
				} else if(num.equals("7")) {
					answer += "칠";
				} else if(num.equals("8")) {
					answer += "팔";
				} else if(num.equals("9")) {
					answer += "구";
				}
			} else {
				System.out.println("숫자는 1~9까지만 입력하시오.");
				continue;
			}		
			
		}
		System.out.println(answer);
	}
}
