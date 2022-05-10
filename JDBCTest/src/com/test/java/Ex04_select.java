package com.test.java;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex04_select {

	public static void main(String[] args) {
		
		//Ex04_select.java
		
//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
//		m6();
//		m8();
		m9();
		
	}//main

	private static void m9() {
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			//tblAddress 출력
			String sql = "select * from tblAddress order by seq asc";
			
			rs = stat.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getString("name"));
			}
			
			//자원 해제 코드, Clean-up code
			rs.close();
			stat.close();
			conn.close();
			
			
		} catch (Exception e) {
			System.out.print("Ex04_select.m9");
			e.printStackTrace();
		}
		
	}

	private static void m8() {
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			//요구사항 : 영업부 직원수와 영업부 직원 명단을 출력하시오.
			// 1. select count(*) as cnt from tblInsa where buseo = '영업부'
			// 2. select * from tblInsa where buseo = '영업부'
			
			String sql = "";
			
			sql = "select count(*) as cnt from tblInsa where buseo = '영업부'";
			rs = stat.executeQuery(sql);
			
			//어쩌피 레코드가 하나이기때문에 while문 안돌아도됨
			if(rs.next()) {
				System.out.println("직원수 : " + rs.getString("cnt"));
			}
			
			rs.close();
			
			sql = "select * from tblInsa where buseo = '영업부'";
			rs = stat.executeQuery(sql);
			
			int n = 0;
			
			while(rs.next()) {
				System.out.println(rs.getString("name"));
				n++;
			}
			
			System.out.println("직원수 : " + n);
			
			rs.close();
			stat.close();
			conn.close();
			
			
		} catch (Exception e) {
			System.out.print("Ex04_select.m8");
			e.printStackTrace();
		}
		
	}

	private static void m6() {
		
		//select > 오류 발생
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			String sql = "select name, buseo, jikwi from tblInsa";
			
			//Ex04_select.m6java.lang.NullPointerException
			rs = stat.executeQuery(sql);
			
			while(rs.next()) {
				
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("buseo"));
				System.out.println(rs.getString("jikwi"));
			}
			
			rs.close();
			stat.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.print("Ex04_select.m6");
			e.printStackTrace();
		}
		
	}

	private static void m5() {
		
		//tblInsa + tblBonus
		//요구사항 : 특정 직원에게 보너스를 지급하세요.
		//1. 모든 직원 명단을 출력(직원번호, 이름, 부서, 직위) > m4() 참조 -- 해결
		//2. 사용자 > 직원 선택(직원번호 입력)
		//3. 사용자 > 보너스 금액 입력
		//4. 보너스 지급 > insert tblBonus
		//5. 지급된 내역을 명단 출력(직원번호, 이름, 부서 ,직위, 보너스 금액) > m4()
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			String sql = "select num, name, buseo, jikwi from tblInsa";
			
			rs = stat.executeQuery(sql);
			
			// 직원 전체명단 출력하기
			System.out.println("[번호]\t[이름]\t[부서]\t[직위]");
			
			while(rs.next()) {
				
				System.out.printf("%s\t%s\t%s\t%s\n"
						, rs.getString("num")
						, rs.getString("name")
						, rs.getString("buseo")
						, rs.getString("jikwi"));
				
			}
			
			// 사용자에게 직원번호 입력받기
			System.out.print("직원번호를 입력하세요 : ");
			String number = sc.nextLine();
			
			// 사용자에게 보너스 금액 입력받기
			System.out.print("보너스 금액을 입력하세요 : ");
			int bonus = sc.nextInt();
			
			// 보너스 지급하기			
			// tblBonus에 넣기
			sql = String.format("insert into tblBonus (seq, num, bonus) values (seqBonus.nextVal, %s, %d)"
					, number
					, bonus);
			int result = stat.executeUpdate(sql);
			
			//지급된 명단 출력하기
			sql = "select i.num, i.name, i.buseo, i.jikwi, b.bonus from tblInsa i inner join tblBonus b on i.num = b.num";
			rs = stat.executeQuery(sql);
			
			System.out.println("[번호]\t[이름]\t[부서]\t[직위]\t[보너스]");
			while(rs.next()) {
				System.out.printf("%s\t%s\t%s\t%s\t%,d\n"
						, rs.getString("num")
						, rs.getString("name")
						, rs.getString("buseo")
						, rs.getString("jikwi")
						, rs.getInt("bonus"));
			}
			
			System.out.println();
			System.out.println("프로그램 종료");
			rs.close();
			stat.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.print("Ex04_select.m5");
			e.printStackTrace();
		}
		
		
	}

	private static void m4() {
		
		//다중값 반환
		//- N행 N열
		//- 레코드 N줄 + 컬럼 N개
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			String buseo = "총무부";
			
			String sql = "select name, jikwi, city, basicpay from tblInsa where buseo = '" + buseo + "'";
			
			rs = stat.executeQuery(sql);
			
			System.out.println("[이름]\t[직위]\t[지역]\t[급여]");
			
			while(rs.next()) {
				
				//직원 1명
				System.out.printf("%s\t%s\t%s\t%,10d원\n"
						, rs.getString("name")
						, rs.getString("jikwi")
						, rs.getString("city")
						, rs.getInt("basicpay"));
				
			}
			
			rs.close();
			stat.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.print("Ex04_select.m3");
			e.printStackTrace();
		}
		
	}

	private static void m3() {
		
		//다중값 반환
		//- N행 1열
		//- 레코드 N줄 + 컬럼 1개
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			String sql = "select name from tblInsa order by name";
			
			//60명
			rs = stat.executeQuery(sql);
			
			rs.next();
			rs.next();
			rs.next();
			
			// 몇바퀴? > 60바퀴 - 3바퀴
			while(rs.next()) {
				System.out.println(rs.getString("name"));
			}
			
			// 에러발생 : ResultSet.next가 호출되지 않았음
			//rs = state.executeQuery(sql); //BOF
			// 에러발생 : 결과 집합을 모두 소모했음
			//rs.next()
			//System.out.println(rs.getString("name"));
			
			rs.close();
			stat.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.print("Ex04_select.m3");
			e.printStackTrace();
		}
		
	}

	private static void m2() {
		
		//다중값 반환
		//- 1행 N열
		//- 레코드 1줄 + 여러개 컬럼
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			String sql = "select name, age, tel, address from tblAddress where seq = 4";
			
			rs = stat.executeQuery(sql);
			
			if(rs.next()) {
				
				System.out.println("이름 : " + rs.getString("name"));
				System.out.println("나이 : " + rs.getString("age"));
				System.out.println("전화번호 : " + rs.getString("tel"));
				System.out.println("주소 : " + rs.getString("address"));
				
			} else {
				System.out.println("데이터가 없습니다.");
			}
			
			rs.close();
			stat.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.print("Ex04_select.enclosing_method");
			e.printStackTrace();
		}
	}

	private static void m1() {
		
		//단일값 반환
		//- 1행 1열
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			String sql = "select count(*) + 100 as cnt from tblInsa";
			
			//반환값 X -> executeUpdate()
			//반환값 O -> executeQuery();
			
			rs = stat.executeQuery(sql);
			
			//Result == 커서(Cursor) > 판독기 > 스트림, Iterator, 향상된 for문
			
			rs.next(); //커서를 1줄 전진 > 레코드 위치
			
			int cnt1 = rs.getInt(1); //컬럼 순서(Index)
			int cnt2 = rs.getInt("cnt"); //컬럼명
			String cnt3 = rs.getString("cnt");
			
			System.out.println(cnt1);
			System.out.println(cnt2);
			System.out.println(cnt3);
			
			stat.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.print("Ex04_select.m1");
			e.printStackTrace();
		}
	}
}//Ex04
