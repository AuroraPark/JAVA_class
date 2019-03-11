//워드 스크램블(word scramble)은 단어의 철자(spelling)을 섞어놓고 원래 단어를 맞추는 게임입니다.
//이 게임을 만들어가는 과정을 단계적으로 완성해나가는 것이 문제입니다.
//Java1000제에 들어갈 문제이며, Java1000제에서는 이러한 형식으로 처음부터 쉽게 단계적으로 점점 기능을 추가하고
//완성해 가는 방식으로 구성할 예정입니다.
//풀어보시고,... 좋은 의견이나 지적 언제나 환영합니다. *^^*
//
// 
//
//[문제1] 다음의 예제를 완성하시오.
//getAnswer(String[] strArr)는 배열strArr의 요소중의 하나를 임의로 골라서 반환한다.(Math.random()사용)
//getScrambledWord(String str)는 주어진 문자열 str의 각 문자의 순서를 뒤섞은 다음, 새로운 문자열로 반환한다.
//                                             (Math.random()사용)

package day12;

import java.util.Scanner;

public class WordScramble {
	public static void main(String[] args) {
		String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW" };
		Scanner sc = new Scanner(System.in);// 한번 생성해 놓고 재사용하면 되므로 반복문 밖으로 이동

//		System.out.println("Question:" + question);
//		System.out.println("Answer:" + answer);

//		[문제2] 다음의 예제에서 while문의 내부를 주석의 내용을 참고해서 완성하세요.
//		[문제3] 문제2의 예제를 변경해서, 문제를 맞추더라도 프로그램이 종료되지 않고 다음문제를 보여주도록 하세요.				
		// 문제를 맞추더라도 프로그램이 종료 X -- while문을 한번 더 사용
		// 문제를 틀리면 같은 문제를 맞을 때 까지 내줌
		while (true) { // 외부 프로그램
			String answer = getAnswer(strArr);
			String question = getScrambledWord(answer);
//			문제4] 실행결과를 잘 보고, 다음의 예제의 getHint메서드를 완성하세요.
//			String getHint(String answer, char[] hint) - 문제의 답의 일부를 보여주는 메서드
//			                                                             한번 틀릴 때마다 한글자씩 더 보여준다.
			char[] hint = new char[answer.length()];

			// hint를 '_'로 초기화 한다. 정답이 LOVE라면 hint는 "____"이 된다.
			for (int i = 0; i < hint.length; i++) {
				hint[i] = '_';
			}

			while (true) { // 내부 프로그램
				System.out.println("Question :" + question);
				System.out.print("Your answer is :");

				// 1. 화면을 통해 사용자의 입력을 받는다.(Scanner클래스 사용)
				String str = sc.nextLine().trim();

				// 2. 사용자가 q 또는 Q를 입력하면 프로그램을 종료한다.
				if (str.equalsIgnoreCase("q"))
//					break outer2;
					System.exit(0); // 프로그램을 종료시킨다.

				// 3. 사용자가 정답을 맞출때까지 반복하다가
				// 사용자가 정답을 맞추면, while문을 빠져나간다.
				// 정답을 맞춘다?
				if (str.equalsIgnoreCase(answer)) {
					System.out.println("정답입니다.");
//						break outer1;
					break;
				} else {
					System.out.println(str + "은/는 정답이 아닙니다. 다시 시도해보세요.");
//						break;
					System.out.println("Hint:" + getHint(answer, hint));
				}
			} // while
		} // outer while
	} // main

	public static String getAnswer(String[] strArr) {
		// 내용을 완성하세요.
		int index = (int) (Math.random() * strArr.length);
		return strArr[index];
	}

	public static String getScrambledWord(String str) {
		// [문제 1]내용을 완성하세요.
		// 1. 문자열을 받아온다.(문자열을 담을 배열을 만든다.)
		// 2. 문자열의 문자를 하나씩 배열에 담는다.
		// 매개변수 str에는 getAnswer의 리턴 값(answer)을 받아온다.
//		String question2 = "";
//		for (int i = 0; i < str.length(); i++) {
//			char[] question = str.toCharArray(); // String char[] 을 로 변환
//// 			3. 섞는다.
//			int idx = 0; // 임의의 값을 얻어 저장할 변수
//
//			for (int j = 0; j < question.length; j++) { // 글자의 길이 question배열의 j만큼 반복한다.
//				idx = (int) (Math.random() * question.length);
//
//				char tmp = question[i]; // 두 값을 바꾸는데 사용할 임시 변수
//				question[i] = question[idx]; // words의 글자의 i번째를 섞어준다.
//				question[idx] = tmp;
//
//			}
//
//			question2 = new String(question);
//
//		}
//		// 4. 반환한다.
//		return question2;

		// 개선코드
		char[] chArr = str.toCharArray();

		for (int i = 0; i < chArr.length; i++) {

			int idx = (int) (Math.random() * str.length());

			char tmp = chArr[i];
			chArr[i] = chArr[idx];
			chArr[idx] = tmp;
		}

		return new String(chArr);

	} // scramble(String str).

	public static String getHint(String answer, char[] hint) {
		int count = 0; // 힌트에 포함된 '_'의 개수

		// 1. 반복문을 이용해서 hint에 포함된 '_'의 개수를 센다.
		for (int i = 0; i < hint.length; i++) {
			if (hint[i] == '_')
				count++;
//			else
//				continue;
		}
		// 2. count의 값이 2보다 클 때만 정답의 한 글자를 hint에 넣는다.
		// 정답을 다 알려주는 상황이 되지 않게 하기 위함.
		// [주의] 반드시 이전 힌트 보다 한글자를 더 보여줘야함.
		// 예를 들어 정답이 "LOVE"이고 이전 힌트가 "L___"이었다면
		// 그 다음 힌트는 "L__E"또는 "L_V_" 와 같은 식이어야 한다.
		// Math.random()을 사용해서 정답의 한 글자를 골라서 힌트에 넣으면 된다.
//		char[] tmp = answer.toCharArray();
//		if (count > 2) {
//			// answer의 글자를 힌트에 넣기
//			// 일단 1개만 넣기
//			// 위에거에 1개 넣기
//			int idx = (int) (Math.random() * hint.length);
//			hint[idx] = tmp[idx];
//			// 한글자 추가 = count--;
//			count--;
//		}
		
		// 개선코드
		  if(count > 2) { 
              while(true) { 
                    int idx = (int)(Math.random()*answer.length()); 

                    if(hint[idx]=='_') { 
                          hint[idx] = answer.charAt(idx); // charAt()요소값가져오기
                          break;                   
                    } 
              } // while 
        } 


		
		
		return new String(hint);
	} // getHint()
}