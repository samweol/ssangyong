package com.project.sports.main;

import java.util.Scanner;
import com.project.sports.input.User;
import com.project.sports.output.Output;
import com.project.sports.user.UserFunction;
import com.project.sports.user.UserLogin;

public class UserAdminDivide {
	
	public static void loginType(String input) {
		
		Scanner sc = new Scanner(System.in);
		UserLogin userLogin = new UserLogin();
		boolean loginFlag = true;
		
		while(loginFlag) {
			Output.loginMenu();
			input = sc.nextLine(); // 회원/관리자 여부 받기

			if(input.equals("1")) { //회원
				userLogin.loginInfo();
				//실행되는 메소드
			} else if(input.equals("2")) { //관리자
				
			}else if(input.equals("0")){
				loginFlag = false;
			} else { //유효성검사
				
			}
		}
		
	}
	

}
