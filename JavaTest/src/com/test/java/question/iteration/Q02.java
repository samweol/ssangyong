package com.test.java.question.iteration;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws Exception {
		
		// 요구사항 : 시작 숫자, 종료 숫자, 증감치를 입력받아 숫자를 순차적으로 출력하시오.
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("시작 숫자:");
		int startNum = Integer.parseInt(reader.readLine());
		
		System.out.print("종료 숫자:");
		int endNum = Integer.parseInt(reader.readLine());
		
		System.out.print("증감치:");
		int plusMinus = Integer.parseInt(reader.readLine());
		
		// for문 작성하기 + 출력하기
		if (startNum < endNum) {			
			for (int i=startNum; i<=endNum; i+=plusMinus) {
				System.out.println(i);
			}			
		} else {			
			for (int i=startNum; i>=endNum; i+=plusMinus) {
				System.out.println(i);
			}
				
		}
		
	}
}
