package com.test.java.question.string;

public class Q05 {

	public static void main(String[] args) {
		
		// 요구사항 : 특정 단어가 문장내에 몇회 있었는지 수를 세시오.
		
		String content = "안녕~ 길동아~ 잘가~ 길동아~길동길동";
		String word = "길동";
		int count = 0;
		int index = -1;
		
//		int index = content.indexOf(word); //4
//		System.out.println(index);
//		index =content.indexOf(word, index+1); //5부터 찾기
//		System.out.println(index);//13
//		index =content.indexOf(word, index+1);
//		System.out.println(index);//17
//		index =content.indexOf(word, index+1);
//		System.out.println(index);//19
		
		while(true) {
			index = content.indexOf(word, index+1);
			if(index < 0) {
				break;
			}
			count++;
		}
		
		
		System.out.printf("\'%s\'을 총 %d회 발견했습니다.", word, count);
	}
}
