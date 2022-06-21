package com.test.java.question.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Q03 {

	public static void main(String[] args) {
		
		//요구사항 : 성적을 확인 후 합격자/불합격자 명단을 출력하시오.
		//조건
		//- 합격 조건 : 3과목 평균 60점 이상
		//- 과락 조건 : 1과목 40점 미만
		ArrayList<String> pass = new ArrayList<String>();
		ArrayList<String> unpass = new ArrayList<String>();
		
		try {
			
			File file = new File("C:\\class\\파일_입출력_문제\\성적.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			
			//읽어오기
			String line = null;
			String[] list;
			while((line = reader.readLine())!= null){
//				System.out.println(line);
				list = line.split(",");
				//0번째방 = 이름, 1번째방~3번째방 = 점수
				
				//계산
				int kor = Integer.parseInt(list[1]);
				int eng = Integer.parseInt(list[2]);
				int math = Integer.parseInt(list[3]);
				
				int sum = kor + eng + math;
				int avg = sum / 3;
				
				
				
				//조건
				if(kor < 40 || eng < 40 || math < 40) {
					//불합격
					unpass.add(list[0]);
				} else {
					if(avg >= 60) {
						pass.add(list[0]);
					} else {
						//불합격
						unpass.add(list[0]);
					}
				}
			}
			reader.close();
			System.out.print("[합격자]");
			System.out.println(pass);
			System.out.print("[불합격자]");
			System.out.println(unpass);
			
			//toString 오버로딩해서 출력형태로 바꿔야함
			
		} catch (Exception e) {
			System.out.print("Q03.enclosing_method");
			e.printStackTrace();
		}
	}
}
