package com.test.java.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws Exception {
		
		// 미해결
		// 요구사항 : 숫자를 입력받아 3자리마다 ,를 붙이시오.
		// 조건 : %d 사용 금지
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 : ");
		String input = reader.readLine();
		
		// 잘라서 배열에 넣기
		String[] num = new String[input.length()];
		for(int i=0; i<num.length; i++) {
			num[i] = input.substring(i, i+1);
		}
		
	}
}
