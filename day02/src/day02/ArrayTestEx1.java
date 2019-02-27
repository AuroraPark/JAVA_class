/* 두 배열이 같은지 확인하고 같으면 "같습니다" 다르면 "다릅니다" 출력

int[] arr1 = { 1, 2, 3 };
int[] arr2 = { 1, 2, 3 };  

*/
package day02;

public class ArrayTestEx1 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3 };

//		같다는게 뭐지?
//		각 요소에 저장된 값이 전부 같으면 같다

		// if (arr1[0] == arr2[0] && arr1[1] == arr2[1] && arr1[2] == arr2[2]) {
		// System.out.println("같습니다.");
		// } else {
		// System.out.println("다릅니다.");
		// }

// 2. 반복되는 문장을 반복문을 쓰면 좋겠다.
//		for (int i = 0; i < arr1.length; i++) {
//			if (arr1[i] == arr2[i]) {
//				System.out.println((i+1)+"번째가 같습니다.");
//			} else {
//				System.out.println((i+1)+"번째가 다릅니다.");
//			} 
//		}

// 3. 다 비교하기 보다 중간에 false나오면 빠져나오는게 낫겠다.
// 4. 그럼 플래그를 줘서 비교하면 좋겠다.
//		boolean flag = true;
//
//		while (flag) {
//			for (int i = 0; i < arr1.length; i++) {
//				if (arr1[i] != arr2[i]) {
//					flag = false;
//					System.out.println((i + 1) + "번째가 다릅니다. 끝납니다.");
//					break;
//				} else {
//					System.out.println((i + 1) + "번째가 같습니다.");
//
//				}
//			}
//			
//		}
//		System.out.println("배열이 동일합니다.");
		int cnt = 0;
		for (int i = 0; i < 3; i++) {
				if (arr1[i] == arr2[i]) {
					cnt++; // 같으면
				} else {
					break;
				}

		}
		// 조건식을 어떻게 해야할까?
		// 배열의 길이만큼 cnt의 값이 나와야
		if(cnt == arr1.length) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		// 중간에 다르면 빠져나오면 되니까

	}
}
