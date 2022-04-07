package com.test.java.question.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws Exception {
		
		// 요구사항 : 배열에 요소를 삽입하시오.
		// 조건 : 배열 길이 = 10
		// 조건 : 마지막요소는 우측으로 옮겨질 공간이 없으면 삭제된다.
		
		// 방법 : 삽입할 위치 이후의 배열요소를 다 뒤로 한칸씩 옮기고, 삽입한다.
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("삽입 위치 : ");
		int index = Integer.parseInt(reader.readLine());
		
		System.out.print("값 : ");
		int num = Integer.parseInt(reader.readLine());
		
		// 배열 생성
		int[] arr = {5, 6, 1, 3, 2, 8, 7, 4, 10 ,9};		
		
		System.out.printf("원본 : %s\n", dump(arr));
		
		int[] result = addNum(arr, index, num);
		System.out.printf("결과 : %s\n", dump(result));

	}//main
	
	public static int[] addNum(int[] arr ,int index, int num) {
		
		for (int i=8; i>=index; i--) {
			arr[i+1] = arr[i];
		}
		
		arr[index] = num;
		
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
