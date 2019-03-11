//이번 예제는 성적처리 프로그램을 만드는 것입니다. 총점계산, 반등수, 전교등수, 반, 번호별 정렬을 다룹니다.
//[문제1] 다음의 예제에서 Student클래스를 작성하세요.

//[문제2] Student클래스가 Comparable인터페이스를 구현해서, list를 총점(total) 내림차순으로 정렬되도록 하는 예제입니다.

//[문제3] list를 다양한 기준으로 정렬하기 위해 Comaprator를 구현한 클래스를 구현하세요.
//           ClasstotalComparator - 반별로 총점이 높은 순에서 낮은 순으로 정렬(반은 오름차순, 총점은 내림차순)
//           ClassStudentNo - 반, 번호 순으로 내림차순 정렬

//[문제4] 총점으로 전교등수를 계산하고 총점이 높은 순에서 낮은 순(내림차순)으로 정렬해서 list를 출력하세요.
//        전교등수를 저장할 수 있도록 Student클래스에 인스턴스변수 schoolRank가 추가되어 있습니다.
//         calculateSchoolRank(List<Student> list) - 전교등수(schoolRank)를 계산한다.

//[문제6] 데이터를 적절한 크기에 맞춰 정렬하는 format메서드를 완성하고,  이 메서드를 이용해서
//           화면에 데이터를 실행결과와 같이 줄맞춰 출력하세요.
//           String format(String str, int length, int alignment) - 주어진 문자열(str)을 지정된 길이(length)에 맞게
//                                                                          정렬(alignment)한다.
//           예를 들어 format("이름", 6, CENTER)의 결과는 "  이름  "이 된다.

package day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SungJuk {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();

		// 이름, 반, 번호, 국어, 수학, 영어
		list.add(new Student("남궁성", 3, 2, 100, 100, 100));
		list.add(new Student("왕자바", 3, 1, 90, 100, 80));
		list.add(new Student("자바왕", 3, 3, 70, 100, 100));
		list.add(new Student("킹왕짱", 1, 2, 100, 60, 90));
		list.add(new Student("자바짱", 1, 1, 100, 100, 100));
		list.add(new Student("최고수", 1, 3, 100, 80, 60));
		list.add(new Student("홍길동", 2, 1, 50, 80, 100));
		list.add(new Student("일지매", 2, 3, 70, 80, 100));
		list.add(new Student("변강쇠", 2, 4, 80, 80, 85));
		list.add(new Student("이원구", 2, 2, 90, 90, 90));

		calculateSchoolRank(list); // 전교등수를 계산한다.
		calculateClassRank(list); // 반등수를 계산한다.

//		System.out.println("[반별 총점높은 순으로 정렬]");
//		Collections.sort(list, new ClasstotalComparator()); // 반, 총점 순으로 정렬
//		printList(list);
//
//		System.out.println();
//
//		System.out.println("[반, 번호 순으로 정렬]");
//		Collections.sort(list, new ClassStudentNoComparator()); // 반, 번호 순으로 정렬
		printList(list);

	}

	public static void printList(List<Student> list) {
		System.out.println("이름\t반\t번호\t국어\t수학\t영어\t총점\t전교등수\t반등수");
		System.out.println("===============================================================");

		for (Student s : list) {
			System.out.println(s);
		}

		System.out.println("===============================================================");
	}

