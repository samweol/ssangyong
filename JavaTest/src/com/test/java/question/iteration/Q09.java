package com.test.java.question.iteration;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q09 {

	public static void main(String[] args) throws Exception {
		
		// 요구사항 : 컴퓨터가 1~10 사이의 숫자 1개를 생각하면 사용자가 맞추는 프로그램을 구현하시오.
		// 조건 : 시도 횟수가 10회가 넘어가면 프로그램을 강제로 종료하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.");
		
		// 시도 횟수 측정
		int time = 1;
		
		// 랜덤 숫자
		int randomNum = (int) (Math.random() * 10 + 1);
		
		for(;;) {
			System.out.print("숫자 : ");
			int numInput = Integer.parseInt(reader.readLine());
			if(numInput == randomNum) {
				System.out.println("맞았습니다.");
				break;
			} else {
				System.out.println("틀렸습니다.");
			}
			time ++;
			if (time == 10) {
				break;
			}
		}
		
		System.out.println();
		System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", randomNum);
		System.out.printf("정답을 맞추는데 시도한 횟수는 %d회 입니다.\n", time);
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
		
	}
}
