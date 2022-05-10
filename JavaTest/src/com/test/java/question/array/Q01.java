package com.test.java.question.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws Exception {
		
		// 요구사항 : 숫자를 5개 입력받아 배열에 담은 뒤 역순으로 출력하시오.
		
		// 입력받기		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] nums = new int[5];
		for(int i=0; i<5; i++) { //for문을 사용해서 5번을 바로바로 배열로 받기
			System.out.print("숫자 : ");
			nums[i] = Integer.parseInt(reader.readLine());
		}
		
		// 출력하기
		for(int i=4; i>=0; i--) { // for문을 반대로 해서 역순으로 출력하기
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}
		
	}
}
