package com.test.java.question.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		
		//요구사항 : 이름을 입력받아 회원 정보를 검색 후 출력하시오.
		
		//입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		File file = new File("C:\\class\\파일_입출력_문제\\단일검색.txt");
		
		// 파일을 읽어와서 "," 단위로 잘라서 배열에 저장하기
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			boolean loop = false;
			
			while((line = reader.readLine()) != null) {
//				System.out.println(line);
				
				//자르기
				String[] list = line.split(",");
				//0:번호, 1:이름, 2: 주소, 3: 핸드폰 번호
				
				if(list[1].equals(name)) {
					System.out.printf("[%s]\n", list[1]);
					System.out.printf("번호 : %s\n", list[0]);
					System.out.printf("주소 : %s\n", list[2]);
					System.out.printf("전화 : %s\n", list[3]);
					loop = true;
					break;
				}
			}
			
			if(loop == false) {
				System.out.println("회원이 존재하지 않습니다.");
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
