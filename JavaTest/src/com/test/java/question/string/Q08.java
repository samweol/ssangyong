package com.test.java.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q08 {

	public static void main(String[] args) throws Exception {
		
		// 대문자가 두개이상일 때 해결 못함
		
		// 요구사항 : 영단어를 입력받아 분리하시오.
		// 조건
		// 1. 합성어를 입력한다.
		// 2. 합성어는 파스칼 표기법으로 입력한다.
		// 3. 출력은 각 단어를 공백으로 구분한다.

//		System.out.println((int)'A'); //65
//		System.out.println((int)'Z'); //90
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("단어: ");
		String input = reader.readLine();
		char[] word = new char[input.length()];
		
		// 비교할 배열 만들기 (대문자 알파벳을 모두 넣어서 배열 하나 만들기)
		int[] upperAlphabet = new int[(int)'Z'-(int)'A' + 1]; //26개짜리
		for(int i=0; i<upperAlphabet.length; i++) {
			
			upperAlphabet[i] = 65 + i;			
		}
		
		// 입력한 값을 배열안에 넣기
		for(int i=0; i<word.length; i++) {
			
			word[i] = input.charAt(i);
			
		}
		
		// 비교해서 대문자인 index 찾기
		int index = 0;
		for(int i=1; i<word.length; i++) {
			
			for(int j=0; j<upperAlphabet.length; j++) {
				
				if(word[i] == (char)upperAlphabet[j]) {
					index = i;
				}
				
			}
			
		}
		
		// 문자 자르기
		String frontWord = input.substring(0, index-1);
		String backWord = input.substring(index);
		
		// 출력
		System.out.printf("결과 : %s %s\n", frontWord, backWord);
	}
}
