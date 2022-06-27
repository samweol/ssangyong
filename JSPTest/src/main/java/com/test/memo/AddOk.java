package com.test.memo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/memo/addok.do")
public class AddOk extends HttpServlet {
	
	//AddOk.java
	//1. 인코딩처리
	//2. 데이터 가져오기
	//3. DB 작성 > insert
	//	3.1 DAO 위임
	//	3.2 DTO 생성
	//4. int result
	//	- 1. 성공
	//	- 0. 실패
	//5. JSP 호출하기
	//	- 4번을 전달하기

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//1.
		req.setCharacterEncoding("UTF-8");
		
		//2.
		String subject = req.getParameter("subject");
		String content = req.getParameter("content");
		String name = req.getParameter("name");
		String pw = req.getParameter("pw");
		
		//3. 상자에 포장하고
		DTO dto = new DTO();
		dto.setSubject(subject);
		dto.setContent(content);
		dto.setName(name);
		dto.setPw(pw);
		
		//상자채로 DAO에게 보내기 (쿼리 작성해주세요 -DB관련)
		DAO dao = new DAO();
		
		int result = dao.add(dto);
		
		//4. jsp에서 사용해야함로 req에 넣는다.
		req.setAttribute("result", result);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/memo/addok.jsp");

		//req, resp를 위의 주소로 넘긴다.
		dispatcher.forward(req, resp);
	}
}