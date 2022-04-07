package com.test.java.question.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q08 {

	public static void main(String[] args) throws Exception {
		
		// 요구사항 : 배열의 요소를 삭제하시오.
		// 조건
		// 1. 배열 길이 : 10
		// 2. 마지막 요소는 0으로 채우시오.
		// 설계 : 앞으로 한칸씩 당기고 마지막 칸 0으로 채우기
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("삭제 위치 : ");
		int index = Integer.parseInt(reader.readLine());
		
		// 배열 생성
		int[] arr = {5, 6, 1, 3, 2, 8, 7, 4, 10, 9};
		
		System.out.printf("원본 : %s\n", dump(arr));
		System.out.printf("결과 : %s\n", dump(deleteNum(arr, index)));
		
		
		
	}//main
	
	public static int[] deleteNum(int[] arr, int index) {
		
		for(int i=index; i<arr.length-1; i++) {
			
			arr[i] = arr[i+1];
			
		}
		arr[arr.length-1] = 0;
		
		return arr;
	}
	
		public static String dump(int[] list) {
		
		String start = "[";
		String finish = "]";
		
		// for문을 사용하여 배열을 String으로 바꾼다.
		for(int i=0; i<list.length; i++) {
			
			start = start + Integer.toString(list[i]) + ",";
		}
		
		String result = String.format("%s\b%s", start, finish );
		
		return result;
	}
	
}//class
