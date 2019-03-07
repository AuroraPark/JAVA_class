package day02;

public class TestEx8 {
	public static void main(String args[]) {
		int num = 1;
		System.out.println("--------1 내답안--------");
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i + 5 * j + " ");
			}
			System.out.println();
		}

		System.out.println("--------2 변수 하나 더 선언--------");

		// for (int i = 1; i <= 5; i++) {
//			System.out.printf("%2d %n", num++);
		// }

//		System.out.println("----------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++)
				System.out.printf("%2d %n", ((j - 1) * 10 + i));
		}

	}
}