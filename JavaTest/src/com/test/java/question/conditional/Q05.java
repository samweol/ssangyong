package com.test.java.question.conditional;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws Exception {
		
		// 요구사항 : 숫자 2개와 연산자 1개를 입력받아 연산 과정과 결과를 출력하시오.
		
		calculate();
	}

	private static void calculate() throws Exception {
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 숫자 : ");
		int num1 = Integer.parseInt(reader.readLine());
		System.out.print("두번째 숫자 : ");
		int num2 = Integer.parseInt(reader.readLine());
		System.out.print("연산자 : ");
		String operator = reader.readLine();
		
		// 조건문 작성
		if (operator.equals("+")||operator.equals("-")||operator.equals("*")||operator.equals("/")||operator.equals("%")) {
			if (operator.equals("+")) {
				System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
			} else if (operator.equals("-")) {
				System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
			} else if (operator.equals("*")) {
				System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
			} else if (operator.equals("/")) {
				System.out.printf("%d / %d = %.1f\n", num1, num2, (double)num1 / num2);
			} else if (operator.equals("%")) {
				System.out.printf("%d % %d = %d\n", num1, num2, num1 % num2);
			}
		} else {
			System.out.println("연산이 불가능합니다.");
		}
		
	}
}
