package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws Exception {
		
		// 요구사항 : 학생의 국어 점수를 입려받아 성적을 출력하시오.
		decideKorScore();
	}

	private static void decideKorScore() throws Exception {
		
		// 입력 받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("점수 : ");
		int kor = Integer.parseInt(reader.readLine());
		char score = ' ';
		// 조건문 작성
		if (kor >=0 && kor <=100) {
			if(kor >=90) {
				score = 'A';
			} else if (kor >=80 && kor <= 89) {
				score = 'B';
			} else if (kor >= 70 && kor <= 79) {
				score = 'C';
			} else if (kor >= 60 && kor <= 69) {
				score = 'D';
			} else {
				score = 'F';
			}
			System.out.printf("입력한 %d점은 성적 %c입니다.",kor, score);
		} else {
			System.out.println("점수가 올바르지 않습니다. 0~100 사이의 값을 입력하시오.");
		}
		
		
	}
}
