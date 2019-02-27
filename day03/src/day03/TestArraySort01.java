/*
int[] arr = {4,4,4,6,5,7,9,7,5,3};

1. 배열 arr  오름차순으로 정렬하여 출력하시오. 

arr = {3,4,4,4,5,5,6,7,7,9};

*/

package day03;

public class TestArraySort01 {

	public static void main(String[] args) {
		int[] arr = { 4, 4, 4, 6, 5, 7, 9, 7, 5, 3 }; // 정렬할 배열 arr
		int[] numArr = new int[10]; // numArr에 0~9까지의 수 넣어 두기
		int[] counter = new int[10]; // 갯수 세서 넣을 배열

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i; // 1. 0~9까지 수 넣어두기
			// System.out.print(numArr[i]);
		}
		// System.out.println();

		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				// 2. 배열 numArr[i]와 배열 arr[j]를 비교
				if (numArr[i] == arr[j])
					// 3. 같으면 counter을 증가시킨다.
					counter[numArr[i]]++;
			}
		}

		// 출력문
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 1; j < counter[i] + 1; j++) {
				System.out.print(numArr[i]);
			}
		}
		System.out.println();

		// 개선 코드 - 버블정렬 알고리즘

		for (int i = 0; i < arr.length - 1; i++) {
			boolean changed = false;

			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					changed = true;
				}
			} // end for j

			if (!changed)
				break;

		} // end for i
		for (int k = 0; k < arr.length; k++)
			System.out.print(arr[k]);
		System.out.println();

		// 강사님 코드
		int[] cntArr = new int[10]; // 카운팅 결과를 저장할 배열

		// 1. 카운팅한다.
		// 배열 arr의 요소를 읽어서 cntArr에 저장
		for (int i = 0; i < arr.length; i++) {
			cntArr[arr[i]]++;
		}

		// 2. 카운팅 확인
		for (int i = 0; i < cntArr.length; i++) {
			if (cntArr[i] != 0)
				System.out.println(i);
		}

		// 3. 정렬(오름차순)결과를 출력
		// cntArr의 갯수만큼 index 값을 출력
		for (int i = 0; i < cntArr.length; i++) {
			for (int j = 0; j < cntArr[i]; j++) {
				if (cntArr[i] > 0)
					System.out.print(i);
			}
		}

	}

}
