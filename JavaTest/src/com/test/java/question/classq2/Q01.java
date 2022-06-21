package com.test.java.question.classq2;

public class Q01 {

	public static void main(String[] args) {
		
		//학생 1
		Student s1 = new Student(); //기본 생성자 호출
		System.out.println(s1.info());

		//학생 2
		Student s2= new Student("홍길동", 13); //오버로딩 생성자 호출
		System.out.println(s2.info());

		//학생 3
		Student s3= new Student(3, 10, 30); //오버로딩 생성자 호출
		System.out.println(s3.info());

		//학생 4
		Student s4= new Student("아무개", 12, 1, 5, 11); //오버로딩 생성자 호출
		System.out.println(s4.info());
		
	}
}

class Student{
	
	private String name;
	private int age;
	private int grade;
	private int classNumber;
	private int number;
	
	public Student() {
		this("미정", 0, 0, 0, 0);
	}
	
	public Student(String name, int age) {
		this(name, age, 0, 0, 0);
	}
	
	public Student(int grade, int classNumber, int number) {
		this("미정", 0, grade, classNumber, number);
	}
	
	public Student(String name, int age, int grade, int classNumber, int number) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.classNumber = classNumber;
		this.number = number;
	}
	
	public String info() {
		String txt = "";
		txt += String.format("%s", this.name);
		if(this.age == 0) {
			txt += String.format("(나이 : 미정, ");
		} else {
			txt += String.format("(나이 : %d세, ", this.age);
		}
		
		if(this.grade == 0) {
			txt += String.format("학년 : 미정, ", this.grade);
		} else {
			txt += String.format("학년 : %d, ", this.grade);
		}
		
		if(this.classNumber == 0) {
			txt += String.format("반 : 미정, ", this.classNumber);
		} else {
			txt += String.format("반 : %d, ", this.classNumber);
		}
		
		if(this.number == 0) {
			txt += String.format("번호 : 미정)", this.number);
		} else {
			txt += String.format("번호 : %d)", this.number);
		}
		
		
		return txt;
	}
}
