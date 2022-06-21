package com.test.java.obj.stereo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex55_Exception {

	public static void main(String[] args) { // 여기서 예외 던지기를 써버리면 아무도 책임을 안진다는 것 > 에러 방치
		
		/*
		
			예외, Exception
			- 컴파일 발견 X > 실행 중 발견 O
			- 런타임 오류
			- 개발자 미리 예측 O, X
			
			카톡
			- 메시지 전송 기능
			
			예외 처리, Exception Handling
			1. 전통적인 방식
				- 제어문 사용(조건문)
			2. 전용 처리 방식
				- try catch finally문 사용
		
		
		*/
		
//		m1();
		// static이 없으면 에러 > 객체를 통해서 접근해야하는데 객체를 만들지않아서.
		
//		m2();
//		m3();
//		try {
//			m4();
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("본사 처리");
//		}
		m5();
	}//main

	private static void m5() {
		// 예외 던지기
		// 요구사항 : 숫자 입력 > 처리
		// 조건 : 반드시 짝수만 입력
		//		 홀수 > 에러
		
		int num = 5;
		
		if(num % 2 ==0) {
			System.out.println("업무 코드");
		} else {
			System.out.println("예외 처리");
		}
		
		try {
			
			if(num % 2 ==1 ) {
				throw new Exception("홀수를 입력했습니다."); //강제로 에러 발생
			}
			
			System.out.println("업무 코드");
		} catch (Exception e) {
			System.out.println("예외 처리");
			System.out.println(e.getMessage());
		}
	}

	private static void m4() throws Exception {
		// 예외 미루기
		// - 해당 영역에서 예외 처리를 할만한 상황이 안되면 다른 곳으로 예외 처리의 책임을 떠 넘길 수 있다.
		// - throws Exception
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// Unhandled exception type IOException > try & catch로 해결가능
		String input = reader.readLine();
		
		
	}

	private static void m3() {
		
		try {
		int num = 10;
		
		System.out.println(100 / num); // A. ArithmeticException
		
		//throw new ArithmeticException();
		
		int[] nums = {10, 20, 30, 40};
		
		System.out.println(nums[1]); // B. ArrayIndexOutOfBoundsException
		
		
		Parent p = new Parent();
		Child c;
		
		c = (Child)p; //C. ClassCastException
		} catch(ArithmeticException e) {
			//ArithmeticException e = new ArithmeticException();
			System.out.println("0으로 나누기");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 첨자 오류");
		} catch(ClassCastException e) {
			System.out.println("형변환 오류");
		} catch (Exception e) {
			// Exception > 모든 OOOException의 부모 클래스
			System.out.println("예외 처리");
		}
		
		
		
//		catch (Exception e) {
//			System.out.println("예외처리");
//			System.out.println(e.getMessage());
//		}
		
	}

	private static void m2() {
		//Exception 객체의 역할
		
		int num = 10;
		try {
			System.out.println(100 / num); // A
		} catch(Exception e) {
			System.out.println("0으로 나누기");
		}
		
		int[] nums = {10, 20, 30};
		try {
			System.out.println(nums[0]); // B
		} catch(Exception e) {
			System.out.println("배열 첨자 오류");
		}
		
		Parent p = new Parent();
		Child c;
		
		try {
			c = (Child)p; //C
		} catch(Exception e) {
			System.out.println("형변환 오류");
		}
	}

	// 메소드 자동 생성 > 생각?
	// 1. private
	// 2. static
	// 3. void
	// 4. ()
	private static void m1() {
		
		// 요구사항 : 숫자 입력받아 연산을 하시오.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = scan.nextInt();
		
		// 전통적인 방식
		if(num != 0) {
			// 비즈니스 코드(= 업무코드) > 주 목적!
			System.out.printf("100 / %d = %d\n", num, 100/num);
		} else {
			// 예외 처리 코드
			System.out.println("0을 입력하면 안됩니다.");
		}
		
		// 비권장
		if(num == 0) {
			// 예외 처리 코드
						System.out.println("0을 입력하면 안됩니다.");
		} else {
			// 비즈니스 코드(= 업무코드) > 주 목적!
			System.out.printf("100 / %d = %d\n", num, 100/num);
		}
		
		// try문
		// - try : 비즈니스 코드 작성
		// - cathc : 예외 처리 코드 작성
		
		// - 조건?
		// 1. 일단 try내부의 코드를 실행한다.
		// 2. 아무 문제 없음
		// 3. 빠져나감 > catch 실행 안함
		
		// 1. 일단 try내부의 코드를 실행한다.
		// 2. 에러 발생
		// 3. 남아있는 업무코드의 실행을 중단
		// 4. 즉시 catch로 이동한다.
		// 5. catch 실행
		
		// if문 vs try문
		// - if문 : 사전에 미리 검사를 해서 사고가 안나게 처리
		// - try문 : 일단 실행 > 감시 > 사고가 터지면 그때 처리
		
		// try의 영역 > 예외가 발생할 거 같다고 예측 가능한 최소한의 영역에만 적용
		try {
			// 비즈니스 코드(= 업무코드) > 주 목적!
			System.out.printf("100 / %d = %d\n", num, 100/num);
			System.out.println("나머지 업무 코드");
		} catch (Exception e) {
			// 예외 처리 코드
			System.out.println("0을 입력하면 안됩니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			
		}
		System.out.println("종료");
		// Exception e
		// - 예외 객체
		// - 예외가 발생한 상황에 대한 정보를 알려준다.
		
		
	}
}//Ex55

// 예제를 위해 생성
class Parent {
	
}

class Child extends Parent{
	
}