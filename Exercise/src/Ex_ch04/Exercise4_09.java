//숫자로 이루어진 문자열 str 이 있을때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라
//만일 문자열이 "12345"라면 '1+2+3+4+5'의 결과인 15를 출력되어야한다.

package Ex_ch04;

public class Exercise4_09 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			/* (1) . 알맞은 코드를 넣어 완성하시오 */
			sum += str.charAt(i) - '0';	// 문자를 숫자로 변경
		}
		System.out.println("sum=" + sum);
	}

}
