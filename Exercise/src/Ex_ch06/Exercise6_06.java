/* 
 * getDistance - 두점 간의 거리를 구한다 
 * 제곱근 계산은 를 사용하면 된다 Math.sqrt(double a) .
 * 거리구하는 공식 :  Math.sqrt(a * a + b * b)
 * a = x끼리의 차
 * b = y끼리의 차
*/

package Ex_ch06;

public class Exercise6_06 {
	// 두 점 (x,y)와 (x1,y1)간의 거리를 구한다
	static double getDistance(int x, int y, int x1, int y1) { // 지역변수 x,y
	/*	(1) . 알맞은 코드를 넣어 완성하시오*/
		double a =x - x1;
		double b = y - y1;

		return Math.sqrt(a * a + b * b);
	}
	public static void main(String args[]) {
	System.out.println(getDistance(1,1,2,2));
	}

}
