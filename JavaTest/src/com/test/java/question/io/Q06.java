package com.test.java.question.io;

import java.io.FileReader;
import java.util.Stack;

public class Q06 {

	public static void main(String[] args) throws Exception {
		//괄호.txt 현재 소스코드 그대로 -> 맞아야됨
		//괄호.java 다운받은 파일 -> 틀려야 정상님
		FileReader reader = new FileReader("C:\\class\\파일_입출력_문제\\괄호.java");
		Stack st = new Stack();
		
		
		try {
			int code = -1;
			while((code = reader.read())!=-1) {
			if ('(' == code || '{' == code) st.push(code+"");
			if (')' == code || '}' == code)  st.pop();	
			}//while
				
			if(st.size()==0) System.out.println("괄호가 일치합니다.");
			else System.out.println("괄호가 일치하지 않습니다.");
			
			} catch (Exception e) {
				System.out.println("괄호가 일치하지 않습니다.");
		}//try
		reader.close();
	}//main

}
