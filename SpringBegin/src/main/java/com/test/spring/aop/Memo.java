package com.test.spring.aop;

public interface Memo {

	//메모 쓰기
	void add(String memo);
	
	//void addComment(String comment);
	
	//메모 읽기
	String read(int seq) throws Exception;
	
	//메모 수정하기
	boolean edit(int seq, String memo);
	
	//메모 삭제하기
	boolean del(int seq);
	
}
