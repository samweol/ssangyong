package com.test.java.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11 {

	public static void main(String[] args) throws Exception {
		/*
			문자열은 equals로 꼭 비교하기!!!!!!!!!!!!!!
		*/
		
		// 요구사항 : 입력받은 문장에서 숫자를 찾아 그 합을 구하시오.
		// 조건 : 모든 숫자는 한자리 숫자로 처리한다.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("입력 : ");
		String input = reader.readLine();
//		int sum = 0;
//		for(int i=0; i<input.length(); i++) {
//			char temp = input.charAt(i);
//			if(temp>='0' && temp<='9') {
//				sum += temp - '0'; 
//			}
//		}
//		
//		System.out.println(sum);

		
		
		
		String[] content = new String[input.length()];
		
		for(int i=0; i<content.length; i++) {
			content[i] = input.substring(i, i+1);
//			System.out.println(content[i]);
		}
		
		int sum = 0;
		
		
		for(int i=0; i<content.length; i++) {
			
			if(content[i].equals("0") 
					|| content[i].equals("1") 
					|| content[i].equals("2")
					|| content[i].equals("3")
					|| content[i].equals("4")
					|| content[i].equals("5")
					|| content[i].equals("6")
					|| content[i].equals("7")
					|| content[i].equals("8")
					|| content[i].equals("9")) {
				
				sum += Integer.parseInt(content[i]);				
			}
			
		}
		
		System.out.println(sum);
	}
}
