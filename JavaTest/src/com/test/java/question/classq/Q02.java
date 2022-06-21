package com.test.java.question.classq;

public class Q02 {

	public static void main(String[] args) {
		
		Note note = new Note();

		note.setSize("B4");
		note.setColor("노란색");
		note.setPage(25);
		note.setOwner("홍길동");
		System.out.println(note.info());
		
		
		// 이름이 없는 경우 해결 못함
		Note note2 = new Note();

		note2.setSize("A4");
		note2.setColor("검정색");
		note2.setPage(100);
		System.out.println(note2.info());
		
	}
}

class Note{
	private String size;			//크기 : 쓰기, A3/A4/A5/B3/B4/B5
	private String color;			//색상 : 쓰기, 검정색/흰색/노란색/파란색
	private int page;				//페이지수 : 쓰기, 10~200페이지 이내
									//10~50(얇다)/51~100(보통)/101~200(두껍다)
	private String owner;			//소유자이름 : 쓰기, 한글2~5자이내. 필수값
	private int price;				//가격 : Setter,Getter구현안함.
	
	/*
	기본 노트 : A5 + 흰색 + 10페이지 = 가격 500원
	크기 변경 : A3(+400), A4(+200원), B3(+500원), B4(+300원), B5(+100원)
	색상 변경 : 검정색(+100원), 노란색(+200원), 파란색(+200원)
	페이지수 변경 : 페이지 당 *10원 추가
	 */
	
	public void setSize(String size) {
		
		if(checkSize(size)) {
			this.size = size;
		} else {
			System.out.println("잘못된 사이즈입니다.");
		}
	}
	public void setColor(String color) {
		if(checkColor(color)) {
			this.color = color;
		} else {
			System.out.println("입력하실 수 있는 색상은 검정색/흰색/노란색/파란색 입니다.");
		}		
	}
	public void setPage(int page) {
		if(page >=10 && page <=200) {
			this.page = page;
		} else {
			System.out.println("페이지는 10~200페이지 이내만 입력하실 수 있습니다.");
		}	
	}
	public void setOwner(String owner) {
		if(checkName(owner) || owner.equals(null)) {
			this.owner = owner;
		} else {
			System.out.println("이름은 2-5자 이내, 한글로만 입력해야합니다.");
		}
		
	}
	

	//유효성 검사
	private boolean checkSize(String size) {
		if(size.equals("A3")
				||size.equals("A4")
				||size.equals("A5")
				||size.equals("B3")
				||size.equals("B4")
				||size.equals("B5")) {
			return true;
		}
		return false;
	}
	private boolean checkName(String name) {
		if(name.length()<2 || name.length()>5) {
			return false;
		}
		
		for(int i=0; i<name.length(); i++) {
			char c = name.charAt(i);
			if(c<'가' || c>'힣') {
				return false;
			}
		}
		return true;
	}
	private boolean checkColor(String color) {
		if(color.equals("검정색")
				||color.equals("흰색")
				||color.equals("노란색")
				||color.equals("파란색")) {
			return true;
		}
		return false;
	}
	private String decidePageThickness(int page) {
		String thickness ="";
		if(page<=50) {
			thickness = "얇은";
		} else if(page>50 && page<=100) {
			thickness = "보통인";
		} else {
			thickness = "두꺼운";
		}
		return thickness;
	}
	public String info() {
		
//		if(owner.equals(null)) {
//			System.out.println("주인이 없는 노트");
//		} else {
//			
//		
//		price = calNotePrice(size, color, page);
//		System.out.println("■■■■■■ 노트 정보 ■■■■■■");
//		System.out.printf("소유자 : %s\n특성 : %s %s %s노트\n가격 : %,d\n"
//					, this.owner
//					, this.color
//					, decidePageThickness(page)
//					, this.size
//					, price);
//		System.out.println("■■■■■■■■■■■■■■■■■■■■■■");
//		}
		
		price = calNotePrice(size, color, page);
		
		StringBuilder sb = new StringBuilder();
		
		if(this.owner.equals(null)) {
			sb.append("주인이 없는 노트");
		} else {
			sb.append("■■■■■■ 노트 정보 ■■■■■■");
			sb.append("\r\n");
			sb.append("소유자 : " + this.owner);
			sb.append("\r\n");
			sb.append(String.format("특성 : %s %s %s 노트"
					, this.color
					, decidePageThickness(page)
					, this.size));
			sb.append("\r\n");
			sb.append(String.format("가격 : %,d원", price));
			sb.append("\r\n");
			sb.append("■■■■■■■■■■■■■■■■■■■■■■");
		}
		
		return sb.toString();
	}
	private int calNotePrice(String size, String color, int page) {
		// 기본 노트 : A5 + 흰색 + 10페이지 = 500원	
		String basicSize = "A5";
		String basicColor = "흰색";
		int basicPage = 10;
		int basicPrice = 500;
		int price = 0;
		if(size.equals(basicSize)
				&& color.equals(basicColor)
				&& page == basicPage) {
			price = basicPrice;
		}
		
		// 크기 변경	
		if(size.equals("A3")) {
			price = basicPrice + 400;
		} else if(size.equals("A4")) {
			price = basicPrice + 200;
		} else if(size.equals("B3")) {
			price = basicPrice + 500;
		} else if(size.equals("B4")) {
			price = basicPrice + 300;
		} else if(size.equals("B5")) {
			price = basicPrice + 100;
		}

		// 색상 변경
		if(color.equals("검정색")) {
			price += 100;
		} else if(color.equals("노란색") 
				||color.equals("파란색")) {
			price += 200;
		} 
	
		// 페이지수 변경
		price += (page - basicPage) * 10;
		
		
		return price;
	}
	
}
