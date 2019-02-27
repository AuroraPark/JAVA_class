/* 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
100 . 이상이 되는지 구하시오*/
package Ex_ch04;

public class Exercise4_04 {

	public static void main(String[] args) {
		int num = 0; // 합이 100이상일때의 숫자를 담을 변수
		int sum = 0; // 숫자들의 합

		while (true) { // sum이 100이상이면 반복문을 빠져나온다.
			if (sum >= 100)
				break;
			num++;
			if (num % 2 == 0) {
				sum -= num;		// 짝수일때 빼기
			} else {
				sum += num;		// 홀수일때 더하기
			}

			// 개선코드 - 부호를 이용
			/* 조건식의 값이 true이므로 무한 반복문이 된다.
			 * 매 반복마다 s의 값은 1, -1, 1, -1 ...
			 * for(int i = 1; true; i++, s = -s) { 
			 * 	num = s *i;	// i와 부호 (s)를 곱해서 더할 값을 구한다.
			 * 	sum +=num;
			 * 
			 * 	if(sum>=100)
			 * 		break;
			 * }
			 */
		}
		//
		System.out.println(num + "일 때 숫자가 " + sum + "이됩니다.");
	}

}
