package com.test.java.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws Exception {
		
		// 요구사항 : 주민 등록 번호 유효성 검사를 하시오.
		// 조건 : '-'의 입력 유뮤 상관없이 검사하시오.
		
		// 입력받기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("주민등록번호 : ");
		String jumin = reader.readLine();
		String juminCheck = "";
		
		// '-' 가 포함되어 있으면 제거하는 코드
		
		juminCheck = jumin.replace("-", "");
		
		
		String juminArr[] = new String[juminCheck.length()];		
		// 배열에 String 잘라서 넣기
		for(int i=0; i<juminArr.length; i++) {
			juminArr[i] = juminCheck.substring(i, i+1);
		}
		
		int[] num = new int[juminArr.length];
		
		// String -> int 배열로 변경하는 코드
		for(int i=0; i<num.length-1; i++) { 			
			num[i] = Integer.parseInt(juminArr[i]);			
		}
		
		// 계산하는 코드 - 2단계
		int sum = 0;
		int a = 2;
		for(int i=0; i<num.length; i++) { // 배열 0-7까지
			
			sum += num[i] * a;
			a++;
			if(a>9) {
				a = 2;
			}
		}
		// 2,  3,  4,  5,  6,  7,  8,  9,  2,  3,  4,  5
		// 0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  10, 11 
		// 14, 14, 14, 19, 19, 26, 34, 34, 34, 34, 36, 36
		// 14, 14, 14, 19, 19, 26, 34, 34, 36, 36, 40, 40
		
//		
//		for(int i=2; i<6; i++) {
//			
//			sum += num[i+6] * i;
//		}
		
		// 3단계
		int level3 = sum % 11;
		
		// 4단계
		int lastNum = 11 - level3;
		String check = Integer.toString(lastNum);
		
		if(juminArr[juminArr.length-1].equals(check)) {
			System.out.println("올바른 주민등록번호입니다.");
		} else {
			System.out.println("올바르지 않은 주민등록번호입니다.");
		}
		
	}
}
