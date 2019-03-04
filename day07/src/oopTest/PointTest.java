// 테스트

package oopTest;

//1-2
public class PointTest {

	public static void main(String[] args) {
		Point p = new Point(5,3);
		Point p2 = new Point(3,4);

		System.out.println(p.x);
		System.out.println(p.y);
		System.out.println(p.toString());
		System.out.println(Point.getDistance(p, p2));
		
		System.out.println(p.getDistance(p2));
		
		System.out.println("equals:"+p.equals(p2));

		Point3D p3 = new Point3D();
		System.out.println("p3.x : " + p3.x);
		System.out.println("p3.y : " + p3.y);
		System.out.println("p3.z : " + p3.z);
		System.out.println("p3.toString() : " +p3.toString());
	}

}
