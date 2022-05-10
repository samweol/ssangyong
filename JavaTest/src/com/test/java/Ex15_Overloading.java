package com.test.java;

public class Ex15_Overloading {

	public static void main(String[] args) {
		
		/* 메소드, 오버로딩 Method Overloading
		- 메소드가 인자 리스트를 다양한 형태로 가질 수 있는 기술
		- 같은 이름의 메소드 + 인자를 다양하게
		
		메소드 오버로딩을 하는 이유?
		- 성능 향상(x)
		- 개발자 도움 (o) > 머리 나쁜 개발자들 위한 기술 > 메소드 이름 외우기 힘든 사람을 위해서
		
		메소드 오버로딩 구현 조건 가능
		1. 매개변수의 갯수
		2. 매개변수의 자료형
		
		메소드 오버로딩 구현 조건 불가능
		1. 매개변수의 이름
		2. 반환값의 자료형
		
		메소드를 선언하는 중
		1. public static void test(){} 				// 가능
		2. public static void test(){} 				// 불가능
		3. public static void test(int n){} 		// 가능
		4. public static void test(int m){}			// 불가능
		5. public static String test(String s){}	// 가능
		6. public static void test(int n, int m){}	// 가능
		7. public sttic int test(){}				// 불가능, 1번때문에
		
		*/
	
		// 요구사항 : 선을 출력하는 메소드
		// 추가사항 : 선의 모양을 다양하게
		drawLine();
		drawLine();
		drawLine();
		drawLine("*");
	} // main
	
	// 식별자 중독 > 숫자 붙이는 행동 절대 금지 > 의미 불분명
	// 메소드 생성 > 이름 ?
	public static void drawLine() {
		System.out.println("==============================");
	}
	
//	public static void drawLine() {
//		System.out.println("******************************");
//	}
	
	public static void drawLine(String s) {
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.println();
	}

	private static String test1() {

		// 1. 호출 구문 > 메소드 자동 생성 (Ctrl + 1 > create)
		// 2. 블럭 선택 > refactor > extract method
		
		String result = test1();
		System.out.println(result);
		
		/* 코드 컨벤션
		- 프로그래밍 코드 작성 시 지켜야할 규칙
		
		구글 + 자바 코딩 + 코드 컨벤션
		
		1. 수동 적용 > Ctrl + Shift + F
		2. 자동 적용(저장할 때) > save actions		
		*/
		
		// printf() > 형식 문자 사용 > 출력할 때만 사용 가능
		
		// 10 / 3 -> "3/3"
		
		System.out.println(10 / 3); // 3
		System.out.println(10.0 / 3); // 3.33333
		
		System.out.printf("%.1f\n", 10.0 / 3); // 3.3
		
		// 1. 자바 수학 기능
		// - round : 반올림 함수
		
		System.out.println(Math.round(10.0 / 3 * 10 / 10.0));
		
		// return String.valueOf(Math.round(10.0 / 3 * 10 / 10.0));
		// String.valueOf() -> String으로 변환
		
		// 2. 형식 문자열 지원 메소드
		//printf 메소드와 기능은 동일하지만 -> 결과를 출력 x, 결과를 반환 o
		
		// String result = String.format("%.1f", 10.0 / 3); 
		return result;
		
	}
} // class
