/*
 *  예제5-23 을 변경하여 아래와 같은 결과가 나오도록 하시오
 */
package EX_ch05;

import java.util.Scanner;

public class Exercise5_12 {
	public static void main(String[] args) {
		String[][] words = { { "chair", "의자" }, // words[0][0], words[0][1]
				{ "computer", "컴퓨터" }, // words[1][0], words[1][1]
				{ "integer", "정수" } // words[2][0], words[2][1]
		};

		Scanner scanner = new Scanner(System.in);
		int count = 0; // 맞춘 갯수 저장하는 변수

		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?", i + 1, words[i][0]);

			String tmp = scanner.nextLine();

			if (tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n%n");
				count++;
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1]);
			}
		}
		System.out.printf("전체 %d문제 중 %d문제 맞추셨습니다.", words.length, count);
	} // end of main
} // end of class
