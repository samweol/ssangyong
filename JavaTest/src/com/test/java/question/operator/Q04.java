package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// 입력받기
		System.out.print("섭씨(C) : ");
		String tem = reader.readLine();
		int item = Integer.parseInt(tem);
		
		// 출력하기
		System.out.printf("섭씨 %d C는 화씨 %.1f F입니다.", item, (float)item*1.8+32);
	}

}
