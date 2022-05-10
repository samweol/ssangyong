package com.test.java.question.iteration;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q14_While {

	public static void main(String[] args) throws Exception {
		
		// 요구사항 : 자판기 프로그램을 구현하시오.
		
		/* 설계
			1. 자판기 모양 출력하기
			2. 입력받기 (금액) + (음료 번호)
			3. 출력하기 " __ 를 제공합니다." "잔돈 __원을 제공합니다." "계속 하시려면 엔터를 입력하세요."
			> 반복
		*/
		
		// 자판기 모양 출력하기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		// 자판기 내부 로직 작성하기
		
		// 변수 설정하기 > 추후에 음료수 값이 변동될 수 있으므로 보기좋게 정리
		int last = 0;
		int cokePrice = 700;
		int sodaPrice = 600;
		int vita500Price = 500;
		
		
		// 유효성 검사 + 음료수 고르기 + 남은 돈 계산하기
		
		while(true) {
			
			System.out.println("===============");
			System.out.println("     자판기");
			System.out.println("===============");
			System.out.println("1. 콜라 : 700원");
			System.out.println("2. 사이다 : 600원");
			System.out.println("1. 비타500 : 500원");
			System.out.println("---------------");
			
			// 입력받기
			System.out.print("금액 투입(원) : ");
			int money = Integer.parseInt(reader.readLine());
			System.out.println("---------------");
			System.out.print("음료 선택(번호) : ");
			String drink = reader.readLine();
			
			// 유효성 검사
			if(drink.equals("1")||drink.equals("2")||drink.equals("3")) {
				if(drink.equals("1")) {
					last += money - cokePrice;
					
					if (last<0) {
						System.out.println("금액이 부족합니다.");
						break;
					}
					
					System.out.println("+콜라를 제공합니다.");
					System.out.printf("+잔돈 %d원을 제공합니다.\n", last);
					System.out.println();
					
					System.out.println("계속 하시려면 엔터를 입력하세요.");
					String answer = reader.readLine();
					if(answer.equals("")) {
						
					} else {
						break;
						}
				} else if (drink.equals("2")) {
					last = money - sodaPrice;
					
					if (last<0) {
						System.out.println("금액이 부족합니다.");
						break;
					}
					
					System.out.println("+사이다를 제공합니다.");
					System.out.printf("+잔돈 %d원을 제공합니다.\n", last);
					System.out.println();
					
					System.out.println("계속 하시려면 엔터를 입력하세요.");
					String answer = reader.readLine();
					if(!answer.equals("")) {
						break;
					} 
				} else if (drink.equals("3")) {
					last = money - vita500Price;
					
					if (last<0) {
						System.out.println("금액이 부족합니다.");
						break;
					}
					
					System.out.println("+비타500을 제공합니다.");
					System.out.printf("+잔돈 %d원을 제공합니다.\n", last);
					System.out.println();
					
					System.out.println("계속 하시려면 엔터를 입력하세요.");
					String answer = reader.readLine();
					if(answer.equals("")) {
						
					} else {
						break;
						}
				}
			} else {
//				continue;
				System.out.println("해당 음료수는 없습니다. 다시 입력해주세요.");
			}
			
			
		}
		
		
		
	}
	
	public static void doAgain() {
		
	}
}
