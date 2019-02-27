/*
 * 연습문제
1. 5 * 5 int 배열 만들고
2. 1~25로 초기화
3. shuffles - 배열 요소를 섞는다.


*/

package day03;

public class TestArraySort03 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int[][] arr2 = new int[5][5];
		int n = 1; // arr 배열 안에 넣을 수 (1로 초기화)

		// 2. 1~25로 초기화
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = n;
				n++; // 1부터 1씩 증가시키며 arr 값을 초기화
			}
		}

		// 2. 잘 들어갔는지 확인
		System.out.println("--------arr 초기 배열 -------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) { // 배열arr 출력
				System.out.printf("%02d ", arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("--------arr2 = 셔플 배열 -------");
		// 3. shuffles로 배열 요소를 섞는다.
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int tmpi = (int) (Math.random() * arr.length); // 행을 랜덤화한다.
				int tmpj = (int) (Math.random() * arr[i].length); // 열을 랜덤화 한다.
				arr2[i][j] = arr[tmpi][tmpj]; // 랜덤화된 arr의 값을 arr2에 넣는다
			}
		}

		// 출력
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.printf("%02d ", arr2[i][j]); // arr2 출력
			}
			System.out.println();
		}

		// 중복을 못잡아서 실패!
		// 중복 없는 값 섞기 - 자리바꿈
		// 3. shuffles로 배열 요소를 섞는다.
		int temp = 0; // 두 값을 바꾸는데 사용할 임시 변수
		int k = 0; // j 의 값을 바꾸는데 사용할 임시 변수
		int s = 0; // i 의 값을 바꾸는데 사용할 임시 변수

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				k = (int) (Math.random() * arr.length); // 열 셔플
				s = (int) (Math.random() * arr[i].length); // 행 셔플
				temp = arr[i][j]; // 열셔플
				arr[i][j] = arr[i][k];
				arr[i][k] = temp;

				temp = arr[i][j]; // 행셔플
				arr[i][j] = arr[s][j];
				arr[s][j] = temp;

			}
		}
		System.out.println("--------arr3 셔플 배열 -------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%02d ", arr[i][j]); // 두번 셔플 된 배열 arr 출력
			}
			System.out.println();
		}

		// 4. 행열 셔플을 한번에 실행할 수는 없을까?
		// 랜덤 i,j를 줘보자

		k = 0; // j 의 값을 바꾸는데 사용할 임시 변수
		s = 0; // i 의 값을 바꾸는데 사용할 임시 변수

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				k = (int) (Math.random() * arr.length); // 열 셔플
				s = (int) (Math.random() * arr[i].length); // 행 셔플

				// 배열에 저장된 값을 뒤 섞는다.
				int tmp = arr[i][j];
				arr[i][j] = arr[k][s];
				arr[k][s] = tmp;
			}
		}
		System.out.println("--------arr4 셔플 배열 -------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%02d ", arr[i][j]); // 두번 셔플 된 배열 arr 출력
			}
			System.out.println();
		}
	}

}
