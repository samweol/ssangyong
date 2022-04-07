package com.test.java;

public class Ex07_Output {

	public static void main(String[] args) {
		/* 콘솔 입출력, Console Input Output, 
		- 기본 입력 장치 : 키보드
		- 기본 출력 장치 : 모니터
		
		콘솔 출력
		- 클래스.필드.메소드()
		
		1. System.out.print(값)
		- 값을 출력하고 종료
		
		2. System.out.println(값)
		- print line > 줄단위 출력
		- 값을 출력하고 엔터치고 종료
		
		3. System.out.printf(값)
		- print format > 여러가지 출력 형식 제공
		
		*/
		
		int age = 20;
		String name = "홍길동";
		
		// print() > print("\r\n") > 빈라인 생성
		System.out.print(10);
		System.out.print(age);
		System.out.print(name);
		System.out.print("안녕하세요.");
		
		// println() > 아무것도 안찍고 엔터만 출력 > 빈라인 생성
		System.out.println(10);
		System.out.println(age);
		
		// 성적표 출력하기
		String name1 = "홍길동";
		int kor1 = 100;
		int eng1 = 90;
		int math1 = 80;
		
		String name2 = "아무개";
		int kor2 = 95;
		int eng2 = 89;
		int math2 = 77;
		
		System.out.println("=============================");
		System.out.println("            성적표");
		System.out.println("=============================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]");
		System.out.println("-----------------------------");
		
		// print()
		System.out.print(name1);
		System.out.print("\t");
		System.out.print(kor1 + "\t");
		System.out.print(eng1 + "\t");
		System.out.print(math1 + "\n");
		
		System.out.print(name2 + "\t" + kor2 + "\t" + eng2 + "\t" + math2 + "\n");
		
		// println()
		System.out.println(name1 + "\t" + kor1 + "\t" + eng1 + "\t" + math1);
		System.out.println(name2 + "\t" + kor2 + "\t" + eng2 + "\t" + math2);
		
		System.out.print(name1);
		System.out.print("\t");
		System.out.print(kor1 + "\t");
		System.out.print(eng1 + "\t");
		System.out.println(math1);
		
		System.out.println();
		/* printf()
		- 형식 문자 제공, PlaceHolder
		- 가독성 향상
		
		1. %s > String
		2. %d > Decimal(정수, byte, short, int, long)
		3. %f > Float(실수, float, double)
		4. %c > Char
		5. %b > Boolean
		*/
		// 요구사항 : "안녕하세요. 홍길동님" 출력
		name = "홍길동";
		System.out.println("안녕하세요. " + name + "님");
		
		// cmd 명렁어 "cls" : clear screen
		
		System.out.printf("안녕하세요. %s님\n", "아무개");
		System.out.printf("안녕하세요. %s님\n", name);
		// 안녕하세요. 홍길동님 > 출력
		
		// 요구사항 : "안녕하세요. 홍길동님. 반갑습니다. 홍길동님"
		System.out.printf("안녕하세요. %s님. 반갑습니다. %s님\n", name, name);
		
		// 요구사항 : SQL
		// insert into tblMember (seq, name, age, address, tel) values (1, '홍길동', 20, '서울시 강남구 역삼동', '010-1234-5678');
		
		String seq = "1";
		name = "홍길동";
		String age2 = "20";
		String address = "서울시 강남구 역삼동";
		String tel = "010-1234-5678";
		
		System.out.printf("insert into tblMember (seq, name, age, address, tel) values (%s, '%s', %s, '%s', '%s');\n", seq, name, age2, address, tel);
		
		System.out.println();
		
		System.out.printf("문자열 : %s\n", "문자열");
		System.out.printf("정수 : %d\n", 10);
		System.out.printf("실수 : %f\n", 3.14);
		System.out.printf("문자 : %c\n", 'A');
		System.out.printf("논리 : %b\n", true);
		
//		System.out.printf("문자열 : %d\n", "홍길동"); 오류
//		System.out.printf("문자열 : %s\n", 20); 형변환 수업
		
		System.out.println();
		
		/* 형식 문자의 확장 기능
		1. %숫자d
		- 모든 형식 문자에 적용
		- 출력할 너비 지정
		- (+) : 우측 정렬
		- (-) : 좌측 정렬
		- 서식 작업에 사용> 탭문자와 같이 사용한다.
		- 수치 숫자 : 우측 정렬
		- 수치 숫자x : 좌측, 우측 정렬
		- 문자열 : 좌측 정렬
		 */
		
		int num = 123;
		System.out.printf("[%d]\n", num);
		System.out.printf("[%10d]\n", num); // 10칸을 확보하고 그 안에 출력해라
		System.out.printf("[%-10d]\n", num);
		// 확보한 자리를 초과하는 경우 - 자리수를 무시
		System.out.printf("[%5d]\n", 1234567);
		
		/* 2. %.숫자f
		- %f 전용
		- 소숫점 이하 출력 자릿수 지정
		 */
		
		double num2 = 3.14;
		System.out.println(num2);
		System.out.printf("%f\n", num2);
		System.out.printf("%.2f\n", num2);
		System.out.println();
		
		System.out.println(10.0/3);
		System.out.printf("%f\n", 10.0/3);
		System.out.printf("%.2f\n", 10.0/3);
		System.out.println();
		
		/* 3. %,d
		- %d, %f 적용
		- 천단위 표기(3자리)
		*/
		
		int price = 1234567;
		System.out.printf("금액 : %d원\n", price);
		System.out.printf("금액 : %,d원\n", price);
		System.out.println();
		
		// 숫자 출력 > 반드시 !!단위 출력
		System.out.println("=======================");
		System.out.println("         음료가격");
		System.out.println("=======================");
		System.out.printf("콜라 : \t\t%5d원\n", 2500);
		System.out.printf("스무디 : \t\t%5d원\n", 3500);
		System.out.printf("박카스 : \t\t%5d원\n", 500);
		System.out.printf("아메리카노 : \t%5d원\n", 12000);
		
		// 숫자는 우측 정렬 > 가장 긴 자릿수 찾기 > 얘 한테 맞추기
	}

}
