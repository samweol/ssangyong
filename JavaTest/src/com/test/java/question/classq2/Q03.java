package com.test.java.question.classq2;

public class Q03 {

	public static void main(String[] args) {
		
		//포장하는 직원
		Packer packer = new Packer();

		//연필
		Pencil p1 = new Pencil();
		p1.setHardness("HB");
		packer.packing(p1);

		Pencil p2 = new Pencil();
		p2.setHardness("4B");
		packer.packing(p2);

		//지우개
		Eraser e1 = new Eraser();
		e1.setSize("Large");
		packer.packing(e1);

		//볼펜
		BallPointPen b1 = new BallPointPen();
		b1.setThickness(0.3);
		b1.setColor("black");
		packer.packing(b1);

		BallPointPen b2 = new BallPointPen();
		b2.setThickness(1.5);
		b2.setColor("red");
		packer.packing(b2);

		//자
		Ruler r1 = new Ruler();
		r1.setLength(30);
		r1.setShape("줄자");
		packer.packing(r1);
		
		//결과 확인
		packer.countPacking(0);
		packer.countPacking(1);
		packer.countPacking(2);
		packer.countPacking(3);
		packer.countPacking(4);
	}
}

class Packer {
	
	private static int pencilCount;
	private static int eraserCount;
	private static int ballPointPenCount;
	private static int rulerCount;
	
	public void packing(Pencil pencil) {
		
		//포장 전 검수 : HB 진하기 연필입니다.
		//포장을 완료했습니다.
		System.out.printf("포장 전 검수 : %s 진하기 연필입니다.\n", pencil.getHardness());
		System.out.println("포장을 완료했습니다.");
		pencilCount++;
	}
	
	public void packing(Eraser eraser) {
		System.out.printf("포장 전 검수 : %s 사이즈 지우개입니다.\n", eraser.getSize());
		System.out.println("포장을 완료했습니다.");
		eraserCount++;
	}
	
	public void packing(BallPointPen ballPointPen) {
		System.out.printf("포장 전 검수 : %s 색상 %smm 볼펜입니다.\n"
				, ballPointPen.getColor()
				, ballPointPen.getThickness());
		System.out.println("포장을 완료했습니다.");
		ballPointPenCount++;
	}
	
	public void packing(Ruler ruler) {
		System.out.printf("포장 전 검수 : %dcm %s입니다.\n"
				, ruler.getLength()
				, ruler.getShape());
		System.out.println("포장을 완료했습니다.");
		rulerCount++;
	}
	
	public void countPacking(int type) {
		
		String txt = "";
		
		if (type == 0) {
			txt += String.format("=====================\n");
			txt += String.format("포장 결과\n");
			txt += String.format("=====================\n");
			txt += String.format("연필 %d회\n", Packer.pencilCount);
			txt += String.format("지우개 %d회\n", Packer.eraserCount);
			txt += String.format("볼펜 %d회\n", Packer.ballPointPenCount);
			txt += String.format("자 %d회\n", Packer.rulerCount);
			
			System.out.println(txt);
		} else if (type == 1){
			txt += String.format("=====================\n");
			txt += String.format("포장 결과\n");
			txt += String.format("=====================\n");
			txt += String.format("연필 %d회\n", Packer.pencilCount);
			
			System.out.println(txt);
		} else if (type == 2) {
			txt += String.format("=====================\n");
			txt += String.format("포장 결과\n");
			txt += String.format("=====================\n");
			txt += String.format("지우개 %d회\n", Packer.eraserCount);
			
			System.out.println(txt);
		} else if (type == 3) {
			txt += String.format("=====================\n");
			txt += String.format("포장 결과\n");
			txt += String.format("=====================\n");
			txt += String.format("볼펜 %d회\n", Packer.ballPointPenCount);
			
			System.out.println(txt);
		} else if(type == 4) {
			txt += String.format("=====================\n");
			txt += String.format("포장 결과\n");
			txt += String.format("=====================\n");
			txt += String.format("자 %d회\n", Packer.rulerCount);
			
			System.out.println(txt);
		}
	}
	
}

class Pencil {
	
	private String hardness; // 흑연 등급(4B, 3B, 2B, B, HB, H, 2H, 3H, 4H)
	
	public void setHardness(String hardness) {
		this.hardness = hardness;
	}
	
	public String getHardness() {
		return hardness;
	}
}

class Eraser {
	
	private String size; // Large, Medium, Small
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public String getSize() {
		return size;
	}
}

class BallPointPen {
	
	private double thickness; // 0.3mm, 0.5mm, 0.7mm, 1mm, 1.5mm
	private String color; // red, blue, green, block
	
	public void setThickness(double thickness) {
		this.thickness = thickness;
	}
	public double getThickness() {
		return thickness;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
}

class Ruler {
	
	private int length; //30cm, 50cm, 100cm
	private String shape; // 줄자, 운형자, 삼각자
	
	public void setLength(int length) {
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getShape() {
		return shape;
	}
}