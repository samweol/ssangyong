package com.test.java.question.array2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws Exception {
		
		// 요구사항 : 성적을 입력받아 아래와 같이 출력하시시오.
		
		// 규칙
		// 과목마다 행은 증가하고 열은 동일 [1][0],[2][0] ... 
		// 근데 밑에서부터 출력해야함. 맨 밑이 국어로 볼시 [9,0]
		
		String[][] score = new String[10][3];
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어 점수 : ");
		int kor = Integer.parseInt(reader.readLine());
		
		System.out.print("영어 점수 : ");
		int eng = Integer.parseInt(reader.readLine());
		
		System.out.print("수학 점수 : ");
		int math = Integer.parseInt(reader.readLine());
		
		
		
		// 데이터 입력 > 문제의 요구사항에 따라 수정 > 문제 풀이
		
		// 국어
		for (int i=9; i>10-kor/10-1; i--) {
			for(int j=0; j<3; j++) {
				score[i][0] = "■";
			}
		}
		
		// 영어
		for (int i=9; i>10-eng/10-1; i--) {
			for(int j=0; j<3; j++) {
				score[i][1] = "■";
			}
		}
		
		// 수학
		for (int i=9; i>10-math/10-1; i--) {
			for(int j=0; j<3; j++) {
				score[i][2] = "■";
			}
		}
		
		// null 처리
		for (int i=0; i<10; i++) {
			for(int j=0; j<3; j++) {
				
				if(score[i][j] == null)
				score[i][j] = " ";
			}
		}
		
		
		// 데이터 출력 > 수정 금지 !!!
		for (int i=0; i<10; i++) {
			for(int j=0; j<3; j++) {
				System.out.printf("%5s", score[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("   -------------");
		System.out.println("   국어  영어  수학");
	}
}
