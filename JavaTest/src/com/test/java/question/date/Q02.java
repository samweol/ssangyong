package com.test.java.question.date;

import java.util.Calendar;

public class Q02 {

	public static void main(String[] args) {
		
		// 요구사항 : 오늘 태어난 아이의 백일과 첫돌을 출력하시오.
		
		// 메소드 호출
		get100();
		getFirstBirth();
	} //main
	
	// 메소드 선언
	public static void get100() {
		Calendar birthday = Calendar.getInstance();
		birthday.add(Calendar.DATE, 100);
		System.out.printf("백일 : %tF\n", birthday);
	}
	
	public static void getFirstBirth() {
		Calendar birthday = Calendar.getInstance();
		birthday.add(Calendar.YEAR, 1);
		System.out.printf("첫돌 : %tF\n", birthday);
	}
} //class
