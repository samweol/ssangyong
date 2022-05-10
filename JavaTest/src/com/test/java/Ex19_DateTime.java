package com.test.java;

import java.util.Calendar;
import java.util.Date;

public class Ex19_DateTime {

	public static void main(String[] args) {
		
		/* 자바의 자료형
		1. 원시형(값형)
			- byte, short, int ,long
			- float, double
			- char
			- boolean
			
		2. 참조형
			- 클래스
			- String
			- 날짜시간
			
		자바의 날짜시간 자료형
		1. Date 클래스 > 거의 사용 안함
		2. Calendar 클래스 > 현역
		3. 추가 클래스 > 현역
		
		A. 시각
		B. 시간
		
		2022년 3월 14일 오후 4시 22분 27초 > 시간 vs 시각? > 시각
		
		8시간 수업 > 시간 vs 시각 > 시간
		
		자료형의 시각 > 둘은 완전 다른 자료형
		
		시각, 시간 > 연산
		
		한달 = 며칠
		특정 기준일(1970년 1월 1일 0시 0분 0초)로부터 해당 시각이 얼만큼 흘렀는지 구한 누적 시간 -> 틱(tick) 값, Epoch Time, Timestamp
		
		시각 + 시각 = X, 2022-03-1 + 2025-05-10
		시각 - 시각 = O(시간), 2025-05-10 - 2022-03-01 = ?
		
		시간 + 시간 = O(시간)
		시간 - 시간 = O(시간)
		
		시각 + 시간 = O(시각)
		시각 - 시간 = O(시각)
		
		*/
//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
//		m6();
		m7();
	} //main

	private static void m7() {
		
		// 현재 시각의 tick
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTimeInMillis());
		
