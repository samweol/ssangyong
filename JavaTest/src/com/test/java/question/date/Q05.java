package com.test.java.question.date;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q05 {

	public static void main(String[] args) throws IOException {
		
		// 요구사항 : 아빠와 딸의 생일을 입력받아 아빠가 딸보다 며칠을더 살았는지 출력하시오.
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("아빠 생일(년) : \n");
		int yearDad = Integer.parseInt(reader.readLine());
		System.out.print("아빠 생일(월) : \n");
		int monthDad = Integer.parseInt(reader.readLine());
		System.out.print("아빠 생일(일) : \n");
		int dateDad = Integer.parseInt(reader.readLine());
		System.out.print("딸 생일(년) : \n");
		int yearDaughter = Integer.parseInt(reader.readLine());
		System.out.print("딸 생일(월) : \n");
		int monthDaughter = Integer.parseInt(reader.readLine());
		System.out.print("딸 생일(일) : \n");
		int dateDaughter = Integer.parseInt(reader.readLine());
		
		// 메소드 호출
		getDadAndDaughter(yearDad, monthDad, dateDad, yearDaughter, monthDaughter, dateDaughter);
	} //main
	
	// 메소드 선언
	public static void getDadAndDaughter(int yearDad, int monthDad, int dateDad, int yearDaughter, int monthDaughter, int dateDaughter) {
		Calendar dadBirthday = Calendar.getInstance();
		Calendar daughterBirthday = Calendar.getInstance();
		
		dadBirthday.set(yearDad, monthDad, dateDad); // 아빠 생일 설정
		daughterBirthday.set(yearDaughter, monthDaughter, dateDaughter); // 딸 생일 설정
		
		long dadTick = dadBirthday.getTimeInMillis();
		long daughterTick = daughterBirthday.getTimeInMillis();
		
		// 계산하기
		long answer = (daughterTick - dadTick) / 1000 / 60 / 60 / 24;
		
		// 출력하기
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.\n", answer);
	}
} //class
