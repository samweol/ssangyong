package com.test.java.obj.Inheritance;

import java.util.Calendar;
import java.util.Date;

public class Ex44_ToString {

	public static void main(String[] args) {
		
		
		Time t1 = new Time(2, 30);
		System.out.println(t1.getHour()); // 각각의 멤버변수 > Getter 호출
		System.out.println(t1.getMin());
		
		Time t2 = new Time(5, 10);
//		System.out.println(t2.info()); // 객체의 상태를 한방에 확인
		
		Date now = new Date();
		
		Calendar now2 = Calendar.getInstance();
		
		// Date, Calendar, Time의 객체를 출력!!
		System.out.println(now); //객체의 내부 데이터 출력
		System.out.println(now2); // 객체의 내부 데이터 출력
		
		// com.test.java.obj.Inheritance.Time > 객체의 자료형(패키지.클래스)
		// @
		// 2b80d80f > 숫자(16진수) > 메모리 주소값 > 해시코드(HashCode)
		
		System.out.println(t1); //com.test.java.obj.Inheritance.Time@2aafb23c
		System.out.println(t2); //com.test.java.obj.Inheritance.Time@2b80d80f
		System.out.println();
		
		// 객체의 출력 > 객체의 toString() 반환값을 출력
		System.out.println(now); // 뒤에 자동으로 .toString이 붙음
		System.out.println(now.toString());
		
		System.out.println(t1); // 뒤에 자동으로 .toString이 붙음
		System.out.println(t1.toString()); //Object.toString()
		// now.toString() : String - Date(오버라이드)
		
		
		// Object.toString()
		// - 자식 클래스에서 그대로 사용하지 않는다. > 쓸모없음
		// - 반드시 메소드 오버라이드(재정의)를 해서 사용한다.
		// - 모든 객체는 toString() 소유
		// - 어떤 코드를 재정의? > 자신의 소유한 데이터(멤버 변수)의 값을 문자열로 돌려주는 코드
		// 					 > 덤프(dump)
		// - 규칙 역할
		
		
	}//main
}//Ex44

class PPP {
	public void test() {
		
	}
}

class QQQ extends PPP {
	public void aaaa() {
		
	}
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		super.test();
	}
}

// 클래스 = 멤버 변수 + 생성자 + Getter/Setter + toString() 오버라이드
class Time {
	private int hour;
	private int min;
	
	public Time(int hour, int min) {
		this.hour = hour;
		this.min = min;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}
	
//	@Override
//	public String toString() {
//		
//		// 최소 권유 > 객체의 데이터를 알아볼 수 있게 문자열로 만들기
//		
//		return this.hour + ":" + this.min;
//	}
	
	@Override
	public String toString() {
		return "Time [hour=" + hour + ", min=" + min + "]";
	}
	
	// 객체의 상태를 확인하기 쉽도록 .. 개발자를 위해서..
	public String info() {
		return this.hour + ":" + this.min;
	}

	
	
}
