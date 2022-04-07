package com.test.java.question.conditional;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q10 {

	public static void main(String[] args) throws Exception {
		
		// 요구사항 : 날짜를 입력받아 아래의 조건에 맞게 결과를 출력하시오.
		
		findDay();
	}

	private static void findDay() throws Exception {
		
		/* 조건
		- 입력받은 날짜가 평일이면 해당 주의 토요일을 알아낸다.
		- 입력받은 날짜가 일요일이면 아무것도 안한다.
		*/
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("년 : ");
		int year = Integer.parseInt(reader.readLine());
		System.out.print("월 : ");
		int month = Integer.parseInt(reader.readLine());
		System.out.print("일 : ");
		int date = Integer.parseInt(reader.readLine());
		
		// Calendar 이용해서 요일 받기
		Calendar day = Calendar.getInstance();
		day.set(year, month - 1, date);
		int dayOfWeekDay = day.get(Calendar.DAY_OF_WEEK); // 1 일요일, 2-6 평일, 7 토요일 
		if(dayOfWeekDay>=2 && dayOfWeekDay <=6) { 
			System.out.println("입력하신 날짜는 '평일'입니다.");
			System.out.println("해당 주의 토요일로 이동합니다.");
			if (dayOfWeekDay ==2) {
				day.add(Calendar.DAY_OF_WEEK, 5);
			} else if (dayOfWeekDay == 3) {
				day.add(Calendar.DAY_OF_WEEK, 4);
			} else if (dayOfWeekDay == 4) {
				day.add(Calendar.DAY_OF_WEEK, 3);
			} else if (dayOfWeekDay == 5) {
				day.add(Calendar.DAY_OF_WEEK, 2);
			} else {
				day.add(Calendar.DAY_OF_WEEK, 1);
			}
			System.out.printf("이동한 날짜는 '%tF'입니다.", day);
		} else if (dayOfWeekDay == 1) {
			System.out.println("입력하신 날짜는 '휴일'입니다.");
			System.out.println("결과가 없습니다.");
		}
	}
}
// day.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
