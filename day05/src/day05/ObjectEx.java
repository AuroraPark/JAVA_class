package day05;

class Point extends Object {
	int x;
	int y;

	Point() {
	}

	static int Point(int x, int y) {
		return x + y;
	}
}

public class ObjectEx {
	public static void main(String[] args) {
		Point p = new Point();

		p.x = 10;
		System.out.println(p.x);
	}
}
