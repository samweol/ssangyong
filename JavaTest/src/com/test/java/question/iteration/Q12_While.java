package com.test.java.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q12_While {

	public static void main(String[] args) throws Exception {
		
		// 요구사항 : 사용자가 입력한 범위의 숫자까지 369 게임 과정을 출력하시오.
		// 조건 : 최대 3자리까지만 입력하시오.
		
		/* 설계
			1. 입력받기 > 유효성 검사 
			2. while문으로 출력 반복
				2.1 369 규칙 세우기
					2.1.1 3, 6, 9 가 들어가는 경우 짝으로 바꿔서 출력
					2.1.2 포함여부는 indexOf() 활용 > 포함하면 문자위치 미 포함하면 -1
		*/
		
		// 입력받기
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int time = Integer.parseInt(reader.readLine());
		int start = 1;
		int i = 1;
		
		// 유효성 검사
		if(time >=1 && time <= 999) {
			
			// while문으로 time 횟수만큼 반복문 돌리기
			while (i <= time) {
				
				if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9 || i / 10 == 3 || i / 10 == 6
						|| i / 10 == 9 || i / 100 == 3 || i / 100 == 6 || i / 100 == 9) {
					
					System.out.print("짝 ");
				} else {
					System.out.print(i + " ");
				}
				i++;
			}
			
		} else {
			
		}
	}
}
