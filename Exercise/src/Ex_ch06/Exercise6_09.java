/* 다음은 컴퓨터 게임의 병사(marine) 를 클래스로 정의한 것이다 
 * 이 클래스의 멤버 중에 을 static붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가  ?
 * 
 * 단 모든 병사의 공격력과 방어력은 같아야 한다
*/


package Ex_ch06;

public class Exercise6_09 {
	class Marine {
		int x = 0, y = 0; // Marine (x,y) 의 위치좌표
		int hp = 60; // 현재 체력
//		static int weapon = 6; // 공격력	// 모든 병사의 공격력과 방어력 동일
//		static int armor = 0; // 방어력

		/* static 붙일 수 있는 것 : 멤버변수와 메서드, 초기화 블럭
		 * weaponUp(), armorUp() - static변수에 대한 작업을 하는 메서드이므로
		 */
//		static void weaponUp() {	// 
//			weapon++;
//		}
//
//		static void armorUp() {
//			armor++;
//		}

		void move(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}
