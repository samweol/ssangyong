package com.test.java.obj.Inheritance;

public class Ex42_Object {

	public static void main(String[] args) {
		
		// Object 클래스
		// - 사용자가 만든 모든 클래스는 자동으로 Object 클래스를 상속 받는다.
		// - 모든 클래스의 근원 클래스, Root Class
		// - 모든 클래스는 Object 클래스로부터 파생된다.
		// - Object 멤버는 모든 클래스에게 상속된다. > 모든 클래스들에게 필요하다고 생각하는 공통 기능을 구현해놨다.
		// Class Object is the root of the class hierarchy.
		// Every class has Object as a superclass. 
		// All objects,including arrays, implement the methods of this class.
		
		Object o1 = new Object();
		
		Test t1 = new Test();
		
		
	}//main
}//Ex42

class Test { //extends Object > 자동으로 상속
	public int a;
	public int b;
}

class Other extends Test {
	public int c;
	public int d;
}
