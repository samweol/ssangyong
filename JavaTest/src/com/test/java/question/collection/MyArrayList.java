package com.test.java.question.collection;

// ArrayList와 동일한 동작을 하는 클래스를 선언하시오.
// 모든 기능의 디테일 > 실제 ArrayList와 비교

public class MyArrayList {
	private String[] list;
	private int index;
	
	public MyArrayList() {
		this.index = 0;
	}
	
	public boolean add(String s) {
		
		//배열의 끝에 아이템 넣기
		//1. 처음 넣을때 배열 만들기
		//1.5 방이 모자라면 배열을 2배로 늘리기
		//2. 데이터 넣기
		
		try {
			
			init();
			
			
			if (checkLength()) {
				doubleList();
			}
			
			
			this.list[this.index] = s;
			this.index++; //Append
			
			return true;
			
		} catch (Exception e) {
			
			return false;
		}		
		
	}

	private boolean checkLength() {
		
		//방이 꽉찼는지?
		if (this.index == this.list.length) {
			return true;
		}
		
		return false;
	}

	private void doubleList() {
		
		//1. 2배 길이의 배열 생성
		//2. 깊은 복사
		//3. 교체
		
		String[] temp = new String[this.list.length * 2];
		
		for (int i=0; i<this.list.length; i++) {
			temp[i] = this.list[i];
		}
		
		this.list = temp;
		
	}

	private void init() {
		
		//처음 넣을 때 배열 만들기
		if (this.index == 0) {
			this.list = new String[4];
		}
		
	}
	
	
	
	
	public String get(int index) {
		
		if (!checkIndex(index)) {
			//잘못된 방번호
			throw new IndexOutOfBoundsException();
		}
		
		return this.list[index];
	}
	
	
	
	
	public int size() {
		
		return this.index;
	}
	
	
	
	
	
	public String set(int index, String value) {
		
		
		if (!checkIndex(index)) {
			//잘못된 방번호
			throw new IndexOutOfBoundsException();
		}
		
		
		String temp = this.list[index];
		
		this.list[index] = value;
		
		return temp;
	}
	
	
	
	
	public String remove(int index) {
		
		String temp = this.list[index];
		
		//Left Shift 처리(***)
		for (int i=index; i<this.list.length-1; i++) {
			this.list[i] = this.list[i+1];
		}
		
		//데이터 1개 삭제 > this.index 반영(***)
		this.index--;
		
		return temp;		
	}
	
	
	
	public boolean add(int index, String value) {
		
		//삽입 > Right Shift
		
		try {
			
			if (checkLength()) {
				doubleList();
			}
		
			for (int i=this.list.length - 2; i>=index; i--) {
				this.list[i+1] = this.list[i];
			}
			
			this.list[index] = value; //새치기
			this.index++;
			
			return true;
			
		} catch (Exception e) {
			return false;
		}
		
	}
	
	
	
	public int indexOf(String value) {
		
		for (int i=0; i<this.index; i++) { //데이터가 있는곳까지만 검색
			if (this.list[i].equals(value)) {
				return i; //찾은 방번호 반환
			}
		}
		
		return -1; //못찾음
	}
	
	
	
	public int lastIndexOf(String value) {
		
		for (int i=this.index - 1; i>=0; i--) {
			if (this.list[i].equals(value)) {
				return i; //찾은 방번호 반환
			}
		}
		
		return -1; //못찾음
	}
	
	
	
	public void clear() {
		
		//모든 요소 삭제
		
		//Case 1.
		
		//for (int i=0; i<this.index; i++) {
		//	this.list[i] = null;
		//}
		
		//Case 2.
		//this.list = new String[this.list.length];
		
		//Case 3.
		this.index = 0; //속도, 경제 ****
		
	}
	
	
	
	public void trimToSize() {
		
		//배열 늘리기의 반대 작업
		String[] temp = new String[this.index];
		
		for (int i=0; i<this.index; i++) {
			temp[i] = this.list[i];
		}
		
		this.list = temp;
		
	}
	
	

