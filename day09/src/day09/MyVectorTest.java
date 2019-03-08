// 내코드
//
package day09;

import static org.junit.Assert.assertTrue;

import java.util.Vector;

import org.junit.Test;
//
//import static org.junit.Assert.assertTrue;
//
//import java.util.Vector;
//
//import org.junit.Test;
//
//public class MyVectorTest {
//	@Test
//	public void isEmptyTest() {
////		Vector v = new Vector(); // Vector의 기능을 확인하고, MyVector도 같은 결과를 얻는지 비교한다.
//		MyVector v = new MyVector();
//		assertTrue(v.isEmpty() == true);
//
//		v.add("1");
//		assertTrue(v.isEmpty() == false);
//
//	}
//
//	@Test
//	public void sizeTest() {
//		MyVector v = new MyVector();
//		assertTrue(v.size() == 0);
//
//		v.add("1");
//		assertTrue(v.size() == 1);
//
//	}
//
////
////=====add() test=====
//	@Test(expected = IllegalArgumentException.class)
//	public void addTest() {
//		MyVector v = new MyVector();
//		// 넣지 않았을 때 비어있는지
//		assertTrue(v.isEmpty() == true);
//		// 사이즈가 0인지
//		assertTrue(v.size() == 0);
//		// 1. size 내 add
//		v.add("1");
//		assertTrue(v.isEmpty() == false);
//		// 사이즈가 늘어나는지
//		assertTrue(v.size() == 1);
//
//
//		// 2. size 외 add
//		for (int i = 2; i < 100; i++) {
//			v.add(i);
//		}
//		assertTrue(v.isEmpty() == false);
//		// 7. add 후 size가 늘어나는지, index 값이 늘어나는지
//		assertTrue(v.size() == 99);
//
//		// 3. capacity 보다 add
//		for (int i = 2; i < 100; i++) {
//			v.add(i);
//		}
//		assertTrue(v.isEmpty() == false);
//
//		// 4. 문자열 추가
//		v.add("abc");
//		// 5. 공백 추가
//		v.add(" ");
//		// 6. null 추가
//		v.add(null);
//
//		// 8. add를 넣을 때 넣은 값과 index의 값이 같은지
//
//		v.add(null);
//		try {
//			assertTrue(v.get(0) == null);
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		assertTrue(v.indexOf(null) == 0);
//
////		assertTrue(v.size==0);
////		
////		v.add("1");
////		assertTrue(v.size()==1);
////		v.add("1");
////		assertTrue(v.size()==2);
////		
////		// 지정한 값이 잘 저장되었는지 확인
////		assertTrue("1".equals(v.get(0)));
////		
////		Vector v2 = new Vector();
////		for(int i=0; i< 1000000; i++) {
////			v.add(i+"");
////		}
////		assertTrue(v2.size(1000000));
////		
////		Vector v1 = new Vector();
////		assertTrue(v2.size(1000000));
////	
//	}
//
////=====get() test=====
//	@Test
//	public void getTest() {
//		MyVector v = new MyVector();
//		// 넣지 않았을 때 비어있는지
//		assertTrue(v.isEmpty() == true);
////1. size 내 index 검색
////2. size보다 큰 index 검색
////3. 음수 검색
////4. add의 값과 get의 값이 같은지 검색
//	}
//
////=====toString() test=====
//	@Test
//	public void toStringTest() {
//		MyVector v = new MyVector();
//		// 넣지 않았을 때 비어있는지
//		assertTrue(v.isEmpty() == true);
////1. 객체 0개 출력
////2. 객체 1개 출력
////3. 공백 출력
////4. null 출력
////5. 객체 여러개 출력
////6. 객체 삭제 후 출력
//	}
//
////=====indexOf() test=====
//	@Test
//	public void indexOfTest() {
//		MyVector v = new MyVector();
//		// 넣지 않았을 때 비어있는지
//		assertTrue(v.isEmpty() == true);
////1. 지정 객체가 존재하지 않는 경우
////2. 첫번째 데이터 검색
////3. 마지막 데이터 검색
////4. 중복 데이터 검색
////5. null검색
////6. 기본형 검색
////7. 참조형 검색
//	}
//
////=====remove() test=====
//	@Test
//	public void removeTest() {
//		MyVector v = new MyVector();
//		// 넣지 않았을 때 비어있는지
//		assertTrue(v.isEmpty() == true);
////1. 마지막 데이터 삭제
////2. 첫번째 데이터 삭제
////3. 중간 데이터 삭제
////4. 연속데이터 삭제
////5. 데이터 두번 삭제
//	}
//}

