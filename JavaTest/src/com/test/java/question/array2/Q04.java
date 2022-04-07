package com.test.java.question.array2;

public class Q04 {

	public static void main(String[] args) {
		
		// 규칙
		// 0행은 1-5열 출력
		// 1행은 1-4열 출력
		// 2행은 1-3열 출력
		// ...4행은 1열 출력
		
		int[][] nums = new int[5][5];
		
		// 데이터 입력 > 문제의 요구사항에 따라 수정 > 문제 풀이
		int n = 1;
		
		for (int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				nums[i][j] = n;
				n++;
			}
		}
		
		// 데이터 출력 > 수정 금지 !!!
		for (int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
		
	}
}
