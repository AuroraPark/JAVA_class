package day09;

import java.util.Vector;

public class MyVectorTest2 {

	public static void main(String[] args) {
		Vector v = new Vector(); // 벡터 객체 생성
		//		Vector v2 = new Vector(3);
//		MyVector v = new MyVector(); // MyVector 객체 생성
		MyVector v2 = new MyVector(3); // MyVector 객체 생성

		System.out.println("=====객체 생성=====");

		System.out.printf("v > size: %d, capacity: %d, isEmpty: %s%n", v.size(), v.capacity(), v.isEmpty());
		System.out.printf("v2 > size: %d, capacity: %d, isEmpty: %s%n", v2.size(), v2.capacity(), v2.isEmpty());

		
		System.out.println("=====add() test=====");

		// add test
		v.add(null);	// null 추가
		v.add(" ");		// " "공백 추가
		
		for (int i = 2; i < 100; i++) {
			v.add(i);
		}

		System.out.printf("v > size: %d, capacity: %d, isEmpty: %s%n", v.size(), v.capacity(), v.isEmpty()); // 테스트
		System.out.printf("v2 > size: %d, capacity: %d, isEmpty: %s%n", v2.size(), v2.capacity(), v2.isEmpty());

		System.out.println("=====get() test=====");

		System.out.printf("v.get(0): %s%n", v.get(0)); // null 객체
		System.out.printf("v.get(1): %s%n", v.get(1));
		System.out.printf("v.get(2): %s%n", v.get(2));
		System.out.printf("v.get(3): %s%n", v.get(3));
//		System.out.printf("v.get(99): %s%n" , v.get(200));	// 빈 객체

		System.out.printf("v > size: %d, capacity: %d, isEmpty: %s%n", v.size(), v.capacity(), v.isEmpty());
		System.out.printf("v2 > size: %d, capacity: %d, isEmpty: %s%n", v2.size(), v2.capacity(), v2.isEmpty());

		System.out.println("=====toString() test=====");
		System.out.println(v.toString());
		
		System.out.println("=====indexOf() test=====");
		System.out.println("1(없는값)의 위치: " +v.indexOf(1));	// 없는 값 찾아보기 "-1" 나옴
		System.out.println("null의 위치: " + v.indexOf(null));
		System.out.println("공백(\" \")의 위치: " +v.indexOf(" "));
		System.out.println("2의 위치: " +v.indexOf(2));
		
		
		v2.add(0);
		v2.add(1);
		v2.add(2);
		v2.add(3);
		v2.add(4);
		v2.add(5);

		System.out.printf("v2 > size: %d, capacity: %d, isEmpty: %s%n", v2.size(), v2.capacity(), v2.isEmpty());
		System.out.println(v2.toString());
		System.out.println(v2.indexOf(2));
		v2.remove(2);
		System.out.printf("v2 > size: %d, capacity: %d, isEmpty: %s%n", v2.size(), v2.capacity(), v2.isEmpty());
		System.out.println(v2.indexOf(2));
		System.out.println(v2.toString());
	}
}
