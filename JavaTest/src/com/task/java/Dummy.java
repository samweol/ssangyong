package com.task.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import javax.swing.text.html.HTMLDocument.Iterator;

public class Dummy {

	public static void main(String[] args) {
		
//		m1();
		m2();
	}

	private static void m2() {
		try {
			
			String[] positionList = {"타자","타자","타자","타자","타자","타자","타자","타자","타자","타자","타자", "투수","투수","투수","투수","투수","투수","투수","투수","투수","투수"};
			String[] name1 = {"김", "이", "박", "최", "정", "강", "조", "윤", "장", "임", "한", "오", "서", "신", "권", "황", "안", "송", "류", "전", "홍",
		            "고", "문", "양", "손", "배", "조", "백", "허", "유", "남", "심", "노", "정", "하", "곽", "성", "차", "주", "우", "구", "신",
		            "임", "나", "전", "민", "유", "진", "지", "엄", "채", "원", "천",
		            "방", "공", "강", "현", "함", "변", "염", "양", "변", "여", "추", "노", "도", "소", "신",
		            "석", "선", "설", "마", "길", "주", "연", "방", "위", "표", "명", "기", "반", "왕", "금", "옥", "육", "인", "맹", "제", "모",
		            "장", "남", "탁", "국", "여", "진", "어", "은", "편", "구", "용"};


		      String[] name2 = { "가", "강", "건", "경", "고", "관", "광", "구", "규", "근", "기", "길", "나", "남", "노", "누", "다", "단",
		            "달", "담", "대", "덕", "도", "동", "두", "라", "래", "로", "루", "리", "마", "만", "명", "무", "문", "미", "민", "바", "박",
		            "백", "범", "별", "병", "보", "빛", "사", "산", "상", "새", "서", "석", "선", "설", "섭", "성", "세", "소", "솔", "수", "숙", "순",
		            "숭", "슬", "승", "시", "신", "아", "안", "애", "엄", "여", "연", "영", "예", "오", "옥", "완", "요", "용", "우", "원", "월", "위",
		            "유", "윤", "율", "으", "은", "의", "이", "익", "인", "일", "잎", "자", "잔", "장", "재", "전", "정", "제", "조", "종", "주",
		            "준", "중", "지", "진", "찬", "창", "채", "천", "철", "초", "춘", "충", "치", "탐", "태", "택", "판", "하", "한", "해", "혁",
		            "현", "형", "혜", "호", "홍", "화", "환", "회", "효", "훈", "휘", "희", "운", "모", "배", "부", "림", "봉", "혼", "황", "량",
		            "린", "을", "비", "솜", "공", "면", "탁", "온", "디", "항", "후", "려", "균", "묵", "송", "욱", "휴", "언", "령", "섬", "들",
		            "견", "추", "걸", "삼", "열", "웅", "분", "변", "양", "출", "타", "흥", "겸", "곤", "번", "식", "란", "더", "손", "술", "훔",
		            "반", "빈", "실", "직", "흠", "흔", "악", "람", "뜸", "권", "복", "심", "헌", "엽", "학", "개", "롱", "평", "늘", "늬", "랑",
		            "얀", "향", "울", "련" };
		      int seq = 2000;
		      BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\선수목록1.txt"));
		      Random rnd = new Random();
		      
		      for(int j=1; j<11; j++) {
		    	  
		    	//여기서 중복이 안되는 숫자를 20개 받아서 그 숫자를 등번호에 넣는다.
	    		  HashSet<String> set = new HashSet<String>();
	    			
	    			while(set.size()<20) {
	    				set.add(rnd.nextInt(100)+ "");
	    			}
	    			
	    			ArrayList<String> numList = new ArrayList<String>();
	    			for(String s : set) {
	    				numList.add(s);
	    			}
		    	  
		    	  for(int i=0; i<20; i++) {
		    		  seq++;
				    	//seq●Tseq●연도●타자●선수번호●선수이름●키●몸무게●타율●홈런●안타●타점●득점
//				    	  int seq = 1 + i;
				    	  
				    	  //팀 번호 teamSeq
				    	  //한팀씩해보자
				    	  
				    	  //연도 2022 9개/ 2021-2012 144개 
				    	  String year = "2022";
				    	  
				    	  //포지션 - 타자 10명/ 선수 10명 나오게 해야함
				    	  String position = positionList[i]; //0. 타자, 1. 투수
				    	  
				    	  //선수 등번호 - 중복 안되게 유효성 검사 필요
				    	  String playerNum = numList.get(i);
				    	  
				    	  //선수 이름
				    	  String name = name1[rnd.nextInt(name1.length)] 
									+ name2[rnd.nextInt(name2.length)] 
									+ name2[rnd.nextInt(name2.length)];
				    	  
				    	  //키 (170~199)
				    	  String height = Integer.toString(rnd.nextInt(30)+170);
				    	  
				    	  //몸무게 (60~99)
				    	  String weight = Integer.toString(rnd.nextInt(40)+60);
				    	  
				    	  //타수 > 5~18번
				    	  int hitSum = rnd.nextInt(30)+1;
				    	  
				    	  //홈런 > 랜덤(0-11)
				    	  int homeRun = rnd.nextInt(hitSum);
				    	  
				    	  //안타 > 랜덤(0-29)
				    	  int hit = rnd.nextInt(hitSum - homeRun);
				    	  
				    	  //타점 > 랜덤
				    	  int hitScore = rnd.nextInt(10);
				    	  
				    	  //득점 > 랜덤
				    	  int makeScore = rnd.nextInt(10);
				    	 
				    	  //타자 - 타율
				    	  double battingAvg = (hit + homeRun)/(double)hitSum;
				    	  
				    	//이닝 (1-9)
				    	  int inning = rnd.nextInt(9)+1;
				    	  
				    	  //투수 - 평균 자책점
				    	  double earnedRunAvg = (9*rnd.nextInt(10)/(double)inning);
				    	  
				    	  //승수 (0-70)
				    	  int win = rnd.nextInt(70); 
				    	  
				    	  //탈삼진 (1-30)
				    	  int threeOut = rnd.nextInt(30);
				    	  if(position.equals("타자")) {
				    		  writer.write(String.format("%d●%d●%s●%s●%s●%s●%s●%s●%.2f●%d●%d●%d●%d\n"
		  			  				,seq
		  			  				,j
		  			  				,year
		  			  				,position
		  			  				,playerNum
		  			  				,name
		  			  				,height
		  			  				,weight
		  			  				,battingAvg
		  			  				,homeRun
		  			  				,hit
		  			  				,hitScore
		  			  				,makeScore));  
				    	  } else {
				    		  writer.write(String.format("%d●%d●%s●%s●%s●%s●%s●%s●%.2f●%d●%d●%d\n"
		  			  				,seq
		  			  				,j
		  			  				,year
		  			  				,position
		  			  				,playerNum
		  			  				,name
		  			  				,height
		  			  				,weight
		  			  				,earnedRunAvg
		  			  				,win
		  			  				,inning
		  			  				,threeOut));
		    	  }
		      }
		      }
		      writer.close();
			
		} catch (Exception e) {
			System.out.print("Dummy.m2");
			e.printStackTrace();
		}
		
	}

