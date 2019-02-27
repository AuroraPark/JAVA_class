/* 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
100 . 이상이 되는지 구하시오*/
package Ex_ch04;

public class Exercise4_04 {

	public static void main(String[] args) {
		int num = 0; // 합이 100이상일때의 숫자를 담을 변수
		int sum = 0; // 숫자들의 합

		while (true) { // sum이 100이상이면 반복문을 빠져나온다.
			if (sum > 100)
				break;
			num++;
			if (num % 2 == 0) {
				sum -= num;		// 짝수일때 빼기
			} else {
				sum += num;		// 홀수일때 더하기
			}

		}
		//
		System.out.println(num + "일 때 숫자가 " + sum + "이됩니다.");
	}

}
