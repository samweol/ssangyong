package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws Exception {
		
		// 요구사항 : 근무 년수를 입력받아 아래와 같이 출력하시오.
		
		decideYourPosition();
	}

	private static void decideYourPosition() throws Exception {
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("근무 년수 : ");
		int year = Integer.parseInt(reader.readLine());
		
		// 조건문 작성
		if (year >=1) {
			if (year <= 4) {
				System.out.printf("%d년차 초급 개발자입니다.\n", year);
				System.out.printf("앞으로 %d년 더 근무를 하면 중급 개발자가 됩니다.\n", 5 - year);
			} else if (year >=5 && year <=9) {
				System.out.printf("%d년차 중급 개발자입니다.\n", year);
				System.out.printf("당신은 %d년전까지 초급 개발자였습니다.\n", year - 4);
				System.out.printf("앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.\n", 10 - year);
			} else if (year >= 10) {
				System.out.printf("%d년차 고급 개발자입니다.\n", year);
				System.out.printf("당신은 %d년전까지 초급 개발자였습니다.\n", year - 9);
			}
			
		} else {
			System.out.println("입력한 값이 올바르지 않습니다. 1이상의 값을 입력하시오.\n");
		}
		
	}
}
