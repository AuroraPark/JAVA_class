package day09;

public class MyVector {
//	1. Object배열 objArr을 인스턴스 변수로 갖는 MyVector클래스를 선언하시오.
	Object[] objArr; // Object배열
	int size; // 배열에 저장된 객체의 개수
	int capacity; // 배열의 크기

//	2. MyVector클래스에 생성자 MyVector(int capacity)와 
//	기본생성자(capacity=16)를 추가하시오.
	MyVector(int capacity) {
		this.capacity = capacity;
		objArr = new Object[capacity]; // objArr의 크기를 초기화한다.
	}

	MyVector() {
		this(16); // 기본생성자 capacity=16
	}

//	3. MyVector클래스에 
//	객체 배열에 저장된 객체의 개수를 저장하기위한 인스턴스 변수 size를 추가하고, 
//	이 변수의 값을 반환하는 size()와 배열objArr의 길이를 반환하는 capacity(), 
//	객체 배열이 비어있는지 확인하는 boolean isEmpty()를 작성하시오.

	int size() { // size의 값을 반환하는 size()
		return size;
	}

	int capacity() { // 배열objArr의 길이를 반환하는 capacity(),
		return objArr.length;
	}

	boolean isEmpty() { // 객체 배열이 비어있는지 확인
		// 객체 배열이 비어있다는 것은?
		// 1. null 이라면 비어있다.

//		int cnt = 0;	// 배열 원소 개수 담을 변수
//
//		for (int i = 0; i < objArr.length; i++) {
//			if (!(objArr[i] == null))
//				cnt++;
//			else
//				continue;
//		}
//
//		return (cnt == 0) ? true : false;
		// null 이라는 값은 어떻게?
		// 2. size가 0일때 비어있다
		return (size == 0) ? true : false;
	}

//	4. MyVector클래스의 
//	객체 배열 objArr에 객체를 추가하는 메서드 void add(Object obj)를 작성하시오.

	void add(Object obj) {
		if (size >= capacity) { // capacity크기보다 추가하면?
			// 배열 복사!!!!!!!!

			// 1.배열 크기를 2배로 만든다. - 반복시 엄청 크게 만들어진다!
			// 2. size 크기를 2배로 만든다.
			Object[] tmp = new Object[size * 2];

			// 배열을 복사한다.
			for (int i = 0; i < objArr.length; i++) {
				tmp[i] = objArr[i];
			}
			// tmp를 objArr에 저장
			objArr = tmp;
		}

		// 길이 변경 후
		objArr[size] = obj; // 마지막 줄에 obj를 추가한다.
		size++; // 사이즈 하나 증가
	}

//	5. MyVector클래스의 객체 배열 objArr에 
//	저장된 객체를 반환하는 Object get(index)를 작성하시오.
	Object get(int index) {
		// size보다 큰 index를 요청하면?
		// 예외던지기! ArrayIndexOutOfBoundsException
//		if (size < index && index > size) {
//			try {
//				throw new ArrayIndexOutOfBoundsException();
//			} catch (ArrayIndexOutOfBoundsException ae) {
//				return ae.printStackTrace();
//			}
//		}
		// 음수를 입력하면 어떻게 해야하지?
		// 인덱스에 위치한 배열의 값을 리턴
		// 넣을 때 값이랑 뺄때 값이 같은지도 확인

		return objArr[index];

	}

//	6. MyVector 클래스의 객체 배열 objArr에 저장된 모든 객체를 
//	문자열로 이어서 반환하도록 toString()을 오버라이딩 하시오.
	public String toString() {
		String str = ""; // 문자열 초기화

		// 객체 배열을 size만큼 출력한다!
		for (int i = 0; i < size; i++) {
			str += (i == 0) ? "" + objArr[i] : ", " + objArr[i];
		}
		return "[" + str + "]";
	}

//	7. MyVector클래스의 객체 배열 objArr에서 
//	지정된 객체가 저장되어 있는 위치(index)를 반환하는 
//	int indexOf(Object obj)를 작성하시오.
	int indexOf(Object obj) {
		// 지정 객체가 존재하지 않으면?
		// -1을 출력

		int index = 0; // 반환할 위치

		for (int i = 0; i < size; i++) {
			// null 인 경우는 NullPointerException가 날 수 있으므로
			// 미리 걸러준다
			if (obj == null) {
				return index;
			} else if (obj.equals(objArr[i]))
				return index;
			index++;
		}

		return -1;
		// 같은 값이 두개면 어떻게 처리하지? - 1번으로 처리
		// 1. 가장 처음에 발견된 객체 반환
		// 2. 둘다 반환
		// 3. 가장 마지막에 발견된 객체 반환

	}

//	8. MyVector 클래스의 객체 배열 objArr에서 
//	지정된 객체를 삭제하는 boolean remove(Object obj)를 작성하시오.
//	(indexOf()를 이용할것.)
//	왜 boolean 값을 리턴값으로갖지,,,?
//			object를 리턴하는걸로 일단 해보자
	Object remove(Object obj) {
		int index = indexOf(obj);
		// 만약에 동일한 객체가 2개있으면 어떻게 하지? - 1번으로 처리
		// 1. 가장 처음에 발견된 객체 삭제
		// 2. 둘다 삭제
		// 3. 가장 마지막에 발견된 객체 삭제

		// 만약 마지막데이터가 아닌 경우
		if (!(index == size)) {
			// 임시 배열 생성
			Object[] tmp = new Object[objArr.length];
			// 삭제할 데이터 아래의 데이터를 한칸씩 위로 복사
			// System.arraycopy(objArr,index+1, objArr, index, size-index-1)
			for (int i = 0; i < index; i++) {
				tmp[i] = objArr[i];
			}
			for (int i = index; i < size; i++) {
				tmp[i] = objArr[i + 1];
			}
			// tmp를 objArr에 저장
			objArr = tmp;
		}
		objArr[size - 1] = null;
		size--;

		return objArr.toString();
	}
}
