package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// 숫자 2개 입력 받기
		System.out.print("첫번째 숫자 : \n");
		String num1 = reader.readLine();
		
		// String > int
		int a = Integer.parseInt(num1);
		
		System.out.print("두번째 숫자 : \n");
		String num2 = reader.readLine();
		
		// String > int
		int b = Integer.parseInt(num2);
		
		// double c = (double)a; -> 29번 줄에 (float)a대신 c를 넣으면 된다.
		
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%.0f / %d = %.1f\n", (float)a, b, (float)a/b);
		System.out.printf("%d %% %d = %d\n", a, b, a%b);
		
		/* 더 생각해볼 것
		1. 숫자가 아닌 값을 입력하면?
			- if 절이나 삼항 연산자인 ?:를 사용하여 돌려보낸다.
			
		2. 나눗셈의 결과가 정수일 때 소수 이하의 표시 안하려면?
			- %f에서 .0을 붙여 소수점 자리수의 값을 표시하지 않게한다.
			- 혹은 아예 float가 아닌 int형으로 하면 뒤에 소수점 자리수가 짤려서 나온다.
		*/
		
		// 변수 이름 확실하게 
		// 띄어쓰기 확실하게하기!
	}

}
