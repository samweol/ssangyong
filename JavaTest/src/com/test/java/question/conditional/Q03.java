package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws Exception {
		
		// 요구사항 : 문자 1개를 입력받아 아래와 같이 출력하시오.
		
		makeWord();
	}

	private static void makeWord() throws Exception {
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자 : ");
		String alphabet = reader.readLine();
		String word = " ";
		
		// 조건문
		if (alphabet.equals("f")||alphabet.equals("F")||alphabet.equals("f")||alphabet.equals("F")||alphabet.equals("m")||alphabet.equals("M")||alphabet.equals("s")||alphabet.equals("S")||alphabet.equals("b")||alphabet.equals("B")) {
			if (alphabet.equals("f")||alphabet.equals("F")) {
				word = "Father";
			} else if (alphabet.equals("m")||alphabet.equals("M")) {
				word = "Mother";
			} else if (alphabet.equals("s")||alphabet.equals("S")) {
				word = "Sister";
			} else {
				word = "Brother";
			}
			System.out.println(word);
		} else {
			System.out.println("입력한 문자가 올바르지 않습니다.");
		}
		
	}
}
