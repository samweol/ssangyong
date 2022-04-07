package com.test.java.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10_While {
	
	public static void main(String[] args) throws Exception {
		
		// 요구사항 : 숫자 N개를 입력 받아 아래와 같이 출력하시오.
		
		// 조건 
		// - 누적값이 100을 넘어가는 순간 루프를 종료하시오.
		// - 짝수는 더하고 홀수는 빼시오.
		
		/* 설계
		1. 숫자 N개를 입력받는다. > while 문을 사용하여 루프를 돌린다.
		2. while문 안에서 숫자를 받는 대로 바로 계산한다.
			2-1. 짝수와 홀수는 %를 사용하여 나머지가 0, 1로 나눈다.
			2-2. 
		3. 합이 100을 넘어가는 순간 while문을 종료한다.
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		boolean loop = true;
		int sum = 0;
		int num = 0;
		String answer = "";

		
		while(loop) {
			System.out.print("숫자 : ");
			num = Integer.parseInt(reader.readLine());
			
			// 계산하기
			if (num % 2 == 0) { // 짝수 일 때
				
				sum += num;
				answer += String.format("+ %d ", num);
				
			} else { // 홀수 일 때
				
				sum -= num;
				answer += String.format("- %d ", num);
			}
			
			
			// 조건문 걸기
			if(sum > 100) {
				System.out.printf("%s = %d", answer, sum);
				break;				
			}
			
		}
		
		// 출력 : + 12 + 28 - 39 - 15 + 38 + 24 + 78  = 126
		// 앞에 + 지우는 방법 생각해보기

		

	}
}
