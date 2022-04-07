package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex25_Array {

	public static void main(String[] args) throws Exception {
		
		/* 
			배열, Array
			- 자료형
			- 집합 자료형 > 데이터를 여러개 저장할 수 있는 자료형
			- 같은 자료형을 저장하는 집합 > 같은 자료형 변수들의 집합
		
		*/
		
//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
//		m6();
//		m7();
//		m8();
//		m9();
//		m10();
		m11();
	}//main

	private static void m11() {
		
		// 1~10 사이의 난수
		int[] ns = new int[10];
		
		for(int i=0; i<ns.length; i++) {
			ns[i] = (int)(Math.random()*10 + 1);
		}
		
		// 배열안의 상태?? > 확인 작업!!!
		for(int i=0; i<ns.length; i++) {
			System.out.println(ns[i]);
		}
		
		System.out.println();
		printArray(ns);
		
		System.out.println(dump(ns));
		
		// 배열의 작업을 도와주는 클래스 > Arrays
		System.out.println(Arrays.toString(ns)); //덤프 메소드 > 배열 상태 확인용으로 사용!!!
		
	}
	
	// 배열의 상태를 문자열로 바꿔서 반환 > 덤프(dump)
	public static String dump(int[] ns) {
		
		String txt = "[";
		
		for(int i=0; i<ns.length; i++) {
			txt += ns[i] + ",";
		}
		
		txt += "]";
		return txt;
	}

	private static void m10() {
		
		// 배열 초기화 리스트
		
		int[] ns1 = new int[5];
		printArray(ns1); // 자동 초기화
		System.out.println();
		
		// 초기화
		ns1[0] = 100;
		ns1[1] = 90;
		ns1[2] = 80;
		ns1[3] = 70;
		ns1[4] = 60;
		printArray(ns1); //사용자 초기화
		System.out.println();
		
		int[] ns2 = new int[] {100, 90, 80, 70, 60}; //초기화 리스트
		printArray(ns2);
		System.out.println();
		
		int[] ns3 = {100, 90, 80, 70, 60}; //초기화 리스트
		printArray(ns3);
		System.out.println();
		
		String[] name1 = new String[3];
		
		name1[0] = "홍길동";
		name1[1] = "아무개";
		name1[2] = "하하하";
		
		String[] name2 = new String[] {"홍길동", "아무개", "하하하"};
	}

	private static void m9() {
		
		// 배열의 생성 직 후 상태
		
//		int a; // null 상태, 지역변수는 null 상태로 사용할 수 없다.
//		System.out.println(a);
		
		int[] ns = new int[3];
		
		System.out.println(ns[0]); //0
		System.out.println(ns[1]); 
		System.out.println(ns[2]);
		
		// 배열 자동 초기화
		// 배열(참조형)은 값형과 다르게 생성 직후 사용자(개발자)가 아무것도 안해도 자동으로 초기화가 된다.
		
		// 규칙
		// 1. 정수배열 - > 0
		// 2. 실수배열 -> 0.0
		// 3. 문자배열 -> \0(null)
		// 4. 논리배열 -> false
		// 5. 참조형 -> null
		
		double[] ns2 = new double[3];
		System.out.println(ns[0]); //0
		
		boolean[] ns3 = new boolean[3];
		System.out.println(ns3[0]); //false
		
		String[] ns4 = new String[3];
		System.out.println(ns4[0]); //null
	}

	private static void m8() {
		
		// 배열 복사
		// 1. 얕은 복사, Shallow Copy
		//	- 주소 복사
		//	- Side Effect 발생
		
		// 2. 깊은 복사, Deep Copy
		//	- 요소끼리 복사
		// - Side Effect 발생하지 않음
		int[] ns = new int[3];
		
		ns[0] = 10; 
		ns[1] = 20; 
		ns[2] = 30;
		
		int[] copy = new int[3]; 
		// 얕은 복사 시 = new int[3]; 작성 안해도됨.
		// 깊은 복사 시 = new int[3]; 작성 해야함.
		
		// 얕은 복사
//		copy = ns;
//		ns[0] = 100; // 원본 수정
		
		// 깊은 복사
		for(int i=0; i<ns.length; i++) {
			copy[i] = ns[i];
		}
		
		ns[0] = 100; // 원본 수정 > Side Effect가 발생하지 않음
		
		printArray(ns);
		System.out.println();
		
		printArray(copy);
		System.out.println();
		
		
	}
	
	public static void printArray(int[] ns) {
		
		for(int i=0; i<ns.length; i++) {
			System.out.printf("%d : %d\n", i, ns[i]);
		}
	}

	private static void m7() {
		
		// 배열 복사(= 참조형 복사)
		
		// 복사
		// 1. 값형 복사
		// 2. 참조형 복사
		
		/* 메모리 공간 > 일정한 규칙에 따라 저장되는 위치가 다름
		- Stack
		- Heap
		
		
		*/
		int a = 10; // Stack에 a가 만들어짐, 값형(Value Type)
		int b;
		
		// 값 형의 복사 > 공간이 가지는 값을 복사한다.
		b = a;
		
		// 원본 수정 > 복사본 영향 없음> Side Effct가 발생하지 않는다.
		a = 20;
		
		System.out.println("a : " + a); //20
		System.out.println("b: " + b); //10
		
		int[] ns = new int[3];// 참조형(Reference Type) 
		// int[] ns :  Stack에 ns가 만들어짐 > 공간안에는 공간을 만들수 없다. 공간안에는 값만 넣을 수 있다.
		// new int[3] : Heap에 방 3개가 만들어지고 연속적으로 만들어진다.
		// Heap에 만들어진 공간의 주소값을 int[] ns 에 넣어라 > 공간을 ns에 넣는 것이 아니라 주소'값'을 넣는 것이니 가능하다.
		
		ns[0]= 10;
		ns[1]= 20;
		ns[2]= 30;
		
		int[] copy = new int[3];
		
		//int[] = int[] > 좌우 자료형이 같으면 무조건 복사가 가능
		// 참조형의 복사 > 주소값을 복사한다.
		copy = ns; // ns의 값 하나하나를 복사하는 것이아니라 ns가 가지는 주소값을 copy에 복사하는 것이다.
		
		// 후에 원본 배열의 값을 수정
		// 원본 수정 > 복사본 영향 있음 > Side Effect 발생한다. > !!!!!! 주의 !!!!!!
		ns[0] = 100;
		
		System.out.println(ns[0]); //10 > 100
		System.out.println(copy[0]); //10 > 100
	}

	private static void m6() throws Exception {
		
		// 프로그램 > 메모리 공간 할당 > 변수 생성
		// ***** 메모리 할당 받은 공간의 크기는 불변이다. *****
		
		// 성적 처리 프로그램
		// - 배열의 길이? > 몇명이죠? > 300명 > 320~330명 여유 잡기 > 왜? > 변경이 불가능하기때문
		
		// 자바의 배열은 길이는 불변이지만, 동적할당은 가능하다.
		
		// 정적할당 > 컴파일 때 이미 배열의 길이가 정해짐
		int[] nums = new int[3];
		
		// 동적할당 > 컴파일 때는 배열의 길이를 모름 > 런타임 때 정해짐
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("배열 길이 : ");
		
		int length = Integer.parseInt(reader.readLine());
		
		int[] num2 = new int[length];
		
		System.out.println(num2.length);
		
	}

	private static void m5() {
		
		// 각 자료형 > 배열
		
		// 정수 배열(byte, short, int, long)
		byte[] list1 = new byte[3];
		list1[0] = 10;
		System.out.println(list1[0]);
		
		long[] list2 = new long[3];
		list2[0] = 100;
		System.out.println(list2[0]);
		
		// 실수 배열(float, double)
		double[] list3 = new double[3];
		list3[0] = 0.1;
		System.out.println(list3[0]);
		
		// 문자 배열(char)
		char[] list4 = new char[3];
		list4[0] = 'A';
		System.out.println(list4[0]);
		
		// 논리 배열(boolean)
		boolean[] list5 = new boolean[3];
		list5[0] = true;
		System.out.println(list5[0]);
		
		// 문자열 배열, 참조형 배열(String)
		String[] list6 = new String[3];
		list6[0] = "홍길동";
		System.out.println(list6[0]);
	}

	private static void m4() {
		
		int kors[] = new int[3];
		
		kors[0] = 100;
		kors[1] = 90;
		kors[2] = 80;
//		kors[3] = 70; // 실수로 한명 더 추가  
		//java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		
//		for (int i=0; i<=3; i++) { // 크기가 배열 선언시보다 크므로 오류 발생 (위와 동일)
//			System.out.printf("kors[%d] = %d\n", i, kors[i]); 
//		}
	}
		
		

	private static void m3() {
		
		// int[] > int 배열
		// kors > 변수명, 배열명
		// new > 객체 생성 연산자
		// int[3] > 3 > 배열의 길이 > 변수의 갯수
		int[] kors = new int[3];
		
		// 배열의 길이 == 방의 갯수
		System.out.println(kors.length); // 프로퍼티(Property), 필드(Field)
		
		int index = 0;
		kors[index] = 100; // 배열 0번째 방에 100을 넣어라
		
		index++;
		
		kors[index] = 90; // 배열 1번째 방에 90을 넣어라
		
		// 배열 방 > 요소(Element)
		// 배열 방번호 > 첨자(Index)
		// 자바 배열의 방번호는 0부터 시작한다. > Zero-based Index
		
		// 루프 변수(i)의 변화 > 배열의 방번호 변화
		for(int i=0; i<kors.length; i++) {
			
			kors[i] = 100;
		}
		
		int total = 0;
		
		for(int i=0; i<kors.length; i++) {
			total += kors[i];
		}
		
		double avg = total / (double)kors.length;
		
		System.out.printf("총점 : %d점, 평균 : %.1f점\n", total, avg);
		
	}

	private static void m2() {
		
		// 요구사항 : 학생 3명 > 국어 점수 > 총점, 평균
		// 추가사항 : 학생 수 증가 > 300명
		
		// 1. 배열 선언하기(생성하기)
		// - 자료형[] 변수명 = new 자료형[길이];
		// 2. 배열 사용하기(입/출력)
		
		// kors의 자료형? int[]입니다. > int 배열입니다.
		int[] kors = new int[300];
		
		// kors의 자료형 ? int[] 입니다.
		// kors[0]의 자료형? int 입니다.
		kors[0] = 100;
		kors[1] = 90;
		kors[2] = 80;
		
		// ...
		kors[299] = 100;
		
		int total = kors[0] + kors[1] + kors[2];
		double avg = total / (double)kors.length; // 배열의 길이
		
		System.out.printf("총점 : %d점, 평균 : %.1f점\n", total, avg);
	}

	private static void m1() {
		
		// ***** 같은 성격의 데이터(데이터의 성격(국어) + int)를 여러개를 취급하는 상황
		// 요구사항 : 학생 3명 > 국어 점수 > 총점, 평균
		// 추가사항 : 학생 수 증가 > 300명
		
		int kor1;
		int kor2;
		int kor3;
		// 변수 297개 더 필요
		
		kor1 = 100;
		kor2 = 90;
		kor3 = 80;
		// 점수 297개 더 필요
		
		int total = kor1 + kor2 + kor3; //297개 더 더하기
		double avg = total / 3.0; // 3.0 > 300.0
		
		System.out.printf("총점 : %d점, 평균 : %.1f점\n", total, avg);
	}
}//class
