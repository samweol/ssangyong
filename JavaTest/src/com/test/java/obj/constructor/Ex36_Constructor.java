package com.test.java.obj.constructor;

public class Ex36_Constructor {

	public static void main(String[] args) {
		
		/*
			생성자, Constructor
			- (특수한 목적을 가지는)메소드
			- 객체 멤버(변수)를 초기화하는 역할을 가지는 메소드
			- 일반 메소드처럼 마음대로 호출이 불가능하다. > 객체가 생설될 때 딱 1번만 호출된다. > 그 뒤에는 호출이 불가능 > 1회용!
			- 클래스 이름과 동일한 이름을 가진다.
			
			
			
			new, 객체 생성 연산자
			
			
			
			Test t = new Test(); > 'Test()' 메소드, 메소드 호출 > 
			
		
		*/
		
		
		User u1 = new User();
		System.out.println(u1.getName());
		System.out.println(u1.getId());
		System.out.println(u1.getAge());
		System.out.println(u1.isFlag());
		System.out.println();
		
		// 하얀색, 미정
		
		Cup c1 = new Cup();
		
		// Setter 역할 > 객체 초기화
		// Setter 역할 > 객체 정보 수정
		c1.setColor("yello");
		c1.setOwner("홍길동");
		
		
		Cup c2 = new Cup();
//		c1.setColor("white");
//		c1.setOwner("미정");
		
		c1.info();
		c2.info();
	}
}

class Cup{
	private String color;
	private String owner;
	private int weight;
	
	// 기본 생성자는 개발자가 작성 안하면 자동 생성된다.
	// 기본 생성자는 개발자가 작성하면 자동 생성안된다.
	// 개발자가 기본 생성자를 생성 후 일부 멤버를 초기화를 안해도 그 일부 멤버에 한해서는 자동으로 초기화 코드가 작성된다.
	// ***** 객체의 멤버 변수는 반드시 초기화 과정을 거치게 된다.
	public Cup() {
		this.color = "white";
		this.owner = "미정";
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void info() {
		System.out.printf("색상 : %s, 소유주 : %s\n", this.color, this.owner);
	}
}

class User{
	
	private String name;
	private String id;
	private int age;
	private boolean flag; //자료형이 boolean으로 만들면 getter의 이름이 is가 붙어서 생긴다.
	
	// 기본 생성자
	// 1. 메소드 명 == 클래스명
	// 2. 반환값 명시 안함 > 생성자 반환값을 가질 수 없다.
	// 3. return문 가질 수 없다.
	// 4. 구현부는 해당 클래스의 멤버를 초기화하는 코드를 작성한다.(*****)
	public User() { //이전까지는 작성하지 않아도 컴파일 과정에서 알아서 생성된 생성자임
		
		this.name = "익명";
		this.id = "none";
		this.age = -1;
		this.flag = true;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
}