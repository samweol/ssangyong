package com.test.java.question.classq2;

public class Q04 {

	public static void main(String[] args) {
		
		//바리스타
		Barista barista = new Barista();
		
		//손님 1
		//에스프레소 1잔 주문 - 원두 30g
		Espresso e1 = barista.makeEspresso(30);
		e1.drink();
		
		//손님 2
		//라테 1잔 주문 - 원두 30g, 우유 250ml
		Latte l1 = barista.makeLatte(30, 250);
		l1.drink();

		//손님 3
		//아메리카노 1잔 주문 - 원두 30g, 물 300ml, 각얼음 20개
		Americano a1 = barista.makeAmericano(30, 300, 20);
		a1.drink();
		
	}
}

class Barista {
	
	public Espresso makeEspresso(int bean) {
		// 에스프레소 1잔을 만든다.
		Espresso espresso = new Espresso(bean);
		Coffee.bean += bean;
		Coffee.espresso++;
		return espresso;
	}
	
	public Espresso[] makeEspressoes(int bean, int count) {
		// 에스프레소 N잔을 만든다.
		Espresso[] espresso = new Espresso[count];
		for(int i=0; i<count; i++) {
			espresso[i] = makeEspresso(bean);
			Coffee.bean += bean;
			Coffee.espresso++;
		}
		return espresso;
	}
	
	public Latte makeLatte(int bean, int milk) {
		// 라떼 1잔을 만든다.
		Latte latte = new Latte(bean, milk);
		Coffee.bean += bean;;
		Coffee.milk += milk;
		Coffee.latte++;
		return latte;
	}
	
	public Latte[] makeLattes(int bean, int milk, int count) {
		// 에스프레소 N잔을 만든다.
		Latte[] latte = new Latte[count];
		for(int i=0; i<count; i++) {
			latte[i] = makeLatte(bean, milk);
			Coffee.milk += milk;
			Coffee.latte++;
		}
		return latte;
	}
	
	public Americano makeAmericano(int bean, int water, int ice) {
		// 아메리카노 1잔을 만든다.
		Americano americano = new Americano(bean, water, ice);
		Coffee.bean += bean;
		Coffee.water += water;
		Coffee.ice += ice;
		Coffee.americano++;
		return americano;
	}
	
	public Americano[] makeAmekricanos(int bean, int water, int ice, int count) {
		Americano[] americano = new Americano[count];
		for(int i=0; i<count; i++) {
			americano[i] = makeAmericano(bean, water, ice);
			Coffee.bean += bean;
			Coffee.water += water;
			Coffee.ice += ice;
			Coffee.americano++;
		}
		return americano;
	}
	
	private void calConsupmtion() {
		
	}
	
	public void result() {
		// 음료 판매량(에스프레소 판매 개수, 라떼 판매 개수, 아메리카노 판매 개수)
		// 원자지 소비량(원두 소비량, 물 소비량, 우유 소비량, 얼음 소비량)
		// 매출액(원두 판매액, 물 판매액, 우유 판매액, 얼음 판매액)
		
		// 출력부분
		String txt = "";
		txt += String.format("=================================\n");
		txt += String.format("판매 결과\n");
		txt += String.format("=================================\n");
		txt += String.format("\r\n");
		txt += String.format("\r\n");
		txt += String.format("---------------------------------\n");
		txt += String.format("음료 판매량\n");
		txt += String.format("---------------------------------\n");
		txt += String.format("에스프레소 : %d잔\n", Coffee.espresso);
		txt += String.format("아메리카노 : %d잔\n", Coffee.americano);
		txt += String.format("라떼 : %d잔\n", Coffee.latte);
		txt += String.format("\r\n");
		txt += String.format("\r\n");
		txt += String.format("---------------------------------\n");
		txt += String.format("원자재 소비량\n");
		txt += String.format("---------------------------------\n");
		txt += String.format("원두 : %dg\n", Coffee.bean);
		txt += String.format("물 : %dml\n", Coffee.water);
		txt += String.format("얼음 : %d개\n", Coffee.ice);
		txt += String.format("우유 : %,dml\n", Coffee.milk);
		txt += String.format("\r\n");
		txt += String.format("\r\n");
		txt += String.format("---------------------------------\n");
		txt += String.format("매출액\n");
		txt += String.format("---------------------------------\n");
		txt += String.format("원두 : %,d원\n", Coffee.beanTotalPrice);
		txt += String.format("물 : %,d원\n", Coffee.waterTotalPrice);
		txt += String.format("얼음 : %,d원\n", Coffee.iceTotalPrice);
		txt += String.format("우유: %,d원\n", Coffee.milkTotalPrice);
		System.out.println(txt);
	}
}

class Coffee {
	
	public static int bean;				// 총 원두량(g)
	public static int water;			// 총 물 용량(ml)
	public static int ice;				// 총 얼음 개수(개)
	public static int milk;				// 총 우유 용량(ml)
	public static int beanUnitPrice;	// 원두 단가(원), 1g당 1원
	public static int waterUnitPrice;	// 물 단가(원), 1ml당 0.2원
	public static int iceUnitPrice;		// 얼음 단가(원), 1개당 3원
	public static int milkUnitPrice;	// 우유 단가(원), 1ml당 4원
	public static int beanTotalPrice;	// 원두 총 판매액(원)
	public static int waterTotalPrice;	// 물 총 판매액(원)
	public static int iceTotalPrice;	// 얼음 총 판매액(원)
	public static int milkTotalPrice;	// 우유 총 판매액(원)
	public static int americano;		// 아메리카노 총 판매 개수(잔)
	public static int latte;			// 라떼 총 판매 개수(잔)
	public static int espresso;			// 에스프레소 총 판매 개수(잔)
}

class Espresso {
	private int bean; // 에스프레소 생산 시 들어가는 원두량(g)
	
	public Espresso(int bean) {
		this.bean = bean;
	}
	
	public void drink() {
		System.out.printf("원두 %dg으로 만들어진 에스프레소를 마십니다.\n", this.bean);
	}
}

class Latte {
	private int bean; // 라떼 생산 시 들어가는 원두량(g)
	private int milk; // 라떼 생산 시 들어가는 우유량(ml)
	
	public Latte(int bean, int milk) {
		this.bean = bean;
		this.milk = milk;
	}
	
	public void drink() {
		System.out.printf("원두 %dg, 우유 %dml으로  만들어진 라떼를 마십니다.\n"
				, this.bean
				, this.milk);
	}
}

class Americano {
	private int bean; 	// 아메리카노 생산 시 들어가는 원두량(g)
	private int water; 	// 아메리카노 생산 시 들어가는 물량(ml)
	private int ice; 	// 아메리카노 생산 시 들어가는 얼음 개수(개)
	
	public Americano(int bean, int water, int ice) {
		this.bean = bean;
		this.water = water;
		this.ice = ice;
	}
	
	public void drink() {
		System.out.printf("원두 %dg, 물 %dml, 얼음 %d개로 만들어진 아메리카노를 마십니다.\n"
				, this.bean
				, this.water
				, this.ice);
	}
}