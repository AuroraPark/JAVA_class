// 코드 여기에 추가 - 답안

package oopTest;

// 1-1  두개의 정수 x, y를 저장하기 위한 인스턴스 변수가 선언된 Point클래스를 정의하시오.
public class Point {

	int x; // 원래 이름 this.x
	int y; // 원래 이름 this.y

//  1-7 Point 클래스의 equals()를 다음과 같은 조건으로 오버라이딩 하고 테스트  하시오
//
//  - 비교하는 객체가 Point객체가 아니면 false를 반환
//  - Point객체의 x와 y의 값이 같을 때만 true를 반환
	// 두점이 같으면 true,다르면 false
	// 같다는건, x와 비교 대상의 x가 같고, y와 비교 대상의 y가 같은 경우

	public boolean equals(Object obj) {
//	1. 비교하는 객체가 Point객체가 아니면 false를 반환
		if (!(obj instanceof Point))
			return false;

		// 형변환을 통해 사용할 수 있게 만든다!
		Point p = (Point) obj;

//	2. Point객체의 x와 y의 값이 같을 때만 true를 반환
		return this.x == p.x && this.y == p.y;
		// 간단하게 한줄로 쓸 수 있다.
//		if (this.x == p.x && this.y == p.y)
//			return true;
//		else
//			return false;
	}

//	1-3 Point클래스에 toString()을 오버라이딩 해서 x와 y의 값을 포함한 문자열을 반환 하도록 하시오.
//	PointTest클래스에서 Point객체를 생성한 다음, x와 y의 값을 3과 5로 초기화 하시오.
//	그리고 toString()을 호출해서 x와 y의 값을 출력하시오 .
	public String toString() {
		return "toString> x : " + this.x + ", y : " + this.y;
	}

//	 1-5 Point 클래스에 두 점 사이의 거리를 double 타입의 값으로 계산해서 
//	반환하는 static 메서드 getDistance(Point p1, Point p2)를 추가하시오.
//	public static double getDistance(int x1, int y1, int x2, int y2) { //를 묶은것
	public static double getDistance(Point p1, Point p2) { // cm
		int a = p1.x - p2.x;
		int b = p1.y - p2.y;

		return Math.sqrt(a * a + b * b);
	}

//	1-6 Point 클래스에 두 점 사이의 거리를 double타입의 값으로 계산해서 
//	반환하는  getDistance(Point p)를 추가하시오.
	double getDistance(Point p) { // im
//		double a = this.x - p.x;	
//		double b = this.y - p.y;
//
//		return Math.sqrt(a * a + b * b);

		return getDistance(this, p); // 내용이 같으면 (im -호출- cm)으로 중복 제거
	}

//	 1-4 Point 클래스에 x,y를 매개변수로 하는 생성자와 기본 생성자(x,y를 모두 1로 초기화)를 추가하시오. 
//	그 다음에 PointTest클래스에서 테스트 하시오.

	// 매개변수가 있는 생성자
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 기본생성자
	Point() {
//		x = 1;
//		y = 1;
		this(1, 1); // Point(1, 1)
	}

}

//	1-8 Point클래스를 상속받고 z를 인스턴스 변수로 갖는 Point3D 클래스를 작성하시오.
class Point3D extends Point {
	int z;

//	1-9 Point3D클래스에 생성자 Point3D(int x, int y, int z) 와 
//	기본 생성자 (x,y,z를 1로 초기화)를 추가하시오.
	Point3D() {
	//	Point3D(1,1,1); // 오류
		this(1, 1, 1);
	}

	Point3D(int x, int y, int z) {
		super(x, y); // 조상의 멤버는 조상의 생성자가 초기화 하게 한다.
		this.z = z;
	}

//  1-10 Point3D클래스의 toString()이 x,y,z 의 값을 
//	문자열로 반환하도록 오버라이딩 하시오.
	public String toString() {
//		return "toString> x : " + super.x + ", y : " + super.y + ", z : " + this.z;
//		// 중복 제거
		
		return super.toString() + ", z : " + this.z;	// 조상 거 가져다가 쓰기
	}
}

