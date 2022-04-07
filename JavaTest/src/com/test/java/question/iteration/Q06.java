package com.test.java.question.iteration;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws Exception {
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("시작 숫자 : ");
		int startNum = Integer.parseInt(reader.readLine());
		
		System.out.print("종료 숫자 : ");
		int endNum = Integer.parseInt(reader.readLine());
		
		int sum = 0;
		int change = 1;
		
		for (int i=startNum; i<=endNum; i++) {
			if (i == endNum) {
				System.out.printf("%d = ", i);
			} else if (change > 0) {
				System.out.printf("%d - ", i);
			} else {
				System.out.printf("%d + ", i);
			}
			sum += (i * change);
			change = change * (-1);
		}
		
		System.out.println(sum);
	}
}
