package com.test.memo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/memo/list.do")
public class List extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//List.java
		//1. DB 작업 > DAO 위임 > select
		//2. 결과 반환
		//3. JSP 호출하기 + 결과를 전달하면서
		
		//1 + 2
		DAO dao = new DAO();
		
		ArrayList<DTO> list = dao.list();
		
		//2.5 > 줄바꿈 처리는 servlet에서 해주기 jsp는 오직 출력만함 로직들은 모두 servlet에서 처리해야함
		for(DTO dto : list) {
			dto.setContent(dto.getContent().replace("\r\n", "<br>")); //dto의 content를 꺼내와서 replace를 해주고 다시 dto의 set으로 넣어줌
		}
		
		//3.
		req.setAttribute("list", list);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/memo/list.jsp");

		dispatcher.forward(req, resp);
	}
}
