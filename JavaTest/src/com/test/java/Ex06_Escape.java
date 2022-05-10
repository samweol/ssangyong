package com.test.java;

public class Ex06_Escape {

	public static void main(String[] args) {
		
		// 내가 만든 프로그램을 다른 사람에게 주고 싶다 !! > 배포
		// 자바의 기본 배포 단위 > 소스 파일을 컴파일 결과물(*.class) > jar > 자바 압축파일
		
		int age = 20;
		System.out.println("안녕하세요. 저는 " + age + "살 입니다.");
		
		/* 특수 문자 > Escape Sequence
		- 컴파일러가 번역을 할 때, 미리 약속된 표현을 만나면 그 표현을 바로 출력하지 않고, 약속에 따라 처리를 한 후에 출력하는 구성 요소
		- 자료형 > char
		
		1. \n
		- new line, line feed
		- 개행 문자 
		char c1 = '\n';
		*/
		
		// 요구사항 > "안녕하세요. 홍길동입니다." 출력해주세요.
		// 수정사항 > "안녕하세요." , "홍길동입니다." 각각 다른 라인에 출력해주세요.
		// 믄자열 리터럴에는 엔터를 넣을 수 없다.
		
		String msg = "안녕하세요. \n홍길동입니다."; // 수정사항에 따라 \n을 추가하여 줄바꿈을 한다.
		System.out.println(msg);	
		System.out.println();
		
		/*
		2. \r
		- carriage return
		- 커서(캐럿)의 위치를 현재 라인의 맨앞(첫번째 열)으로 이동
		- 키보드 > Home 키
		*/
		
		msg = "안녕하세요. \r홍길동";
		System.out.println(msg);
		
		/* 운영체제(os)
		1. 윈도우 : \r\n이 엔터
		2. 맥os : \r이 엔터
		3. 리눅스 : \n이 엔터
		
		3. \t
		- 탭문자, tab
		- 현재 위치에서 가장 가까운 tab으로 이동해라 (tab은 8칸 마다 있다.)
		*/
		
		msg = "하나\t둘\t셋\t넷";
		System.out.println(msg);
		
		/* 4. \b
		- Backspace
		- 콘솔 > 동작 o
		- 이클립스 콘솔 > 동작 x
		*/
		
		msg = "홍길동\b입니다.";
		System.out.println(msg);
		
		/* 5. \", \', \\
		- 이미 무언가를 하는 문자들을 의미 없게 만드는 역할
		*/
		
		// 요구사항 > 화면 > 홍길동 : "안녕하세요."
		
		System.out.println("홍길동 : " + "\"안녕하세요.\"");
		
		// 연산 반향 (왼쪽 -> 오른쪽)
		// 자바 > 변수를 만들고 초기화를 하지 않으면 사용이 불가능하다. 
	}

}
