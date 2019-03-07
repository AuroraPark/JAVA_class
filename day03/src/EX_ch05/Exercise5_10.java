/*
 *  다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
	(1)에 알맞은 코드를 넣어서 완성하시오
 */
package EX_ch05;

public class Exercise5_10 {
	public static void main(String[] args) {
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' };

		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };

		String src = "abc123";
		String result = "";

		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);

			/* (1) . 알맞은 코드를 넣어 완성하시오 */
			// 문자 ch를 숫자로 변환
			
			if ((ch - 'a') < 97 ) { // a보다 큰 문자가 오면
				for (int j = 0; j < abcCode.length; j++) {
					if (j == (ch - 'a')) {
						result += abcCode[j]; // 결과에 더해준다.
					}
				}
			} else { // a보다 작은 문자가 오면  // 틀림!!!!!!!!!!!!!!!!!!!!!!!!!!!1
				for (int j = 0; j < numCode.length; j++) {
					if (j == (ch - 'a')) 
						result += numCode[j]; // 결과에 더해준다.
				}
			}

		}

		System.out.println("src:" + src);
		System.out.println("result:" + result);
	} // end of main
} // end of class
