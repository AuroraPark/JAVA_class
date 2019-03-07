package day09;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyVectorTest {
	@Test
	public void isEmptyTest() {
		MyVector v = new MyVector();
		assertTrue(v.isEmpty() == true);

		v.add("1");
		assertTrue(v.isEmpty() == false);

	}

	@Test
	public void sizeTest() {
		MyVector v = new MyVector();
		assertTrue(v.size() == 0);

		v.add("1");
		assertTrue(v.size() == 1);

	}

//
//=====add() test=====
	@Test
	public void addTest() {
		MyVector v = new MyVector();
		// 넣지 않았을 때 비어있는지
		assertTrue(v.isEmpty() == true);
		// 사이즈가 0인지
		assertTrue(v.size() == 0);
		// 1. size 내 add
		v.add("1");
		assertTrue(v.isEmpty() == false);
		// 사이즈가 늘어나는지
		assertTrue(v.size() == 1);
		// 기본 생성자로 생성된 capacity가 16인지
		assertTrue(v.capacity == 16);
		
		// 2. size 외 add
		for (int i = 2; i < 100; i++) {
			v.add(i);
		}
		assertTrue(v.isEmpty() == false);
		// 7. add 후 size가 늘어나는지, index 값이 늘어나는지
		assertTrue(v.size() == 99);
		assertTrue(v.capacity() == 16 );

		// 3. capacity 보다 add
		for (int i = 2; i < 100; i++) {
			v.add(i);
		}
		assertTrue(v.isEmpty() == false);

		// 4. 문자열 추가
		v.add("abc");
		// 5. 공백 추가
		v.add(" ");
		// 6. null 추가
		v.add(null);

		// 8. add를 넣을 때 넣은 값과 index의 값이 같은지

	}

//=====get() test=====
	@Test
	public void getTest() {
		MyVector v = new MyVector();
		// 넣지 않았을 때 비어있는지
		assertTrue(v.isEmpty() == true);
//1. size 내 index 검색
//2. size보다 큰 index 검색
//3. 음수 검색
//4. add의 값과 get의 값이 같은지 검색
	}

//=====toString() test=====
	@Test
	public void toStringTest() {
		MyVector v = new MyVector();
		// 넣지 않았을 때 비어있는지
		assertTrue(v.isEmpty() == true);
//1. 객체 0개 출력
//2. 객체 1개 출력
//3. 공백 출력
//4. null 출력
//5. 객체 여러개 출력
//6. 객체 삭제 후 출력
	}

//=====indexOf() test=====
	@Test
	public void indexOfTest() {
		MyVector v = new MyVector();
		// 넣지 않았을 때 비어있는지
		assertTrue(v.isEmpty() == true);
//1. 지정 객체가 존재하지 않는 경우
//2. 첫번째 데이터 검색
//3. 마지막 데이터 검색
//4. 중복 데이터 검색
//5. null검색
//6. 기본형 검색
//7. 참조형 검색
	}

//=====remove() test=====
	@Test
	public void removeTest() {
		MyVector v = new MyVector();
		// 넣지 않았을 때 비어있는지
		assertTrue(v.isEmpty() == true);
//1. 마지막 데이터 삭제
//2. 첫번째 데이터 삭제
//3. 중간 데이터 삭제
//4. 연속데이터 삭제
//5. 데이터 두번 삭제
	}
}
