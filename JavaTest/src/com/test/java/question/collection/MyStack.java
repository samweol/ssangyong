package com.test.java.question.collection;


// 코드 리뷰를 바탕으로 주말에 추가 수정
public class MyStack {
	
	private String[] list;
	private int index;
	
	public MyStack() {
		this.index = 0;
		this.list = new String[5];
	}
	
	public void push(String value) {
		// 초기 길이를 4로 설정하고 늘어나는 코드 추가
		this.list[this.index] = value;
		this.index++;
	}
	
	public String pop() {
		
		String output = "";
		output = this.list[this.index-1];
		this.index--;
		return output;
	}
	
	public int size() {
		
		return this.index;
	}
	
	public String peek() {
		String value = this.list[this.index-1];
		
		return value;
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
