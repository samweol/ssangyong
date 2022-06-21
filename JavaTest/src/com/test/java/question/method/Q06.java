package com.test.java.question.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q06 {
	public static void main(String[] args) throws IOException {
		// 요구사항 : 국어, 영어, 수학 점수를 전달하면 '합격' 혹은 '불합격'이라는 단어를 반환하는 메소드를 선언하시오.
		// 점수 입력 받기 - 국어
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("국어 : \n");
		String inputKor = reader.readLine();
		int kor = Integer.parseInt(inputKor);
		
		// 영어
		System.out.print("영어 : \n");
		String inputEng = reader.readLine();
		int eng = Integer.parseInt(inputEng);
		
		// 수학
		System.out.print("수학 : \n");
		String inputMath = reader.readLine();
		int math = Integer.parseInt(inputMath);
		
		// 메소드 호출
		String result = test(kor, eng, math);
		System.out.printf("%s입니다.\n", result);
		
	} // main
	
	//메소드 선언
	public static String test(int kor, int eng, int math) {
		// 평균 점수 구하기
		int average = (kor + eng + math)/3;
		String answer = (kor<40 || eng<40 || math<40)? "불합격" : (average>=60)? "합격" : "불합격";
		return answer;
	}

} // class
