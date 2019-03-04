// 테스트 - 답안

package oopTest;

//1-2  앞서 정의한 Point클래스를 테스트 하기위한
// PointTest 클래스를 작성하고, 
// Point객체를 생성하는 코드를 작성하시오.
public class PointTest {

	public static void main(String[] args) {
		// 2
//		Point p = new Point();
//		p.x = 5;
//		p.y = 3;
		
		// 4
		Point p = new Point();
		Point p2 = new Point(0,0);
		Point3D p3 = new Point3D(1,3,2);
		
		System.out.println(p);
		// 3 테스트
		System.out.println(p.toString());
		// 5 테스트 - 클래스 메서드(cm) / 클래스이름.메소드
		// p와 p2의 거리를 계산
		System.out.println(Point.getDistance(p, p2));
		// 6 테스트 - 인스턴스 메서드(im)
		// p와 p2의 거리를 계산(나하고 p2)
		System.out.println(p.getDistance(p2));
		// 7 테스트
		System.out.println(p.equals(p2));
		// Point3D
		System.out.println(p3.toString());
	}
}