//	[문제 5] 총점으로 전교등수를 계산하고 총점이 높은 순에서 낮은 순(내림차순)으로 정렬해서 list를 출력하세요.
//  전교등수를 저장할 수 있도록 Student클래스에 인스턴스변수 schoolRank가 추가되어 있습니다.
//   calculateSchoolRank(List<Student> list) - 전교등수(schoolRank)를 계산한다.
	public static void calculateSchoolRank(List<Student> list) {
		Collections.sort(list); // 먼저 list를 총점기준 내림차순으로 정렬한다.

		int prevRank = -1; // 이전 전교등수
		int prevtotal = -1; // 이전 총점
		int length = list.size();
		// 카운트 변수 사용
//		int count = 1; // 동점자 수
//            list가 이미 총점순으로 정렬되어 있기 때문에... 이전 데이터하고만 총점을 비교하면 된다.
//            다음의 코드를 완성하세요.
//
//             1. 반복문을 이용해서 list에 저장된 Student객체를 하나씩 읽는다.
		for (int i = 0; i < length; i++) {
			// total 을 어떻게 가지고오지?
			// list의 get 메서드로 가져온다.
			Student st = list.get(i);

//			1.1 총점(total)이 이전총점(prevtotal)과 같으면
			if (st.total == prevtotal) {
//              이전 등수(prevRank)를 등수(schoolRank)로 한다.
				st.schoolRank = prevRank;
			} else {
//				 1.2 총점이 서로 다르면,
//               등수(schoolRank)의 값을 알맞게 계산해서 저장한다.
//               이전에 동점자 였다면, 그 다음 등수는 동점자의 수를 고려해서 계산되어야한다.
//               (실행결과 화면 참고)
				// 앞에 total과 같으면 rank도 같다?
				// 크면 등수를 i+1부터 다시시작
				st.schoolRank = i + 1;
			}
			prevRank = st.schoolRank;
			prevtotal = st.total;
//          1.3 현재 총점과 등수를 이전총점(prevtotal)과 이전등수(prevRank)에 저장한다.

		} // for문 끝
	} // public static void calculateSchoolRank(List<STUDENT> list) {

	public static void calculateClassRank(List<Student> list) {
		Collections.sort(list, new ClassTotalComparator()); // 먼저 반별 총점기준 내림차순으로 정렬한다.

		int prevClassNo = -1;
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();

//		 * list가 이미 정렬되어 있기 때문에... 이전 데이터하고만 총점과 반을 비교하면 된다.
//		 * 다음의 코드를 완성하세요.
//		 * 1. 반복문을 이용해서 list에 저장된 Student객체를 하나씩 읽는다.
		// 개선코드
		for (int i = 0, n = 0; i < length; i++, n++) {
			Student st = list.get(i);
//		 * 1.1 반이 달라지면,(classNo와 prevClassNo가 다르면)
			if (st.classNo != prevClassNo) {
//		 * 이전등수(prevRank)와 이전총점(prevTotal)을 초기화 한다.
				prevRank = -1;
				prevTotal = -1;
				n = 0;

			}
//		 * 1.1 총점(total)이 이전총점(prevTotal)과 같으면
			if (st.total == prevTotal) {
//		 * 이전 등수(prevRank)를 등수(schoolRank)로 한다.
				st.schoolRank = prevRank;
//		 * 1.2 총점이 서로 다르면,
			} else {
//		 * 등수(schoolRank)의 값을 알맞게 계산해서 저장한다.
//		 * 이전에 동점자 였다면, 그 다음 등수는 동점자의 수를 고려해서 계산되어야한다.
				st.schoolRank = n + 1;
			}

//			* (실행결과 화면 참고)
//		 * 1.3 현재 반과 총점과 등수를 이전반(prevClassNo)와 이전총점(prevTotal)과 이전등수(prevRank)에 저장한다.
			prevClassNo = st.classNo;
			prevRank = st.schoolRank;
			prevTotal = st.total;
		} // for문 끝
	} // public static void calculateClassRank(List<Student> list) {

}

class Student implements Comparable<Student> {
//            코드를 완성하세요.
//      1.  이름(name), 반(classNo), 번호(studentNo),
//         국어(Korean), 수학(Math), 영어(English), 총점(total)을
//         인스턴스변수로 선언한다.

	final static int LEFT = 0;
	final static int CENTER = 1;
	final static int RIGHT = 2;

	String name = "";
	int classNo = 0;
	int studentNo = 0;
	int koreanScore = 0;
	int mathScore = 0;
	int englishScore = 0;

	int total = 0;

	int schoolRank = 0; // 전교등수

	int classRank = 0; // 반등수

