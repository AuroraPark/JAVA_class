package Ex_ch06;

class MyPoint {
	int x;	// 인스턴스 변수
	int y;	// 인스턴스 변수

	MyPoint(int x, int y) {
		this.x = x;	
		this.y = y;
	}
	/* (1) getDistance . 인스턴스메서드 를 작성하시오 */
	// 인스턴스 메서드(im)은 iv를 사용한다.
	double getDistance(int x, int y) { // 지역변수 x,y
		/*	(1) . 알맞은 코드를 넣어 완성하시오*/
			double a = this.x - x;	// 인스턴스 변수사용 - this.x 
			double b = this.y - y; // 인스턴스 변수사용 - this.y 

			return Math.sqrt(a * a + b * b);
		}
}

class Exercise6_7 {
	public static void main(String args[]) {
		MyPoint p = new MyPoint(1, 1);
		// p (2,2) . 와 의 거리를 구한다
		System.out.println(p.getDistance(2, 2));
	}
}