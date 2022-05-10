package com.test.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import com.test.data.Data;
import com.test.data.User;

public class Ex76_Stream {

	public static void main(String[] args) {
		
		/*
			스트림, Stream
			- 데이터 소스로부터 탐색/조작 가능한 도구
			- list.stream().forEach()
			
			파이프, pipe
			- 스트림 객체 메소드
			1. 중간 파이프
				- 반환값 > 스트림
				
			2. 최종 파이프
				- 반환값 > 스트림X > void, 다른 자료형
				
			
			필터링
			- filter()
			- 앞의 스트림에서 조건에 맞는 요소만 남기고 맞지 않는 요소는 버린다. > 조건에 맞는 요소만 반환한다. 
			
			처리
			- forEach()
			- 최종처리 파이프
			- 앞의 스트림의 요소를 최종 처리하는 메소드
		*/
		
//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
//		m6();
//		m7();
//		m8();
//		m9();
		m10();
	}

	private static void m10() {
		
		List<Integer> list = Data.getIntList(10);
		
		list.stream()
					.filter(n -> n >= 50)
					.peek(n -> System.out.println("@" + n))
					.filter(n -> n % 2 == 1)
					.peek(n -> System.out.println("#" + n))
					.forEach(n -> System.out.println(n));
		
	}

	private static void m9() {
		
		List<Integer> list = Data.getIntList();
		
		//총합			  Stream<Integer>  IntStream 
		System.out.println(list.stream().mapToInt(n -> n).sum());
		
		//평균
		System.out.println(Data.getUserList().stream()
				.filter(u -> u.getGender() == 1)
				.mapToInt(u -> u.getHeight())
				.average().getAsDouble());
		
		//유저의 키 평균값 구하기
		System.out.println(Data.getUserList().stream().mapToInt(u -> u.getHeight()).average().getAsDouble());
	}

	private static void m8() {
		
		List<Integer> list = Data.getIntList();
		
		//최댓값? 최솟값?
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		
		System.out.println(list.stream().max((a, b) -> a - b)); //Optional[99]
		System.out.println(list.stream().min((a, b) -> a - b)); //Optional[0]
		
		Optional<Integer> result = list.stream().max((a, b) -> a - b);
		System.out.println("최댓값 : " + result.get());
		//지역 변수
		//- 값형 + 참조형 > 초기화를 하지 않으면 사용 불가능!
		
		//멤버 변수
		//- 생성자가 무조건 초기화를 해버린다.
		//- 값형 > 0, 0.0, false...
		//- 참조형 > null
		
		//값형 : null을 가질 수가 없다.
		//참조형 : null을 가질 수 있다.
		
//		Test t = new Test();
//		System.out.println(t.a); //0
//		System.out.println(t.b); //false
//		System.out.println(t.c); //null
//		System.out.println(t.d); //null
		
//		User temp = getUser();
		
		//Optional<T> : 값형이 null을 가질 수 없는 특성을 보완하기 위해 만들어진 자료형
		
		
		Optional<User> maxUser = Data.getUserList().stream().max((u1, u2) -> u1.getAge() - u2.getAge());
		
		System.out.println(maxUser.get());
		
	}
	
//	private static int getNum() {
//		
//		boolean condition = true;
//		
//		if(condition) {
//			return 100;
//		} 
//		
//		return 
//	}
	
	private static User getUser() {
		
		boolean condition = true;
		
		if(condition) {
			return new User();
		}
		
		return null;
	}

	private static void m7() {
		
		//집계, Reduce
		//- count(), max(), min(), sum(), avg()
		//- 최종처리 파이프
		//- 요소들을 가공해서 축소하는 작업, 통계값
		
		System.out.println(Data.getIntList().stream().count());
		
		//stream has already been operated upon or closed
		
		List<User> list = Data.getUserList();
		System.out.println("총인원수 : " + list.stream().count());		
		System.out.println("남자수 : " + list.stream().filter(u -> u.getGender() == 1).count());
		System.out.println("여자수 : " + list.stream().filter(u -> u.getGender() == 2).count());
		
		System.out.println(Data.getIntList().stream().distinct().count());
		
	}

