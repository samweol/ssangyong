package com.task.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		HashSet<String> set = new HashSet<String>();
		
		while(set.size()<20) {
			set.add(rnd.nextInt(100)+ "");
		}
		
		
		
		for(String s : set) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println(set.size());
		
	}
}
