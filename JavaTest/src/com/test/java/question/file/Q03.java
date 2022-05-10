package com.test.java.question.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		
		//요구사항 : 지정한 파일을 다른 폴더로 이동하고, 이동한 파일과 동일한 파일명의 파일이 존재하는 경우 중복 처리하시오.
		// 조건
		//- D:\class\java\file\AAA\test.txt → D:\class\java\file\BBB\test.txt 로 이동하는 것이 목적
		//- BBB 폴더에 이미 test.txt가 있을 경우 덮어쓰거나(y) 작업을 취소(n) 하시오.
		
		
		//BBB에 test.txt가 없어도 실행문장이 뜬다.
		File dir = new File("C:\\class\\java\\file\\AAA\\test.txt");
		File dir2 = new File("C:\\class\\java\\file\\BBB\\test.txt");
		
		if(dir.exists()) {
			boolean result = dir.renameTo(dir2);
//			System.out.println(result);
			System.out.println("파일 이동을 실행합니다.");
			if(dir2.exists()) {
				System.out.print("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n)");
				Scanner sc = new Scanner(System.in);
				String answer = sc.next();
				sc.close();
				
				if(answer.equals("y")) {
					//파일을 덮어씌우기
					dir2.delete();
					dir.renameTo(dir2);
					System.out.println("y. 파일을 덮어썼습니다.");
				} else if(answer.equals("n")) {
					//작업을 취소하기
					System.out.println("n. 작업을 취소합니다.");
				}
			}
		} else {
			try {
				dir.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
