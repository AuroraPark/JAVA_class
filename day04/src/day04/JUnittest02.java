package day04;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
//Q. 길이가 3인 두 개의 int 배열을 입력받아서 비교한 결과를
//String으로 반환하는 메서드를 작성하시오.
//두 배열에 같은 값이 있으면 ball이고 
//같은 값이면서 위치 까지 같으면 strike이다
//만일 {1,2,3}과 {1,3,2}를 비교하면 "1S2B"를 반환해야한다.
public class JUnittest02 {

//	String check(int[] arr1, int[] arr2) {
//		int strCnt = 0; // 스트라이크 카운트
//		int ballCnt = 0; //볼 카운트
//		
//		for(int i = 0; i < arr1.length; i++) {
//			if(arr1[i] == arr2[i]) {
//				strCnt++;
//			} else {
//				for(int j = 0; j < arr1.length; j++) {
//					if(arr1[i] == arr2[j]) {
//						ballCnt++;
//					}
//				}
//			}
//		}
//		
//		return "1S2B";
//	}

	/*강사님 코드*/
	String check(int[] arr1, int[] arr2) {
		int s = 0;
		int b = 0;
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j< arr2.length; j++) {
				if(arr1[i] == arr2 [j]) {	// i와 j가 같을 때 s++, 다를때 b++;
					if(i==j)
						s++;
					else
						b++;
				}
			}
		}
		return s+ "S" + b + "B";
	}

	@Test
	public void test3() {
		assertTrue(check(new int[] {1,2,3}, new int[] {1,3,2}).equals("1S2B"));
	}
	

}
