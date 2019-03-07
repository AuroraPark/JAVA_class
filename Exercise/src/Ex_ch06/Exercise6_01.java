/* SutdaCard라는 클래스 정의하기!
 * 
*/
package Ex_ch06;

public class Exercise6_01 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);	//3
		SutdaCard card2 = new SutdaCard();		//1K

		System.out.println(card1.info()); // 3
		System.out.println(card2.info()); // 1K

	}
}

class SutdaCard {
	int num; // 카드의 숫자 1~10사이의 정수
	boolean isKwang; // 광이면 true, 아니면 false

	SutdaCard() {
		this(1, true);	// 1K
	} // 기본

	SutdaCard(int num, boolean isKwang) {	// 3
		this.num = num;
		this.isKwang = isKwang;
	}

	String info() {	//숫자를 문자열로 반환한다. 광인경우 K를 덧붙인다.
		return num + (isKwang ? "K" : "");
	}
}
