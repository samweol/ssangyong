package com.test.java.question.iteration;

public class Q08 {

	public static void main(String[] args) {
		
		// 요구사항 : 서기 1년 1월 1일부터 오늘까지 며칠째인지 합을 구하시오.
		// 1년 = 365일
		
		int total = 0;
		int year = 2022;
		int month = 3;
		int date = 17;
		
		// 1년 1월 1일 ~ 2021년 12월 31일 > 윤년 체크하기
		
		for(int i=1; i<year; i++) {
			total += 365;
			
			// 현재 i년이 윤년인지 검사하기
			if (isLeafYear(i)) {
				total++;
			}
		}
		
		// 2022년 1월 1일 ~ 2022년 2월 28일
		for (int i=1; i<month; i++) {
			
			total += getLastDay(year, i);
		}
		
		// 2022년 3월 1일 ~ 2022년 3월 17일
		
		total += date;
		
		// 특정 날짜의 요일? > 기준일 + 기준일 요일 + 기준일로부터 특정 날짜의 날짜 합
		
		System.out.printf("%d년 %d월 %d일은 %,d일째 되는 날이고 %s요일입니다."
				,year, month, date
				, total
				, getDay(total));
		
		}

	public static String getDay(int date) {
		
		if (date % 7 == 1) {
			return "월";
		} else if (date % 7 == 2) {
			return "화";
		} else if (date % 7 == 3) {
			return "수";
		} else if (date % 7 == 4) {
			return "목";
		} else if (date % 7 == 5) {
			return "금";
		} else if (date % 7 == 6) {
			return "토";
		} else {
			return "일";
		}
	}

	public static int getLastDay(int year, int month) {
		
		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				return 31;
			case 4: case 6: case 9: case 11:
				return 30;
			case 2:
				return isLeafYear(year)? 29 : 28;
		}
		return 0;
	}

	public static boolean isLeafYear(int year) {
		
		if(year % 4 == 0) {
			
			if(year % 100 == 0) {
				
				if(year % 400 == 0) {
					return true;
				} else {
					return false;
				}
				
			} else {
				return true;
			}
			
		} else {
			return false;
		}
		
	}
}
