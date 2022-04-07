package com.test.java.question.date;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q03 {

	public static void main(String[] args) throws IOException {
		
		// 요구사항 : 태어난 년도를 입력하면 나이를 출력하시오.
		
		// 태어난 년도 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("태어난 년도 : ");
		String year = reader.readLine();
		
		// string > int
		int birthYear = Integer.parseInt(year);
		
		// 메소드 호출
		getYear(birthYear);
		
	} //main
	
	public static void getYear(int birthYear) {
		Calendar now = Calendar.getInstance();
		// 나이 계산하는 법 : 현재 년도 - 태어난 년도
		int nowYear = now.get(Calendar.YEAR);
		int answer = nowYear - birthYear + 1;
		String output = String.format("나이 : %d세", answer);
		System.out.println(output);
	}
} //class
