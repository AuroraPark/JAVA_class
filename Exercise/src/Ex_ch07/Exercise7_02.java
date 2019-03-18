/*문제 7-1
//섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck 클래스)을 정의한 것이다
//섯다카드 20장을 담는 SutdaCard 배열을 초기화하시오. 
//단 섯다카드는 1 부터 10 까지의 숫자가 적힌 카드가 한 쌍씩 있고 
//숫자가 1,3,8 인 경우에는 둘 중의 한 장은 광(Kwang) 이어야 한다 
//즉 SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다
*/

/*문제 7-2
//문제 7-1의  SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트 하시오.
//[ 주의  ]Math.random()을 사용하는 경우 실행결과와 다를 수 있음
//	1. 메서드명: shuffle 
//		기 능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다( Math.random()사용)
//		반환타입 :없음 
//		매개변수 :없음 
//		
//	2. 메서드명: pick 
//		기 능: 배열  cards 에서 지정된 위치의  SutdaCard를 반환한다 .
//		반환타입 : SutdaCard
//		매개변수 위치 : int index -위치
//		
//	3. 메서드명: pick 
//		기 능 :배열 cards에서 임의의 위치의 SutdaCard 를 반환한다.(Math.random()사용 )
//		반환타입 : SutdaCard
//		매개변수 : 없음 
*/
package Ex_ch07;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
//		섯다카드 20장을 담는 SutdaCard 배열을 초기화하시오. 
		// 단 섯다카드는 1 부터 10 까지의 숫자가 적힌 카드가 한 쌍씩 있고
		// 숫자가 1,3,8 인 경우에는 둘 중의 한 장은 광(Kwang) 이어야 한다
		// 즉 SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다
		/* (1)배열 SutdaCard를 적절히 초기화 하시오 */
		int[] SutdaCard = new int[20];

		for (int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
			cards[i] = new SutdaCard(num, isKwang);
		}

	}
//	1. 메서드명: shuffle 
//	기 능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다( Math.random()사용)
//	반환타입 :없음 
//	매개변수 :없음 

	void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			int j = (int) (Math.random() * cards.length);
			// cards[i] cards[j] . 와 의 값을 서로 바꾼다
			SutdaCard tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}

//2. 메서드명: pick 
//	기 능: 배열  cards 에서 지정된 위치의  SutdaCard를 반환한다 .
//	반환타입 : SutdaCard
//	매개변수 : int index -위치
	SutdaCard pick(int index) {
		if (index < 0 || index >= CARD_NUM) // index . 의 유효성을 검사한다
			return null;
		return cards[index];
	}
	
////3. 메서드명: pick 
////	기 능 :배열 cards에서 임의의 위치의 SutdaCard 를 반환한다.(Math.random()사용 )
////	반환타입 : SutdaCard
////	매개변수 : 없음 

	SutdaCard pick() {
		int index = (int) (Math.random() * cards.length);
		return pick(index); // pick(int index) . 를 호출한다
	}

} // SutdaDeck

class SutdaCard {
	final int num;
	final boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

class Exercise7_02 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();

		System.out.println(deck.pick(0));
		System.out.println(deck.pick());

		deck.shuffle();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");

		System.out.println();
		System.out.println(deck.pick(0));
	}

}