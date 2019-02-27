package day02;

public class TestEx09 {
	public static void main(String args[]) {
		int a = 1;
		for (int i = 1; i <= 10; i++) {
			// System.out.println(i + " " + (( 0 == (i % 3)) ? a++ : a));
			System.out.println(i + " " + ((i-1)/3));
		}
	}
}