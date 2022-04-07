package com.test.java.question.iteration;

public class Q07 {

	public static void main(String[] args) {
		
		// 1. 누적 변수 생성
		// 2. 루프 생성 
		//	2.1 값 누적
		//	2.2 값 출력
		//	2.3 조건 > 누적값 1000이상 > break
		// 3. 출력
		
		// for문 작성하기
		int sum = 0;
		for(int i=1; ;i++) {
			sum += i; // 값 누적
			if (sum > 1000) {
				System.out.printf("%d = %d", i, sum);
				break;
			} else {
				System.out.printf("%d + ", i);
			}
		}
		
//		System.out.printf("\b\b= %d\n", sum); cmd에서 직접 실행해야한다. 이때 bin 폴더에서 실행해야한다.
	}
}