	private static void m6() {
		
		//매칭
		//- alMatch(), anyMatch(), noneMatch()
		//- 최종처리 파이프
		//- 스트림 요소들이 제시하는 조건을 만족하는지 판단
		//	a. boolean allMatch(Predicate) : 모든 요소가 조건을 100% 만족?
		//	b. boolean anyMatch(Predicate) : 일부 요소가 조건을 만족하는지
		//	c. boolean noneMatch(Predicate) : 모든 요소가 조건을 0% 만족(불만족)
		
		int[] nums = {2, 4, 6, 8, 10};
		
		//요구사항 : 배열안에 짝수만 들어있는지?
		boolean result = false;
		
		for(int n: nums) {
			if(n % 2 == 1) {
				result = true;
				break;
			}
		}
		
		if(result) {
			System.out.println("홀수 발견!");
		} else {
			System.out.println("짝수만 들어있음");
		}

		//allMatch() > && 연산자 성질
		//1. nums안에 각 요소를 Predicate에 넣어서 검사해라!!
		//2. 모든 요소가 true를 반환 > 자신도 true
		//3. 일부 요소가 false를 반환 > 자신은 false
		
		System.out.println(Arrays.stream(nums).allMatch(n -> n % 2== 0));
		System.out.println(Arrays.stream(nums).noneMatch(n -> n % 2== 0));

		//anyMatch() > || 연산자 성질
		//1. nums안에 각 요소를 Predicate에 넣어서 검사해라!!
		//2. 일부 요소가 true를 반환 > 자신도 true
		//3. 모든 요소가 false를 반환 > 자신은 false		
		System.out.println(Arrays.stream(nums).anyMatch(n -> n % 2 == 0));
		
		//여자 > 이상형 > User + 175cm 이상+ 65kg 이상 > anyMatch
		
		result = Data.getUserList().stream()
											.filter(u -> u.getGender() == 1)
											.anyMatch(u -> u.getHeight() >= 175 && u.getWeight() >= 65);
		
		if(result) {
			System.out.println("이상형이 있습니다.");
			
			Data.getUserList().stream()
								.filter(u -> u.getGender() == 1)
								.filter(u -> u.getHeight() >= 175)
								.filter(u -> u.getWeight() >= 65)
								.forEach(u -> System.out.println(u));
		} else {
			System.out.println("다음 기회에");
		}
		
		
	}

	private static void m5() {
		
		Data.getUserList().stream()
				.filter(user -> user.getGender() == 1)
				.map(user -> user.getWeight())
				.distinct()
				.forEach(weight -> System.out.println(weight));
		System.out.println();
		
		//정렬
		//- sorted()
		//- 중간처리 파이프
		//- 배열, 컬렉션의 sort()와 사용법이 동일
		//	a. 단일값 오름차순 > sort()
		//	b. 단일값 내림차순 > sort(구현)
		//	c. 복합값 오름차순, 내림차순 > sort(구현)
		
		List<Integer> nums = Data.getIntList(10);
		System.out.println(nums);
		
		nums.sort((a, b) -> a - b);
		nums.sort(Comparator.naturalOrder());	//오름차순 정렬 객체
		nums.sort(Comparator.reverseOrder());	//내림차순 정렬 객체
		
		System.out.println(nums);
		
		//배열 정렬(x) > 스트림 정렬(o)
		//***** 스트림의 조작은 원본 배열에 영향을 미치지 않는다.
		nums.stream()
				.sorted()
				.forEach(num -> System.out.println(num));
		
		nums.stream()
				.sorted((a, b) -> b - a)
				.forEach(num -> System.out.println(num));
		
		Data.getIntList().stream()
					.distinct()
					.filter(n -> n % 2 == 0)
					.sorted()
					.forEach(n -> System.out.println(n));
		
	}

