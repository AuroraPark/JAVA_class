package ch11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Properties;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx1 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // Queue에 최대 5개 까지만 저장
	static Properties sysProp = System.getProperties();

	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

		while (true) {
			System.out.print(">>");
			try {
				// 화면으로부터 라인단위로 입력받는다.
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim(); // 공백 제거

				if ("".equals(input))
					continue; // 공백이면 다시 진행

				if (input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여줍니다.");
					System.out.println(" q 또는 Q - 프로그램을 종료합니다. ");
					System.out.println(" history - 최근에 입력한 명령어를" + MAX_SIZE + "개 보여줍니다.");

					// date출력
					System.out.println(" date - 오늘 날짜를 보여줍니다.");
					// 현재 dir 위치
					System.out.println(" dir - 현재 폴더 위치를 보여줍니다.");
					// output
					System.out.println(" output - 현재 history를 txt파일로 내보냅니다.");

				} else if (input.equalsIgnoreCase("date")) { // 오늘 날짜
					int i = 0;// 입력받은 명령어를 저장하고,
					save(input);

					System.out.println(LocalDate.now());

				} else if (input.equalsIgnoreCase("dir")) { // 현재 폴더 위치
					int i = 0;// 입력받은 명령어를 저장하고,
					save(input);

					// user.dir
					System.out.println(sysProp.getProperty("user.dir"));

				} else if (input.equalsIgnoreCase("history")) {
					int i = 0;// 입력받은 명령어를 저장하고,
					save(input);

					// LinkedList의 내용을 보여준다.
					LinkedList tmp = (LinkedList) q;
					ListIterator it = tmp.listIterator();

					while (it.hasNext())
						System.out.println(++i + "." + it.next());

				} else if (input.equalsIgnoreCase("output")) { // history를 파일으로 저장
					LinkedList tmp = (LinkedList) q;
					ListIterator it = tmp.listIterator();

					
					try {
						((Properties) it).store(new FileOutputStream("history.txt"), "Queue Example");
					} catch (IOException e) {
						e.printStackTrace();
					}
				} else {
					save(input);
					System.out.println(input);
				} // if(input.equalsIgnoreCase("q")) {

			} catch (Exception e) {
				System.out.println("입력 오류입니다.");
			}
		} // while(true)

	} // main

	public static void save(String input) {
		// queue에 저장한다.
		if (!"".equals(input)) {
			q.offer(input);
		}

		// Queue 의 최대 크기를 넘으면 제일 처음 입력된 것을 삭제한다.
		if (q.size() > MAX_SIZE) // size()는 Collection인터페이스에 정의
			q.remove();
	}

}// end of class
