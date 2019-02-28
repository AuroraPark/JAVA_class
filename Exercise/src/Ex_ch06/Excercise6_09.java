package Ex_ch06;

class Marine {
	int x = 0, y = 0; // Marine (x,y) 의 위치좌표
	int hp = 60; // 현재 체력
	int weapon = 6; // 공격력
	int armor = 0; // 방어력

	void weaponUp() {
		weapon++;
	}

	void armorUp() {
		armor++;
	}

	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Excercise6_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
