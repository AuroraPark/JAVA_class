//이번 문제는 도스창과 같은 콘솔어플리케이션을 만들어보는 것입니다. 도스창 처럼 명령어를 입력하면
//명령어가 실행된 결과를 화면에 보여주는 텍스트 기반의 어플리케이션입니다.(text-based application)
//[문제1] 에제를 실행하면 '>>'와 같은 프롬프트가 나타나서 사용자의 입력을 기다리고,
//            사용자가 입력한 내용을 화면에 출력한다. 만일 사용자가 'q' 또는 'Q'를 입력하면 프로그램을 종료한다.
//            다음의 예제를 완성하세요.

//[문제2] 사용자가 입력한 명령라인을 공백(' ')을 구분자로 해서 잘라서 배열에 저장한 다음에
//           배열의 내용을 출력하는 예제. 코드를 완성하세요.

//[문제3] 사용자가 입력한 명령라인의 내용을 저장하는 save(String input)메서드와 사용자가 입력한
//             명령라인의 이력을 보여주는 history()메서드를 완성하세요

//[문제4] 사용자 입력을 받는 프롬프트에 현재 작업중인 폴더(디렉토리)의 경로를 표시하는 예제의 코드를 완성하세요.

package day12;

import java.util.*;
import java.io.*;

public class console {
	static String[] argArr; // 입력한 매개변수를 담기위한 문자열배열
	static LinkedList q = new LinkedList(); // 사용자가 입력한 내용을 저장할 큐(Queue)
	static final int MAX_SIZE = 5; // q(큐)에 저장될 수 있는 값의 개수

	static File curDir; // 현재 디렉토리

	static {
//       * 다음의 코드를 완성하세요.
//		 * 1. 시스템속성 "user.dir"값을 읽어서 File객체를 만들고, curDir에 할당하세요.

//		 * 2. 1의 코드를 간단히 예외처리하세요.

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

//		while (true) {
//			try {
//				String prompt = curDir.getCanonicalPath() + ">>";
		  while(true) { 
              String prompt = ">>"; 


				System.out.print(prompt);

				/*
				 * 다음과 같은 내용의 코드를 넣으세요. 1. 화면으로부터 라인단위로 입력받는다. - java.util.Scanner클래스 사용 2. q 또는
				 * Q를 입력하면 실행종료한다.
				 */
				String input = s.nextLine();

				save(input);

				// 다음의 코드를 완성하세요.
				// 1. 입력받은 값에서 앞뒤 공백을 제거한다. (String클래스의 trim()사용)
				input = input.trim();
//			  2. 입력받은 명령라인의 내용을 공백을 구분자로 해서 나눠서 argArr에 담는다. 
//			    String클래스의 split(String regex)를 사용 - 
//			공백이 하나 이상인 경우에도 하나의 공백으로 간주해야함 실행결과를 주의깊게 확인하세요.

				argArr = input.split(" +"); // 공백 정규식 "+" 를 붙여준다.

				String command = argArr[0].trim();

				if ("".equals(command))
					continue;

				command = command.toLowerCase(); // 명령어를 소문자로 바꾼다.

				if (command.equalsIgnoreCase("q")) { // q 또는 Q를 입력하면 실행종료한다.
					System.exit(0);
				} else if (command.equals("history")) { // equalsIgnoreCase대신 equals를 사용.
					history();
				} else {
					for (int i = 0; i < argArr.length; i++) {
						System.out.println(argArr[i]);
					}
				}
				/*
				 * 위의 코드를 향상된 for문으로 변경하면 다음과 같다. for(String arg : argArr) {
				 * System.out.println(arg); }
				 */
//			} catch (Exception e) {
//				System.out.println("입력오류입니다.");
//
//			} // try-catch문

		} // while

	} // main

	public static void save(String input) {
		if (input == null || "".equals(input))
			return;

//		 * 다음의 코드를 완성하세요.
//		 * 1. queue에 저장한다. 
		q.add(input); // queue에 저장한다.

//		  2. queue의 최대크기(MAX_SIZE)를 넣으면 제일 오래된 저장값을 삭제한다.
		// Queue 의 최대 크기를 넘으면 제일 처음 입력된 것을 삭제한다.
		if (((LinkedList) q).size() > MAX_SIZE)
			q.remove();

	}

// 사용자가 입력한 최근 명령을 보여주는 메서드
	public static void history() {
		int i = 0;
//		 * 다음의 코드를 완성하세요. 
//		1. LinkedList에 저장된 내용(최근 MAX_SIZE개의 명령어)을 보여준다.
		// LinkedList의 내용을 보여준다.
		ListIterator it = q.listIterator();

		while (it.hasNext()) {
			System.out.println(++i + "." + it.next());
		}

	}

} // class