public class MyVectorTest {
//	Vector v;
//
//	// 돌아가기 전에 수행할 문장
//	@Before
//	void setup() {
//		System.out.println("before");
//		v = new Vector();
//	}
//
//	// 테스트가 끝난 후에 수행될 작업을 넣는다.
//	@After
//	void cleanUp() {
//		System.out.println("After");
//	}

	// =====capacity() test=====

	@Test(expected = IllegalArgumentException.class)
//	@Test
	public void capacityTest() {
		// 1 용량
		Vector v5 = new Vector(1);
//		MyVector v5 = new MyVector(1);
		assertTrue(v5.capacity() == 1);

		// 2 용량 크게
//		Vector v = new Vector(100);
		MyVector v = new MyVector(100);
		assertTrue(v.capacity() == 100);

		// 3 기본 용량
//		Vector v2 = new Vector();
		MyVector v2 = new MyVector();
		assertTrue(v2.capacity() == 16);

		// 4 음수값 - 예외발생
		Vector v3 = new Vector(-1);
//		MyVector v3 = new MyVector(-1);
		assertTrue(v3.capacity() == 16);

		// 5 0
//		Vector v4 = new Vector(0);
		MyVector v4 = new MyVector(0);
		assertTrue(v4.capacity() == 0);
	}

	// =====size() test=====
	@Test
	public void sizeTest() {
		// 1 배열 처음만들어졌을 때 0인지
//		Vector v = new Vector();
		MyVector v = new MyVector();
		assertTrue(v.size() == 0);
		System.out.println("sizeTest()");

		// 2 추가후 size 증가
		v.add("1");
		assertTrue(v.size() == 1);
		v.add("2");
		assertTrue(v.size() == 2);

		// 3 삭제후 size 감소
		v.remove(1);
		assertTrue(v.size() == 1);

		// 4 추가 삭제 후 size 동일
		v.add(2);
		v.remove(1);
		assertTrue(v.size() == 1);

		// 5 전부 삭제 후 size 0
		v.remove(0);
		assertTrue(v.size() == 0);
		assertTrue(v.isEmpty());
	}

	// =====add() test=====
	@Test
	public void addTest() throws IllegalAccessException {
		// 1 null 저장
//		Vector v = new Vector();
		MyVector v = new MyVector();
		v.add(null);
		assertTrue(v.get(0) == null);
		assertTrue(v.indexOf(null) == 0);

		// 5 여러가지 문자열
		v.add("abc");
		v.add(" ");
		v.add("-1");

		assertTrue("abc".equals(v.get(1)));
		assertTrue(" ".equals(v.get(2)));
		assertTrue("-1".equals(v.get(3)));

		// 2 저장 후 size 증가
//		Vector v2 = new Vector();
		MyVector v2 = new MyVector();
		assertTrue(v2.size() == 0);
		assertTrue(v2.isEmpty() == true);

		v2.add("1");
		assertTrue(v2.size() == 1);
		v2.add("1");
		assertTrue(v2.size() == 2);

		// 3 지정한 값이 잘 저장되었는지 확인
		assertTrue("1".equals(v2.get(0)));
		assertTrue(v2.indexOf("1") == 0);

		// 4 큰 값 넣어보기
//		Vector v3 = new Vector();
		MyVector v3 = new MyVector();
		for (int i = 0; i < 1000000; i++) {
			v3.add(i + "");
		}
		assertTrue(v3.size() == 1000000);
	}