	private static void m1() {
		int teamSeq = 1;
	      
	    try {
			
			//선수 명단
			//seq●Tseq●타자●선수번호●선수이름●키●몸무게●타율●홈런●안타●타점●득점
			//C:\class
			
	    	//만들 갯수
	    	int hsize = 10;
	    	int psize = 10;
	    	
			//포지션
			String[] positionList = {"타자","타자","타자","타자","타자","타자","타자","타자","타자","타자","타자", "투수","투수","투수","투수","투수","투수","투수","투수","투수","투수"};
			
			//선수 번호 랜덤 -> 겹치면 안됨
			Random rnd = new Random();
			
			//이름
			String[] name1 = {"김", "이", "박", "최", "정", "강", "조", "윤", "장", "임", "한", "오", "서", "신", "권", "황", "안", "송", "류", "전", "홍",
		            "고", "문", "양", "손", "배", "조", "백", "허", "유", "남", "심", "노", "정", "하", "곽", "성", "차", "주", "우", "구", "신",
		            "임", "나", "전", "민", "유", "진", "지", "엄", "채", "원", "천",
		            "방", "공", "강", "현", "함", "변", "염", "양", "변", "여", "추", "노", "도", "소", "신",
		            "석", "선", "설", "마", "길", "주", "연", "방", "위", "표", "명", "기", "반", "왕", "금", "옥", "육", "인", "맹", "제", "모",
		            "장", "남", "탁", "국", "여", "진", "어", "은", "편", "구", "용"};


		      String[] name2 = { "가", "강", "건", "경", "고", "관", "광", "구", "규", "근", "기", "길", "나", "남", "노", "누", "다", "단",
		            "달", "담", "대", "덕", "도", "동", "두", "라", "래", "로", "루", "리", "마", "만", "명", "무", "문", "미", "민", "바", "박",
		            "백", "범", "별", "병", "보", "빛", "사", "산", "상", "새", "서", "석", "선", "설", "섭", "성", "세", "소", "솔", "수", "숙", "순",
		            "숭", "슬", "승", "시", "신", "아", "안", "애", "엄", "여", "연", "영", "예", "오", "옥", "완", "요", "용", "우", "원", "월", "위",
		            "유", "윤", "율", "으", "은", "의", "이", "익", "인", "일", "잎", "자", "잔", "장", "재", "전", "정", "제", "조", "종", "주",
		            "준", "중", "지", "진", "찬", "창", "채", "천", "철", "초", "춘", "충", "치", "탐", "태", "택", "판", "하", "한", "해", "혁",
		            "현", "형", "혜", "호", "홍", "화", "환", "회", "효", "훈", "휘", "희", "운", "모", "배", "부", "림", "봉", "혼", "황", "량",
		            "린", "을", "비", "솜", "공", "면", "탁", "온", "디", "항", "후", "려", "균", "묵", "송", "욱", "휴", "언", "령", "섬", "들",
		            "견", "추", "걸", "삼", "열", "웅", "분", "변", "양", "출", "타", "흥", "겸", "곤", "번", "식", "란", "더", "손", "술", "훔",
		            "반", "빈", "실", "직", "흠", "흔", "악", "람", "뜸", "권", "복", "심", "헌", "엽", "학", "개", "롱", "평", "늘", "늬", "랑",
		            "얀", "향", "울", "련" };
		      
		      //키, 몸무게 랜덤
		      
		      //타자 - 타율, 홈런, 안타, 타점, 득점
		      //투수 - 평균자책팀, 승수, 이닝, 탈삼진
		      int seq = 0;
		      BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\선수목록.txt"));
		      for(int k=2012; k<2022; k++) {
		    	  
		    	  for(int j=1; j<11; j++) {
		    		  
		    		  //여기서 중복이 안되는 숫자를 20개 받아서 그 숫자를 등번호에 넣는다.
		    		  HashSet<String> set = new HashSet<String>();
		    			
		    			while(set.size()<20) {
		    				set.add(rnd.nextInt(100)+ "");
		    			}
		    			
		    			ArrayList<String> numList = new ArrayList<String>();
		    			for(String s : set) {
		    				numList.add(s);
		    			}
			    	  
			    	    for(int i=0; i<20; i++) {
					    	  seq++;
					    	//seq●Tseq●연도●타자●선수번호●선수이름●키●몸무게●타율●홈런●안타●타점●득점
//					    	  int seq = 1 + i;
					    	  
					    	  //팀 번호 teamSeq
					    	  //한팀씩해보자
					    	  
					    	  //연도 2022 9개/ 2021-2012 144개 
					    	  String year = Integer.toString(k);
					    	  
					    	  //포지션 - 타자 10명/ 선수 10명 나오게 해야함
					    	  String position = positionList[i]; //0. 타자, 1. 투수
					    	  
					    	  //선수 등번호 - 중복 안되게 유효성 검사 필요
					    	  String playerNum = numList.get(i);
					    	  
					    	  //선수 이름
					    	  String name = name1[rnd.nextInt(name1.length)] 
										+ name2[rnd.nextInt(name2.length)] 
										+ name2[rnd.nextInt(name2.length)];
					    	  
					    	  //키 (170~199)
					    	  String height = Integer.toString(rnd.nextInt(30)+170);
					    	  
					    	  //몸무게 (60~99)
					    	  String weight = Integer.toString(rnd.nextInt(40)+60);
					    	  
					    	  //타수 > 5~18번
					    	  int hitSum = rnd.nextInt(300)+1;
					    	  
					    	  //홈런 > 랜덤(0-11)
					    	  int homeRun = rnd.nextInt(hitSum);
					    	  
					    	  //안타 > 랜덤(0-29)
					    	  int hit = rnd.nextInt(hitSum - homeRun);
					    	  
					    	  //타점 > 랜덤
					    	  int hitScore = rnd.nextInt(10);
					    	  
					    	  //득점 > 랜덤
					    	  int makeScore = rnd.nextInt(10);
					    	 
					    	  //타자 - 타율
					    	  double battingAvg = (hit + homeRun)/(double)hitSum;
					    	  
					    	//이닝 (1-9)
					    	  int inning = rnd.nextInt(9)+1;
					    	  
					    	  //투수 - 평균 자책점
					    	  double earnedRunAvg = (9*rnd.nextInt(10)/(double)inning);
					    	  
					    	  //승수 (0-70)
					    	  int win = rnd.nextInt(70); 
					    	  
					    	  //탈삼진 (1-30)
					    	  int threeOut = rnd.nextInt(140);
					    	  if(position.equals("타자")) {
					    		  writer.write(String.format("%d●%d●%s●%s●%s●%s●%s●%s●%.2f●%d●%d●%d●%d\n"
			  			  				,seq
			  			  				,j
			  			  				,year
			  			  				,position
			  			  				,playerNum
			  			  				,name
			  			  				,height
			  			  				,weight
			  			  				,battingAvg
			  			  				,homeRun
			  			  				,hit
			  			  				,hitScore
			  			  				,makeScore));  
					    	  } else {
					    		  writer.write(String.format("%d●%d●%s●%s●%s●%s●%s●%s●%.2f●%d●%d●%d\n"
			  			  				,seq
			  			  				,j
			  			  				,year
			  			  				,position
			  			  				,playerNum
			  			  				,name
			  			  				,height
			  			  				,weight
			  			  				,earnedRunAvg
			  			  				,win
			  			  				,inning
			  			  				,threeOut));
					    	  }
					    	  
					      } 
			      }
		      }
		      writer.close();
		  
		      
		} catch (Exception e) {
			System.out.print("Dummy.main");
			e.printStackTrace();
		}
		
		//타자일 때, 투수일 때 다르게 출력
//		String.format("%d●%d●%s●%d●%s●%s●%s●%d●%d●%d●%d●%d");
	}
}
