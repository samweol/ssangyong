package com.test.java.question.classq;

class Test{
	public int a;
	public void b() {
		
	}
}

public class Q04 {

	public static void main(String[] args) {
		
//		// Test
//		
//		Test t1 = new Test();
//		t1.a = 10;
//		t1.b();
//		
//		Test t2 = null;
//		t2.a = 20;
//		t2.b();
		
		
		
		
		
		
		
		Employee e1 = new Employee();

		e1.setName("홍길동");
		e1.setDepartment("홍보부");
		e1.setPosition("부장");
		e1.setTel("010-1234-5678");
		e1.setBoss(null); //직속 상사 없음

		e1.info();
		
		
		Employee e2 = new Employee();

		e2.setName("아무개");
		e2.setDepartment("홍보부");
		e2.setPosition("사원");
		e2.setTel("010-2541-8569");
		e2.setBoss(e1); //직속 상사 e1(홍길동)

		e2.info();
		
		//java.lang.NullPointerException
		// -> 해당 라인
	}
}

class Employee {
	private String name;			//이름 : 읽기/쓰기, 2~5자 이내
	private String department;		//부서 : 읽기/쓰기, 영업부/기획부/총무부/개발부/홍보부
	private String position;		//직책 : 읽기/쓰기, 부장/과장/대리/사원
	private String tel;				//연락처 : 읽기/쓰기, 010-XXXX-XXXX 형식 확인
	private Employee boss;			//직속상사 : 읽기/쓰기, 다른 직원 중 한명, 같은 부서가 아니면 될 수 없음(유효성 검사)
									// boss = null > 주소값 변수가 비어있다.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(checkName(name)) {
			this.name = name;
		} else {
			System.out.println("이름은 2~5자 이내로 입력하세요.");
		}	
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		if(checkDepartment(department)) {
			this.department = department;
		} else {
			System.out.println("해당하는 부서가 없습니다.");
		}
		
	}

	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		if(checkPosition(position)) {
			this.position = position;
		} else {
			System.out.println("해당 직책은 없습니다.");
		}
		
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		if(checkTel(tel)) {
			this.tel = tel;
		} else {
			System.out.println("잘못된 형식입니다.");
		}
		
	}

	public Employee getBoss() {
		return boss;
	}
	public void setBoss(Employee boss) {
		
		//java.lang.NullPointerException
		if(boss != null) {
			if(this.department.equals(boss.getDepartment())) {
				this.boss = boss;
			}
		}		
	}
	
	private boolean checkName(String name) {
		if(name.length() <2 && name.length() >5) {
			return false;
		}
		
		for(int i=0; i<name.length(); i++) {
			char c = name.charAt(i);
			if(c < '가' || c > '힣') {
				return false;
			}
		}		
		return true;
	}
	private boolean checkDepartment(String department) {
		if(department.equals("영업부")
				||department.equals("기획부")
				||department.equals("총무부")
				||department.equals("개발부")
				||department.equals("홍보부")) {
			return true;
		}
		return false;
	}
	private boolean checkPosition(String position) {
		if(position.equals("부장")
				||position.equals("과장")
				||position.equals("대리")
				||position.equals("사원")) {
			return true;
		}
		return false;
	}
	private boolean checkTel(String tel) {
		
		String[] num = new String[tel.length()];
		for(int i=0; i<tel.length(); i++) {
			num[i] = tel.substring(i, i+1);
		}
		
		if(!num[3].equals("-")
				||!num[8].equals("-")) {
			return false;
		}
		return true;
	}
	
	public void info() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("[" + this.name + "]");
		sb.append("\r\n");
		sb.append("- 부서 : " + this.department);
		sb.append("\r\n");
		sb.append("- 직위 : " + this.position);
		sb.append("\r\n");
		sb.append("- 연락처 : " + this.tel);
		sb.append("\r\n");
		if(this.boss == null) {
			sb.append("- 직속상사 : 없음");
		} else {
			sb.append("- 직속상사 : " + boss.getName() + "(" + boss.getDepartment() + boss.getPosition() + ")");
		}
		sb.append("\r\n");
		
		System.out.println(sb);
		
	}
}