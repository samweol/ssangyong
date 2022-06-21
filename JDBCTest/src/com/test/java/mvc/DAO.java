package com.test.java.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import mylibrary.db.DBUtil;

//JDBC 코드 담당 > DB 업무 담당
public class DAO {

	private Connection conn = null;
	private Statement stat = null; //정적
	private PreparedStatement pstat = null; //동적
	private ResultSet rs = null;
	
	// 생성자는 자동으로 호출되기 때문에 DB 연결을 생성자안에 넣어버렸다.
	public DAO() {
		
		conn = DBUtil.open(); //DB 연결		
	}
	
	public int add(Address dto) {
		
		
		
		try {
			
			String sql = "insert into tblAddress (seq, name, age, gender, tel, address, regdate) values (seqAddress.nextVal, ?, ?, ?, ?, ?, default)";
			
			pstat = conn.prepareStatement(sql); // 객체 생성
			
			//?에 채우기
			pstat.setString(1, dto.getName());
			pstat.setString(2, dto.getAge());
			pstat.setString(3, dto.getGender());
			pstat.setString(4, dto.getTel());
			pstat.setString(5, dto.getAddress());
			
			//반영하기 > 결과
			int result = pstat.executeUpdate();
			
			return result; //1. 성공, 0. 실패
			
		} catch (Exception e) {
			System.out.print("DAO.add");
			e.printStackTrace();
		}
		
		return 0;
	}//add

	public ArrayList<Address> list() {
		
		try {
			
			String sql = "select * from tblAddress order by seq asc";
			
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			
			//ResultSet -> ArrayList
			ArrayList<Address> list = new ArrayList<Address>();
			
			while(rs.next()) {
				
				// 레코드 1개 > Address 1개
				Address dto = new Address();
				
				// rs의 컬럼값을 address인 dto에 넣기
				dto.setSeq(rs.getString("seq"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getString("age"));
				dto.setGender(rs.getString("gender"));
				dto.setTel(rs.getString("tel"));
				dto.setAddress(rs.getString("address"));
				
				// 값이 다 들어간 address인 dto를 arraylist에 넣기
				list.add(dto);
			}
			
			return list; //Service에게 반환
			
		} catch (Exception e) {
			System.out.print("DAO.list");
			e.printStackTrace();
		}
		
		
		return null;
	}

	public Address get(String seq) {
		
		try {
			
			String sql = "select * from tblAddress where seq = ?";
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, seq);
			
			rs = pstat.executeQuery();
			
			if(rs.next()) {
				//레코드 1개 > Address 1개로 전환
				Address dto = new Address();
				
				dto.setSeq(rs.getString("seq"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getString("age"));
				dto.setGender(rs.getString("gender"));
				dto.setTel(rs.getString("tel"));
				dto.setAddress(rs.getString("address"));
				
				return dto;
			}
			
		} catch (Exception e) {
			System.out.print("DAO.get");
			e.printStackTrace();
		}
		
		return null;
	}

	public int edit(Address dto) {
		
		try {
			
			// 모든 컬럼을 업데이트 한다. > SQL 1개만 만들기 위해서!!!
			String sql = "update tblAddress set name = ?, age = ?, gender = ?, tel = ?, address = ? where seq = ?";
			
			pstat = conn.prepareStatement(sql); // 객체 생성
			
			//?에 채우기
			pstat.setString(1, dto.getName());
			pstat.setString(2, dto.getAge());
			pstat.setString(3, dto.getGender());
			pstat.setString(4, dto.getTel());
			pstat.setString(5, dto.getAddress());
			pstat.setString(6, dto.getSeq());
			
			//반영하기 > 결과
			int result = pstat.executeUpdate();
			
			return result; //1. 성공, 0. 실패
			
		} catch (Exception e) {
			System.out.print("DAO.add");
			e.printStackTrace();
		}
		
		return 0;
	}

	public int del(String seq) {
		
		try {
			
			// 모든 컬럼을 업데이트 한다. > SQL 1개만 만들기 위해서!!!
			String sql = "delete from tblAddress where seq = ?";
			
			pstat = conn.prepareStatement(sql); // 객체 생성
			
			//?에 채우기
			pstat.setString(1, seq);
			
			//반영하기 > 결과
			int result = pstat.executeUpdate();
			
			return result; //1. 성공, 0. 실패
			
		} catch (Exception e) {
			System.out.print("DAO.add");
			e.printStackTrace();
		}
		return 0;
		
	}
	
}

//디자인 패턴
//MBC Pattern
// - Model
// - View
// - Controller > 운용

//동일한 주제 > 쌍용 교육 센터 관리 프로그램
// > 교육장을 운영하는 직원들의 요구사항
