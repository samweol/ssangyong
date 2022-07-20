package com.project.care.main.company.reservation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.project.care.DBUtil;
import com.project.care.dto.componentDTO;
import com.project.care.dto.prescriptionDTO;
import com.project.care.dto.proIngDTO;
import com.project.care.dto.productDTO;

public class prescriptionDAO {
	
	private Connection conn;
	   private Statement stat;
	   private PreparedStatement pstat;
	   private ResultSet rs;
	   
	   public prescriptionDAO() {

	      conn = DBUtil.open();
	   }
	   

	   // 성분명 리스트
	   public ArrayList<componentDTO> comtype() {
			
			try {
				
				conn = DBUtil.open();
				
				String sql = "select * from tblIngred";
				
				stat = conn.createStatement();
				
				rs = stat.executeQuery(sql);
				
				ArrayList<componentDTO> list = new ArrayList<componentDTO>();
				
				while (rs.next()) {
					
					componentDTO tdto = new componentDTO();
					
					tdto.setIseq(rs.getString("iseq"));
					tdto.setComponent(rs.getString("component"));
					
					list.add(tdto);
				}
								
				rs.close();
	            stat.close();
	            conn.close();
				
				return list;
				
			} catch (Exception e) {
				System.out.println("prescriptionDAO.protype");
				e.printStackTrace();
			}
			
			return null;
		}

	   // 제품명
	public ArrayList<productDTO> protype() {

		try {
			
			conn = DBUtil.open();
			
			String sql = "select * from tblProduct";
			
			stat = conn.createStatement();
			
			rs = stat.executeQuery(sql);
			
			ArrayList<productDTO> list = new ArrayList<productDTO>();
			
			while (rs.next()) {
				
				productDTO tdto = new productDTO();
				
				tdto.setPseq(rs.getString("pseq"));
				tdto.setPname(rs.getString("pname"));
				
				list.add(tdto);
			}
							
			rs.close();
            stat.close();
            conn.close();
			
			return list;
			
		} catch (Exception e) {
			System.out.println("prescriptionDAO.protype");
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public ArrayList<proIngDTO> pilist(String proingseq) {
		
		try {
			
			conn = DBUtil.open();
			
			String sql = "select * from tblProIng where proingseq = ?";
			
			pstat = conn.prepareStatement(sql);
			
			pstat.setString(1, proingseq);
			rs = pstat.executeQuery();				
			
			
			ArrayList<proIngDTO> pllist = new ArrayList<proIngDTO>();
			
			
			while (rs.next()) {
				
				proIngDTO pldto = new proIngDTO();
				
				pldto.setProingseq(rs.getString("proingseq"));
				pldto.setIseq(rs.getString("iseq"));
				pldto.setPseq(rs.getString("pseq"));
				
				pllist.add(pldto);
			}
							
			
			rs.close();
            pstat.close();
            conn.close();
			
			return pllist;
			
			
		} catch (Exception e) {
			System.out.println("prescriptionDAO.protype");
			e.printStackTrace();
		}
		
		
		
		return null;
	}


	public int add(prescriptionDTO dto) {
		try {
			String sql = "";

		} catch (Exception e) {
			System.out.println("prescriptionDAO.add");
			e.printStackTrace();
		}
		return 0;
	}
	
	

}
