package com.test.java.question.conditional;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q08 {

	public static void main(String[] args) throws Exception {
		
		// 요구사항 : 주차 요금을 계산하시오.
		
		parkCharge();
	}

	private static void parkCharge() throws Exception {
		
		// 입력 받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("[들어온 시간]");
		System.out.print("시 : ");
		int hourIn = Integer.parseInt(reader.readLine());
		System.out.print("분 : ");
		int minIn = Integer.parseInt(reader.readLine());
		
		System.out.println();
		
		System.out.println("[나간 시간]");
		System.out.print("시 : ");
		int hourOut = Integer.parseInt(reader.readLine());
		System.out.print("분 : ");
		int minOut = Integer.parseInt(reader.readLine());
		
		// 조건문 작성하기
		/* 조건
		- 무료 주차 : 30분
		- 초과 10분당 : 2,000원
		*/
		
		int totalTime = (hourOut * 60 + minOut) - (hourIn * 60 + minIn);
		
		if (totalTime > 30) {
			int charge = 2000;
			int rate = (totalTime - 30) / 10 ;
			int totalCharge = charge * rate;
			System.out.printf("주차 요금은 %,d원입니다.", totalCharge);
		} else {
			System.out.println("무료입니다.");
		}
	}
}
