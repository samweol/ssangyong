package com.test.java.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q12 {

	public static void main(String[] args) throws Exception {
		
		// 피연산자가 부족한 경우, 연산자가 올바르지 않은 경우 미해결
		
		// 요구사항 : 연산식을 입력받아 실제 연산을 하시오.
		// 조건 
		// 1. 산술 연산자만 구현하시오.(+, -, *, /, %)
		// 2. 연산식의 공백은 자유롭게 입력 가능합니다.
		// 3. 산술 연산자가 반든시 존재하는지 체크하시오.
		// 4. 피연산자의 갯수가 2개인지 체크하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("입력 : ");
		String input = reader.readLine();
		
		// 중간 공백 제거
		String updateInput = input.replace(" ", "");
//		System.out.println(updateInput);
		
	
		// 연산자를 구분으로 앞 뒤 자르기
		
		if(updateInput.contains("+")) {
			String[] numPlus = updateInput.split("\\+");
			System.out.printf("%s + %s = %d\n"
					,numPlus[0]
					,numPlus[1]
					,(Integer.parseInt(numPlus[0]) + (Integer.parseInt(numPlus[1]))));
		} else if(updateInput.contains("-")) {
			String[] numSubstract = updateInput.split("\\-");
			System.out.printf("%s - %s = %d\n"
					,numSubstract[0]
					,numSubstract[1]
					,(Integer.parseInt(numSubstract[0]) - (Integer.parseInt(numSubstract[1]))));
		} else if(updateInput.contains("*")) {
			String[] numMultiply = updateInput.split("\\*");
			System.out.printf("%s * %s = %d\n"
					,numMultiply[0]
					,numMultiply[1]
					,(Integer.parseInt(numMultiply[0]) * (Integer.parseInt(numMultiply[1]))));
		} else if(updateInput.contains("/")) {
			String[] numDivide = updateInput.split("\\/");
			System.out.printf("%s  %s = %d\n"
					,numDivide[0]
					,numDivide[1]
					,(Integer.parseInt(numDivide[0]) / (Integer.parseInt(numDivide[1]))));
			
		} else if(updateInput.contains("%")) {
			String[] numLeft = updateInput.split("\\%");
			System.out.printf("%s  %s = %d\n"
					,numLeft[0]
					,numLeft[1]
					,(Integer.parseInt(numLeft[0]) % (Integer.parseInt(numLeft[1]))));
		}
		
		
		
						
		
	
	}
	
	public static void checkOperator(String[] arr) {
		if(arr[0].equals(null)||arr[2].equals(null)) {
			System.out.println("피연산자가 부족합니다.");
		}
	}
}
