package day04;

import static org.junit.Assert.*;

import org.junit.Test;

public class baseBallCheck {

	// Q. 세 개의 정수를 입력받아서 그 중에 2째로 큰 값을 반환하는 메서드
	// int mid(int x, int y, int z)를 작성하시오.

	String baseBallCheck(int[] arr1, int[] arr2) {
		int s = 0;
		int b = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) { // i와 j가 같을 때 s, 다를 때 b
					if (i == j)
						s++;
					else
						b++;
				}
			}
		}

		return s + "S" + b + "B";

	}

	@Test
	public void test() {
		assertTrue(mid(1, 2, 3) == 2);
	}

	@Test
	public void test2() {
		assertTrue(mid(1, 1, 1) == 2);
	}

	@Test
	public void test3() {
		assertTrue(mid(1, 3, 2) == 2);
	}

}
