package com.test.java;

import java.sql.Connection;

public class Ex02 {

	public static void main(String[] args) {
		
		try {
			
			Connection conn = DBUtil.open(); //접속완료
			
			System.out.println(conn.isClosed() ? "연결 안됨" : "연결됨");
			
			DBUtil.close();
			
			
			// 오류
			// 1. 서버 주소
			// IO 오류: The Network Adapter could not establish the connection
			// 2. 아이디 & 비밀번호
			// ORA-01017: invalid username/password; logon denied
			
			// services.msc > oracle.xe 중지
			// 3. 서버 중지
			// Listener refused the connection with the following error
			// 4. 연결 문자열 오타
			// 부적합한 Oracle URL이 지정되었습니다.
			// 5. 포트번호
			// IO 오류 : The Network Adapter could not establish the connection
			// 6. SID
			// ORA-12505, TNS : listener does not currently know of SDI given in connect descriptor
			// 7. 드라이브
			// oracle.jdbc.dirver.OracleDriver
			// 8. ojdbc.jar
			// oracle.jdbc.driver.OracleDriver
			conn = DBUtil.open("localhost", "hr", "java1234");
			
			System.out.println(conn.isClosed() ? "연결 안됨" : "연결됨");
			
			DBUtil.close();
			
		} catch (Exception e) {
			System.out.print("Ex02.main");
			e.printStackTrace();
		}
		
	}
}
