package com.test.spring.aop;

import java.util.Calendar;

import org.aspectj.lang.ProceedingJoinPoint;

//보조 업무 객체
public class Logger {

	public void log() {
		Calendar now = Calendar.getInstance();
		System.out.printf("[LOG][%tF %tT] 로그를 기록합니다.\n", now, now);
	}
	
	public void time(ProceedingJoinPoint jp) {
		long begin = System.nanoTime();
		
		System.out.println("[LOG] 기록을 시작합니다.");
		//주업무
		try {
			
			jp.proceed(); //지금 실행하는 주업무의 대리자
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		long end = System.nanoTime();
		
		System.out.println("[LOG] 기록을 종료합니다.");
		System.out.printf("[LOG] 소요 시간 %,dms\n", end - begin);
		
	}
	
	public void history(Object memo) {
		System.out.println("[LOG]읽기 기록 : " + memo);
	}
	
	public void check(Exception e) {
		System.out.println("[LOG] 예외 발생 " + e.getMessage());
	}
	
}
