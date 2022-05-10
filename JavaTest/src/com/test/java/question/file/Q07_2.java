package com.test.java.question.file;

import java.io.File;
import java.util.HashSet;

public class Q07_2 {

	public static void main(String[] args) {
		
		File file1 = new File("C:\\class\\파일_디렉토리_문제\\동일 파일\\MusicA");
		File file2 = new File("C:\\class\\파일_디렉토리_문제\\동일 파일\\MusicB");
//		
		String[] list1 = file1.list();
		String[] list2 = file2.list();
//		
//		for(String s1 : list1) {
//			for(String s2 : list2) {
//				if(s1.equals(s2)) {
//					System.out.println(s1);
//					break;
//				}
//			}
//		}
		
		//HashSet > 중복값
		//1. 수업 중
		//2. 안 배운 기능도 추가
		
		//Set > 집합 > 교집합, 합집합, 차집합...
		HashSet<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		
		set1.add("빨강");
		set1.add("노랑");
		set1.add("파랑");
		set1.add("주황");
		set1.add("검정");
		
		set2.add("빨강");
		set2.add("녹색");
		set2.add("분홍");
		set2.add("주황");
		set2.add("검정");
		
//		set1.addAll(set2); //set1 + set 2 = 합집합		
//		System.out.println(set1); //[검정, 주황, 녹색, 빨강, 분홍, 노랑, 파랑]
		
//		set1.retainAll(set2); //교집합
//		System.out.println(set1); //[검정, 주황, 빨강]
		
//		set1.removeAll(set2); //차집합
//		System.out.println(set1); //[노랑, 파랑]
		
		//2.
		HashSet<String> list3 = new HashSet<String>();
		HashSet<String> list4 = new HashSet<String>();
		
		for(String s : list1) {
			list3.add(s);
		}
		
		for(String s : list2) {
			list4.add(s);
		}
		
		list3.retainAll(list4);
		System.out.println(list3);
		
	}
}
