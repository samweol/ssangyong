package com.test.java.question.collection;

import java.util.ArrayList;

public class Q01 {

	public static void main(String[] args) {
		
		ArrayList<String> list2 = new ArrayList<String>();
		
//		list2.add("홍길동");
//		list2.add("아무개");
//		list2.add("테스트");
//		list2.add("하하하");
//		list2.add("호호호"); 
//		
//		System.out.println(list2.get(7)); //IndexOutOfBoundsException
		
		// -------------------------------------------------
		
//		MyArrayList list = new MyArrayList();
//		
//		list.add("홍길동");
//		list.add("아무개");
//		list.add("테스트");
//		list.add("하하하");
//		list.add("호호호");
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(7)); //null
//		System.out.println();
		
//		for(int i=0; i<5; i++) {
//			System.out.println(list.get(i));
//		}
//		System.out.println();
		
//		System.out.println(list.size());
		
//		String temp = list.set(1, "서주예");
//		for(int i=0; i<5; i++) {
//		System.out.println(list.get(i));
//	}
//		System.out.println(temp);
		
//		String temp = list.remove(2);
//		System.out.println(temp);
//		System.out.println();
//		for(int i=0; i<list.size(); i++) {
//		System.out.println(list.get(i));
//		}
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		System.out.println();
//		
//		list.add(2, "김민교");
//		for(int i=0; i<list.size(); i++) {
//		System.out.println(list.get(i));
//		}
		
//		System.out.println(list.indexOf("홍길동"));
//		System.out.println(list.indexOf("하하하"));
		
		//배열 생성
		MyArrayList list = new MyArrayList();

		//추가
		list.add("홍길동");
		list.add("아무개");
		list.add("하하하");

		//읽기
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		//개수
		System.out.println(list.size());

		//탐색 + 읽기
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}

		//수정
		list.set(0, "우하하");
		System.out.println(list.get(0));

		//삭제
		list.remove(1);
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}

		//삽입
		list.add(1, "호호호");
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}

		//검색
		if (list.indexOf("홍길동") > -1) {
		      System.out.println("홍길동 있음");
		} else {
		      System.out.println("홍길동 없음");
		}

		//초기화
		list.clear();
		System.out.println(list.size());
	}
}
