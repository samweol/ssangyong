package com.test.java.question.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Q07 {

	public static void main(String[] args) {
		
		//요구사항 : 직원들의 지각과 조퇴를 카운트하시오.
		//조건
		//- 출근 : 오전 9시
		//- 퇴근 : 오후 6시
		
		int lateCount = 0;
		int outCount = 0;
		
		try {
			
			File file = new File("C:\\class\\파일_입출력_문제\\출결.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				
				String[] list;
				list = line.split(",");
				//0:날짜, 1:이름, 2:출근, 3:퇴근
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
