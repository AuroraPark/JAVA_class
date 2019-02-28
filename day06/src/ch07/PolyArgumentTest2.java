/* 객체 지향 프로그래밍
 * 다형성에 대해 알아보자!
 * 예제 7-22 p.371
 */

package ch07;

class Product { // 조상클래스
	int price; // 제품의 가격
	int bonusPoint; // 제품 구매시 제공하는 보너스 점수

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}

	Product() {
	} // 기본생성자
}

class Tv extends Product { // Product의 자손클래스 1
	Tv() {  super(100); } // 조상클래스의 생성자 Product (int price)를 호출

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product { // Product의 자손클래스 2
	Computer() {  super(200); } // 조상클래스의 생성자 Product (int price)를 호출

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product { // Product의 자손클래스 3
	Audio() {  super(50); } // 조상클래스의 생성자 Product (int price)를 호출

	public String toString() {
		return "Audio";
	}
}

class Buyer { // 고객 , 물건을 사는 사람
	int money = 1000;	// 소유 금액
	int bonusPoint = 0;	// 보너스 점수
	Product[] item = new Product[10];	//구입한 제품을 저장하기 위한 배열
	int i = 0;	//Product 배열에 사용될 카운터
	
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;			// 가진돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint;	// 제품의 보너스 점수를 추가한다.
		item[i++] = p;				// 제품을 Product[] item에 저장한다.
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void summary() {		 // 구매한 물품에 대한 정보를 요약해서 보여준다.
		int sum = 0;		 // 구입한 물품의 가격 합계
		String itemList =""; // 구입한 물품목록
		
		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for(int i = 0; i<item.length; i++) {
			if(item[i]==null) break;
			sum += item[i].price;
			itemList +=(i==0)? ""+ item[i] : ", " + item[i];
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

public class PolyArgumentTest2 {
	public static void main(String[] args) {
		Buyer b = new Buyer();

		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();
	}
}
