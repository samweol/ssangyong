package com.test.java.question.array2;

public class Q05 {

	public static void main(String[] args) {
		
		// 규칙
		// [0.2] , [1,1] [1,2] [1,3], [2,0] [2,1] [2,2] [2,3] [2,4]
		// [3,1] [3,2] [3,3] , [4,2] -> 출력된 곳
		// 1행은 3->3
		// 2행은 2->4
		// 3행은 1->5
		// 4행은 2->4
		// 5행은 3->3
		
		int[][] nums = new int[5][5];
		int mid = 5/2;
		
		// 데이터 입력 > 문제의 요구사항에 따라 수정 > 문제 풀이
		int n = 1;
		
		for (int i=0; i<5; i++) {
			if(i <= mid) { // 중간 기준보다 작으면 0,1,2까지
				for(int j=mid-i; j<=mid+i; j++) {
					nums[i][j] = n;
					n++;
				}
			} else { // 3,4
				for(int j=i-mid; j<=5+(mid-1)-i; j++) {
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
