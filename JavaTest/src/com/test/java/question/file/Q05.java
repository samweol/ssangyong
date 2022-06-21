package com.test.java.question.file;

import java.io.File;
import java.util.ArrayList;

public class Q05 {

	public static void main(String[] args) {
		//요구사항 : 이미지 파일이 있다. 확장자별로 파일이 몇개 있는지 세시오.
		//조건
		//- 새로운 확장자 파일이 추가되도 동작이 가능하게 구현하시오.
		//- 'mouse.bmp'추가를 하면 소스 수정 없이도 *.bmp : 1개 출력이 되게 하시오.
		
		File file = new File("C:\\class\\파일_디렉토리_문제\\확장자별 카운트");
		
		File[]list = file.listFiles();
		// 새로운 확장자 추가시 구현하는 코드 못함
		ArrayList<String> type = new ArrayList<String>();
		//HashMap으로 확장자 받기
		
		int gifCount = 0;
		int jpgCount = 0;
		int pngCount = 0;
		for(File f : list) {

			if(f.getName().contains(".gif")) {
				gifCount++;
			} else if(f.getName().contains(".jpg")) {
				jpgCount++;
			} else if(f.getName().contains(".png")) {
				pngCount++;
			}
		}
		
		System.out.printf("*.gif : %d개\n", gifCount);
		System.out.printf("*.jpg : %d개\n", jpgCount);
		System.out.printf("*.png : %d개\n", pngCount);
	}
}
