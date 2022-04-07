package com.test.java.question.classq;

public class Q01 {

	public static void main(String[] args) {
		
		Book b1 = new Book();

		b1.setTitle("자바의 정석");
		b1.setPrice(45000);
		b1.setAuthor("남궁성");
		b1.setPublisher("도우출판");
		b1.setISBN("8994492038");
		b1.setPage(1022);

		System.out.println(b1.info());
		
	}
}

class Book{
	
	private String title;				//제목 : 읽기/쓰기, 최대 50자이내(한글, 영어, 숫자)
	private int price;					//가격 : 읽기/쓰기, 0-1,000,000원
	private String author;				//저자 : 읽기/쓰기, 제한 없음 > 유효성 검사x
	private String publisher;			//출판사 : 쓰기 전용 > get 필요없음
	private String year = "2019";		//발행년도 : 읽기 전용(2019년) > 초기값 설정 > set 필요없음
	private String ISBN;				//ISBN : 읽기/쓰기 > 유효성 검사x
	private int page;					//페이지수 : 읽기/쓰기, 1~무제한
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		// 유효성 검사
		if(checkTitle(title)) {
			this.title = title;
		} else {
			System.out.println("잘못된 입력입니다.");
		}	
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		// 유효성 검사
		if(price >=0 && price <= 1000000) {
			this.price = price;
		} else {
			System.out.println("가격은 1,000,000원 이하여야합니다.");
		}
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getYear() {
		return year;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		// 유효성 검사
		if(page >=1) {
			this.page = page;
		} else {
			System.out.println("책은 최소 1장 이상이어야합니다.");
		}	
	}
	
	public String info() {
//		System.out.printf("제목 : %s\n가격 : %,d\n저자 : %s\n출판사 : %s\n발행년도 : %s년\nISBN : %s\n페이지 : %,d장\n"
//				, this.title
//				, this.price
//				, this.author
//				, this.publisher
//				, this.year
//				, this.ISBN
//				, this.page);
		
		// append() : 문자열을 뒤에 계속 추가하는 메소드
		StringBuilder sb = new StringBuilder();
		
		sb.append("제목 : " + this.title);
		sb.append("\r\n");
		sb.append(String.format("가격 : %d원", this.price));
		sb.append("\r\n");
		sb.append("저자 : " + this.author);
		sb.append("\r\n");
		sb.append("출판사 : " + this.publisher);
		sb.append("\r\n");
		sb.append(String.format("발행년도 : %s년", this.year));
		sb.append("\r\n");
		sb.append("ISBN : " + this.ISBN);
		sb.append("\r\n");
		sb.append(String.format("페이지 : %,d장", this.page));
		sb.append("\r\n");
		
		return sb.toString(); // StringBuilder - > String
		
	}
	
	private boolean checkTitle(String title) {
		if(title.length() > 50) {
			return false;
		} 		
		for(int i=0; i<title.length(); i++) {
			char c = title.charAt(i);
			
			if(c>='!' && c<='/') {
				return false;
			}
		}
		
		return true;
	}
	
	
}
