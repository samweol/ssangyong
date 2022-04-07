package com.test.java;

public class Ex09_Casting {

	public static void main(String[] args) {
		/*
			형변환, (자료)형변환, Casting, Data Type Casting
			- 코드를 유연하게 작성하기 위한 도구
			- int -> double
			- float -> short
			
		 1. 암시적 형변환(= 자동 타입 변환)
		 	- 큰형 = 작은형
		 	- 100% 안전
		 	- short = byte;
		 	- int = byte;
		 	- long = byte;
		 	- int = short;
		 	- long = short;
		 	- long = int;
		 */
		byte b1;
		short s1;
		
		b1 = 10; // 원본
		s1 = b1; // 복사, 자동 형변환 발생
		
		// 암시적인 형변환 발생 > 개발자가 모르게 자료형을 바꾸는 행동이 발생
		// (자료형)피연산자 : 형변환 연산자 > 피연산자의 자료형을 ()안의 자료형으로 바꿔서 반환해라
		// s1 = (short)b1; 원래 코드
		// 위의 복사가 안전하게 이루어졌는지 확인
		System.out.println(s1);
		/*
		 	
		 2. 명시적 형변환(= 강제 타입 변환)
		 - 작은형 = 큰형
		 - 경우에 따라 다르다. > 작은형이 소화할 수 있는 범위의 원본값이면 복사가 가능하고, 작은형이 소하할 수 없는 범위의 원본값이면 손실분이 생긴다. > 성공/실패
		 - 단, 개발자의 주의를 요함!
		 
		 '=' 연산자
		 - 피연산자 2개
		 - 할당 연산자, 대입 연산자
		 - 변수 = 값(리터럴, 변수)
		 - LValue = RValue
		 - LValue의 자료형과 RValue의 자료형은 반드시 동일해야 한다. > 이 규칙을 만족하지 못하면 컴파일 에러 발생
		 
		*/
		
		byte b2;
		short s2;
		
		s2 = 10; // 원본
		
		// 복사
		// 작은형 = 큰형
		// 형변환 연산자를 생략할 수 없다.
		b2 = (byte)s2; // 명시적 형변환(=강제 타입 변환)
		System.out.println(b2);
		
		// 은행 계좌 관리 프로그램
		// - 기업은행(한독) 계좌
		int money = 2100000000; // 21억(4byte)
		
		// 계좌 이체 -> 기업은행(잠실) 계좌
		short copy; // 2byte
		
		copy = (short)money; // 계좌 이체
		System.out.println("잠실 계좌 잔액 : " + copy); // 잠실 계좌 잔액 : 29952원
		
		// -> 이 과정동안 에러가 발생하지 않았기 때문에 무서운 것 !
		
		/* 자료형이 다른값들끼리 복사할 때
		1. 암시적 형변환 > 신경X > 확인
		2. 명시적 형변환 > 주의 !!!!! > 조심 !!!!
		
		명시적 형변환 시 발생하는 넘치는 현상 > 오버플로우(Overflow)
		1. 위로 넘치는 현상 > Overflow(오버 플로우)
		2. 아래로 넘치는 현상 > Underflow(언더 플로우)
		
		오버플로우가 발생할 만한 상황미리 예측해서 관리가 필요하다 !!
		*/
		
		// 정수형 리터럴은 int이다.
		
		// byte = int
		byte m1 = 10;
		// short = int
		short m2 = 10;
		// -> 서비스 문법
		
		// int = int
		int m3 = 10;
		
		// long = int
		int m4 = 10; // -> 암시적인 형 변환이 일어나고 있었음
		
		// float = double
		float f1 = 3.14F; // (float)3.14 -> 서비스 문법이 없어서 F를 붙이는 것이다.
		
		//double = double;
		double f2 = 3.14;
		
		/* 형변환
		1. 정수 -> 정수
		2. 실수 -> 실수
		3. 실수 -> 정수
		4. 정수 -> 실수
		*/
		
		int n1 = 1000;
		float n2 = n1;
		// 암시적 형변환 > 안전
		System.out.println(n2); // 1000.0
		
		int n3;
		float n4 = 1000;
		// 명시적 형변환 > 불안전
		n3 = (int)n4;
		System.out.println(n3); // 1000
		
		// int < float
		// long < float
		
		// 크기 정리 : byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		
		/* char, boolean, String > 형변환
			boolean > 형변환 대상 불가능
			- 값형과 참조형간에는 형변환이 불가능
		
			char > 형변환 대상 가능
			- 겉보기엔 문자, 내부는 숫자
			- char는 숫자형 잘형 중의 하나로 취급한다.
		*/
		
		char c1; //2byte
		short r1; //2byte
		
		c1 = 'A'; // 원본
		r1 = (short)c1; // 복사, 명시적 형변환
		System.out.println(r1); //65
		
		char c2;
		short r2;
		
		r2 = 65; // 원본
		c2 = (char)r2; // 복사, 명시적 형변환
		System.out.println(c2); //A
		
		// 결론 : char를 숫자로 형변환하려면 반드시 int 이상의 자료형으로 변환해야한다.
		
		char c3;
		int a3;
		
		c3 = 'A';
		a3 = c3; // 암시적 형변환
		System.out.println(a3);
		
		char c4;
		int a4;
		
		a4 = 65;
		c4 = (char) a4; // 명시적 형변환
		System.out.println(c4);
		
		// char <-> int
		
		// 각 문자들의 문자 코드값을 알고 있는게 좋다.
		
		// 유효성 검사
		// - 데이터가 업무에 타당한 데이터인지 확인하는 검사
		// - 모든 프로그램에 들어가는 필수 업무
		
		// ex) 사이트 회원 가입 > 이름 입력(한글로만 입력)
		
		String name = "홍A동";
		// (int)'홍' (int)'A' (int)'길' -> 한글 범위를 벗어나는 'A'가 있음을 확인할 수 있다.
		
		/* 형변환 복습
		1. int -> long
		2. long -> int
		
		3. int -> double
		4. double -> int
		5. long -> double
		6. double -> long
		
		7. int -> char
		8. char -> int
		*/
	}

}
