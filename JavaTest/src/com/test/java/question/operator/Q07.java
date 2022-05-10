package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력 받기 (소문자 -> 대문자)
		System.out.print("문자 입력 : ");
		String word1 = reader.readLine();
		
		// string > char
		char small = word1.charAt(0);
		
		// char > int
		int ismall = small;
		System.out.printf("소문자 '%c'의 대문자는 '%c' 입니다. \n", small, (char)(ismall-32));
		
		// a = 97 , A = 65
		// 32 차이가 나기때문에 소문자를 입력하였을때의 숫자에 32를 빼준다. -> 그 후에 출력하기
		
		/* 더 생각해볼 것
		1. 소문자가 아닌 글자를 입력한다면?
		- 소문자의 범위(숫자로)안에 들지 않는다면 경고메시지를 띄우게한다.
		*/
//		int a = 65;
//		char b = a; //  char<->int 형변환은 명시적이지않아도된다.!
//		System.out.println((char)a); int>char 명시적형변환 'A'
		
		
	}

}
