package com.test.java.question.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Q02 {

	public static void main(String[] args) {
		
		//요구사항 : 숫자를 한글로 바꾼 뒤 파일을 다른 이름으로 저장하시오.
		//조건
		//- 0 → 영, 1 → 일 ... 9 → 구
		//- 저장할 파일명: 숫자_변환.dat
		
		//파일 읽어오기
		try {
			
			File file = new File("C:\\class\\파일_입출력_문제\\숫자.txt");
			File file2 = new File("C:\\class\\파일_입출력_문제\\숫자_변환.txt");
			
			//읽어오기 + 쓰기
			BufferedReader reader = new BufferedReader(new FileReader(file));
			BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
			
			
			//한 글자씩 읽어오기
			int code = -1;
			
			while((code = reader.read()) != -1) {
				System.out.print((char)code);
				
				if((char)code == '0') {
					code = '영';
				} else if((char)code == '1') {
					code = '일';
				} else if((char)code == '2') {
					code = '이';
				} else if((char)code == '3') {
					code = '삼';
				} else if((char)code == '4') {
					code = '사';
				} else if((char)code == '5') {
					code = '오';
				} else if((char)code == '6') {
					code = '육';
				} else if((char)code == '7') {
					code = '칠';
				} else if((char)code == '8') {
					code = '팔';
				} else if((char)code == '9') {
					code = '구';
				}
				
				writer.write((char)code);
			}
			
			reader.close();
			writer.close();
			
			
		} catch (Exception e) {
			System.out.print("Q02.main");
			e.printStackTrace();
		}
	}
}
