/*  아래는 변수 의 값 중에서 일의 자리를 로 바꾸는 코드이다 만일 변수 의 num 1 . num
값이 이라면 이 되고 이라면 이 된다 에 알맞은 코드를 넣으시오 333 331 , 777 771 . (1) .
*/
package Ex_ch03;

public class Exercise3_05 {
	public static void main(String[] args) {
		int num = 333;
		System.out.println((num / 100) * 100 + (num % 100 / 10) * 10 + 1);
	}
}
