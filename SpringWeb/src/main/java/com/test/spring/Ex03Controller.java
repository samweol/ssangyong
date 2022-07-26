package com.test.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//컨트롤러 구현
//1. Controller 인터페이스 구현
//2. 어노테이션 사용

@Controller
@RequestMapping(value="/ex03.do")
public class Ex03Controller {

	//요청 메소드 > 맘대로 ~ > @RequestMapping
	
	/*
	 * @RequestMapping public String test() {
	 * 
	 * //업무 코드 ..
	 * 
	 * return "ex03"; }
	 */
	
	//요청 메소드가 void > 자동으로 가상주소와 동일한 jsp를 찾아준다. -> 권장x > 세밀한 제어 불가능
	@RequestMapping
	public void test() {
		System.out.println("test");
		
		//반환값이 없는데도 jsp가 호출이 되긴 된다.
		//return "ex03";
	}
}
