package com.test.toy.member;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberDTO {

	private String id;
	private String pw;
	private String name;
	private String lv;
	private String pic;
	private String regdate;
}
