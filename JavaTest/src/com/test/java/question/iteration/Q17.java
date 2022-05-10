package com.test.java.question.iteration;

public class Q17 {
	public static void main(String[] args) {
		
		//1. 입력된 값을 저장하 num 변수 생성
		//2. 다중 for문으로 완전수 계산
		//3. 완전수의 약수를 다시 계산하기 위해 for문 생성하고 divisor 변수에 저장
		//4. 출력


		String num = "";
		for (int i=1; i<=100; i++) {

			int sum = 0;

			for (int j=1; j<i; j++) {

				if (i % j == 0) {
					sum += j;
				} 
			}
			if (sum == i) {
				num += i;
				String divisor = "";
				for (int j=1; j<i; j++) {
					if (i % j ==0) {
						divisor += j + ", ";
					}
				}
				num += " = [" + divisor + "\b\b]\n";
			}
		}
		System.out.println(num);
	}
}
