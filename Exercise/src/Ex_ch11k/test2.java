package Ex_ch11k;

import java.util.Scanner;

//  369게임 
//1-99까지의 정수를 입력받고
//3,6,9 중 하나가 있으면 박수짝
//2개가 있으면 박수 짝짝을 출력하세요.

public class test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String result = "";
			System.out.print("1-99사이의 정수를 입력해주세요>");
			int num = sc.nextInt();
			
			if (!(1 <= num && num <= 99)) {
				System.out.println("다시입력해주세요");
			} else {
				int one = num % 10;
				int two = num / 10;
				if (one == 3 || one == 6 || one == 9)
					result += "박수짝";

				if (two == 3 || two == 6 || two == 9)
					result += "짝";
			}

			System.out.println(result);
		}
	}
}