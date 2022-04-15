package com.project.sports.user.findlogininfo;

import java.util.Scanner;
import com.project.sports.output.Output;

public class FindMenu {

	public static void findMenu() {
		
		Scanner sc = new Scanner(System.in);
		
		boolean findMenuFlag = true;
		while(findMenuFlag) {
			
			System.out.println("1. 아이디 찾기");
			System.out.println("2. 비밀번호 찾기");
			Output.back();
			Output.input();
			
			String input = sc.nextLine();
			
			if(input.equals("1")) { //아이디 찾기
				FindId.findId();
			} else if(input.equals("2")) { //비밀번호 찾기
				FindPassword.findPassword();
			} else if(input.equals("0")){ //뒤로가기
				break;
			} else {
				//유효성 검사
			}
			
			
		}
	}
}
