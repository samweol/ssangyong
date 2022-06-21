package com.test.java.question.conditional;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q09 {

	public static void main(String[] args) throws Exception {
		
		// 요구사항 : 년도를 입력받아 해당 년도가 '평년'인지 '윤년'인지 출력하시오.
		
		decideYear();
	}

	private static void decideYear() throws Exception {
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("년도 입력 : ");
		int year = Integer.parseInt(reader.readLine());
		
		/* 조건
		a. 년도를 4로 나눈다.
			- 떨어지면 b 검사
			- 떨어지지 않으면 평년
		b. 년도를 100으로 나눈다.
			- 떨어지면 c 검사
			- 떨어지지 않으면 윤년
		c. 년도를 400으로 나눈다.
			- 떨어지면 윤년
			- 떨어지지 않으면 평년
		- Calendar 클래스 사용 금지
		 */
		
		String yearType = " ";
		// 조건문 작성
		if (year % 4 == 0) {
			if (year % 100 ==0) {
				if (year % 400 == 0) {
					yearType = "윤년";
				} else {
					yearType = "평년";
				}
				
			} else {
				yearType = "윤년";
			}
			
		} else {
			yearType = "평년";
		}
		System.out.printf("%d년은 '%s'입니다.", year, yearType);
	}
}
