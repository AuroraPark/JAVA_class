/* 다음의 for 문을 while 문으로 변경하시오 */

package Ex_ch04;

public class Exercise4_05 {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}

		System.out.println("---------while문----------");
		int i = 0;
		while (i <= 10) {	// 10될때까지
			int j = 0;
			while (j <= i) {
				System.out.print("*");	// 별 개수 증가
				j++;
			}
			System.out.println();	// 엔터치기
			i++;
		}
	}

}
