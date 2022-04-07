package com.test.java.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q09 {

	public static void main(String[] args) throws Exception {
		// count와 *** 해결 못함
		
		
		// 요구사항 : 금지어를 마스킹 처리 하시오.
		// 조건
		// 금지어 : 바보, 멍청이
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("입력 : ");
		String content = reader.readLine();
		
//		String word1 = "바보";
//		String word2 = "멍청이";
//		String update = "";
//		int count = 0;
//		
//		
//		if(content.contains(word1)) {
//			update = content.replace(word1, "**");
//			count++;		
//		}
//		if(content.contains(word2)) {
//			update = update.replace(word2, "***");
//			count++;
//		}
//		
//		
//		System.out.println(update);
//		System.out.printf("금지어를 %d회 마스킹했습니다.", count);
		
		
		
		
		
		
//		System.out.println(content.replace("바보", "*"));
//		 조건에 맞는 금지어설정
		String[] word = {"바보", "멍청이"};
		int count = 0;
		for(int i=0; i<word.length; i++){
			if(content.contains(word[i])) {
				content = content.replace(word[i], "**");
				count++;
			} 
		}
		
		System.out.println(content);
		System.out.printf("금지어를 %d회 마스킹했습니다.", count);
	}
}
