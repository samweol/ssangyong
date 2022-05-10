package com.test.java.question.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q02 {

public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("학생 수: ");
		int studentNum = Integer.parseInt(reader.readLine());
		
		// 입력한 학생 수에 맞는 배열 선언
		String[] nameArr = new String[studentNum];
		
		// 학생 수만큼 학생 이름 입력받아 배열에 저장
		for (int i = 0 ; i < studentNum ; i ++) {
			System.out.print("학생명: ");
			nameArr[i] = reader.readLine();
		}
		
		// 결과 출력
		System.out.printf("입력한 학생은 총 %d명 입니다.\n", studentNum);
		
		for (int i = 0 ;  i < studentNum ; i ++) {
			
			for (int j = 0 ; j < studentNum-i-1 ; j ++) {
				
				// 앞 문자열과 뒤 문자열을 compareTo 연산한 값이 음수이면 -> 내림차 순이면
				if (nameArr[j].compareTo(nameArr[j+1]) > 0) {
					//swap
					String temp = nameArr[j];
					nameArr[j] = nameArr[j+1];
					nameArr[j+1] = temp;
				}
			}
			System.out.printf("%d. %s\n", i+1, nameArr[i]);
		}
	}
} //class
