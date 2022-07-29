package com.test.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping(value="/member/info")
	public String info() {
	
		//회원 > 정보 페이지
		
		//return "member.info";
		return "one.member.info";
	}
	
	@GetMapping(value="/member/point")
	public String point() {
		
		//회원 > 포인트 페이지
		
		//return "member.point";
		return "two.member.info";
	}
	
	@GetMapping(value="/admin/chart")
	public String chart() {
		
		//관리자 > 차트 페이지
		
		//return "admin.chart";
		return "three.member.info";
	}
	
	@GetMapping(value="/admin/preference")
	public String preference() {
		
		//관리자 > 환경 설정 페이지
		
		return "admin.preference";
	}
	
	@GetMapping(value="/test")
	public String test() {
		
		//기존 ViewResolver > return "test"
		// - "test" > "WEB-INF/views/" + "test" + ".jsp"
		
		//Tiles ViewResolver
		// - "test" > <definition name="test">
		
		return "test";
	}
}
