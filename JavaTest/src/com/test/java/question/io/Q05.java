package com.test.java.question.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) throws Exception {
		//명단에 있는사람 -> 정재재, 정재게, 정길돈
		BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\파일_입출력_문제\\검색_회원.txt"));
		Scanner sc = new Scanner(System.in);
		System.out.print("이름:");
		String input = sc.nextLine();
		sc.close();
		
		String line = null;
		while((line = reader.readLine())!=null) {
			if(line.contains(input)) {
				String[] temp = line.split(",");
				info(temp);
			}
		}
		reader.close();
	}//main
	private static void info(String[] temp) throws Exception {
		String number = temp[0];
		String name = temp[1];
		String address = temp[2];
		String goods = null;
		String amount = null;
		
		BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\파일_입출력_문제\\검색_주문.txt"));
		String line = null;
		while((line = reader.readLine())!=null) {
			if(line.contains(number)) {
				String[] temp2 = line.split(",");
				goods = temp2[1];
				amount = temp2[2];
			}
		}//while
		reader.close();
		System.out.println("====구매내역====");
		System.out.println("[번호]\t[이름]\t[상품명]\t[개수]\t[배송지]");
		System.out.printf("%s\t%s\t%s\t%s\t%s",number, name, goods, amount, address);
	}

}