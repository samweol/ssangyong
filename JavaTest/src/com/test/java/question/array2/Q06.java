package com.test.java.question.array2;

public class Q06 {

	public static void main(String[] args) {
		
		// 규칙
		// 0-3행의 0,1,2,3 요소의 합을 4열에 작성한다.
		// 각 열의 합을 마지막 행에 작성한다.
		
		int[][] nums = new int[5][5];
		
		// 데이터 입력 > 문제의 요구사항에 따라 수정 > 문제 풀이
		int n = 1;
		
		for (int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				nums[i][j] = n;
				n++;
				
				
				nums[i][4] += nums[i][j]; // 4열의 값은 0-3열의 합이다.	
				nums[4][j] += nums[i][j];
				
			}
			nums[4][4] += nums[i][4];
			
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
