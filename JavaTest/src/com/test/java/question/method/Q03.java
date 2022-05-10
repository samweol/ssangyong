package com.test.java.question.method;

public class Q03 {
	public static void main(String[] args) {
		
		// 요구사항 : 숫자 1개를 전달하면 4자리로 출력하는 메소드를 선언하시오.
		// 해결방법 : 4자리를 확보해서 출력하기 > %4d로 해결 > 이 경우 빈칸으로 나옴 > %04d로 하는 경우 빈칸에 0이 들어감
		
		// 메소드 호출
		digit(1);
		digit(12);
		digit(321);
		digit(5678);
		digit(98765);
	} // main
	
	// 메소드 선언
	public static void digit(int num) {
		System.out.printf("%d -> %04d\n", num, num);
	}

} // class
