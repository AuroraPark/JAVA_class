//package day05;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//
//public class PokerTest {
//
//	// Q. 포커 게임의 순위(RANK)를 판별하는 메서드 작성
//	// 5장의 카드를 받아서, 순위를 문자열로 반환
//	// 예) 카드 5장이 모두 같은 무늬 - "flush"
//	// 카드 5장이 연속, 1,2,3,4,5 - "straight"
//	String rankCheck(Card[] cards) {
//		return "straight";
//	}
//
//	@Test
//	void test() { // 같은 숫자가 2개면, 1 pair
//		Card[] cArr = { new Card(2, "S"), new Card(2, "S"), new Card(3, "D"), new Card(4, "H"), new Card(5, "S") };
//		assertTrue(rankCheck(cArr).equals("1 pair"));
//	}
//
//	@Test
//	void test2() { // 같은 숫자가 2개인개 2개면, 2 pair
//		Card[] cArr = { new Card(2, "S"), new Card(2, "S"), new Card(4, "D"), new Card(4, "H"), new Card(5, "S") };
//		assertTrue(rankCheck(cArr).equals("2 pair"));
//	}
//
//	@Test
//	void test3() { // 같은 숫자가 3개이면, Three Card
//		Card[] cArr = { new Card(2, "S"), new Card(2, "S"), new Card(2, "D"), new Card(4, "H"), new Card(5, "S") };
//		assertTrue(rankCheck(cArr).equals("three card"));
//	}
//
//	@Test
//	void test4() { // 같은 숫자가 4개이면, Four Card
//		Card[] cArr = { new Card(2, "S"), new Card(2, "S"), new Card(2, "D"), new Card(2, "H"), new Card(5, "S") };
//		assertTrue(rankCheck(cArr).equals("four card"));
//	}
//
//	@Test
//	void test5() { // three card와 1 pair가 같이 있으면, full house
//		Card[] cArr = { new Card(2, "S"), new Card(2, "S"), new Card(2, "D"), new Card(4, "H"), new Card(4, "S") };
//		assertTrue(rankCheck(cArr).equals("full house"));
//	}
//
//	@Test
//	void test6() { // 같은 무늬 5장이면 flush
//		Card[] cArr = { new Card(5, "S"), new Card(2, "S"), new Card(7, "S"), new Card(4, "S"), new Card(4, "S") };
//		assertTrue(rankCheck(cArr).equals("flush"));
//	}
//
//	@Test
//	void test1() { // 숫자가 연속이면 straight. 3,4,5,6,7
//		Card[] cArr = { new Card(1, "S"), new Card(2, "S"), new Card(3, "D"), new Card(4, "H"), new Card(5, "S") };
//		assertTrue(rankCheck(cArr).equals("straight"));
//	}
//
//	@Test
//	void test11() { // straight이면서 flush이면 staight flush
//		Card[] cArr = { new Card(1, "S"), new Card(2, "S"), new Card(3, "S"), new Card(4, "S"), new Card(5, "S") };
//		assertTrue(rankCheck(cArr).equals("straight flush"));
//	}
//
//	@Test
//	void test12() { // 아무것도 아니면 no rank
//		Card[] cArr = { new Card(8, "S"), new Card(2, "S"), new Card(3, "D"), new Card(4, "S"), new Card(5, "S") };
//		assertTrue(rankCheck(cArr).equals("no rank"));
//	}
//
//}
//
//class Card {
//	int num;
//	String kind;
//
//	Card() {
//		this(1, "S");
//	}
//
//	Card(int num, String kind) {
//		this.num = num;
//		this.kind = kind;
//	}
//}
