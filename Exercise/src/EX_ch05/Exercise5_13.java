/*
 *  단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제이다 실행결과와 .
	같이 동작하도록 예제의 빈 곳을 채우시오.
 */
package EX_ch05;

import java.util.Scanner;

public class Exercise5_13 {
	public static void main(String[] args) {
		String[] words = { "television", "computer", "mouse", "phone" };

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray(); // String char[] 을 로 변환
			/*
			 * 알맞은 코드를 넣어 완성하시오 char배열 question에 담긴 문자의 위치를 임의로 바꾼다
			 */
			int idx = 0;	// 임의의 값을 얻어 저장할 변수
			
			for (int j = 0; j < question.length; j++) {	// 글자의 길이 question배열의 j만큼 반복한다.
				idx = (int) (Math.random() * question.length);

				char tmp = question[i];	// 두 값을 바꾸는데 사용할 임시 변수
				question[i] = question[idx];	// words의 글자의 i번째를 섞어준다.
				question[idx] = tmp;
			
			}


			System.out.printf("Q%d.%s의 정답을 입력하세요.>", i + 1, new String(question));

			String answer = scanner.nextLine();

			// trim() answer , equals word[i] 으로 의 좌우 공백을 제거한 후 로 와 비교
			if (words[i].equals(answer.trim()))
				System.out.printf("맞았습니다.%n%n");
			else
				System.out.printf("틀렸습니다.%n%n");
		}

	} // end of main
} // end of class