	private boolean checkIndex(int index) {
		
		//유효한 index의 범위?
		//0 ~ index - 1
		
		if (index >= 0 && index < this.index) {
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		
		//객체의 상태의 확인하는 용도
		// > 되도록 상황에 따라 보기 좋게 구현
		
		String temp = "";
		
		temp += "\n";
		temp += String.format("length: %d\n", this.list.length); //배열의 실제 길이
		temp += String.format("index: %d\n", this.index); //현재 방번호
		temp += String.format("[\n");
		
		for (int i=0; i<this.list.length; i++) {
			temp += String.format("  %d: %s,\n", i, this.list[i]);
		}
		
		temp += String.format("]\n");
		
		return temp;		
	}
	
	
	
}

	
	
//	private String[] list; 	//ArrayList의 내부 배열(*****)
//	private int index;		// ***** 가장 중요한 역할 *****
//	
//	public MyArrayList() {
//		this.index = 0;
//	}
//	
//	// list.add("홍길동");
//	public void add(String value) {
//		
//		// 배열의 끝에 아이템 넣기
//		// 1. 처음 넣을 때 배열 만들기
//		// 1.5 방이 모자라면 배열을 2배로 늘리기
//		// 2. 데이터 넣기
//		
//		// 첫 add 인지? > index == 0
//		if(this.index == 0) {
//			this.list = new String[4];			
//		}
//			
//		// 현재 배열의 길이보다 많은 데이터를 입력하려고 하는지?
//		// > 배열의 2배로 늘려 + 복사 + 교체 > 그림판
//		
//		if(this.index > 3) {
//			String[] newList = new String[8]; // 2배짜리 배열 생성
//			for(int i=0; i<this.list.length; i++) {
//				newList[i] = this.list[i]; // 배열 복사 (깊은 복사)
//			}
//			this.list = newList; // 교체 (얕은 복사)
//		}
//		
//		// add
//		this.list[this.index] = value;
//		this.index++;
//	}
//	
//	// System.out.println(list.get(0));
//	public String get(int index) {	
//		// 없는 방 번호를 요청했을 때?
//		if(index > this.index) {
//			throw new ArrayIndexOutOfBoundsException();
//		}
//		return this.list[index];
//	}
//	
//	public int size() {
//				
//		return this.index;
//	}
//	
//	public String set(int index, String value) {
//		
//		String before = this.list[index];
//		this.list[index] = value;
//		
//		return before;
//	}
//	
//	public String remove(int index) {
//		
//		String remove = this.list[index];
//		
//		// index 뒤에 있는 요소를 앞으로 한칸씩 이동시킨다. (좌시프트)
//		
//		for(int i=index+1; i<list.length; i++) {
//			this.list[i-1] = this.list[i];
//		}
//		this.index--; // size 변경
//		
//		return remove;
//	}
//	
//	public boolean add(int index, String value) {
//		
//		// 해당 index 기준으로 뒤에 아이들을 오른쪽으로 한칸 씩 이동시킨다. (우시프트)
//		// 해당 index에 value값을 넣는다.
//		for(int i=this.index; i>=index; i--) {
//			this.list[i+1] = this.list[i];
//		}
//		this.list[index] = value;
//		this.index++;
//		return true;
//	}
//	
//	public int indexOf(String value) {
//		
//		for(int i=0; i<=this.index; i++) {
//			if(this.list[i].equals(value)) {
//				return i;
//			} else {
//				return -1;
//			}
//		}
//		
//		return -1;
//	}
//	
//	public int lastIndexOf(String value) {
//		
//		for(int i=this.index; i>=0; i--) {
//			if(this.list[i].equals(value)) {
//				return i;
//			}
//		}
//		
//		return -1;
//	}
//	
//	public void clear() {
//		for(int i=0; i>=this.index; i++) {
//			this.list[i] = null;
//		}
//		this.index = 0;
//	}
//	
//	public void trimToSize() {
//		
//		String[] newArray = new String[this.index];
//		
//		for(int i=0; i<this.index; i++) {
//			newArray[i] = this.list[i];
//		}
//		
//		this.list = newArray;
//	}
//}
