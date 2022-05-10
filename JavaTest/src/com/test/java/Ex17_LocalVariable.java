package com.test.java;

public class Ex17_LocalVariable {

	public static void main(String[] args) {
		
		/*줄맞춤 Alt+Shift+Y*/
		// 자바 변수의 종류
		// 1. 멤버 변수
		// - 수업 x
		
		// 2. 지역 변수
		// - 수업 o
		
		// 지역 변수, Local Variable
		// - 메소드 안에서 선언한 변수
		// - 메소드 영역(= 지역, = 해당 변수의 지역)
		// - 자신이 선언된 메소드를 자신의 영역(Scope)이라고 생각한다. > 지역 변수는 자신의 영역 밖으로 나가지 못한다. > 외부 지역에서는 이 지역 변수를 접근이 불가능하다.
		// - 메소드 매개변수도 지역 변수이다. (역할 추가)
		
		// 지역 변수의 생명 주기, Life Cycle
		// - 어떤 요소가 언제 태어나서 ~ 언제 죽는지
		
		int a = 10; // a는 main 메소드의 지역 변수다.
		
		m1();
	}
	
	public static void m1() {
		int b = 20; // b는 m1 메소드의 지역 변수다.
		
		System.out.println(b);
//		System.out.println(a); a cannot be resolved to a variable.
	}
}
