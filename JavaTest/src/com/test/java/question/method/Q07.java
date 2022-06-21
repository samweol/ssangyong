package com.test.java.question.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q07 {
	public static void main(String[] args) throws IOException {
		// 요구사항 : 지하철 탑승 소요시간을 구하시오. 지나가는 역의 개수, 환승역의 횟수, 시간대를 전달받아 총 걸리는 시간을 반환하는 메소드를 선언하시오.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 지나가는 역의 개수 받기
		System.out.print("역의 개수 : \n");
		String inputStation = reader.readLine();
		int station = Integer.parseInt(inputStation);
		
		// 환승역의 횟수 받기
		System.out.print("환승역의 횟수 : \n");
		String inputChange = reader.readLine();
		int change = Integer.parseInt(inputChange);
		
		// 시간대를 받기
		System.out.print("시간대(1.평상시, 2.출근시, 3.퇴근시) : \n");
		String inputTime = reader.readLine();
		int time = Integer.parseInt(inputTime);
			
		// 메소드 호출
		int result = getTime(station, change, time);
		System.out.printf("총 소요 시간은 %d분입니다.\n", result);
	} // main
	
	// 메소드 선언
	public static int getTime(int station, int change, int time) {
		/* 조건
			- 각 역간 소요 시간 : 2분
			- 환승 소요 시간 : N분
			- 시간대에 따라 환승 소요 시간이 다르다.
				- 평상시 : 3분
				- 출근시 : 4분
				- 퇴근시 : 5분
		*/
		
		// time 변수의 값에 따라 N분 값을 찾는 식
		int min = (time>3 || time<1)? 0 : (time == 1)? 3 : (time == 2)? 4 : 5;

		// 총 시간 구하기
		int answer = (station - 1) * 2 + change * min;
		// -> 역간 소요시간으로 치면 -1 하는게 맞지만 교수님 문제에선 그냥 station *2로 하신 것 같다.
		
		return answer;
	}

} // class
