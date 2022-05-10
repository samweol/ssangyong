package com.test.java.question.iteration;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q15 {
	public static void main(String[] args) throws Exception {
		
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("행:");
		int row = Integer.parseInt(reader.readLine());
		
		
		for (int i=0; i<row; i++) {
			
			for(int j=row-1; j>i; j--) {
				
				System.out.print(" "); // 공백 출력
			}
			for (int j=97; j<i+98; j++) {
				
				System.out.print((char)j); //기준선 기준 왼쪽
			}
			for (int j=97+i; j>96; j--) {
				
				System.out.print((char)j); //기준선 기준 오른쪽
			}
			
			System.out.println();
		}
	}
}
