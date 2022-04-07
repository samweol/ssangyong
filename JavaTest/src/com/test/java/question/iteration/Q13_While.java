package com.test.java.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q13_While {

	public static void main(String[] args) throws Exception {
		
//		요구사항 : 최대 9자리 정수를 입력받아 각자리의 홀수 숫자합과 짝수 숫자합을 구하시오.

//		조건
//		9자리 이하 숫자만 입력하시오.
//		Math.pow() 메소드 사용(제곱값 구하는 메소드)
//		Math.pow(10, 2) → 100
//		Math.pow(10, 3) → 1000
//		Math.pow(10, 4) → 10000

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("숫자 입력:");
			int inputNum = Integer.parseInt(reader.readLine());
			int num = 1;
			int cipher = 0;
			int evenSum = 0;
			int oddSum = 0;
			while (num <= 9) {
				
				cipher = inputNum / (int)Math.pow(10, num - 1) % 10;
				
				if (cipher % 2 == 0) {
					evenSum += cipher;
				} else {
					oddSum += cipher;
				}
				
				num++;
			}
			System.out.printf("짝수의 합 : %d\n", evenSum);
			System.out.printf("홀수의 합 : %d\n", oddSum);
			
		}//main
}