	// =====get() test=====
	@Test(expected = ArrayIndexOutOfBoundsException.class)
//	@Test
	public void getTest() {
//		Vector v = new Vector();
		MyVector v = new MyVector();
		// 넣지 않았을 때 비어있는지
		assertTrue(v.isEmpty() == true);

		for (int i = 0; i < 100; i++) {
			v.add(i + "");
		}
		assertTrue(v.size() == 100);
		// isEmpty 검사
		assertTrue(v.isEmpty() == false);

		// 1. size 내 index 검색
		assertTrue("0".equals(v.get(0)));
		assertTrue("1".equals(v.get(1)));
		assertTrue("99".equals(v.get(99)));

		// 2. size보다 큰 index 검색 - 오류 발생
		assertTrue("100".equals(v.get(100)));

		// 3. 음수 검색 - 오류 발생
		assertTrue("-1".equals(v.get(-1)));

		// 4. add의 값과 get의 값이 같은지 검색
		assertTrue(v.get(1).equals(v.get(v.indexOf("1"))));

	}

	// =====toString() test=====
	@Test
	public void toStringTest() {
//		Vector v = new Vector();
		MyVector v = new MyVector();
		// 넣지 않았을 때 비어있는지
		assertTrue(v.isEmpty() == true);

		// 1. 객체 0개 출력
		assertTrue("[]".equals(v.toString()));

		// 2. 객체 1개 출력
		v.add(1);
		assertTrue("[1]".equals(v.toString()));

		// 3. 공백 출력
		v.add(" ");
		assertTrue("[1,  ]".equals(v.toString()));

		// 4. null 출력
		v.add(null);
		assertTrue("[1,  , null]".equals(v.toString()));

		// 5. 객체 여러개 출력
//		Vector v2 = new Vector();
		MyVector v2 = new MyVector();
		for (int i = 0; i < 10; i++) {
			v2.add(i + "");
		}

		assertTrue("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]".equals(v2.toString()));

		// 6. 마지막 객체 삭제 후 출력
		v2.remove(9);
		assertTrue("[0, 1, 2, 3, 4, 5, 6, 7, 8]".equals(v2.toString()));

		// 7. 중간 객체 삭제 후 출력
		v2.remove(5);
		assertTrue("[0, 1, 2, 3, 4, 6, 7, 8]".equals(v2.toString()));

		// 8. 처음 객체 삭제 후 출력
		v2.remove(0);
		assertTrue("[1, 2, 3, 4, 6, 7, 8]".equals(v2.toString()));
	}

	// =====indexOf() test=====
	@Test
	public void indexOfTest() {
//		Vector v = new Vector();
		MyVector v = new MyVector();
		// 넣지 않았을 때 비어있는지
		assertTrue(v.isEmpty() == true);

		for (int i = 0; i < 100; i++) {
			v.add(i + "");
		}

		// 1. 지정 객체가 존재하지 않는 경우
		assertTrue(v.indexOf(101) == -1);

		// 2. 첫번째 데이터 검색
		assertTrue(v.indexOf("1") == 1);
		// 3. 마지막 데이터 검색
		assertTrue(v.indexOf("99") == 99);
		// 4. 중복 데이터 검색 - 가장 처음 데이터
		v.add("1");
		assertTrue(v.indexOf("1") == 1);
		assertTrue("1".equals(v.get(100)));

		// 5. null검색
		v.add(null);
		assertTrue(v.indexOf(null) == 101);
		// 6. 기본형 검색
		v.add(1);
		assertTrue(v.indexOf(1) == 102);
	}

	// =====remove() test=====
	@Test
	public void removeTest() {
//			Vector v = new Vector();
		MyVector v = new MyVector();
		for (int i = 0; i < 10; i++) {
			v.add(i + "");
		}

		assertTrue("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]".equals(v.toString()));
		assertTrue(v.size() == 10);

		// 1. 마지막 데이터 삭제
		v.remove(9);
		assertTrue("[0, 1, 2, 3, 4, 5, 6, 7, 8]".equals(v.toString()));
		assertTrue(v.size() == 9);

		// 2. 중간 데이터 삭제
		v.remove(5);
		assertTrue("[0, 1, 2, 3, 4, 6, 7, 8]".equals(v.toString()));
		assertTrue(v.size() == 8);

		// 3. 첫번째 데이터 삭제
		v.remove(0);
		assertTrue("[1, 2, 3, 4, 6, 7, 8]".equals(v.toString()));
		assertTrue(v.size() == 7);

	}

} // public class MyVectorTest {