		// 전용메소드
		System.out.println(System.currentTimeMillis());
		
	}

	private static void m6() {
		
		// 1. 현재 시각 만들기 > getInstance() + get()
		// 2. 특정 시각 만들기 > set()
		// 3. 시각 + 시간 = 시각 > add()
		// 4. 시각 - 시간 = 시각 > add()
		// 5. 시각 - 시각 = 시간 > getTimeInMillis()
		// 6. 시간 + 시간 = 시간
		// 7. 시간 - 시간 = 시간
		
		// 2시간 30분 + 10 분 = 2시간 40분
		
		Calendar c1 = Calendar.getInstance();
//		c1.set(Calendar.HOUR, 2);
//		c1.set(Calendar.MINUTE, 30);
//		System.out.printf("%tF %tT\n", c1, c1);
		
		int hour = 2;
		int min = 30;
		
		min += 10;
		
		System.out.printf("%d시간 %d분\n", hour, min);
		
		// 2시간 30분 + 40분 = 2시간 70분 = 3시간 10분
		hour = 2;
		min = 30;
		min += 40;
		
		System.out.printf("%d시간 %d분\n", hour, min);
		
		hour = hour + (min/60); // 2시간 + 1시간
		min = min % 60; // 10분 > 나머지
		
		System.out.printf("%d시간 %d분\n", hour, min);
		
		
		
		
	}

	private static void m5() {
		
		// 연산
		// - 시각 - 시각
		
		Calendar now = Calendar.getInstance();
		Calendar birthday = Calendar.getInstance();
		birthday.set(1998, 3, 17);
		
		// now - birthday = 내가 살아온 시간
		// The operator - is undefined for the argument type(s) java.util.Calendar, java.util.Calendar
		// 산술 연산자(-)는 값형을 대상으로 연산을 한다.
		// System.out.println(now - birthday);
		
		// tick, epoch
		//- Retrun this Calendar's time value in milliseconds.
		// - the current time as UTC milliseconds from the dpoch.
		
		System.out.println(birthday.getTimeInMillis()); // 892775240040
		System.out.println(now.getTimeInMillis()); //1647306458042
		System.out.println(now.getTimeInMillis()/1000/60 /60/ 24/365); //52
		
		System.out.println((now.getTimeInMillis() - birthday.getTimeInMillis())/1000/60/60/24); //8732 , 태어나서 총 이만큼 살아온 것
		
		// 수료일까지 며칠 남았는지?
		// 올해 크리스마스 며칠 남았는지?
		
		Calendar christmas = Calendar.getInstance();
		christmas.set(2022, 11, 25, 0, 0, 0);
		
		long nowTick = now.getTimeInMillis();
		long christmasTick = christmas.getTimeInMillis();
		
		System.out.println((christmasTick - nowTick)/1000/60/60/24); //284일 남았음
		
		Calendar end = Calendar.getInstance();
		end.set(Calendar.HOUR_OF_DAY, 18);
		end.set(Calendar.MINUTE, 00);
		
		long endTick = end.getTimeInMillis();
		System.out.println((double)(endTick - nowTick)/1000/60/60); //7.683342222222222
	}

	private static void m4() {
		
		// 연산
		// - 시각 + 시간
		// - 시각 - 시간
		
		// 오늘 만난 커플 >  100일
		
		Calendar now = Calendar.getInstance();
		System.out.printf("1일차 : %tF \n", now);
		
		now.add(Calendar.DATE, 100);
		System.out.printf("100일차 : %tF \n", now);
		System.out.println();
		
		Calendar birthday = Calendar.getInstance();
		birthday.set(1998, 3, 17);
		birthday.add(Calendar.DATE, 100);
		System.out.printf("내 백일 잔치 : %tF\n", birthday);
		
		// 돌잔치
		birthday.set(1998, 3, 17); // 앞에서 계산한 결과가 누적되므로 초기화 단계가 필수!
		birthday.add(Calendar.YEAR, 1); // 1년은 365일 일수도 366일 수도 있기때문에 년 단위는 YEAR로 더해줘야하고, 그럼 자바에서 알아서 계산해줌
		System.out.printf("내 돌 잔치 : %tF\n", birthday);
		System.out.println();
		
		// 현재 시각 초기화
		now = Calendar.getInstance(); // 초기화
		now.add(Calendar.DATE, -50);
		System.out.printf("50일 전 : %tF\n", now);
		System.out.println();
		
		now = Calendar.getInstance(); // 초기화
		// 3시간 25분뒤 비타민 복용
		now.add(Calendar.HOUR, 3);
		now.add(Calendar.MINUTE, 25);
		System.out.printf("비타민 먹을 시간 : %tT\n", now);
	}

	private static void m3() {
		
		// Calendar 메소드
		// 1. int get(int 캘린더상수)
		// 2. int set(..)
		
		// 현재 시각 얻어오기
		Calendar c1 = Calendar.getInstance();
		
		// 메소드 이름 짓기
		// get : 박스에서 꺼내오는 행동
		// set : 박스 안으로 집어넣는 행동
		// is : 박스의 상태를 확인할 때 > true/false
		
		// 특정 시각 얻어오기> 원하는 시각 만들기
		// 1. 현재 시각 만들기
		// 2. 원하는 시각으로 수정하기
		
		Calendar birthday = Calendar.getInstance(); // 현재시각 얻어오기
		// 시각 수정하기
		// - void set()
		birthday.set(Calendar.YEAR, 1998); // 앞에 필드는 뒤에 있는 데이터가 어떤 데이터에 해당하는지 알려주는 용도
		birthday.set(Calendar.MONTH, 2); // 월은 0-11인걸 기억하자
		birthday.set(Calendar.DATE, 17);
		
		
		birthday.set(Calendar.HOUR, 1);
		birthday.set(Calendar.MINUTE, 31);
		birthday.set(Calendar.SECOND, 0);
		
		System.out.printf("%tF %tT %tA\n", birthday, birthday, birthday);
		
		Calendar christmas = Calendar.getInstance();
		
		christmas.set(2022, 11, 25);
		
		System.out.printf("%tF %tT %tA\n", christmas, christmas, christmas);
		
		christmas.set(2022, 12, 25, 18, 0);
		
		System.out.printf("%tF %tT %tA\n", christmas, christmas, christmas);
		
christmas.set(2022, 12, 25, 18, 0, 0);
		
		System.out.printf("%tF %tT %tA\n", christmas, christmas, christmas);
	}

	private static void m2() {
		// 두번째 예제
		// Calendar 클래스
		// 현재 시각 얻어오기(가장 기본적인 행동) > 현재 컴퓨터의 시계의 시각을 얻어온다.
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1);
		
		int year = 1;
		System.out.println(c1.get(1));
		System.out.println(c1.get(year));
		
		// 자바가 제공하는 Calendar 상수(변수)
		System.out.println(Calendar.YEAR);
		System.out.println(c1.get(Calendar.YEAR));
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println(c1.get(Calendar.YEAR)); //2022 년도
		System.out.println(c1.get(Calendar.MONTH)); //2 월(0-11)
		System.out.println(c1.get(Calendar.DATE)); //14 날짜(일)
		System.out.println(c1.get(Calendar.HOUR)); //5 시(12H)
		System.out.println(c1.get(Calendar.MINUTE)); //22 분
		System.out.println(c1.get(Calendar.SECOND)); //50 초
		System.out.println(c1.get(Calendar.MILLISECOND)); //846 밀리초(1/1000)
		System.out.println(c1.get(Calendar.AM_PM)); //1 오전(0) 오후(1)
		
		System.out.println(c1.get(Calendar.DAY_OF_YEAR)); //73 일
		System.out.println(c1.get(Calendar.DAY_OF_MONTH)); //14 일
		System.out.println(c1.get(Calendar.DAY_OF_WEEK)); //2 일(요일) 1(일)~7(토)
		
		System.out.println(c1.get(Calendar.WEEK_OF_YEAR)); //12 주
		System.out.println(c1.get(Calendar.WEEK_OF_MONTH)); //3 주
		
		System.out.println(c1.get(Calendar.HOUR_OF_DAY)); //17 시(24H)
		
		// 요구사항 : "오늘은 2022년 3월 14일입니다." 출력
		Calendar now = Calendar.getInstance();
		
		System.out.printf("오늘은 %d년 %d월 %d일입니다.\n", now.get(Calendar.YEAR), now.get(Calendar.MONTH)+1, now.get(Calendar.DATE));
		
		// 요구사항 : 지금은 오후 5시 37분입니다."
		System.out.printf("지금은 %s %d시 %d분입니다.", now.get(Calendar.AM_PM) == 0? "오전" : "오후", now.get(Calendar.HOUR), now.get(Calendar.MINUTE));
		
		// printf(), format > 형식 문자 + 날짜시간
		System.out.printf("%tF\n", now); // 2022-03-14
		System.out.printf("%tT\n", now); // 17:44:50
		System.out.printf("%tA\n", now); // 요일
		
	}

	private static void m1() {
		// 첫번째 예제
		
		// Date
		
		// 자료형(Date) 변수명(date) = new Date();
		Date date = new Date(); // 현재 시각을 생성해서 date라는 변수에 담는다.
		System.out.println(date);
		
		
	}
} //class
