package com.test.java;

public class Ex29_String {

	public static void main(String[] args) {
		
		// 1. 메모리의 공간은 한번 할당되면 더 이상 늘리거나 줄일 수 없다.
		// 2. "문자열은 불변이다." > 한번 만들어진 문자열은 절대 수정할 수 없다.
		// 3. 문자열은 참조형이다.
		
		// 자바의 자료형
		// 1. 값형
		//	- 값이 변경되어도 공간의 크기는 변화가 없다.
		// 2. 참조형
		//	- 값이 변경되면 공간의 크기가 변한다. 
		
		
//		m1();
		m2();
		
		
		
	}

	private static void m2() {
		
		//String vs StringBuilder
		// - 문자열
		
		String s1 = "홍길동"; // 문자열 리터럴 사용("")
		String s3 = new String("홍길동"); // 문자열의 원래 모습
		StringBuilder s2 = new StringBuilder("홍길동"); // 참조형의 기본 코드
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		
		// StringBuilder > 기존의 String에 비해 가지는 장점 > 수정 작업에 강하다.
		
		// 일반적인 문자열 > String 사용
		// 하드한 수정 작업 > StringBuilder 사용
		
		long begin = System.nanoTime();
		
		String txt1 = "홍길동";
		
		for(int i=0; i<100000; i++) {
			txt1 = txt1 + "."; // 수정작업
		}
		
		long end = System.nanoTime();
		
		System.out.println(txt1.length());
		System.out.println(end-begin + "ns");
		
		begin = System.nanoTime();
		
		StringBuilder txt2 = new StringBuilder("홍길동");
		
		for(int i=0; i<100000; i++) {
			txt2.append("."); //txt1 = txt1 + "."; // 가비지(Garbage) 발생 안함
		}
		
		end = System.nanoTime();
		
		System.out.println(txt2.length());
		System.out.println(end - begin + "ns");
	}

	public static void m1() {
		// *** 모든 값형은 어떤 데이터를 넣더라도 공간의 크기가 불변이다. ***
		int n1 = 10; //4byte
		int n2 = 20; //4byte
		
		n1 = 1000000000;
		
		// 문자열은 글자의 길이에 따라 저장되는 공간의 크기가 달라질 수 있다.
		String s1 = "홍길동"; //6byte -> 100번지
		String s2 = "아무개"; // 6byte
		System.out.println(s1);
		
		s1 = "홍길동안녕하세요"; // 새로운 주소를 갖는 방을 만들어서 s1을 수정한다. -> 300번지		
		System.out.println(s1);
		
		// 자료형 > int
		int a = 10;			//4byte
		int b = 20;			//4byte
		int c = 10000000;	//4byte
		
		// 자료형 > int[]
		int[] alist = new int[3]; 	//12byte
		int[] blist = new int[5]; 	//20byte
		int[] clist = new int[10];	//40byte
		
		// 자료형 > String
		String t1 = "홍길동";			//6byte
		String t2 = "홍";			//4byte
		String t3 = "홍길동입니다.";	//14byte
		
		String txt = "홍길동";
		
		txt = "아무개";
		
		// 참조형은 모두 같은 주소를 공유할 수 있다.
		// 같은 지역에 한해서(같은 메소드 내에서만)
		String name1 = "홍길동";
		String name2 = "홍길동";
		String name3 = "홍길동";
		
		// 문자열은 불변이다. -> Heap 영역안에 생성된 내용을 절대 수정하지 않는다.
		// 둘이 같은 주소를 공유
		String z1 = "홍길동";
		String z2 = "홍길동";
		
		z1 = "홍길남";
		System.out.println();
		System.out.println();
		//z2 도 홍길남으로 변경
		
		// 문자열을 대상하는 피해야 하는 행동 > 상황 파악
		// 1. 문자열의 잦은 수정
		// 2. 큰 문자열의 수정
		
		String txt1 = "홍길동";
		
		for(int i=0; i<100; i++) {
			txt1 = txt1 + "님"; //누적 -> 수정
		}
		
		System.out.println(txt1);
		System.out.println(txt1.length());
	}
}
