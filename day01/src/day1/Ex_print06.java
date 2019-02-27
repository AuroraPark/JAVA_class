/* 반복문 - {} 안의 문장들을 반복한다.
 * 1부터 5까지 5번 반복
 * for (int i = 1; i <= 5; i++) {}
 * println()은 출력후 줄바꿈
 * print()는 출력후 줄바꿈 안함
 * 블럭설정 후 alt+화살표 키 하면 이동됨
 */
package day1;

public class Ex_print06 {

	public static void main(String[] args) {
		// 6
		System.out.println("------------6----------");

		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
