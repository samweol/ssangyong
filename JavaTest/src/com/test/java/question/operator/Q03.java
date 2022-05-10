package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// 넓이와 높이 입력 받기 + String > int
		System.out.print("너비(cm) : ");
		String input1 = reader.readLine();
		int width = Integer.parseInt(input1);
		// int width = Integer.parseInt(reader.readLine());
		
		System.out.print("높이(cm) : ");
		String input2 = reader.readLine(); 
		int height = Integer.parseInt(input2);
		
		// 답 구하기
		int area = width*height;
		
		// 출력
		
		System.out.printf("사각형의 넓이는 %d cm^2입니다.\n", area);
		System.out.printf("사각형의 둘레는 %d cm입니다.\n", (width+height)*2);
		// 간편하게 쓰기 vs 직관적으로 보이게 쓰기
		// 값을 반복적으로 쓸 시에 변수로 따로 빼서 해놓는게 편함! > 현재는 출력만하면되니까 프린트문에 넣었음!
		// 값을 치환하지 않는 경우에는 input이 아닌 알아먹을 수 있는 변수명을 설정해줘야함!
	}

}
