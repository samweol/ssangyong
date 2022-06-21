package com.test.java.question.array2;

public class Q01 {

	public static void main(String[] args) {
		
		// 규칙 찾기
		// 1. i가 0, 2, 4인 행은 j의 값이 1 씩 오른쪽으로 증가한다.
		// 2. i가 1, 3인 행은 j의 값이 1씩 왼쪽으로 증가한다.
		
		int[][] nums = new int[5][5];
		
		// 데이터 입력 > 문제의 요구사항에 따라 수정 > 문제 풀이
		int n = 1;
		
		for (int i=0; i<5; i++) {
			
			if(i%2 == 0) { // i가 0, 2, 4이면
				for(int j=0; j<5; j++) {
					nums[i][j] = n;
					n++;
				}
				
			} else { // i가 1,3 이면
				for(int j=4; j>=0; j--) {
					nums[i][j] = n;
					n++;
				}
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
