package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// 입력 받기
		System.out.print("한달 수입 금액(원) : ");
		String money = reader.readLine();
		int imoney = Integer.parseInt(money);
		double tax = 0.033;
		
		// 출력 하기
		System.out.printf("세후 금액(원) : %,.0f원\n", imoney-(imoney*tax));
		System.out.printf("세금(원) : %,.0f원\n", imoney * tax);

	}

}
