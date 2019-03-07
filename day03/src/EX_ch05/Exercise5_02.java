/* 다음과 같은 배열이 있을 때  arr[3].length의 값은 얼마인가
 * int[][] arr = {
		{ 5, 5, 5, 5, 5},
		{ 10, 10, 10},
		{ 20, 20, 20, 20},
		{ 30, 30}
	};

 */

package EX_ch05;

public class Exercise5_02 {
	public static void main(String[] args) {
		int[][] arr = { 
				{ 5, 5, 5, 5, 5 }, 
				{ 10, 10, 10 }, 
				{ 20, 20, 20, 20 }, 
				{ 30, 30 } 
		};
		
		System.out.println(arr[3].length); // 2 - 배열은 0부터 시작
	}

}
