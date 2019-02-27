//다음은 배열을 선언하거나 초기화한 것이다 잘못된 것을 고르고 그 이유를 설명 .
//하시오.
//a. int[] arr[];
//b. int[] arr = {1,2,3,};
//c. int[] arr = new int[5];
//d. int[] arr = new int[5]{1,2,3,4,5};
//e. int arr[5];
//f. int[] arr[] = new int[3][];

package EX_ch05;

public class Exercise5_01 {
	public static void main(String[] args) {
												// 내 답변 	// 답안
		// int[] arr[];							// X		// O
		// int[] arr = {1,2,3,};				// O        // O
		// int[] arr = new int[5];				// O		// O
		// int[] arr = new int[5]{1,2,3,4,5};	// O		// X // 두번째 대괄호[]에 숫자 넣으면 안됨
		// int arr[5];							// X		// X
		// int[] arr[] = new int[3][];			// X		// O
	}

}
