package com.test.spring;

import javax.servlet.http.HttpServletRequest;


public interface BoardService {

	int write(HttpServletRequest req, String title);

}
