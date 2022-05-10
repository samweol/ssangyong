package com.test.java.question.method;

public class Q02 {
	public static void main(String[] args) {
		
		// 요구사항 : 이름을 전달하면 이름뒤에 '님'을 붙여서 반환하는 메소드를 선언하시오.
		
		// 메소드 호출 - 매개변수가 홍길동일때
		String result = getName("홍길동");
		System.out.printf("고객 : %s\n", result);

		
		// 메소드 호출 - 매개변수가 아무개일 때
		result = getName("아무개");
		System.out.printf("고객 : %s\n", result);
	} // main
	
	// 메소드 선언
	public static String getName(String name) {
		
		return name + "님";
	}

} // class

// 또 다른 방법으로 BufferedReader을 활용하여 값을 직접 키보드로 입력하게할 수 있다.
/*
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String name = reader.ReadLine();
	String result = getName(name);
	System.out.printf("고객 : %s\n", name);	
*/
