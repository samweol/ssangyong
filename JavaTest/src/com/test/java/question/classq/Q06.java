package com.test.java.question.classq;

import java.util.Calendar;

public class Q06 {

	public static void main(String[] args) {
		
		Refrigerator r = new Refrigerator();
		
		Item item1 = new Item();
		item1.setName("김치");
		item1.setExpiration(2022, 4, 8);
		r.add(item1);//냉장고에 넣기
		
		Item item2 = new Item();
		item2.setName("깍두기");
		item2.setExpiration(2022, 4, 1);
		r.add(item2);//냉장고에 넣기

		Item item3 = new Item();
		item3.setName("멸치볶음");
		item3.setExpiration(2022, 4, 3);
		r.add(item3);//냉장고에 넣기
		
		Item item4 = r.get("깍두기");//냉장고에서 꺼내기
		System.out.printf("%s의 유통기한 : %tF\n", item4.getName(), item4.getExpiration());

		System.out.printf("냉장고 안의 총 아이템 개수 : %d개\n", r.count());

		r.listItem();
		
	}
}
/*
	- Refrigerator 객체의 정보
		- Item을 최대 100개까지 담을 수 있다. (멤버 변수 = Item 배열)
	- Refrigerator 객체의 사용
		- Item을 냉장고에 넣는다. void add(Item item);
		- Item을 냉장고에서 꺼낸다. Item get(String name);
		- 냉장고에 있는 Item의 개수를 확인한다. int count();
		- 냉장고에 있는 Item을 확인한다. void listItem();
*/
class Refrigerator{
	private Item[] items = new Item[100];
	private int i = 0;
	
	public void add(Item item) {
		// item 리스트에 넣고 번호에 1 더하기 > 넣는 행위
		this.items[i] = item;
		System.out.printf("\'%s\'를 냉장고에 넣었습니다.\n", this.items[i].getName());
		i++;
	}
	public Item get(String name) {
		for(int j=0; j<items.length; j++) {
			if(items[j].getName().equals(name)) {
				break;
			} else {
				i--;
			}
		}
		Item a = items[i];
		
		return null;
		
	}
	public int count() {
		
		return i;
	}
	public void listItem() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("[냉장고 아이템 목록]");
		sb.append("\r\n");
		for(int i=0; i<items.length; i++) {
			sb.append(String.format("%s(%tF)\n", items[0].getName()
					, items[0].getExpiration()));
		}
		sb.append("\r\n");
		
		System.out.println(sb);
	}
}
/*
	- Item 객체의 정보
		- 식품명, 유통기한
*/
class Item{
	private String name;
	private Calendar expiration;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Calendar getExpiration() {
		return expiration;
	}
	public void setExpiration(int year, int month, int date) {
		Calendar expiration = Calendar.getInstance();
		expiration.set(year, month, date);
		this.expiration = expiration;
	}
	
	
}