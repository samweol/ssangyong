package com.test.java.question.overloading;

public class Q03 {

	public static void main(String[] args) {
		
		// 요구사항 : 인자로 받은 숫자들 중 양수의 갯수를 반환하는 메소드를 선언하시오. 
		
		// 메소드 호출
		
		int count = positive(10);
		System.out.printf("양수 : %d개\n", count);
		count = positive(10, 20);
		System.out.printf("양수 : %d개\n", count);
		count = positive(10, 20, -30);
		System.out.printf("양수 : %d개\n", count);
		count = positive(10, 20, -30, 40);
		System.out.printf("양수 : %d개\n", count);
		count = positive(10, 20, -30, 40, 50);
		System.out.printf("양수 : %d개\n", count);
		
		
	} //main
	
	// 메소드 선언
	public static int positive(int n1) {
		int count = 0;
		count += (n1 > 0)? 1 : 0;
		return count;
	}
	
	public static int positive(int n1, int n2) {
//		int count, count1, count2 = 0;
//		count1 = (n1 > 0)? 1 : 0;
//		count2 = (n2 > 0)? 1 : 0;
//		count = count1 + count2;
//		return count;
		int count = 0;
		count += (n1 > 0)? 1 : 0;
		count += (n2 > 0)? 1 : 0;
		return count;
	}
	
	public static int positive(int n1, int n2, int n3) {
//		int count, count1, count2, count3 = 0;
//		count1 = (n1 > 0)? 1 : 0;
//		count2 = (n2 > 0)? 1 : 0;
//		count3 = (n3 > 0)? 1 : 0;
//		count = count1 + count2 + count3;
//		return count;
		
		int count = 0;
		count += (n1 > 0)? 1 : 0;
		count += (n2 > 0)? 1 : 0;
		count += (n3 > 0)? 1 : 0;
		return count;
	}
	
	public static int positive(int n1, int n2, int n3, int n4) {
//		int count, count1, count2, count3, count4 = 0;
//		count1 = (n1 > 0)? 1 : 0;
//		count2 = (n2 > 0)? 1 : 0;
//		count3 = (n3 > 0)? 1 : 0;
//		count4 = (n4 > 0)? 1 : 0;
//		count = count1 + count2 + count3 + count4;
//		return count;
		
		int count = 0;
		count += (n1 > 0)? 1 : 0;
		count += (n2 > 0)? 1 : 0;
		count += (n3 > 0)? 1 : 0;
		count += (n4 > 0)? 1 : 0;
		return count;
	}
	
	public static int positive(int n1, int n2, int n3, int n4, int n5) {
//		int count, count1, count2, count3, count4, count5 = 0;
//		count1 = (n1 > 0)? 1 : 0;
//		count2 = (n2 > 0)? 1 : 0;
//		count3 = (n3 > 0)? 1 : 0;
//		count4 = (n4 > 0)? 1 : 0;
//		count5 = (n5 > 0)? 1 : 0;
//		count = count1 + count2 + count3 + count4 + count5;
//		return count;
		
		int count = 0;
		count += (n1 > 0)? 1 : 0;
		count += (n2 > 0)? 1 : 0;
		count += (n3 > 0)? 1 : 0;
		count += (n4 > 0)? 1 : 0;
		count += (n5 > 0)? 1 : 0;
		return count;
	}
} //class
