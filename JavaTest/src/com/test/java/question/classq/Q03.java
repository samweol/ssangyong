package com.test.java.question.classq;

import java.util.Calendar;

public class Q03 {

	public static void main(String[] args) {
		
		Bugles snack = new Bugles();
		snack.setWeight(500);
		snack.setCreationTime(2022, 3, 20);
		System.out.println("가격 : " + snack.getPrice() + "원");
		System.out.println("유통 기한이 " + snack.getExpiration() + "일 남았습니다.");
		snack.eat();
	}
}

class Bugles {
	
	private int price;					//가격 : 읽기전용, 850원(300g)/1200원(500g)/1950원(850g)
	private int weight;					//용량 : 쓰기전용, 300g/500g/850g
	private Calendar creationTime;		//생산일자 : 쓰기전용(Calendar)
	private long expiration;				//남은유통기한 : 읽기 전용
	
	/*
		생산된 제품의 유통기한 기준 : 7일(300g)/10일(500g)/15일(850g)
	*/
	
	public int getPrice() {
		if(weight == 300) {
			price = 850;
		} else if(weight == 500) {
			price = 1200;
		} else {
			price = 1950;
		}
		return price;
	}
	public void setWeight(int weight) {
		if(checkWeight(weight)) {
			this.weight = weight;
		} else {
			System.out.println("용량은 350g/500g/850g으로만 입력해주세요.");
		}
		
	}
	public void setCreationTime(int year, int month, int date) {
		
		Calendar creationTime = Calendar.getInstance();
		creationTime.set(year, month-1, date); // 사용자가 입력한 값으로 생산일장 세팅
		this.creationTime = creationTime;
	}
	public int getExpiration() {
		expiration = calDate(weight);
		return (int)expiration;
	}
	
	
	private long calDate(int weight) {	
		Calendar now = Calendar.getInstance();
		Calendar endTime = Calendar.getInstance();		
		endTime.set(creationTime.get(Calendar.YEAR),
					creationTime.get(Calendar.MONTH),
					creationTime.get(Calendar.DATE));
		// weight에 따라 endTime 계산하기
		if(weight == 300) {
			endTime.add(Calendar.DATE, 7);
		} else if(weight == 500) {
			endTime.add(Calendar.DATE, 10);
		} else {
			endTime.add(Calendar.DATE, 15);
		}
		
		long endTick = endTime.getTimeInMillis();
		long nowTick = now.getTimeInMillis();
		long expiration = (endTick - nowTick)/1000/60/60/24; // 유통기한 - 제조일자
		
		return expiration - 1; //생산일부터 1일이여하기때문에 1을 빼줘야함.

	}	
	private boolean checkWeight(int weight) {
		if(weight == 300 || weight == 500 || weight == 850) {
			return true;
		} else {
			return false;
		}
	}
	
	 public void eat() {
		 
		 if(expiration >= 0) {
			 System.out.println("과자를 맛있게 먹었습니다.");
		 } else {
			 System.out.println("유통기한이 지나 먹을 수 없습니다.");
		 }

	   }
	
}
