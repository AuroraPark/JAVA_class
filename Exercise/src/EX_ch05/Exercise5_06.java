/*
 *  다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다 
 *  변수 money 의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 
 *  계산해서 출력하라 
 *  단 가능한 한 적은 수의 동전으로 거슬러 주어야한다 
 *  (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
 *    [Hint] 나눗셈 연산자와 나머지 연산자를 사용해야 한다
 */
package EX_ch05;

public class Exercise5_06 {
	public static void main(String[] args) {
		// . 큰 금액의 동전을 우선적으로 거슬러 줘야한다
		int[] coinUnit = { 500, 100, 50, 10 };

		int money = 2680;
		System.out.println("money=" + money);

		for (int i = 0; i < coinUnit.length; i++) {
			// (1) . 알맞은 코드를 넣어 완성하시오
			// 나누기로 해당 동전의 갯수를 뽑아내고 나머지를 구해서 다음 동전의 갯수를 뽑아낸다.
			int tmp = money / coinUnit[i]; // 동전 갯수를 저장할 임시 변수

			// 출력문
			System.out.printf("%d원: %d%n", coinUnit[i], tmp);
			
			// 개선코드
//			System.out.println(coinUnit[i]+"원: " + money / coinUnit[i]);
			
			
			// 남은 돈을 나머지연산자를 이용해 구한다.
			money = money % coinUnit[i];

		}
	}

}
