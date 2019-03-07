package day09;

import static org.junit.Assert.assertTrue;

import java.util.Vector;

import org.junit.Test;

public class MyVectorTest2 {

	public static void main(String[] args) {
		Vector v = new Vector(); // 벡터 객체 생성
 Vector v2 = new Vector(3);
//		MyVector v = new MyVector(); // MyVector 객체 생성
	//	MyVector v2 = new MyVector(3); // MyVector 객체 생성

		System.out.println("=====객체 생성=====");
		// 넣지 않았을 때 비어있는지
		System.out.printf("v > size: %d, capacity: %d, isEmpty: %s%n", v.size(), v.capacity(), v.isEmpty());
		System.out.printf("v2 > size: %d, capacity: %d, isEmpty: %s%n", v2.size(), v2.capacity(), v2.isEmpty());

		System.out.println("=====add() test=====");

		
		
		
		v.add("1");
		assertTrue(v.isEmpty() == false);
		// 사이즈가 늘어나는지
		assertTrue(v.size() == 1);
		// 기본 생성자로 생성된 capacity가 16인지
//		assertTrue(v.capacity == 16);
		
		// 2. size 외 add
		for (int i = 2; i < 100; i++) {
			v.add(i);
		}
		assertTrue(v.isEmpty() == false);
		// 7. add 후 size가 늘어나는지, index 값이 늘어나는지
		assertTrue(v.size() == 99);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// add test
		// 1. size 내 add
		v.add(null); // 6. null 추가
		v.add(" "); // 5. 공백 추가
		v.add("abc"); // 4. 문자열 추가
		v.add(false);// boolean값 추가
		v.add(-1); // 음수추가

		// 2. size 외 add
		// 3. capacity 보다 add
		for (int i = 2; i < 100; i++) {
			v.add(i);
		}
		// 7. add 후 size가 늘어나는지, index 값이 늘어나는지
		System.out.printf("v > size: %d, capacity: %d, isEmpty: %s%n", v.size(), v.capacity(), v.isEmpty()); // 테스트
		System.out.printf("v2 > size: %d, capacity: %d, isEmpty: %s%n", v2.size(), v2.capacity(), v2.isEmpty());
		// 8. add를 넣을 때 넣은 값과 index의 값이 같은지

		System.out.println("=====get() test=====");
		// 1. size 내 index 검색
		System.out.printf("v.get(0): %s%n", v.get(0)); // null 객체
		System.out.printf("v.get(1): %s%n", v.get(1));
		System.out.printf("v.get(2): %s%n", v.get(2));
		System.out.printf("v.get(3): %s%n", v.get(3));
		// 2. size보다 큰 index 검색
//		System.out.printf("v.get(99): %s%n" , v.get(200));	// 빈 객체
		// 3. 음수 검색
//		System.out.printf("v.get(3): %s%n", v.get(-1));
		System.out.printf("v > size: %d, capacity: %d, isEmpty: %s%n", v.size(), v.capacity(), v.isEmpty());
		System.out.printf("v2 > size: %d, capacity: %d, isEmpty: %s%n", v2.size(), v2.capacity(), v2.isEmpty());
		// 4. add의 값과 get의 값이 같은지 검색
		System.out.println(v.indexOf(0));
		System.out.println(v.get(0));
		System.out.println("=====toString() test=====");
		System.out.println(v.toString());

		System.out.println("=====indexOf() test=====");
		System.out.println("1(없는값)의 위치: " + v.indexOf(1)); // 없는 값 찾아보기 "-1" 나옴
		System.out.println("null의 위치: " + v.indexOf(null));
		System.out.println("공백(\" \")의 위치: " + v.indexOf(" "));
		System.out.println("2의 위치: " + v.indexOf(2));

		v2.add(0);
		v2.add(1);
		v2.add(2);
		v2.add(3);
		v2.add(4);
		v2.add(5);

		System.out.printf("v2 > size: %d, capacity: %d, isEmpty: %s%n", v2.size(), v2.capacity(), v2.isEmpty());
		System.out.println(v2.toString());
		System.out.println(v2.indexOf(2));

		System.out.println("=====remove() test=====");

		v2.remove(2);
		System.out.printf("v2 > size: %d, capacity: %d, isEmpty: %s%n", v2.size(), v2.capacity(), v2.isEmpty());
		// 지우고 검색해보기
		System.out.println(v2.indexOf(2));
		System.out.println(v2.toString());
		// 연속 삭제
		v2.remove(3);
		v2.remove(4);
		// 사이즈가 줄어드는지
		System.out.printf("v2 > size: %d, capacity: %d, isEmpty: %s%n", v2.size(), v2.capacity(), v2.isEmpty());
		System.out.println(v2.toString());


	
	
	
	}

	// =====get() test=====

	// =====toString() test=====
	// 1. 객체 0개 출력
	// 2. 객체 1개 출력
	// 3. 공백 출력
	// 4. null 출력
	// 5. 객체 여러개 출력
	// 6. 객체 삭제 후 출력

	// =====indexOf() test=====
	// 1. 지정 객체가 존재하지 않는 경우
	// 2. 첫번째 데이터 검색
	// 3. 마지막 데이터 검색
	// 4. 중복 데이터 검색
	// 5. null검색
	// 6. 기본형 검색
	// 7. 참조형 검색

	// =====remove() test=====

	// 1. 마지막 데이터 삭제
	// 2. 첫번째 데이터 삭제
	// 3. 중간 데이터 삭제
	// 4. 연속데이터 삭제
	// 5. 데이터 두번 삭제

}
