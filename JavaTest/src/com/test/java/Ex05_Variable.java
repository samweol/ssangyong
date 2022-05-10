package com.test.java;

public class Ex05_Variable {

	public static void main(String[] args) {
		// 1. 각 자료형 변수 만들기
		// 2. 각 자료형 리터럴로 만드는 방법
		
		// 정수형 > 표기 : 숫자를 있는 그대로 나열하면 된다.
		byte b1;
		b1 = 10; // 10 > 정수형 리터럴
		System.out.println(b1);
		
		// 자료형의 최대, 최소 범위 값 수를 알려주는 상수사용
		b1 = Byte.MAX_VALUE; // final 상수 (JDK가 제공하는 상수)
		System.out.println(b1);
		
		b1 = Byte.MIN_VALUE;
		System.out.println(b1);
		
		short s1;
		s1 = 3000;
		System.out.println(s1);
		
		s1 = Short.MAX_VALUE;
		System.out.println(s1);
		
		int n1;
		n1 = 1000000000;
		System.out.println(n1);
		
		n1 = Integer.MAX_VALUE;
		System.out.println(n1);
		
		long l1;
		l1 = 100000000;
		System.out.println(l1);
		
		// 정수형 리터럴은 int 범위를 벗어나게 표현할 수 없다.
		l1 = 2300000000L; // 끝에 L을 적어주지 않으면 오류가 발생
		
		l1 = Long.MAX_VALUE;
		System.out.println(l1);
		
		
		// 변수만 자료형이 있는게 아니라, 모든 리터럴(상수)도 자료형이 있다.
		byte b2 = 10;
		short s2 = 10;
		int n2 = 10;
		long l2 = 10;
		
		System.out.println(b2);
		System.out.println(s2);
		System.out.println(n2);
		System.out.println(l2);
		// 정수형 리터럴의 int 이다.
		
		// 64bit 운영체제 > 32bit 운영체제 > 16bit > 8bit
		// CPU가 한번에 메모리로부터 가져와서 처리하는 데이터의 양
		// 예로부터 프로그래밍 언어의 'int' 자료형은 운영체제의 bit와 동일하다.
		
		// 실수형
		// 실수형 리터럴(상수)는 float인가? double 인가? -> double 이다.
		
		float f1;
		f1 = 3.14F; // 실수형 리터럴 표기법, F를 붙이지 않으면 오류가 발생한다.
		System.out.println(f1);
		
		double d1;
		d1 = 3.14;
		System.out.println(d1);
		
		// 보통 실수형은 잘 사용 안한다 > 손실분 발생때문에 반드시 필요한 경우나 손실분이 미미한 경우에만 사용한다.
		
		// 문자형
		char c1;
		c1 = 'a'; // 문자형 상수(리터럴) 표기법 '' 사용
		System.out.println(c1);
		
		// 두 글자 이상의 글자를 넣을 시 오류가 발생, char형은 반드시 1개의 문자만 저장할 수 있다.
		
		// 논리형
		// - 상수의 종류가 2가지 true, false 이다.
		boolean flag;
		flag = true; // 논리형 리터럴
		flag = false;
		System.out.println(flag);
		
		/* 문자열, String
		- 추가 자료형
		- 참조형에 속함
		- 문자의 열
		- 문자들이 열을 지어 있는 형태 > 문자의 집합
		*/
		
		String name;
		name = "서주예"; // 문자열 리터럴(상수) 표기법 "" 사용
		System.out.println(name);
		
		// String s = ""; // 빈문자열, Empty String
		// char c4 = '\0'; // 빈문자(Null) 문자
		
		// 9개의 자료형 = 값형(8개) + 참조형(1개)
		
		// 똑같은 값을 가지는 변수 2개 필요
		// int age = 20;
		// int copy = 20;
		
		// int age = 20;
		// int copy = age; // 이게 더 좋은 코드, 변수 = 변수가 가지는 값
		
		// 변수끼리 값을 복사할 수 있다.
		
		/* 연산자
		= : 대입
		+ : 합, 연결
		*/
		
		int a1 = 10;
		int a2 = 20;
		int a3 = a1 + a2; // 산술연산
		System.out.println(a3);
		
		String str1 = "홍길동";
		String str2 = "안녕하세요.";
		String str3 = str1 + str2; // 문자열 연산자 > Concat
		System.out.println(str3); // 홍길동안녕하세요 -> 출력값
		
		a1 = 100;
		a2 = 200;
		a3 = a1 + a2;
		
		// 화면에 출력 > 연산과정과 함께 결과를 출력하시오.
		System.out.println(a1 + "+" + a2 + "=" + a3); // 문자열 연산
		
		// 식별자를 ""안에 넣으면 식별자가 아닌 그냥 문자가 된다. > 의미를 잃어버린다.
		
		/* 숫자형 데이터를 저장할 변수를 만들 때 주의할 점!!(자료형 선택)
		1. 몸무게를 저장할 때 > 숫자O > 더하기 빼기 가능
		int weight;
		weight = 70;
		
		2. 주민등록번호 앞자리(생년월일) > 숫자X > 더하기 빼기 불가능
		int number; 절대 금지!!
		number = 980317;
		System.out.println(number);
		
		String number;
		number = "980317";
		
		3. 상품번호 > 숫자X
		int productNo;
		productNo = 123;
		System.out.println(productNo);
		
		* 2000년 3월 7일에 태어난 아기
		number = 000307; // int 이므로 16진수로 인식한다.
		System.ou.println(number); // 199 출력
		
		자바의 기수 표기법
		- 데이터 표시는 아래와 같이 3개의 기수법을 제공한다.
		- 출력은 기수법과 상관없이 항상 10진수로 출력된다.
		
		1. 10진수 > 100
		2. 8진수 > 0100 (앞에 0을 하나 붙이면 8진수가 된다.)
		3. 16진수 > 0x100 (앞에 0을 x개 붙이면 16진수가 된다.)
		*/
		
		/* 과제
		- 각 자료형(9개) > 변수 10개 만들기 > 문장으로 출력하시오.
		- 자료형 + 변수 + 리터럴 + 출력
		
		1. 주변의 데이터 검색 !! > 내 키(180cm)
		2. 1번의 데이터가 자바의 어떤 자료형 매칭 적합한지? > 매칭 > 정수 vs 실수 + 길이 > double
		3. 2의 자료형 > 변수 선언하기 > 의미있게
		4. 3의 변수 > 데이터 대입(자료형에 맞는 리터럴 표기법)
		5. 출력 > 문장으로 만들어서 출력
		
		> 자료형 마다 아래의 예제 10번씩
		double height = 180.5;
		System.out.println("제 키는" + height" + "입니다.");
		
		*/
		
		
		
	}

}
