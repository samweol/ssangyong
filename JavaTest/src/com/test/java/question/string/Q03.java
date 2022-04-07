package com.test.java.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws Exception {
		
		// 요구사항 : 숫자를 입력받아 각 자릿수의 수의 합을 구하시오.
		/* 설계
		1. 숫자 입력받기 > charAt으로 char변수로 받기
		2. 배열 요소 하나하나 더하는 것을 for문을 사용하기
		3. 출력하기
		*/
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 : ");
		String input = reader.readLine();
		
		// 배열에 넣기
		String[] num = new String[input.length()];
		int sum = 0;
		
		System.out.print("결과 : ");
		for(int i=0; i<num.length; i++) {
			num[i] = input.substring(i, i+1);
			sum += Integer.parseInt(num[i]);
			
			
			if(i == num.length-1) {
				System.out.printf("%s = ",num[i]);
			} else {
				System.out.printf("%s + ",num[i]);
			}
		}
		System.out.print(sum);
	}
}
