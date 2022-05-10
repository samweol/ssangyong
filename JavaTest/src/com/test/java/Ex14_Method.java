package com.test.java;

public class Ex14_Method {

	public static void main(String[] args) {
		/*
		public static void hello(){
			System.out.println();
		}
		
		
		접근지정자 정적키워드 반환자료형 메소드명 인자리스트 {
			
			구현코드
			업무코드(비즈니스 코드)
		}
		
		메소드 인자리스트
		- 파라미터(Parameters)
		- 인자(Arguments)
		- 매개변수
		- 메소드를 호출할 때 메소드에게 값을 전달할 수 있다. > 도구
		
		메소드 메개변수
		- 호출 -> (데이터) -> 메소드
		
		메소드 반환값
		- 메소드가 실행 뒤 호출한 곳에 값을 돌려주는 행동
		- 메소드 -> (데이터) -> 호출
		- 목적? 메소드 내에서 업무 진행의 결과를 이어서 사용하고자 변환
		
		 */
		
		System.out.println(getNum());
		
		int num = getNum();
		System.out.println(num);
		
		int age = 25;
		String result = checkAge(age);
		System.out.println(result);
	} //main
	
	public static int getNum() { //This is method must return a result of type int
		// 리턴문, 반환문
		// - getNum을 호출한 곳에 아래의 값을 돌려준다.
		// - 하나의 값만 반환 가능하다.
		
		return 10;
	}
	
	public static String checkAge(int age) {
		
		String result = age >= 19 ? "성인" : "미성년자";
		
		return result;
	}

}// class
