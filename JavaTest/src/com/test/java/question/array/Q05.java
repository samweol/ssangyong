package com.test.java.question.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws Exception {
		
		// 요구사항 : 난수를 담고 있는 배열을 생성한 뒤 아래와 같이 출력하시오.
		// 조건 : 난수를 20개 발생 후 배열에 넣는다.
		// 조건 : 난수는 1~20 사이
		// 조건 : 배열을 탐색하여 범위에 만족하는 숫자만 출력한다.
		
		/* 설계
			- 만약 생성된 수가 최소~최대 범위 밖이라면 다음값을 넣어버려서 삭제해버리기?
		
		
		*/
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("최대 범위 : ");
		int max = Integer.parseInt(reader.readLine());
		
		System.out.print("최소 범위 : ");
		int min = Integer.parseInt(reader.readLine());
		
		// 난수 배열 생성하기
		int[] arr = makeRandomArray(20);
		
		// 출력하기
		
		// 1. 원본
		String before = dump(arr);		
		System.out.printf("원본 : %s\n", before);
		
		// 2. 결과
		String after = dump(boundaryArray(arr, min, max));
		System.out.printf("결과 : %s\n", after);
		
	}//main
	
	public static int[] boundaryArray(int[] arr, int min, int max) {
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] < min || arr[i] > max) {
				
				if(arr[i] >= min && arr[i] <= max) {
					
				}
				
			}
			
		}
		
		return arr;
		
	}
	
	public static String dump(int[] arr) {
		
		String start = "";
		
		for(int i=0; i<arr.length; i++) {
			
			start += arr[i] + ",";
			
		}
		
		String result = String.format("%s\b", start);
		return result;
	}
	
	public static int[] makeRandomArray(int num) {
		
		int[] arr = new int[num];
		// for문을 사용해서 발생하는 난수를 배열안에 넣기
		for(int i=0; i<20; i++) {
			arr[i] = (int)(Math.random() * 20 + 1);
		}
		
		return arr;
	}
	
}//class
