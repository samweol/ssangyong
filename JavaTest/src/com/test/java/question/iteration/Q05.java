package com.test.java.question.iteration;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws Exception {
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("시작 숫자 : ");
		int startNum = Integer.parseInt(reader.readLine());
		System.out.print("종료 숫자 : ");
		int finishNum = Integer.parseInt(reader.readLine());
		
		// for문 작성하기 + 출력
		
		// 합계 구하기
		int sum = 0;
		for(int i=startNum; i<=finishNum; i++) {
			sum += i;
			if(i == finishNum) {
				System.out.print(i + " = ");
			} else {
				System.out.print(i + " + ");
			}			
		}
		System.out.println(sum);
	}
}
