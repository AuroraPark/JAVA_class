/*  아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
 * */
package Ex_ch03;

public class Exercise3_08 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
//		byte c = a + b; // 명시적 형변환 해줘야함
		byte c = (byte)(a + b);
		char ch = 'A';
//		ch = ch + 2;	// 명시적 형변환 해줘야함
		ch = (char)(ch + 2);
		float f = 3f / 2; // 형 지정 해줘야 함
		long l = 3000L * 3000 * 3000;
		float f2 = 0.1f;
		double d = 0.1f;
		boolean result = d == f2;
		System.out.println("c=" + c);
		System.out.println("ch=" + ch);
		System.out.println("f=" + f);
		System.out.println("l=" + l);
		System.out.println("result=" + result);
	}
}