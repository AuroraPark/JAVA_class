package Ex_ch06;

class PlayingCard {				// 클래스
	int kind;		// 인스턴스 변수(iv)
	int num;		// 인스턴스 변수(iv)
	static int width;	// 클래스 변수(cv)
	static int height;  // 클래스 변수(cv)

	PlayingCard(int k, int n) {	// 지역변수 k, n
		kind = k;
		num = n;
	}

}

public class Exercise6_08 {		// 클래스
	public static void main(String args[]) {	// main 메소드
		PlayingCard card = new PlayingCard(1, 1);	// 지역변수 card
	}
}

// 답 Note > args 도 지역변수
