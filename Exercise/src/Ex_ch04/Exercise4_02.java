// 1부터 20까지의 정수 중에서 2또는 의 3배수가 아닌 수의 총합을 구하시오
package Ex_ch04;

public class Exercise4_02 {
	public static void main(String[] args) {
		int sum = 0; // 총합 저장할 값
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0 || i % 3 == 0) { // 2의 배수 3의배수면 continue로 건너뛰기
				continue;
			} else {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
