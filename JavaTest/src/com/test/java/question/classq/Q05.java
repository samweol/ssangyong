package com.test.java.question.classq;

public class Q05 {

	public static void main(String[] args) {
		
		Box box1 = new Box();

		box1.cook();
		box1.check();
		box1.list();
	}
}

class Box{
	private Macaron[] list = new Macaron[10];

	public void cook() {
		
		for(int i=0; i<list.length; i++) {
			
			Macaron m = new Macaron(); // 마카롱 만들기
			
			// 5  - 5 = 0
			// 15 - 5 = 10
			int n = (int)(Math.random() * 11) + 5; // 생산크기
			m.setSize(n);
			
			String[] color = {"red", "blue", "yello", "white", "pink", "purple", "green", "black"};
			n = (int)(Math.random() * color.length); // 랜덤 색깔
			m.setColor(color[n]);
			
			n = (int)(Math.random() * 20) + 1; // 두께지정
			m.setThickness(n);
			
			this.list[i] = m; // 마카롱 리스트에 넣기
			
		}
		
		System.out.printf("마카롱을 %d개 만들었습니다.\n", list.length);
		
	}
	public void check() {
		
		int pass = 0;
		int failed = 0;
		
		for(int i=0; i<this.list.length; i++) {
			Macaron m = this.list[i]; // list배열에서 마카롱 하나씩 가져오기
			
			if(checkMacaron(m)) {
				pass++;
			} else {
				failed++;
			}						
		}
		System.out.printf("[박스 체크 결과]\n" 
							+ "QC 합격 개수 : %d개\n"
							+"QC 불합격 개수 : %d개\n"
							, pass
							, failed);
		
	}
	// 유효성 검사
	private boolean checkMacaron(Macaron m) {
		
		if(m.getSize() <8 || m.getSize() > 14) {
			return false;
		}
		
		if(m.getColor().equals("black")) {
			return false;
		}
		
		if(m.getThickness() <3 || m.getThickness() > 18) {
			return false;
		}
		
		return true;
	}
	public void list() {
		System.out.println("[마카롱 목록]");
		
		for(int i=0; i<this.list.length; i++) {
			Macaron m = this.list[i];
			System.out.printf("%d번 마카롱 : %dcm(%s, %dmm) : %s\n"
					, (i+1)
					, m.getSize()
					, m.getColor()
					, m.getThickness()
					, checkMacaron(m)? "합격":"불합격");
		}
	}	
}

class Macaron{
	private int size;
	private String color;
	private int thickness;
	
	// 주로 setter, getter에는 업무코드를 넣지 않는다.
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getThickness() {
		return thickness;
	}
	public void setThickness(int thickness) {
		this.thickness = thickness;
	}
	
	
}