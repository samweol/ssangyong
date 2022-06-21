package com.test.java.question.iteration;

public class Q19 {
public static void main(String[] args) {
		
		
		
		for (int i = 0; i < 100; i += 10) {
			int sum = 0;
			for (int j=1+i; j<=i+10; j++) {
				sum += j;
			}
			System.out.printf("%2d ~ %3d : %3d\n", 1 + i, i + 10, sum);



		}
	}
}
