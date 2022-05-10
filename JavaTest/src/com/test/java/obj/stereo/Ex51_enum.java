package com.test.java.obj.stereo;

public class Ex51_enum {

	public static void main(String[] args) {
		
		// 클래스의 종류
		// 1. 클래스
		// 2. 인터페이스
		// 3. 추상클래스
		// 4. enum
		
		// 열거형, Enumeration
		// - 클래스의 일종
		
		// 요구사항 : 의류 쇼핑몰 > 티셔츠 > 고객 > 색상 선택(빨강, 노랑, 파랑)
		// Case1.
		String color = "빨강"; // 오타 발생 가능!!
		
		if(color.equals("빨강")||color.equals("노랑")||color.equals("파랑")) {
			System.out.println("판매 가능");
		} else {
			System.out.println("재고 없음");
		}
		
		
		// Case2.
		색상 c1 = 색상.빨강; // 오타가 나면 에러가 발생
						 // 선택형 > 제약적 > 제공한 것들 중에만 선택해서 사용해라!!
		색상 c2 = 색상.파랑;
		
		if(c1 == 색상.빨강 || c1 == 색상.노랑 || c1 == 색상.파랑) {
			System.out.println("판매 가능");
		} else {
			System.out.println("재고 없음");
		}
		
		직급 postion = 직급.사원;
		
		Gender g1 = Gender.MALE;
		Gender g2 = Gender.FEMALE;
	}//main
}//Ex51


class 클래스명 {
	// 구현 멤버
}

interface 인터페이스명 {
	//추상 멤버
}

abstract class 추상클래스명 {
	// 구현 멤버
	// 추상 멤버
}

//열거형 선언하기
enum 열거형명 {
	// 열거형 멤버
}

enum 색상 {
	빨강, //final static 상수
	노랑,
	파랑
}

class 색상2 {
	final public static int 빨강 = 0;
	final public static int 노랑 = 0;
	final public static int 파랑 = 0;
}

enum 직급 {
	사원,
	대리,
	과장,
	부장
}

enum Gender {
	MALE,
	FEMALE
}