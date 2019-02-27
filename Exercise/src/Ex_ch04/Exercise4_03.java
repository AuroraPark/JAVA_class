/* 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 의 결과를 계산하시오.
 * 1은 10개
 * 2는 9
 * 3-8
 * ...
 */
package Ex_ch04;

public class Exercise4_03 {
	public static void main(String[] args) {
		int sum = 0;

		for (int j = 10; j > 0; j--) {
			for (int i = 1; i <= j; i++) { // j만큼 i의 갯수를 sum에 더한다
				sum += i;
			}
		}
		System.out.println(sum);

		// 개선코드
//		int sum2 = 0; // i의 합을 담을 변수
//		int totalSum = 0; // sum의 합을 담을 변수
//
//		for (int i = 1; i <= 10; i++) {
//			sum2 += i;
//			totalSum += sum2;
//		}
//
//		System.out.println(totalSum);
	}
}
