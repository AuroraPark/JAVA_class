/* Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를
 * 완성하라. (1)에 알맞은 코드를 넣으시오.
 */

package Ex_ch04;

public class Exercise4_07 {
	public static void main(String[] args) {
		// Math.random() = 0~1
		int value = (int) (Math.random() * 6) + 1; // 1 ~ 6 // 마지막 7의 값은 미포함.
		System.out.println("value:" + value);

	}

}