	private static void m4() {
		
		//매핑
		//- map(), mapXXX()
		//- 중간처리 파이프
		//- 변환 작업에 사용한다. (*****)
		//- map() 					> 앞의 스트림을 처리한 후 다른 타입의 스트림을 반환한다.
		//- distinct(), filter() 	> 앞의 스트림 처리 후 동일한 타입의 스트림을 반환
		
		List<String> list = Data.getStringList(10);
		System.out.println(list);
		
		list.stream()										//Stream<String>
				.filter(word -> word.length() <= 3)			//Stream<String>
				.forEach(word -> System.out.println(word));
		
//		list.stream()									//Stream<String>
//				.map(word -> {							//Stream<Integer>
//					return word.length();
//				}).forEach(num -> System.out.println(num));
//		System.out.println();
		
		list.stream()
				.map(word -> word.length())
				.distinct()
				.filter(length -> length >= 5)
				.forEach(length -> System.out.println(length));
		System.out.println();
		
		String[] names = {"홍길동", "홍재석", "테스트", "아무개", "하하하", "호호호", "후후후", "유재석", "박명수"};
		
		//mapping
		Arrays.stream(names)
					.map(name -> name.substring(1))
					.forEach(name -> System.out.println(name));
		System.out.println();
		
		List<User> ulist = Data.getUserList();
		
		//map() > 의도? >원본 데이터를 다른 형태로 가공!
		ulist.stream()
				.map(user -> user.getName())
				.forEach(user -> System.out.println(user));
		System.out.println();
		
		List<Student> slist = new ArrayList<Student>();
		
		slist.add(new Student("가가가", 100, 90, 80));
		slist.add(new Student("나나나", 95, 70, 85));
		slist.add(new Student("다다다", 80, 80, 75));
		slist.add(new Student("라라라", 90, 75, 60));
		slist.add(new Student("마마마", 75, 100, 95));
		
		slist.stream()
				.map(s -> {
					int total = s.getKor() + s.getEng() + s.getMath();
					if(total >= 180 ) {
						return "합격";
					} else {
						return "불합격";
					}
				}) //Stream<Student> -> Stream<String>
				.forEach(result -> System.out.println(result));
		System.out.println();
		
		
		slist.stream()
				.map(s -> {
					int total = s.getKor() + s.getEng() + s.getMath();
					Result r = null;
					
					if(total >= 180) {
						r = new Result(s.getName(), "합격");
					} else {
						r = new Result(s.getName(), "불합격");
					}
					return r;
				}).forEach(r -> System.out.printf("%s(%s)\n" 
						, r.getName()
						, r.getResult()));
		
		System.out.println();
		
		
	}

	private static void m3() {
		
		//중복 제거
		//- distinct()
		//- 중간 처리 파이프
		//- 앞의 스트림에서 중복 요소를 제거한다. > 유일한 요소만 남아있는 스트림을 반환한다.
		//- Set의 성질과 유사
		
		System.out.println(Data.getIntList().size());
		
		List<Integer> list = Data.getIntList();
		
		//요구사항 : 위의 배열에서 중복값 제거
		//Case 1.
		Set<Integer> set = new HashSet<Integer>();
		
		for(int n : list) {
			set.add(n);
		}
		System.out.println(set.size());
		System.out.println();
		
		//Case 2.
		//- ArrayList -> (변환) -> HastSet
		Set<Integer> set2 = new HashSet<Integer>(list);
		System.out.println(set2.size());
		System.out.println();
		
		//Case 3.
		list.stream()
				.distinct()
				.forEach(n -> System.out.printf("%4d", n));
		System.out.println();
		System.out.println(list.stream().count()); //100
		System.out.println(list.stream().distinct().count()); //61
		System.out.println();
		
		String[] names = {"홍길동", "아무개", "하하하", "홍길동", "호호호", "후후후", "홍길동"};
		Arrays.stream(names).distinct().forEach(name -> System.out.println(name));
		System.out.println();
		
		List<Cup> clist = new ArrayList<Cup>();
		
		clist.add(new Cup(Cup.BLACK, 200));
		clist.add(new Cup(Cup.WHITE, 300));		//1
		clist.add(new Cup(Cup.RED, 400));
		clist.add(new Cup(Cup.YELLOW, 500));
		clist.add(new Cup(Cup.BLUE, 600));		//2
		clist.add(new Cup(Cup.BLACK, 700));
		clist.add(new Cup(Cup.WHITE, 300));		//1
		clist.add(new Cup(Cup.RED, 900));
		clist.add(new Cup(Cup.YELLOW, 1000));
		clist.add(new Cup(Cup.BLUE, 600));		//2
		
		//*** 기본적으로 같은 자료형(클래스)의 객체가 동일한 값(상태)을 가지더라도 다른 객체이다.
		//	  > 두 객체는 독립적으로 존재한다.(메모리 주소가 다르다.) == 쌍둥이
		
		clist.stream().distinct().forEach(cup -> System.out.println(cup));

		//Set, distinct() > 중복 객체를 제거하려면?
		//1. hasCode() 재정의
		//2. equals() 재정의
	}//m3

