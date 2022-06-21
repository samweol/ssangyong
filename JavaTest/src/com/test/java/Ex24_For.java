package com.test.java;

public class Ex24_For {

	public static void main(String[] args) {
		
//		m1();
//		m2();
//		m3();
		
		// 지역변수
//		m4();
		
//		m5();
//		m6();
//		m7();
		m8();
		
	}

	private static void m8() {
		
		// 별찍기
		for(int i=0; i<5; i++) { // 행만들기(변화x)
			
			for(int j=i; j<5; j++) { // 열만들기(변화o 5->1)
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<5; i++) { // 행만들기(변화x)
			
			for(int j=0; j<=i; j++) { // 열만들기(변화o 1->5)
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<5; i++) { // 행만들기(변화x)
			
			for(int j=0; j<(4-i); j++) { 
				System.out.print(" ");
			}
			
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println();
	}
	
	

	private static void m7() {
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				
				if(i == 5) {
					break; // 안쪽 for문만 탈출
				}
				System.out.printf("i : %d, j: %d\n", i, j);
			}
		}
		
	}

	private static void m6() {
		
		// 다중 루프를 사용할 때 주의할 점
		
		for(int i=0; i<10; i++) {
			for(int j=0; i<10; j++) {
				
				System.out.printf("i : %d, j: %d\n", i, j);
			}
		}
		
	}

	private static void m5() {
		
		// 구구단
		// - 2~9단 출력
		
		for(int i=2; i<=9; i++) {
			
			System.out.println("==========");
			System.out.printf("    %d단\n", i);
			System.out.println("==========");
			
			for(int j=2; j<=9; j++) {
				
				System.out.printf("%d * %d = %2d\n", i, j, i*j);
			}
		}
		
	}

	private static void m4() {
		
		// 지역 변수
		// - 메소드와 제어문내에서 선언한 변수
		
		if(true) {
			int a = 10;
			System.err.println(a);
		}
		
		if(true) {
			int a = 20;
			System.out.println(a);
		}
	}

	private static void m3() {
		
		// 학교
		
		for(int k=1; k<=3; k++) { //학년
			for(int j=1; j<=10; j++) { //반
				for(int i=1; i<=30; i++) { //학생루프
					System.out.printf("%d학년 %d반 %d번 학생\n", k, j, i);
				}
			}
		}
		
		
		
	}

	private static void m2() {
		
		/*
			제어문 중첩
			- 모든 제어문은 종류에 상관없이 서로 중첩할 수 있다.
			
			for문(반복문)끼리 중첩
			- 다중 반복문
			- 단일 for문
			- 2중 for문
			- 3중 for문
				
		*/
		
		// 단일 for문
		for (int i=0; i<10; i++) {
			System.out.println("i : " + i);
		}
		
		// 2중 for문
		for (int i=0; i<10; i++) {
			
			for (int j=0; j<10; j++) {
				//System.out.println("안녕하세요."); // 몇번 실행? 100번
				System.out.printf("i : %d, j : %d\n",i ,j);
			}
			
		}
		
		// 3중 for문
		for(int i=0; i<10; i++) { // 시침
			
			for(int j=0; j<10; j++) { // 분침
				
				for (int k=0; k<10; k++) { // 초침
					
					System.out.printf("i : %d, j : %d, k : %d\n", i, j, k);
				}
			}
		}
	}

	private static void m1() {
		
		// do while문
		
		/*		
		
		{
			실행문;
		}
		while (조건문);
		
		> 선실행(반복) 후 조건
		*/
		
		int num = 0;
		
		do {
			System.out.println(num);
			num++;
		} while(num<10);
	}
}
