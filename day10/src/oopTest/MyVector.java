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
	MyVector(int capacity) {
		objArr = new Object[capacity];
	}

	MyVector() {
		this(16);
	}

	int size() {
		return size;
	}

	// 용량(capacity)은 배열objArr의 길이 - objArr.length
	int capacity() {
		return objArr.length;
	}

	// 배열(objArr)이 비어있는지 확인한다. 비어있으면 true, 아니면 false
	// 비어있다는게 뭐지? 배열이 없는거? size가 0dlsrj
	boolean isEmpty() {
//		if(size==0)
//			return true;
//		else
//			return false;
		return size == 0;
	}

	// 지정된 객체(obj)를 객체 배열(objArr)에서 찾아서 삭제
	//
	boolean remove(Object obj) {
		int idx = indexOf(obj);

		// 못찾으면 false를 반환
		if (idx == -1)
			return false;
//		코드 줄이기
		// 1. idx이후의 요소들을 한칸 씩 위로 복사한다.
//		System.arraycopy(objArr, srcPos, dest, destPos, length);
		System.arraycopy(objArr, idx + 1, objArr, idx, size - idx - 1);
		// 2. 마지막 요소의 값을 null로 바꾼다. 3. size--;
		objArr[size--] = null;

		return true;
	}

	// obj를 objArr에서 찾아서 위치(index)를 반환
	int indexOf(Object obj) {
		for (int i = 0; i < size; i++) {
			// obj가 null 이면?
			// !!!!!!!!!!!!!!!!!!!!코드 줄여보기!!!!!!!!!!!!!!!!!!!!!!!
			if (obj == null && objArr[i] == null) {
				return i;
			}

			if (obj != null && obj.equals(objArr[i]))
				return i;
		}
		return -1;
	}

	// objArr에 저장된 모든 객체에 toString()을 호출
	public String toString() {
		String tmp = "[";
		for (int i = 0; i < size; i++) {
			tmp += objArr[i] + ",";
		}

		return tmp + "]";
	}

	// obj에 저장된 객체를 반환 어디에? index
	Object get(int index) throws IllegalAccessException {
		// 유효성검사
		// 0<=index<size
		if (!(0 <= index && index < size)) {
			throw new IllegalAccessException("index의 범위가 유효하지 않습니다." + index);
		}
		return objArr[index]; 
	}

	// 객체 obj를 배열(objArr)에 저장. 어디에? 제일 마지막 다음 (size)
	void add(Object obj) {
		// 저장할 공간이 있는지 확인
		// 있으면 그냥 저장
		// 없으면 공간을 늘려줘야한다.
		if (true) {// 공간이 부족하면, 공간이 부족한건 어떻게 확인?
			// 1. 공간을 늘려준다.
			// 1-1 새로운 배열을 만든다.
			Object[] tmpArr = new Object[capacity() * 2];
			// 1-2 기존내용(objArr)를 새로운 배열(tmpArr)에 복사한다.
			System.arraycopy(objArr, 0, tmpArr, 0, size);
			// 2. 저장한다.
			objArr = tmpArr;
		}
		// 배열에 obj를 저장 size의 값을 증가
		objArr[size++] = obj;

	}

}
