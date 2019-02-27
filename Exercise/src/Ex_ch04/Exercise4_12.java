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
		
		
		// 개선코드
		for(int i = 1; i <= 9 ; i++) {
			for(int j = 1; j <= 3; j++) {
				int x = j + 1 + (i-1)/3*3;
				int y = i%3==0? 3: i%3;
				
				if(x>9)	// 9단까지만 출력한다.
					break;
				
				System.out.print(x+"*"+y+"="+x*y+"\t");	// println이 아님을 주의
			}
			System.out.println();
			if(i%3==0) System.out.println();
		}
		
	}
}
