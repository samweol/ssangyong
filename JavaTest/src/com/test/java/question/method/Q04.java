package com.test.java.question.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {
	public static void main(String[] args) throws IOException {
		
		// 요구사항 : 숫자를 2개 입력받아 연산식을 반환하는 메소드를 선언하시오.
		
		// 키보드로 숫자 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 첫번째 숫자 입력받기
		System.out.print("첫번째 숫자 : \n");
		String input1 = reader.readLine();
		// String > int (메소드의 매개변수의 형식은 int이기때문에 형변환 필요)
		int n1 = Integer.parseInt(input1);
		
		// 두번째 숫자 입력받기
		System.out.print("두번째 숫자 : \n");
		String input2 = reader.readLine();
		int n2 = Integer.parseInt(input2);
		
		// 메소드 호출
		/* 요구한 호출 사항은 아래와 같으나 해결하지 못함.
		result = add(n1, n2); 
		System.out.println(result);
		
		result = subtract(n1, n2);
		System.out.println(result);
		
		result = multiply(n1, n2);
		System.out.println(result);
		
		result = divide(n1, n2);
		System.out.println(result);
		
		result = mod(n1, n2);
		System.out.println(result);
		 */
		
		String result = add(n1, n2); 
		System.out.printf("%d + %d = %d\n", n1, n2, Integer.parseInt(result));
		
		result = subtract(n1, n2);
		System.out.printf("%d - %d = %d\n", n1, n2, Integer.parseInt(result));

		result = multiply(n1, n2);
		System.out.printf("%d * %d = %d\n", n1, n2, Integer.parseInt(result));

		result = divide(n1, n2);
		System.out.printf("%d / %d = %.1f\n", n1, n2, Double.parseDouble(result));

		result = mod(n1, n2);
		System.out.printf("%d %% %d = %d\n", n1, n2, Integer.parseInt(result));

	} // main
	
	// 메소드 선언
	public static String add(int a, int b) {
		// String > Int
		String answer = Integer.toString(a + b);
		
		return answer;
	}
	
	public static String subtract(int a, int b) {
		// String > Int
		String answer = Integer.toString(a - b);
		return answer;
	}
	
	public static String multiply(int a, int b) {
		// String > Int
		String answer = Integer.toString(a * b);
		return answer;
	}
	
	public static String divide(int a, int b) {
		// String > Int
		String answer = Double.toString((double)a / b);
		return answer;
	}
	
	public static String mod(int a, int b) {
		// String > Int
		String answer = Integer.toString(a % b);
		return answer;
	}

} // class
