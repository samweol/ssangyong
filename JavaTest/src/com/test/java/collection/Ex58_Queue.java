package com.test.java.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Ex58_Queue {

	public static void main(String[] args) {
		
		// Queue
		// - 선입선출
		// - 인터페이스 > 객체 생성X
		
		Queue<String> queue = new LinkedList<String>(); 
		
		// 1. 요소 추가하기
		// - boolean add(T value)
		queue.add("빨강");
		queue.add("파랑");
		queue.add("노랑");
		
		// 2. 요소 개수
		// - int size()
		System.out.println(queue.size()); //3
		
		// 3. 요소 읽기(=꺼내기)
		System.out.println(queue.poll()); //빨강 deque()
		System.out.println(queue.size()); //2
		
		System.out.println(queue.poll()); //파랑 deque()
		System.out.println(queue.size()); //1
		
		System.out.println(queue.poll()); //노랑 deque()
		System.out.println(queue.size()); //0
		
		System.out.println(queue.poll()); //null > 에러 안남
		System.out.println(queue.size()); //0
		
		// 4. 비었는지?
		System.out.println(queue.size() == 0);
		System.out.println(queue.isEmpty());
		
		// 5. 요소 확인
		queue.add("주황");
		System.out.println(queue.peek()); //주황
		System.out.println(queue.size()); //1
		
		// 6.
		queue.clear();
		System.out.println(queue.size()); //0
	}
}
