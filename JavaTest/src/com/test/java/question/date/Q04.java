package com.test.java.question.date;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q04 {

	public static void main(String[] args) throws IOException {
		
		// 요구사항 : 남녀 커플의 이름과 만난 날을 입력받아 기념일을 출력하시오.
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("남자이름 : \n");
		String manName = reader.readLine();
		
		System.out.print("여자 이름 : \n");
		String womanName = reader.readLine();
		
		System.out.print("만난날(년) : \n");
		int year = Integer.parseInt(reader.readLine());
		
		System.out.print("만난날(월) : \n");
		int month = Integer.parseInt(reader.readLine());
		
		System.out.print("만난난(일) : \n");
		int date = Integer.parseInt(reader.readLine());
		
		// 메소드 호출
		getAnniversary(manName, womanName, year, month, date);
		
	} //main
	
	public static void getAnniversary(String manName, String womanName, int year, int month, int date) {
		// 사용자가 입력한 월과 자바내에서 입력한 월에는 1의 차이가 있으므로 빼준다.
		Calendar firstMeet = Calendar.getInstance();
		firstMeet.set(year, month-1, date); // 입력받은 값으로 날짜 설정하기
		
		System.out.printf("'%s'과(와) '%s'의 기념일\n" ,manName, womanName);
		//100일
		firstMeet.add(Calendar.DATE, 100);
		System.out.printf("100일 : %tF\n", firstMeet);
		
		//200일
		firstMeet.set(year, month-1, date);
		firstMeet.add(Calendar.DATE, 200);
		System.out.printf("200일 : %tF\n", firstMeet);
		
		//300일
		firstMeet.set(year, month-1, date);
		firstMeet.add(Calendar.DATE, 300);
		System.out.printf("300일 : %tF\n", firstMeet);
		
		//500일
		firstMeet.set(year, month-1, date);
		firstMeet.add(Calendar.DATE, 500);
		System.out.printf("500일 : %tF\n", firstMeet);
		
		//1000일
		firstMeet.set(year, month-1, date);
		firstMeet.add(Calendar.DATE, 1000);
		System.out.printf("1000일 : %tF\n", firstMeet);

		// set, add가 중복되기때문에 메소드로 빼서 풀수 있다.
		
	}
} //class
