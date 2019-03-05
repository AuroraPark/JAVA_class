// 다음은 물건을 구입하는 사람을 정의한  Buyer클래스이다 이 클래스는 멤버변수로 
// 돈 (money)과 장바구니 (cart)를 가지고 있다 
// 제품을 구입하는 기능의 buy메서드와 
// 장바구니에 구입한 물건을 추가하는 add메서드, 
// 구입한 물건의 목록과 사용금액 그리고 남은 금액을 출력하는 summary 메서드를 완성하시오 .
//
// 	1.  메서드명: buy
// 		기 능 : 지정된 물건을 구입한다 가진 돈(money)에서 물건의 가격을 빼고
// 			장바구니 (cart)에 담는다 
// 		   만일 가진 돈이 물건의 가격보다 적다면 바로 종료한다.
// 		반환타입 : 없음
// 		매개변수 : Product p -구입할 물건
// 	2.  메서드명: add
//		기 능 : 지정된 물건을 장바구니에 담는다.
//		   만일 장바구니에 담을 공간이 없으면 장바구니의 크기를 2배로 늘린 다음에 담는다
//		반환타입 : 없음
//		매개변수 : Product p -구입할 물건 
//	3.  메서드명: summary
//		기 능 : 구입한 물건의 목록과 사용금액 남은 금액을 출력한다
//		반환타입 : 없음 
//		매개변수 :  없음 

package Ex_ch07;

class Exercise7_19 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());

		b.summary();
	}
}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product배열 cart에 사용될index

	void buy(Product p) {
		/*
		 * (1)아래의 로직에 맞게 코드를 작성하시오 1.1가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다 , 1.2가진 돈이
		 * 충분하면 제품의 가격을 가진 돈에서 빼고 1.3 장바구니에 구입한 물건을 담는다.(add 메서드 호출)
		 */
	}

	void add(Product p) {
		/*
		 * (2) . 아래의 로직에 맞게 코드를 작성하시오 1.1 i의 값이 장바구니의 크기보다 같거나 크면 1.1.1 기존의 장바구니보다 2배큰
		 * 새로운 배열을 생성한다 1.1.2 기존의 장바구니의 내용을 새로운 배열에 복사한다 1.1.3 . 새로운 장바구니와 기존의 장바구니를바꾼다
		 * 1.2 물건을 장바구니(cart)에 저장한다 그리고 i의 값을 1 증가시킨다
		 */
	} // add(Product p)

	void summary() {
		/*
		 * (3) . 아래의 로직에 맞게 코드를 작성하시오 1.1 . 장바구니에 담긴 물건들의 목록을 만들어 출력한다 1.2 . 장바구니에 담긴
		 * 물건들의 가격을 모두 더해서 출력한다 1.3 . 물건을 사고 남은 금액(money) 를 출력한다
		 */
	} // summary()
}

class Product {
	int price; // 제품의 가격

	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}