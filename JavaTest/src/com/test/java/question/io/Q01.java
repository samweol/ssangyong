package com.test.java.question.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Q01 {

	public static void main(String[] args) {
		
		//요구사항 : 특정 이름을 찾아 다른 이름으로 변환 후 파일을 다른 이름으로 저장하시오.
		//조건
		//- 유재석 -> 메뚜기
		//- 저장할 파일명 : 이름수정_변환dat
		
		try {
			
			File file = new File("C:\\class\\파일_입출력_문제\\이름수정.txt");
			File file2 = new File("C:\\class\\파일_입출력_문제\\이름수정_변환.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
			
			String line = null;
			
			//한줄씩 읽어오기
			while((line = reader.readLine()) != null) {
//				System.out.println(line);
				
				if(line.contains("유재석")) {
					line = line.replace("유재석", "메뚜기");
//					System.out.println(line);
				}
				
				writer.write(line);
//				System.out.println(line);
			}
			
			reader.close();
			writer.close();
			
		} catch (Exception e) {
			System.out.print("Q01.main");
			e.printStackTrace();
		}

	}
}
