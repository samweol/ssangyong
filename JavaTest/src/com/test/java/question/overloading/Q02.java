package com.test.java.question.overloading;

public class Q02 {

	public static void main(String[] args) {
		// 요구사항 : 인자로 받은 이름들을 직급 순으로 출력하는 메소드를 선언하시오. 
		
		// 메소드 호출
		position("홍길동");
		position("홍길동", "유재석");
		position("홍길동", "유재석", "박명수");
		position("홍길동", "유재석", "박명수", "정형돈");
	} //main
	
	// 메소드 선언
	public static void position(String s1) {
		System.out.printf("사원 : %s\n\n", s1);
	}
	
	public static void position(String s1, String s2) {
		System.out.printf("사원 : %s\n대리 : %s\n\n", s1, s2);
	}
	
	public static void position(String s1, String s2, String s3) {
		System.out.printf("사원 : %s\n대리 : %s\n과장 : %s\n\n", s1, s2, s3);
	}
	
	public static void position(String s1, String s2, String s3, String s4) {
		System.out.printf("사원 : %s\n대리 : %s\n과장 : %s\n부장 : %s\n\n", s1, s2, s3, s4);
	}
} //class
