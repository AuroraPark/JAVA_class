package day02;

public class TestEx4 {
	public static void main(String args[]) {
		for (int i = 1; i <= 10; i++) {
			// System.out.println(i + " " + ((0 != (i % 3)) ? i % 3 : 3));
			System.out.println((i + 2) % 3 + 1);
		}
	}
}
