package com.test.java.question.collection;

public class MySet {

	private int index;
	private String[] list;
	private int sindex;
	
	public MySet() {
		this.index = 0;
		this.sindex = 0;
	}
	public boolean add(String s) {
		
		try {
			if(index ==0) {
				list = new String[4];
			}
			
			if(isDuplicate(s)) {
				return false;
			}
			
			if(this.index == list.length) {
				String[] temp = new String[this.index * 2];
				for(int i=0; i<this.list.length; i++) {
					temp[i] = this.list[i];
				}
				
				this.list = temp;
			}
			
			this.list[this.index] = s;
			this.index++;
			return true;
			
		} catch(Exception e) {
			return false;
		}
		
		
	}
	
	private boolean isDuplicate(String s) {
		for(int i=0; i<this.index; i++) {
			if(this.list[i].equals(s)) {
				return true;
			}
		}
		return false;
	}
	public int size() {
		
		return this.index;
	}
	
	public String remove(String value) {
		
		int index = -1;
		
		// 삭제
		for(int i=0; i<this.index; i++) {
			if(this.list[i].equals(value)) {
				index = i;
				break;
			}
		}
		
		// 삭제후 이동
		for(int i=index; i<this.list.length-1; i++) {
			this.list[i] = this.list[i+1];
		}
		this.index--;
		return value;
	}
	
	public void clear() {
		
		this.index = 0;
		
	}
	
	
	//?
	public boolean hasNext() {
		
		if(this.sindex < this.index) {
			return true;
		}
		return false;
	}
	
	public String next() {
		this.sindex++;
		return this.list[this.sindex-1];
	}
	
	@Override
	public String toString() {
		
		String temp = "";

		temp += "\n";
		temp += String.format("length: %d\n", this.list.length);
		temp += String.format("size: %d\n", this.index);
		temp += String.format("[\n");
		for (int i = 0; i < this.list.length; i++) {
			temp += String.format("   %d: %s\n", i, this.list[i]);
		}
		temp += String.format("]");
		temp += "\n";

		return temp;
	}
}
