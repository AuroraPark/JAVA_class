package day04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTest01 {

	// Q. 세개의 정수를 입력받아서 그중에 2번째로 큰 값을 반환하는 메서드
	// int min(int x, int y, inx z)을 작성하시오

	// 작성한 메서드
	int mid(int x, int y, int z) {
		// 완성하시오.
		int[] arr = { x, y, z };
		int result = 0; // 결과 값을 담을 변수

		// 2. 배열을 정렬한다.
		for (int i = 0; i < arr.length-1; i++) {
			boolean changed = false; // 자리바꿈이 발생했는지 체크

			for (int j = 0; j < arr.length-1- i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					changed = true; // 자리바꿈이 발생했으니 changed를 true로
				}
			} // end for j

			if (!changed) break; // 자리바꿈이 없으면 반복문을 벗어난다.
			
		}
		// 3. 2번째 값을 출력한다.
		result = arr[1];
		return result;
	}

//	/*강사님 풀이*/
//	int mid(int x, int y, int z) {
//		if((x<=y&&y<=z)||(z<=y&&y<=x))
//			return y;
//		else if((y<=x&&x<=z) || (z<=x && x<=y))
//			return x;
//		return z;
//	}

	// 테스트한 메서드
	@Test
	void test1() {
		assertTrue(mid(1, 2, 3) == 2);
	}

	@Test
	void test2() {
		assertTrue(mid(1, 3, 2) == 2);
	}

	@Test
	void test3() {
		assertTrue(mid(2, 1, 3) == 2);
	}

	@Test
	void test4() {
		assertTrue(mid(2, 3, 1) == 2);
	}

	@Test
	void test5() {
		assertTrue(mid(3, 1, 2) == 2);
	}

	@Test
	void test6() {
		assertTrue(mid(3, 2, 1) == 2);
	}

	@Test
	void test7() {
		assertTrue(mid(1, 1, 1) == 1);
	}

	@Test
	void test8() {
		assertTrue(mid(2, 1, 2) == 2);
	}

	@Test
	void test9() {
		assertTrue(mid(1, 2, 2) == 2);
	}

	@Test
	void test10() {
		assertTrue(mid(2, 2, 1) == 2);
	}

	void test11() {
		assertTrue(mid(1, 1, 2) == 1);
	}

	void test12() {
		assertTrue(mid(1, 2, 1) == 1);
	}

	void test13() {
		assertTrue(mid(2, 1, 1) == 1);
	}
}
