package com.test.java.question.collection;


//코드 리뷰를 바탕으로 주말에 추가 수정
public class MyQueue {

	private String[] list;
	private int index;
	private int i;
	
	public MyQueue() {
		this.list = new String[5];
		this.index = 0;
		this.i = 0;
	}
	
	public void add(String value) {
		// 초기 길이를 4로 설정하고 늘어나는 코드 추가
		this.list[this.index] = value;
		this.index++;
	}
	
	public String poll() {
		// 쉬프트 진행코드 추가
		index--;
		return this.list[i++];
	}
	
	public int size() {
		return index;
	}
	
	public String peek(){
		return this.list[i];
	}
	
	public void clear() {
		for(int i=0; i>=this.index; i++) {
			this.list[i] = null;
		}
		this.index = 0;
	}
	
	public void trimToSize() {
		String[] newArray = new String[this.index];
		
		for(int i=0; i<this.index; i++) {
			newArray[i] = this.list[i];
		}
		
		this.list = newArray;
	}
}
