package com.test.java.question.date;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q06 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 요구사항 : 여러 배달 음식을 같은 시간에 받기를 원하는 고객이 있다.
		// 고객이 각각의 매장에 몇시에 전화를 해야 모든 음식을 같은 시간에 받을 수 있는지 알려주시오.
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("음식을 받기 원하는 시각");
		System.out.print("시 : \n");
		int hour = Integer.parseInt(reader.readLine());
		System.out.print("분 : \n");
		int min = Integer.parseInt(reader.readLine());
		
		// 메소드 호출
		getDeliveryTime(hour, min);
	} //main
	
	// 메소드 선언
	
	public static void getDeliveryTime(int hour, int min) {
		
		// 캘린더 이용해서 다시 풀어보기
		/* 조건
		- 전화를 걸면 짜장면은 10분 뒤에 도착합니다.
		- 전화를 걸면 치킨은 18분 뒤 도착합니다.
		- 전화를 걸면 피자는 25분 뒤 도착합니다.
		- 음식을 받기 원하는 시간은 오후 11시 이전에만 가능합니다.(날짜 변경 금지)
		*/

		// 짜장면
		int hourJjajang = (hour >= 23)? null :hour - ((min - 10 > 0)? 0 : 1); 
		int minJjajang = (min - 10 > 0)? min - 10 : 60 + (min - 10); 
		
		// 치킨
		int hourChicken = (hour >= 23)? null : hour - ((min - 18 > 0)? 0 : 1);  
		int minChicken = (min - 18 > 0)? min - 18 : 60 + (min - 18); 
		
		// 피자
		int hourPizza = (hour >= 23)? null : hour - ((min - 25 > 0)? 0 : 1); 
		int minPizza = (min - 25 > 0)? min - 25 : 60 + (min - 25); 
		
		System.out.printf("짜장면 : %d시 %d분\n", hourJjajang, minJjajang);
		System.out.printf("치킨 : %d시 %d분\n", hourChicken, minChicken);
		System.out.printf("피자 : %d시 %d분\n", hourPizza, minPizza);
	}

} //class
