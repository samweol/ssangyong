package com.test.java.question.conditional;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws Exception {
		
		// 요구사항 : 숫자 5개를 입력받아 짝수와 홀수의 개수를 출력하시오.
		evenOdd();
	}

	private static void evenOdd() throws Exception {
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 입력 : ");
		int num1 = Integer.parseInt(reader.readLine());
		System.out.print("숫자 입력 : ");
		int num2 = Integer.parseInt(reader.readLine());
		System.out.print("숫자 입력 : ");
		int num3 = Integer.parseInt(reader.readLine());
		System.out.print("숫자 입력 : ");
		int num4 = Integer.parseInt(reader.readLine());
		System.out.print("숫자 입력 : ");
		int num5 = Integer.parseInt(reader.readLine());
		
		// 조건문 작성
		if (num1 >=1 && num1 <=10 && num2 >=1 && num2 <=10 && num3 >=1 && num3 <=10&& num4 >=1 && num4 <=10&& num5 >=1 && num5 <=10) {
			int even = 0;
			int odd = 0;
			
			if(num1 % 2 == 0) {
				even ++;
			} else {
				odd ++;
			}
			if(num2 % 2 == 0) {
				even ++;
			} else {
				odd ++;
			}
			if(num3 % 2 == 0) {
				even ++;
			} else {
				odd ++;
			}
			if(num4 % 2 == 0) {
				even ++;
			} else {
				odd ++;
			}
			if(num5 % 2 == 0) {
				even ++;
			} else {
				odd ++;
			}
			System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n", even, odd);
			if (even > odd) {
				System.out.printf("짝수가 홀수보다 %d개 더 많습니다.\n", even - odd);
			} else if (even < odd) {
				System.out.printf("홀수가 짝수보다 %d개 더 많습니다.\n", odd - even);
			}
		} else {
			System.out.println("잘못된 입력입니다. 숫자는 1-10 사이만 입력하세요.");
		}
		
	}
}
