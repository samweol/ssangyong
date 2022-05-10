package com.test.java.question.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05 {
	public static void main(String[] args) throws IOException {
		
		// 요구사항 : 숫자를 전달하면 '짝수' 혹은 '홀수'라는 단어를 반환하는 메소드를 선언하시오.
		
		// 숫자 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 : \n");
		String input = reader.readLine();
		int n = Integer.parseInt(input);
		
		// 메소드 호출	
		String result = getNumber(n);
		System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.\n", n, result);
	} // main
	
	// 메소드 선언
	public static String getNumber(int num) {
		int cal = num % 2;
		String answer = (cal == 0)? "짝수" : "홀수";
		return answer;
	}

} // class
