package com.test.java.obj.stereo;

public class Ex48_interface {

	public static void main(String[] args) {
		
		/*
			Stereo Type
			- 추상적인 자료형
			- 인터페이스, 추상 클래스 > 클래스의 일종
			
			인터페이스, Interface
			
		
		
		*/
		
		// 둘다 마우스 > 같은 범주 객체 > 기대치 ... 비슷할 거라고 .. 똑같을 거라고... 기대
		
		G304 m1 = new G304();
		m1.click();
		m1.click();
		m1.click();
//		
//		// 새마우스
		G102 m2 = new G102();
//		m2.down();
//		m2.down();
//		m2.down();
		m2.click();
		m2.click();
		m2.click();
		
		// 1. 인터페이스는 자료형이다.
		// 2. 인터페이스는 객체를 만들 수 없다. > 추상 멤법(추상 메소드)를 가지고 있기 때문에
		//	> 추상 멤버를 가지고 있기 때문에 실체화 할 수 없다.
		
//		Mouse m1 = new Mouse();
//		
//		m1.test(); // 이것 때문에 객체를 만들 수 가 없다.(*****)
		
		
	}
}

// 서로 비슷한 부류의 객체들의 사용법을 물리적으로 통일시키는 방법 > 인터페이스

// 인터페이스 == 제품의 규격 역할

// 인터페이스 -> 건전지 사이즈 등

// 인터페이스 선언
interface Mouse {
	
	// 인터페이스 멤버 선언
	// - 추상 메소드를 멤버로 가진다.(**********) > 인터페이스의 이유
	// - 멤버 변수는 가질 수 없다.
	// - 일반 메소드는 가질 수 없다.
	//	private String name; -> 변수 선언 불가능
	
	// Abstract methods do not specify a body
	void test(); // interface에서는 행동을 정의하지 않는 추상메소드로만 선언이 가능 > public 생략 가능
	
}

class G304 implements Mouse {
	
	// 클래스 멤버 선언
	private String type;
	private String color;
	private int dpi;
	
	public void click() {
		
	}
	
	// *** 인터페이스는 자식 클래스에게 강제로(***) 어떤 메소드를 만들도록 한다. > 안만들면 오류가 생겨 디버깅자체가 안되기때문
	@Override
	public void test() {
		
	}
}

class G102 implements Mouse {
	private String color;
	private int price;
	private int buttons;
	
	public void click() {
		
	}
	
	@Override
	public void test() {
		
	}
}

class AAA {
	private BBB b;
	private int num;
	private CCC[] list;
}

class BBB {
	
}

class CCC {
	
}

class DDD {
	
	public void test() {
		EEE eee = new EEE();
	}
}

class EEE {
	
}