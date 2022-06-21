package com.test.java.question.iteration;

public class Q20 {
	public static void main(String[] args) {
		
		
		int firstNum = 1;
		int secondNum = 1;
		int sum = 2;
		String num = "1 + 1 + ";
		for (int i=1; ; i++) {
			
			if (firstNum + secondNum > 100) {
				break;
			} else {
				if (i % 2 == 0) {
					firstNum += secondNum;
					sum += firstNum;
					num += firstNum + " + ";
				} else {
					secondNum += firstNum;
					sum += secondNum;
					num += secondNum + " + ";
				}				
			}
		}
	
		System.out.printf("%s= %d", num + "\b\b", sum);
	}
}