	Student() {

	}

//   2. 이름, 반, 번호, 국어, 수학, 영어를 입력받아서 각 인스턴스변수에 저장하는
//        생성자를 선언한다.
	Student(String name, int classNo, int studentNo, int Korean, int Math, int English) {
		this.name = name;
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.koreanScore = Korean;
		this.mathScore = Math;
		this.englishScore = English;

		total = Korean + Math + English;
	}

//   3. Object클래스의 toString()을 오버라이딩해서 실행결과와 같이,
//       이름, 반, 번호, 국어, 수학, 영어, 총점이 화면에 출력되도록 한다.
	public String toString() {
//		return name + "\t" + classNo + "\t" + studentNo + "\t" + koreanScore + "\t" + mathScore + "\t" + englishScore
//				+ "\t" + total + "\t" + schoolRank;
		return format(name, 5, LEFT) + format("" + classNo, 4, RIGHT) + format("" + studentNo, 4, RIGHT)
				+ format("" + koreanScore, 6, RIGHT) + format("" + mathScore, 6, RIGHT)
				+ format("" + englishScore, 6, RIGHT) + format("" + total, 8, RIGHT) + format("" + schoolRank, 8, RIGHT)
				+ format("" + classRank, 8, RIGHT);

	}

	public int compareTo(Student obj) {
		/* 이전 결과와는 달리, 총점이 높은순서에서 낮은 순서로 내림차순 정렬되어있음을 확인하세요. */
//		int thisScore = this.total;
//		int anotherScore = obj.total;
//
//		return (thisScore > anotherScore ? -1 : (thisScore == anotherScore ? 0 : 1));

		// 개선 코드
		return obj.total - this.total;
//      return this.name.compareTo(obj.name); // 이름기준으로 오름차순 정렬 
	}

	/*
	 * 제네릭스(Generics) 사용하지 않은 버젼 public int compareTo(Object obj) { int result = -1;
	 * 
	 * if(obj instanceof Student) { Student tmp = (Student)obj;
	 * 
	 * result = tmp.total - this.total; }
	 * 
	 * return result; }
	 */
	public static String format(String str, int length, int alignment) {
		if (str == null)
			str = "";
		int diff = length - str.length();
		// 주어진 문자열(str)의 길이보다 length의 값이 작으면 str를 length만큼만 남기고 잘라낸다.
		// 예를 들어, str이 "012345"이고, length가 3이면 결과는 "012"가 된다.
		if (diff < 0)
			return str.substring(0, length);

		char[] source = str.toCharArray();
		char[] result = new char[length];

		// 배열 result를 공백으로 채운다.
		for (int i = 0; i < result.length; i++)
			result[i] = ' ';
//		 * 다음의 코드를 완성하세요.
//		 * 1. 조건문을 이용해서 alignment의 값에 따라 다르게 처리한다.
//		 * (배열간의 복사에는 System.arraycopy()를 사용한다.)
//		 * 1.1 alignment의 값이 CENTER - 1일 때,
		if (alignment == 1) {
//		 * source의 내용이 result의 가운데 복사되도록 한다.
			result = System.arraycopy(result, 1, source, length, 0);
//		 * 1.2 alignment의 값이 RIGHT - 2일 때,
		} else if (alignment == 2) {

			result = System.arraycopy(result, 1, source, length, 0);
//		 * source의 내용의 끝이 result의 오른쪽 끝에 붙게 복사되도록 한다.

//		 * 1.3 alignment의 값이 LEFT - 0  또는 그 밖의 값 일 때
		} else {

			result = System.arraycopy(result, 1, source, length, 0);
		}
//					
//		 * source의 내용을 result의 왼쪽끝 부터 복사되도록 한다

		return new String(result);
	}

} // end of class Student

//[반별 총점높은 순으로 정렬]
class ClassTotalComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		// 코드를 완성하세요.
		// 1. 반별로 정렬한다.
		int result = s1.classNo - s2.classNo;
		// 반이 같으면
		if (result == 0) {
			result = (s1.total - s2.total) * -1;
		}
		// 2. 총점로 정렬
		return result;
	}
}

//[반, 번호 순으로 정렬]
class ClassStudentNoComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		// 코드를 완성하세요.
		// 1. 반별로 정렬한다.
		int result = s1.classNo - s2.classNo;

		// 반이 같으면
		// 2. 번호 순으로 정렬한다.
		if (result == 0) {
			result = (s1.studentNo - s2.studentNo);
		}
		return result;
	}
}