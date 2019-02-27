/* 두 배열에 같은 숫자가 몇개인지 세어서 출력하세요

int[] arr1 = { 1, 2, 3 };
int[] arr2 = { 1, 2, 3 };  
*/
package day02;

public class ArrayTestEx2 {
	public static void main(String[] args) {
		int count = 0;
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3 };

//		같다는게 뭐지?
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr1[i] == arr2[j]) {
					count++;
				}
			}
		}

		System.out.printf("%d 개가 같습니다.", count);

// 강사님 코드 (흐름보기)
		int cnt = 0; // 같은 숫자의 갯수를 세기 위한 변수

//	if(arr1[0]==arr2[0]) cnt++;
//	if(arr1[0]==arr2[1]) cnt++;
//	if(arr1[0]==arr2[2]) cnt++;
//	if(arr1[1]==arr2[0]) cnt++;
//	if(arr1[1]==arr2[1]) cnt++;
//	if(arr1[1]==arr2[2]) cnt++;
//	if(arr1[2]==arr2[0]) cnt++;
//	if(arr1[2]==arr2[1]) cnt++;
//	if(arr1[2]==arr2[2]) cnt++;

		// 반복문으로 묶기

		// 두 배열이 같은지 비교하려면?
		
		System.out.println(cnt);
	}
}
