/* int타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를
완성하라. 만일 변수 num의 값이 12345라면 ‘1+2+3+4+5’ 의 결과인 15 를 출력하라. 
(1)에 알맞은 코드를 넣으시오.
*/

package Ex_ch04;

public class Exercise4_10 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		/* (1) . 알맞은 코드를 넣어 완성하시오 */
		for (int i = 0; i < 5; i++) {
			int tmp = num % 10;	// 10으로 나눈 나머지 = 1의자리수
			sum += tmp;
			num = num / 10;		// 다음 1의자리 추출을위해10으로 나눈다 
		}
		System.out.println("sum=" + sum);

	}

}
