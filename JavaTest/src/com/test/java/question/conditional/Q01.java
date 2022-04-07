package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws Exception {
		// 요구사항 : 숫자 2개를 입력받아 큰수와 작은 수를 출력하시오.
		
		decideValueSize();
	}

	private static void decideValueSize() throws Exception {
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 숫자 : ");
		int num1 = Integer.parseInt(reader.readLine());
		System.out.print("두번째 숫자 : ");
		int num2 = Integer.parseInt(reader.readLine());
		
		// 조건문으로 두 수 비교하기
		if (num1 > num2) {
			System.out.printf("큰 수는 %d이고, 작은 수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.", num1, num2, (num1 - num2));
		} else if(num1 < num2) {
			System.out.printf("큰 수는 %d이고, 작은 수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.", num2, num1, (num2 - num1));
		}
	}
}
