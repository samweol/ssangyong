package com.project.care.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import com.project.care.DBUtil;
import com.project.care.dto.CompanyDTO;
import com.project.care.dto.LoginDTO;

public class CompanyDAO {

	Connection conn;
	PreparedStatement pstat;
	Statement stat;
	ResultSet rs;
	
	public CompanyDAO () {
		conn = DBUtil.open();
	}

	public CompanyDTO companyLogin(LoginDTO dto) {
		try {
			String sql = "select * from tblCompany where id = ? and password = ?";
			
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, dto.getId());
			pstat.setString(2, dto.getPassword());
			rs = pstat.executeQuery();
			
			if(rs.next()) {
				CompanyDTO companydto = new CompanyDTO();
				
				companydto.setId(rs.getString("id"));
				companydto.setName(rs.getString("name"));
				companydto.setTel(rs.getString("tel"));
				companydto.setAddress(rs.getString("address"));
				companydto.setXcoor(rs.getString("xcoor"));
				companydto.setYcoor(rs.getString("ycoor"));
				companydto.setBusiness(rs.getString("business"));
				companydto.setPassword(rs.getString("password"));
				companydto.setEmail(rs.getString("email"));
				
				return companydto;
			}
		} catch (Exception e) {
			System.out.println("CompanyDAO.companyLogin");
			e.printStackTrace();
		}
		return null;
	}

	public String findId(HashMap<String, String> map) {
		try {
			String sql = "select * from tblCompany where name = ? and tel = ?";
			
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, map.get("name"));
			pstat.setString(2, map.get("tel"));
			rs = pstat.executeQuery();
			
			if(rs.next()) {
				return rs.getString("id");
			}
		} catch (Exception e) {
			System.out.println("CompanyDAO.findId");
			e.printStackTrace();
		}
		return null;
	}

	public String findPassword(HashMap<String, String> map) {
		try {
			String sql = "select * from tblCompany where name = ? and tel = ? and id = ?";
			
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, map.get("name"));
			pstat.setString(2, map.get("tel"));
			pstat.setString(3, map.get("id"));
			rs = pstat.executeQuery();
			
			if(rs.next()) {
				return rs.getString("password");
			}
		} catch (Exception e) {
			System.out.println("CompanyDAO.findPassword");
			e.printStackTrace();
		}
		return null;
	}

	public int updatePassword(HashMap<String, String> map) {
		try {
			String sql = "update tblCompany set password = ? where id = ?";
			
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, map.get("password"));
			pstat.setString(2, map.get("id"));
			
			return pstat.executeUpdate();
		} catch (Exception e) {
			System.out.println("CompanyDAO.updatePassword");
			e.printStackTrace();
		}
		return 0;
	}

	public CompanyDTO getHospitalInfo(CompanyDTO companydto) {
		try {
			String sql = "select c.id, h.hosname, h.license, h.info, h.starttime, h.endtime, st.stat from tblHospital h\r\n"
					+ "    inner join tblCompany c\r\n"
					+ "        on c.cseq = h.cseq\r\n"
					+ "            inner join tblStat st\r\n"
					+ "                on st.statseq = h.statseq\r\n"
					+ "                    where c.id = ?";
			
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, companydto.getId());
			rs = pstat.executeQuery();
			
			//System.out.println(companydto.getId());
			
			if(rs.next()) {
				CompanyDTO dto = new CompanyDTO();
				dto.setHosname(rs.getString("hosname"));
				dto.setLicense(rs.getString("license"));
				dto.setInfo(rs.getString("info"));
				dto.setStarttime(rs.getString("starttime"));
				dto.setEndtime(rs.getString("endtime"));
				dto.setStat(rs.getString("stat"));
				
				return dto;
			}
		} catch (Exception e) {
			System.out.println("CompanyDAO.getHospitalInfo");
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<String> getOpenDate(CompanyDTO companydto) {
		try {
			String sql = "select c.id, h.hosname, op.open from tblHosDate hd\r\n"
					+ "    inner join tblHospital h\r\n"
					+ "        on h.hpseq = hd.hpseq\r\n"
					+ "            inner join tblOpen op\r\n"
					+ "                on op.opneseq = hd.opneseq\r\n"
					+ "                    inner join tblCompany c\r\n"
					+ "                        on c.cseq = h.cseq\r\n"
					+ "                            where id = ?";
			
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, companydto.getId());
			rs = pstat.executeQuery();
			
			while(rs.next()) {
				ArrayList<String> mlist = new ArrayList<String>();
				mlist.add(rs.getString("open"));
				
				return mlist;
			}
		} catch (Exception e) {
			System.out.println("CompanyDAO.getOpenDate");
			e.printStackTrace();
		}
		return null;
	}

	public int updateCompany(CompanyDTO dto) {
		try {
			String sql = "update tblCompany set email = ? where id = ?";
			
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, dto.getEmail());
			pstat.setString(2, dto.getId());
			
			return pstat.executeUpdate();
		} catch (Exception e) {
			System.out.println("CompanyDAO.updateCompany");
			e.printStackTrace();
		}
		return 0;
	}

	public CompanyDTO getCompanyInfo(CompanyDTO companydto) {
		try {
			String sql = "select * from tblCompany where id = ?";
			
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, companydto.getId());
			rs = pstat.executeQuery();
			
			if(rs.next()) {
				CompanyDTO dto = new CompanyDTO();
				dto.setName(rs.getString("name"));
				dto.setBusiness(rs.getString("business"));
				dto.setId(rs.getString("id"));
				dto.setEmail(rs.getString("email"));
				
				return dto;
			}
		} catch (Exception e) {
			System.out.println("CompanyDAO.getCompanyInfo");
			e.printStackTrace();
		}
		return null;
	}

	public int findHpseq(CompanyDTO dto) {
		try {
			String sql = "select h.hpseq from tblHospital h\r\n"
					+ "    inner join tblCompany c\r\n"
					+ "        on c.cseq = h.cseq\r\n"
					+ "            where id = ?";
			
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, dto.getId());
			rs = pstat.executeQuery();
			
			if(rs.next()) {
				return rs.getInt("hpseq");
			}
		} catch (Exception e) {
			System.out.println("CompanyDAO.findHpseq");
			e.printStackTrace();
		}
		return 0;
	}

	public int updateHospital(int hpseq, String info) {
		try {
			String sql = "update tblHospital set info = ? where hpseq = ?";
			
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, info);
			pstat.setInt(2, hpseq);
			
			return pstat.executeUpdate();
		} catch (Exception e) {
			System.out.println("CompanyDAO.updateHospital");
			e.printStackTrace();
		}
		return 0;
	}
}
