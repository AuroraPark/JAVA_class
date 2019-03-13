package Ex_ch11k;





import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		// String을 배열로 바꿈
		char[] ch = line.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if (ch[j] < ch[i]) {
					char tmp = ch[i];
					ch[i] = ch[j];
					ch[j] = tmp;
				}
			}
			// 배열 한자리씩 가지고와서 서로 비교후 자리바꿈
			// 1. tmp에 첫번째 담기

		}
		System.out.println(ch);
	}
}

