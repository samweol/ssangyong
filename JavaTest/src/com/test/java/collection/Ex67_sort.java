package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class Ex67_sort {

	public static void main(String[] args) {
		
//		m1();
		m2();
		
	}//main

	private static void m2() {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(1);
		nums.add(5);
		nums.add(2);
		nums.add(4);
		nums.add(3);
		
		System.out.println(nums);
		
		Collections.sort(nums);
		System.out.println(nums);
		
		Collections.sort(nums, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
			
				return o2 - o1;
			}
		});
		System.out.println(nums);
	
		
		nums.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				
				return 0;
			}
		});
	}

	private static void m1() {
		
		String[] names = {"홍길동", "아무개", "하하하", "호호호"};
		
		Arrays.sort(names); //오름차순
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				
				//o2 - o1
				return o2.compareTo(o1);
			}
		});
		System.out.println(Arrays.toString(names));
		
		Calendar[] dates = new Calendar[5]; //캘린더는 반드시 getInstance를 해야 만들어지는 것이다.
		
		for(int i=0; i<5; i++) {
			dates[i] = Calendar.getInstance();
		}
		
		dates[0].add(Calendar.DATE, 7);
		dates[1].add(Calendar.DATE, 2);
		dates[2].add(Calendar.DATE, 5);
		dates[3].add(Calendar.DATE, 1);
		dates[4].add(Calendar.DATE, 4);
		
		for(int i=0; i<5; i++) {
			System.out.printf("%tF\n", dates[i]);
		}
		System.out.println();
		
		Arrays.sort(dates);
		
		for(int i=0; i<5; i++) {
			System.out.printf("%tF\n", dates[i]);
		}
		System.out.println();
		
		Arrays.sort(dates, new Comparator<Calendar>() {
			@Override
			public int compare(Calendar o1, Calendar o2) {
				
				//return (int)(o2.getTimeInMillis() - o1.getTimeInMillis());
				return o2.compareTo(o1);
			}
		});
		
		for(int i=0; i<5; i++) {
			System.out.printf("%tF\n", dates[i]);
		}
	}
}//Ex67
