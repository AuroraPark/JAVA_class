/* 다음 연산의 결과를 적으시오 */
package Ex_ch03;

public class Exercise3_01 {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // A의 문자코드는 65
														// 내 답			// 정답
		System.out.println(1 + x << 33);				// 3333			// 6
		// ▲ 모름
		System.out.println(y >= 5 || x < 0 && x > 2);	// false		// true
		// ▲ 모름
		System.out.println(y += 10 - x++);				// 7			// 13
		// ▲ 모름
		System.out.println(x+=2);						// 4			// 5
		// ▲ 모름
		System.out.println( !('A' <= c && c <='Z') );	// false		// false
		System.out.println('C'-c);						//				// 2	
		// ▲ 모름
		System.out.println('5'-'0');					// 5			// 5
		System.out.println(c+1);						// B			// 66
		System.out.println(++c);						// C			// B
		System.out.println(c++);						// C			// B
		System.out.println(c);							// D			// C
	}

}
