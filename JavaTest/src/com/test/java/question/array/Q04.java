package com.test.java.question.array;

public class Q04 {

	public static void main(String[] args) {
		
		// 요구사항 : 1~20 사이의 난수를 담고 있는 배열을 생성하고 최대값과 최소값을 출력하시오.
		// 조건 : 난수를 20개 발생 후 배열에 넣는다.
		// 조건 : 눈사는 1~20 사이
		
		// 설계 : 배열 생성하기 > 랜덤 수 넣기 > 크기 비교하기 > dump 메소드 만들기 > 최대는 배열의 마지막, 최소는 배열의 첫번째 출력
		
		// 필요한 배열 생성
		int[] arr = makeRandomArray(20);
			
		// dump 메소드 실행
		String result = dump(arr);
		System.out.printf("원본 : %s\n", result);
		
		// 크기 비교하기
		compareNum(arr);
		System.out.printf("최대값 : %d\n", arr[19]);
		System.out.printf("최소값 : %d\n", arr[0]);
		
		
	}//main
	
	public static int[] makeRandomArray(int num) {
		
		int[] arr = new int[num];
		// for문을 사용해서 발생하는 난수를 배열안에 넣기
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 20 + 1);
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
	
	// 크기 비교하는 메소드 만들기
	public static void compareNum(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++) {
			
			for(int j=0; j<arr.length-i-1; j++) {
				
				if(arr[j]>arr[j+1]) {
					
					int temp;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
				
			}
		}
				
	}
}//class
