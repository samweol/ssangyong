package com.test.java.question.iteration;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws Exception {
		
		// 요구사항 : 입력 횟수(N)와 숫자 N개를 입력받아 짝수의 합과 홀수의 합을 각각 출럭하시오.
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("입력 횟수 : ");
		int time = Integer.parseInt(reader.readLine());
		
		// for문을 사용하여 입력횟수 만큼 숫자 입력받기
		int sumEven = 0; 
		int even = 0;
		int sumOdd = 0;
		int odd = 0;
		for (int i=0; i<time; i++) {
			System.out.print("숫자 : ");
			int num = Integer.parseInt(reader.readLine());
			
			if (num % 2 == 0) {
				sumEven += num;
				even ++;
			} else if (num % 2 == 1) {
				sumOdd += num;
				odd ++;
			}
		}
		System.out.printf("짝수 %d개의 합 : %d\n", even, sumEven);
		System.out.printf("홀수 %d개의 합 : %d\n", odd, sumOdd);
		
	}
}
