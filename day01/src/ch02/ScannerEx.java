package ch02;

import java.util.Scanner; // Scanner를 사용하기 위해 추가 ctrl + shift+ o 자동 import

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("두자리 정수를 하나 입력해주세요.>");
		int num = scanner.nextInt();
	
		/* 아래 두줄 없이 nextInt()로 받아 올 수 있다.*/
	//	String input = scanner.nextLine();
	//	int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환

		System.out.println("입력내용 :" + num);
		System.out.printf("num=%d%n", num);

	}

}
