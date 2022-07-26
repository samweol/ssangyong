package com.test.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board")
public class Ex04Controller {

	@RequestMapping(value="/ex04.do")
	public String test() {
		
		return "ex04";
	}
	
	@RequestMapping(value="/add.do")
	public String add() {
		
		return "add"; //add.jsp
	}
	
	@RequestMapping(value="/addok.do", method = RequestMethod.POST)
	public String addok() {
		
		return "addok"; //addok.jsp
	}
	
	@RequestMapping(value="/list.do")
	public String list() {
		
		return "list"; //list.jsp
	}
	
	@RequestMapping(value="/edit.do", method=RequestMethod.GET)
	public String edit() {
		
		return "edit";
	}
	
	@RequestMapping(value="/editok.do", method=RequestMethod.POST)
	public String editok() {
		
		return "editok";
	}
	
	//스프링 5부터 지원하는 기능 -> 버전업(pom.xml)
	@GetMapping(value="/del.do")
	public String del() {
		
		return "del";
	}
	
	@PostMapping(value="/delok.do")
	public String delok() {
		
		return "delok";
	}
}
