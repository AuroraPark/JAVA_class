package ch03;

public class MathRandomEx {

	public static void main(String[] args) {
		for(int i = 1; i<=20 ; i++) {
			// 1부터 10까지의 난수 뽑기
			System.out.println((int)(Math.random()*10+1));
			// -5부터 5까지의 난수 뽑기
			System.out.println((int)(Math.random()*11-5));
			
		}

	}

}
