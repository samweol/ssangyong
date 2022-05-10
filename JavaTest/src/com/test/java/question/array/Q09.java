package com.test.java.question.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q09 {

	public static void main(String[] args) throws Exception {
		
		// 요구사항 : 배열의 요소를 순차적으로 2개씩 더한 결과를 배열로 생성한 뒤 출력하시오.
		// 조건
		// 1. 원본 배열 길이 : 사용자 입력
		// 2. 원본 배열 요소 : 난수(1-9)
		// 3. 결과 배열 길이 : 사용자 입력 / 2
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("배열 길이 : ");
		int arrLength = Integer.parseInt(reader.readLine());
		
		// 사용자 입력값에 따른 배열 생성
		int[] beforeArr = new int[arrLength];
		
		// 원본 출력
		System.out.printf("원본 : %s\n", dump(makeRandomArray(beforeArr)));
		
		// 결과값을 출력한 배열 생성
		int[] afterArr = new int[arrLength/2];
		int[] result = addArr(beforeArr);
		int [] answer = replaceArr(result, afterArr);
		System.out.printf("결과 : %s\n", dump(answer));
	}//main
	
	public static int[] addArr(int[] arr) {
		
		for(int i=0; i<arr.length; i+=2) { // 2칸씩 넘어가기
			
			arr[i] = arr[i] + arr[i+1];
			
		}
		
		return arr;
	}
	
	public static int[] replaceArr(int[] arr, int[] answer) {
		
		for(int i=0; i<arr.length/2; i++) {
			
			answer[i] = arr[i*2];
			
		}
		
		return answer;
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
	
	public static int[] makeRandomArray(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = (int)(Math.random()*9+1);
		}
		
		return arr;
	}
	
}//class
