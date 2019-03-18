//package day05;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//
//public class DeckTestTest {
//	// Q. 포커 게임의 순위(RANK)를 판별하는 메서드 작성
//	// String rankCheck(Card[] cards)
//	// 5장 카드 받아서 , 순위를 문자열로 반환
//	// 예) 카드 5장이 모두 같은 무늬 = "flush"
//	// 카드 5장이 연속 , 1,2,3,4,5 = "straight"
//	// 포커로 검색
//
////	String rankCheck(Card[] cards) {
//		
//		
////	}
//
//	@Test
//	public void test1() { // straight
//		Card[] cArr = { new Card(1, "S"), new Card(2, "S"), new Card(3, "D"), new Card(4, "H"), new Card(5, "S") };
//		assertTrue(rankCheck(cArr).equals("straight"));
//	}
//
//	@Test
//	public void test2() { // flush
//		Card[] cArr = { new Card(1, "S"), new Card(2, "S"), new Card(3, "S"), new Card(4, "S"), new Card(5, "S") };
//		assertTrue(rankCheck(cArr).equals("flush"));
//	}
//
//	class Card {
//		static final int KIND_MAX = 4; // 카드 무늬의 수
//		static final int NUM_MAX = 13; // 무늬별 카드 수
//
//		static final int SPADE = 4;
//		static final int DIAMOND = 3;
//		static final int HEART = 2;
//		static final int CLOVER = 1;
//		int num;
//		String kind;
//
//		
//		Card(int num, String kind) {
//			this.num = num;
//			this.kind = kind;
//			String result = "";
//		
//			if (num==1) result = "Straight";
//			
//			
//		}
//
//	}
//
//}
