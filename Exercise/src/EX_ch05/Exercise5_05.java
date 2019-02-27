/*
 *  다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프   
	로그램이다 (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오 .  .
 */
package EX_ch05;

public class Exercise5_05 {
	public static void main(String[] args) {
		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];
		// ballArr . 배열 의 임의의 요소를 골라서 위치를 바꾼다
		for (int i = 0; i < ballArr.length; i++) {
			int j = (int) (Math.random() * ballArr.length);
			int tmp = 0;
			
			//  (1) . 알맞은 코드를 넣어 완성하시오
			// 랜덤으로 값을 바꾸는 코드
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];	// 랜덤 위치(j)의 값을 ballArr[i]에 넣는다
			ballArr[j] = tmp;
		}
		// ballArr배열 의 앞에서 3개의 수를 배열 ball3로 복사한다
		/* (2) */
		for(int i = 0; i < 3; i++) {
			ball3[i] = ballArr[i];
		}
	//개선코드
		// System.arraycopy(ballArr,0, ball3,0,3);	// 어레이카피 이용하기
		
		for (int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i]);
		}
	}

}
