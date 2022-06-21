package com.test.java.question.date;

import java.util.Calendar;

public class Q01 {
	public static void main(String[] args) {
		// 요구사항 : 현재 시간을 출력하는 메소드를 선언하시오.
		
		// 메소드 호출
		nowTime();
	} //main
	
	// 메소드 선언
	public static void nowTime() {
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR);
		int min = now.get(Calendar.MINUTE);
		int sec = now.get(Calendar.SECOND);
		String ampm = (now.get(Calendar.AM_PM) == 0)? "오전" : "오후";
		
		System.out.printf("현재 시간 : %s %d시 %d분 %d초\n",ampm, hour, min, sec );
	}
} // class
