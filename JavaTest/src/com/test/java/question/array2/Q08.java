package com.test.java.question.array2;

public class Q08 {

	public static void main(String[] args) {
		
		// 규칙
		// [0, 0] = 1
		// [0, 1] = 2, [1, 0] = 3
		// [0, 2] = 4, [1, 1] = 5, [2, 0] = 6
		// [0, 3] = 7, [2, 1] = 8, [1, 2] = 9, [3, 0] = 10
		
		int[][] nums = new int[5][5];
		
		// 데이터 입력 > 문제의 요구사항에 따라 수정 > 문제 풀이
		int n = 1;
		
		for (int i=0; i<5; i++) {
			for(int j=0; j<i; i++) {
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
