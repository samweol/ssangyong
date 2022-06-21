package com.test.java.question.array;

public class Q06 {

	public static void main(String[] args) {
		
		// 요구사항 : 중복되지 않는 임의의 숫자 6개를 만드시오. (로또)
		// 조건 : 숫자의 범위 1~45
		// 조건 : 오름차순 정렬
		
		// 임의의 숫자 6개 만들기
		int[] lottoArray = makeRandomArray(6);
		int[] checkLottoArray = checkNum(lottoArray);
		compareNum(checkLottoArray);
		String resultLottoNum = dump(checkLottoArray);
		System.out.println(resultLottoNum);
		
		
	}//main
	
	public static int[] checkNum(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr.length-i-1; j++) {
				
				if(arr[j] == arr[j+1]) {
					
					arr[j+1] = (int)(Math.random()*6+1);
				}
				
			}
			
		}
		
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
	
	public static int[] makeRandomArray(int num) {
		
		int[] arr = new int[num];
		// for문을 사용해서 발생하는 난수를 배열안에 넣기
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 6 + 1);
		}
		
		return arr;
	}
	
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
