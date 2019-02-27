/*
 *  다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼  
 *  ‘*’을 찍어서 그래프를 그리는 프로그램이다 
 *  (1)~(2) 에 알맞은 코드를 넣어서 완성하시오 . 
 */
package EX_ch05;

public class Exercise5_08 {
	public static void main(String[] args) {
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];

		for (int i = 0; i < answer.length; i++) {
			/* (1)알맞은 코드를 넣어 완성하시오 . */
			// j+1랑 anwser[i]의 값이 같을 때 마다 counter[j]의 값을 증가시켜줌
			for (int j = 0; j < counter.length; j++) {

				if ((j + 1) == answer[i]) {
					counter[j]++;
				}

			}
			
//			// 개선코드
//			counter[answer[i] - 1]++; // answer 값 - 1 (배열은 0부터 시작)

		}

		for (int i = 0; i < counter.length; i++) {
			/* (2) . 알맞은 코드를 넣어 완성하시오 */
			System.out.print(counter[i]);
			for (int j = 1; j <= counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	} // end of main
} // end of class
