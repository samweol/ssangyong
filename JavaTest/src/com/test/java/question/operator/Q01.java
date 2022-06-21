package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// 태어난 년도 입력 받기
		System.out.print("태어난 년도 : ");
		String year = reader.readLine();
		
		// String > int
		int iyear = Integer.parseInt(year);
		
		// 출력하기
		System.out.printf("나이 : %d\n", 2022-iyear+1);
		
		/* 더 생각해볼 것
		1. 숫자가 아닌 값을 입력하면?
			- if 절을 활용하여 숫자가 아닌 값을 입력하였을 때 오류메시지를 띄우게 하거나 다시 태어난 년도를 작성하는 창을 띄운다.
			- 삼항문산자를 이용한다. 
		2. 올바른 년도가 아닌 값을 입력하면? 음수를 입력하면?
			- 위와 같다.
		3. 올해가 2022년이 아니라면?
			- 매년 새로 갱신하거나, 그 해의 년도를 받는 메소드를 사용한다.
		
		*/
		
		// 변수따로빼기
	}

}
