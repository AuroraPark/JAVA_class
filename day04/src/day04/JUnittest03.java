package day04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnittest03 {
	// Q. 2차원 배열을 받아서 빙고 갯수를 세어 반환하는 메서드

//	int bingoCheck(int[][] arr) {
//		// 한행의 1갯수가 5 이면 빙고?
//		int tmp = 0;
//		int tmp2 = 0;
//		int cnt = 0; // 빙고 갯수 저장할 변수
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				tmp = arr[i][j];
//			}
//			if (tmp == 5)
//				cnt++;
//		}
//		if (tmp2 == 5)
//			cnt++;
//		
//		return cnt;
//	}

	/** 강사님코드 */
	int bingoCheck(int[][] arr) {
		int bingoCnt = 0;
		int garoCnt = 0; // 가로
		int seroCnt = 0; // 세로
		int daegakCnt = 0;// 대각선
		int daegakCnt2 = 0; // 대각선 2

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// 가로부터 세어보자
				if (arr[i][j] == 1)
					garoCnt++;
				// 세로를 세어보자
				if (arr[j][i] == 1)
					seroCnt++;
				// 대각선을 세어보자
				if (arr[j][i] == 1 && i == j)
					daegakCnt++;
				// 대각선 2를 세어보자
				if (arr[j][i] == 1 && i == -j)
					daegakCnt++;
			}
			// garoCnt가 5dlaus bingoCnt 1 증가
			if (garoCnt == 5)
				bingoCnt++;
			// garoCnt가 5dlaus bingoCnt 1 증가
			if (seroCnt == 5)
				bingoCnt++;
			if (daegakCnt == 5)
				bingoCnt++;
			if (daegakCnt2 == 5)
				bingoCnt++;
			garoCnt = 0;
			seroCnt = 0;
		}

		return bingoCnt;
// 가로 카운트
//		if(arr[0][0]==1)	garoCnt++;
//		if(arr[0][1]==1)	garoCnt++;
//		if(arr[0][2]==1)	garoCnt++;
//		if(arr[0][3]==1)	garoCnt++;
//		if(arr[0][4]==1)	garoCnt++;
//		
//		if(arr[1][0]==1)	garoCnt++;
//		if(arr[1][1]==1)	garoCnt++;
//		if(arr[1][2]==1)	garoCnt++;
//		if(arr[1][3]==1)	garoCnt++;
//		if(arr[1][4]==1)	garoCnt++;
//		
//		if(arr[2][0]==1)	garoCnt++;
//		if(arr[2][1]==1)	garoCnt++;
//		if(arr[2][2]==1)	garoCnt++;
//		if(arr[2][3]==1)	garoCnt++;
//		if(arr[2][4]==1)	garoCnt++;
//		
//		if(arr[3][0]==1)	garoCnt++;
//		if(arr[3][1]==1)	garoCnt++;
//		if(arr[3][2]==1)	garoCnt++;
//		if(arr[3][3]==1)	garoCnt++;
//		if(arr[3][4]==1)	garoCnt++;
//		
//		if(arr[4][0]==1)	garoCnt++;
//		if(arr[4][1]==1)	garoCnt++;
//		if(arr[4][2]==1)	garoCnt++;
//		if(arr[4][3]==1)	garoCnt++;
//		if(arr[4][4]==1)	garoCnt++;

	}

	@Test
	public void test() {
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 } };
		assertTrue(bingoCheck(arr) == 1);
	}

	@Test
	public void test2() {
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 } };
		assertTrue(bingoCheck(arr) == 2);
	}

	@Test
	public void test3() {
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 } };
		assertTrue(bingoCheck(arr) == 3);
	}

	@Test
	public void test4() {
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0 } };
		assertTrue(bingoCheck(arr) == 4);
	}

	@Test
	public void test5() {
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 } };
		assertTrue(bingoCheck(arr) == 10);
	}

	@Test
	public void test7() {
		int[][] arr = { { 1, 1, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 1, 1, 0, 0, 0 } };
		assertTrue(bingoCheck(arr) == 2);
	}

	@Test
	public void test8() {
		int[][] arr = { { 1, 1, 1, 0, 0 }, { 1, 1, 1, 0, 0 }, { 1, 1, 1, 0, 0 }, { 1, 1, 1, 0, 0 }, { 1, 1, 1, 0, 0 } };
		assertTrue(bingoCheck(arr) == 3);
	}

	@Test
	public void test9() {
		int[][] arr = { { 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 0 } };
		assertTrue(bingoCheck(arr) == 4);
	}

	@Test
	public void test10() { // 대각선 \
		int[][] arr = { { 1, 0, 0, 0, 0 }, { 0, 1, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 0, 1, 0 }, { 0, 0, 0, 0, 1 } };
		assertTrue(bingoCheck(arr) == 1);
	}

	@Test
	public void test11() { // 대각선 /
		int[][] arr = { { 0, 0, 0, 0, 1 }, { 0, 0, 0, 1, 0 }, { 0, 0, 1, 0, 0 }, { 0, 1, 0, 0, 0 }, { 1, 0, 0, 0, 0 } };
		assertTrue(bingoCheck(arr) == 1);
	}

	@Test
	public void test12() { // 대각선 X
		int[][] arr = { { 1, 0, 0, 0, 1 }, { 0, 1, 0, 1, 0 }, { 0, 0, 1, 0, 0 }, { 0, 1, 0, 1, 0 }, { 1, 0, 0, 0, 1 } };
		assertTrue(bingoCheck(arr) == 2);
	}

	@Test
	public void test13() { // mix 가로 + 대각선
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 0, 1, 0, 1, 0 }, { 0, 0, 1, 0, 0 }, { 0, 1, 0, 1, 0 }, { 1, 0, 0, 0, 1 } };
		assertTrue(bingoCheck(arr) == 3);
	}

	@Test
	public void test14() { // mix 가로 + 대각선 + 세로
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 1, 1, 0, 1, 0 }, { 1, 0, 1, 0, 0 }, { 1, 1, 0, 1, 0 }, { 1, 0, 0, 0, 1 } };
		assertTrue(bingoCheck(arr) == 4);
	}

	@Test
	public void test15() { // mix 가로 +세로
		int[][] arr = { { 1, 0, 0, 0, 1 }, { 1, 1, 0, 1, 0 }, { 1, 0, 1, 0, 0 }, { 1, 1, 0, 1, 0 }, { 1, 0, 0, 0, 1 } };
		assertTrue(bingoCheck(arr) == 3);
	}

}
