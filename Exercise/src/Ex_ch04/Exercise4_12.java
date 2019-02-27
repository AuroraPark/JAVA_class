package Ex_ch04;

public class Exercise4_12 {
	public static void main(String[] args) {

		//2단 - 4단
		for (int i = 1; i <= 3; i++) {
			for (int j = 2; j <= 4; j++) {
				System.out.print(j + "*" + i + "=" + j * i + "\t");
			}
			System.out.println();
		}
		System.out.println();

		//5단 - 7단
		for (int i = 1; i <= 3; i++) {
			for (int j = 5; j <= 7; j++) {
				System.out.print(j + "*" + i + "=" + j * i + "\t");
			}
			System.out.println();
		}
		System.out.println();

		//8단 - 9단
		for (int i = 1; i <= 3; i++) {
			for (int j = 8; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + j * i + "\t");
			}
			System.out.println();
		}
		System.out.println();

		
	}
}
