package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력받기
		System.out.print("사용자가 페달을 밟은 횟수 : ");
		String times = reader.readLine();
		int itimes = Integer.parseInt(times);
		double PI = 3.141592;
		double d = 0.6604;
		
		// 출력하기
		// 26인치 = 0.6604m
		// 자전거 바퀴 1회전 = 바퀴의 둘레 = PID= 3.14 * 0.6604
		System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %,.3f m를 달렸다.", itimes, PI*d*itimes);
	}

}
