/*  아래는 변수 의 값 중에서 일의 자리를 로 바꾸는 코드이다 만일 변수 의 num 1 . num
값이 이라면 이 되고 이라면 이 된다 에 알맞은 코드를 넣으시오 333 331 , 777 771 . (1) .
*/
package Ex_ch03;

public class Exercise3_05 {
	public static void main(String[] args) {
		int num = 333;
		System.out.println((num / 100) * 100 + (num % 100 / 10) * 10 + 1);
	//	System.out.println(num/10*10+1);
		// 개선 코드 : num/10*10+1 -> num/10 - 10뒷자리 다버림 그리고 10곱해서 다시 자리수 맞춰주고 1의자리를 1로 고정해준다. 
		// 나누기 연산자는 반올림하지 않고 다 버림한다
	}
}