	private static void m2() {
		
		Data.getStringList().stream()
				.filter(word -> word.length() >= 5)
				.forEach(word -> System.out.println(word));
		System.out.println();
		
		Data.getUserList().stream()
				.filter(user -> user.getWeight() >= 70)
				.filter(user -> user.getGender() == 1)
				.filter(user -> user.getHeight() >= 180)
				.forEach(user -> System.out.println(user));
		System.out.println();
		
	}

	private static void m1() {
		List<Integer> list = Data.getIntList(20);
//		System.out.println(list);
		
		//짝수만 출력
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) % 2 == 0) {				
				System.out.printf("%4d", list.get(i));
			}
		}
		System.out.println();
		
		for (int n : list) {
			if(n % 2 == 0) {
				System.out.printf("%4d", n);				
			}
		}
		System.out.println();
		
		list.stream().forEach(n -> {
			if(n % 2 == 0) {
				System.out.printf("%4d", n);				
			}
		});
		System.out.println();
		
		//1. list.stream() > 20개의 숫자를 탐색
		//2. filter(조건) > 20개의 숫자를 조건 검사 > true 요소들만 가지고 새로운 Stream 생성
		//3. forEach(소비) > 짝수만 들어있는 Stream을 소비
		list.stream().filter(n -> {
			if(n % 2 == 0) {
				return true;
			} else {
				return false;
			}
		}).forEach(n -> System.out.printf("%4d", n));
		System.out.println();
		
		list.stream()
				.filter(n -> n % 2 == 0)
				.forEach(n -> System.out.printf("%4d", n));
		System.out.println();
		
		list.stream()
				.filter(n -> n % 2 == 0 && n >= 50 )
				.forEach(n -> System.out.printf("%4d", n) );
		System.out.println();
		
		list.stream()
				.filter(n -> n % 2 == 0)
				.filter(n -> n >= 50)
				.forEach(n -> System.out.printf("%4d", n));
		System.out.println();
	}
}//Ex76

class Cup {
	
	public static final int BLACK = 1;
	public static final int WHITE = 2;
	public static final int RED = 3;
	public static final int YELLOW = 4;
	public static final int BLUE = 5;
	
	private int color;
	private int size;
	
	public Cup(int color, int size) {
		this.color = color;
		this.size = size;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return String.format("Cup [color=%s, size=%s]", color, size);
	}
	
	//개발자의 의도대로 Cup 객체를 비교
	@Override
	public int hashCode() {
		//비교하려는 객체의 상태(멤버 변수값)를 가지고 해시코드 생성 + 반환
		//문자열로 바꿔서 해시코드 생성 -> 문자열이 같으면 동일한 해시코드로 반환
		return ("" + this.color + this.size).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return this.hashCode() == obj.hashCode();
	}
	
	
}

class Student {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	@Override
	public String toString() {
		return String.format("Student [name=%s, kor=%s, eng=%s, math=%s]", name, kor, eng, math);
	}
	
	
}

//Stream<Student> -> map() -> Stream<Result>
class Result {
	
	private String name;
	private String result;
	
	public Result(String name, String result) {
		super();
		this.name = name;
		this.result = result;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	
}

class Test {
	
	public int a;
	public boolean b;
	
	public String c;
	public User d;
}
