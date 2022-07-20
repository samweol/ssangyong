package com.project.care.main.company.reservation;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.care.dto.componentDTO;
import com.project.care.dto.prescriptionDTO;
import com.project.care.dto.productDTO;
import com.project.care.dto.reservationDTO;


@WebServlet("/company/prescription.do")
public class Prescription extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String seq = req.getParameter("seq");
		
		reservationDAO dao = new reservationDAO();
		
		reservationDTO dto = dao.get(seq);

		
		
		// 성분명 불러오기 & 제품군
		componentDTO cdto = new componentDTO();
		prescriptionDTO pdto = new prescriptionDTO();
		
		prescriptionDAO pdao = new prescriptionDAO();
		
		ArrayList<componentDTO> clist = new ArrayList<componentDTO>();
		ArrayList<productDTO> plist = new ArrayList<productDTO>();
		
		
		clist = pdao.comtype();
		plist = pdao.protype();
		
		req.setAttribute("dto", dto);
		req.setAttribute("clist", clist);
		req.setAttribute("plist", plist);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/company/prescription.jsp");

		dispatcher.forward(req, resp);

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		// 1. 인코딩
		req.setCharacterEncoding("UTF-8");
		
		// 2. 데이터 보내기
		String avail = req.getParameter("avail");
		String component = req.getParameter("component");
		String pname = req.getParameter("pname");
		String usage = req.getParameter("usage");
		String amount = req.getParameter("amount");
		String pdate = req.getParameter("pdate");
		String explain = req.getParameter("explain");
		
		//3. 포장하기
		prescriptionDTO dto = new prescriptionDTO();
		
		dto.setAvail(avail);
		dto.setComponent(component);
		dto.setUsage(usage);
		dto.setAmount(amount);
		dto.setPdate(pdate);
		dto.setExplain(explain);
		
		dto.setId((String)session.getAttribute("auth"));

		prescriptionDAO dao = new prescriptionDAO();

		// 4. 처방전 작성
		int result = dao.add(dto);
		
		// 5.
		req.setAttribute("result", result);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/company/prescription.jsp");
		dispatcher.forward(req, resp);
	}
}