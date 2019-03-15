package Ex_ch11k;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

// 람다와 스트림을 사용해서

import java.util.Scanner;
import java.util.stream.Stream;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를입력하세요.>");
		int N = sc.nextInt();
		sc.nextLine();
		String[] line = new String[N];
		for (int i = 0; i < N; i++) {
//			System.out.print("단어를 입력하세요>");
			line[i] = sc.nextLine();
		}
		//배열로만들기
		ArrayList<String> lineArr = new ArrayList<String>(Arrays.asList(line));
		// 스트림으로 만들기
		Stream<String> lineStream = lineArr.stream();
		// 중복제거
		lineStream.distinct().sorted().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
		// 길이순 정렬
		// 글자순 정렬
	}
}
