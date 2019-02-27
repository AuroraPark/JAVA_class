/*
 *  2차원 arr 배열 에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
 */
package EX_ch05;

public class Exercise5_04 {
	public static void main(String[] args) {
		int[][] arr = { { 5, 5, 5, 5, 5, }, 
						{ 10, 10, 10, 10, 10 }, 
						{ 20, 20, 20, 20, 20 }, 
						{ 30, 30, 30, 30, 30 } };

		int total = 0;
		float average = 0;

		// (1) . 알맞은 코드를 넣어 완성하시오
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
		}

		average =  total / (float)(arr.length*arr[0].length);
		// 배열 원소 갯수 (arr.length*arr[0].length) - 나누기는 형변환 필요
		System.out.println("total=" + total);
		System.out.println("average=" + average);

	}

}
