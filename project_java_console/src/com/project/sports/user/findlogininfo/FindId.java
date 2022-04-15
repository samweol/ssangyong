package com.project.sports.user.findlogininfo;

import java.util.Scanner;
import com.project.sports.input.User;
import com.project.sports.main.Data;
import com.project.sports.output.Output;

public class FindId {

	public static void findId() {

		Scanner sc = new Scanner(System.in);
		String name = "";
		String phoneNumber = "";

		boolean findIdFlag = true;
		while (findIdFlag) {

			System.out.println("아이디 찾기");
			System.out.println("회원가입시 등록한 이름과 전화번호를 입력하세요.");
			System.out.println("0을 입력하면 작업을 취소하고 뒤로 돌아갑니다.");

			boolean findNameFlag = true;
			while (findNameFlag) {

				System.out.print("이름 : ");
				name = sc.nextLine();
				if (name.equals("0")) {
					Output.backMsg();
					findIdFlag = false;
					break;
				}

				boolean isphoneNumberFlag = true;
				while (isphoneNumberFlag) {

					System.out.print("전화번호 : ");
					phoneNumber = sc.nextLine();
					if (phoneNumber.equals("0")) {
						findNameFlag = false;
						Output.backMsg();
						break;
					} else { // 전화번호를 입력하면

						for (User u : Data.userList) {

							if (u.getName().equals(name) && u.getNumber().equals(phoneNumber)) {
								String line = String.format("회원가입한 아이디는 %s 입니다.", u.getId());
								System.out.println(line);
								System.out.println("Enter(엔터)를 누르면 이전 메뉴로 돌아갑니다.");
								String input = sc.nextLine();
								if (input.equals("")) {
									isphoneNumberFlag = false;
									findNameFlag = false;
									findIdFlag = false;
									break;
								}

							} else { // 일치하는 정보가 없는 경우
								System.out.println("일치하는 아이디가 없습니다.");
								isphoneNumberFlag = false;
								findNameFlag = false;
								findIdFlag = false;
								Output.backMsg();

								break;
							}
						}

					}

				}
			}

		}


	}
}

