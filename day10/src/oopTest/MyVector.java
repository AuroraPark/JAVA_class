// MyVector 답안

package oopTest;

public class MyVector {
	// 1. Object배열 objArr을 인스턴스 변수로갖는
	Object[] objArr = {};
	int capacity = 0;
	int size = 0;
	// 2. 매개변수를 capacity를 갖는 생성자
	// capacity가 뭐지? 용량? 용량은 배열의 크기다.
	// objArr의 크기 == objArr.length;
	MyVector(int capacity){
		objArr = new Object[capacity];
	}
	
	MyVector() {
		this(16);
	}
	
	int size() {
		return size;
	}
	
	
}
