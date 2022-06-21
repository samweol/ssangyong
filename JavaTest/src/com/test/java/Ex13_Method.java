package com.test.java;

public class Ex13_Method {

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
		
		
		 */
		
		hello();
		hello2();
		hello3();
		hello4();
		
		helloEveryOne("홍길동");
		helloEveryOne("아무개"); // 실인자
		
		checkAge(17);
		checkAge(20);
		
		// 실인지와 가인자의 자료형은 동일해야 한다.
		// checkAge("스무살");
		
		// 실인자와 가인자의 갯수가 동일해야한다.
		// checkAge();
		
		Score(100, 90, 80);
		// Score(100, 90);
		// 실인자와 가인자의 순서가 동일해야 한다.
		
		// 구현 메소드 > 각각의 담당 업무 구현 > 담당자
		// 메인 메소드 > 구현 메소드들을 사용해서 흐름 생성
		
		checkNumber(10);
		checkNumber(-5);
		
	} // main
	
	public static void checkNumber(int num) {
		// 양수? 음수? > 삼항연산자 사용
		
//		String result = (num > 0) ? "양수" : "양수아님";
		String result = (num > 0) ? "양수" : (num<0) ? "음수" : "0";
		System.out.printf("%d = %s\n", num, result);
	}
	
	// 주석 > Document 주석
	/**
	 * 성적을 처리합니다.
	 * @param kor 국어
	 * @param eng 영어
	 * @param math 수학
	 */
	public static void Score(int kor, int eng, int math) {
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총합 : " +(kor+eng+math));
	}
	
	public static void checkAge(int age) {
		String result = age >= 19 ? "성인" : "미성년자";
		System.out.printf("%d살은 %s입니다.\n", age, result);
	}
	
	// 메소드 가용성이 높아졌다. > 쓸모가 많아졌다.
	// 생산성 향상 > 코드 절감
	public static void helloEveryOne(String name) { // 가인자
		// String name ="홍길동";
		System.out.printf("%s님 안녕하세요.\n", name);
	}
	
	// 요구사항 : '홍길동'에게 인사를 하는 메소드를 선언하시오.
	public static void hello() {
		System.out.println("홍길동님 안녕하세요.");
	}
	
	// 추가사항 : '아무개'에게 인사를 하는 메소드를 추가하십시오.
	public static void hello2() {
		System.out.println("아무개님 안녕하세요.");
	}
	
	// 추가사항 : 우리 강의실에 있는 모든 사람마다 인사를 하는 메소드를 추가하시오.
	// 각각 30개의 코드 작성
	public static void hello3() {
		System.out.println("황혜연님 안녕하세요.");
	}
	
	public static void hello4() {
		System.out.println("정병직님 안녕하세요.");
	}
	
	// 추가사항 : 대한민국 사람 모두에게 인사하는 메소드를 추가하시오.
	// 말도 안되게 많이 해야함

} // class
