package day12;
//[문제1] 주어진 문자열 데이터를 가지고 실행결과와 같이 출력되도록 코드를 완성하세요.

//데이터의 형식은 문제, 답, 선택지의 순서로 되어 있으며 구분자는 `(숫자1옆의 키)입니다.

import java.util.Scanner;

//[문제2] 문제1에서 완성된 코드에 사용자 입력을 받아서 정답여부를 판단하여 마지막에 최종점수를
//실행결과와 같이 출력하도록 코드를 완성하세요. 

//[문제3] 문제2에서 완성된 코드를 이용해서, 문제의 순서를 임의로 바꾸고, 선택지도 임의로 바뀌어 출력되도록 하세요.

class SimpleQuiz {
	public static void main(String[] args) {
		String[] data = { "다음 중 키워드가 아닌 것은?`2`final`True`if`public", "다음 중 자바의 연산자가 아닌 것은?`6`&`|`++`!=`/`^",
				"다음 중 메서드의 반환값이 없음을 의미하는 키워드는?`1`void`null`false", };

		Scanner s = new Scanner(System.in);
		int score = 0;

		shuffle(data); // 문제를 섞는다.

		for (int i = 0; i < data.length; i++) {
			String[] tmp = data[i].split("`", 3);

			String question = tmp[0];
			String answer = tmp[1];
			String[] choices = tmp[2].split("`");

			answer = choices[Integer.parseInt(answer) - 1];

			shuffle(choices); // 선택지를 섞는다.

			System.out.println("[" + (i + 1) + "] " + question);

			for (int x = 0; x < choices.length; x++) {
				/* 코드를 완성하세요. */
				
				System.out.print((x + 1) + "." + choices[x] + "\t");
			}

			System.out.println();

			/* 알맞은 코드를 넣으세요 */
			System.out.print("[답]");
			String input = s.nextLine();

			int idx = Integer.parseInt(input);
			System.out.println();
			System.out.println();
			// 답 값을 받아서 비교 한뒤 스코어를 올린다.
			if (answer.equals(choices[idx - 1])) {
				score++;
			}
		}

		System.out.printf("정답개수/전체문항수 :%d/%d", score, data.length);

//		for (int i = 0; i < data.length; i++) {
//			// 1. String클래스의 String[] split(String regex, int limit)를 사용해서 문제와 선택지를 나누세요.
//			String[] question = data[i].split("`", 0);
//			// 2. 문제를 출력하세요.
//			System.out.println("[" + (i + 1) + "] " + question[0]);
//
//			// 3. 선택지를 나누기 위해 String[] split(String regex)를 사용하세요.
//			String[] answer = data[i].split("`");
//			// 4.반복문을 이용해서 선택지를 출력하세요.
//			for (int j = 2; j < answer.length; j++) {
//				System.out.printf("%d.%s\t", j-1, answer[j]);
//			}
//			System.out.println();
//			System.out.println();
//		}

	} // main
//	문제의 순서를 임의로 바꾸고, 선택지도 임의로 바뀌어 출력되도록 하세요.

	public static void shuffle(String[] data) {
		// 코드를 완성하세요.
//		
//		for (int x = 0; x < choices.length; x++) {
//			System.out.print((x + 1) + "." + choices[x] + "\t");
//		}	

//		// 1. 배열data의 개수가 0보다 같거나 적으면 메서드 전체를 빠져나간다.
		if (data.length <= 0) {
			System.exit(0);
		}
		// 2. 선택지의 순서를 뒤바꾼다. 반복문과 Math.random()사용
		for (int i = 0; i < data.length; i++) {
			int j = (int) (Math.random() * data.length);
			String tmp = "";

			// 랜덤으로 값을 바꾸는 코드
			tmp = data[i];
			data[i] = data[j]; // 랜덤 위치(j)의 값을 ballArr[i]에 넣는다
			data[j] = tmp;
		}

	} // shuffle()

}
