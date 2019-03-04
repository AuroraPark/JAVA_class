// 코드 여기에 추가

package oopTest;

// 1-1
public class Point {

	int x;
	int y;

	// 1-3
	public String toString() {
		return "toString> x : " + this.x + ", y : " + this.y;
	}

	// 1-4
	Point() {
		this(1, 1);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 1-5
	public static double getDistance(Point p1, Point p2) {
		double a = p1.x - p2.x;
		double b = p1.y - p2.y;

		return Math.sqrt(a * a + b * b);
	}

	// 1-6
	double getDistance(Point p) {
		double a = this.x - p.x;	
		double b = this.y - p.y;

		return Math.sqrt(a * a + b * b);
	}

	// 1-7
	
	// 두점이 같으면 true,다르면 false
	// 같다는건, x와 비교 대상의 x가 같고, y와 비교 대상의 y가 같은 경우
	
public boolean equals(Object obj) {
		// obj를 이용해서 p2의 x,y를 출력
		// p2 의 주소를 참조변수를 통해 가져온다. (X) 형변환 필요
		// Object (참조형) 의 매개변수 obj
		// obj 는 Point(x,y) 형변환 필요
		// p.equals 는 
		int a =((Point)obj).x;
		int b =((Point)obj).y;
		
		if (obj instanceof Point) {
			// Point 객체인지 
			if (this.x ==  a) {
				if(this.y == b) {
				return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}

//1-8
class Point3D extends Point {
	int z;

	// 1-9
	Point3D() {
		this(1, 1, 1);
	}

	Point3D(int x, int y, int z) {

		this.z = z;
	}

	// 1-10
	public String toString() {
		return "toString> x : " + super.x + ", y : " + super.y + ", x : " + this.z;
	}
}


/* 오브젝트 클래스의 메서드 오버라이딩
public boolean equals(Object obj)
Public String toString()
*/