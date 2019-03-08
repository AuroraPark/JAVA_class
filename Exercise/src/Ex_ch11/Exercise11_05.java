//다음의 코드는 성적평균의 범위별로 학생 수를 세기 위한 것이다 
//TreeSet이 학생들의 평균을 기준으로 정렬하도록 
//compare(Object o1, Object o2)와 평균점수의 범위를 
//주면 해당 범위에 속한 학생의 수를 반환하는 getGroupCount() 를 완성하라
//[Hint] TreeSet의 subSet(Object from, Object to)를 사용

package Ex_ch11;

import java.util.*;

class Student implements Comparable {
	String name;
	int ban;
	int no;
	int kor, eng, math;

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public Student() {
	
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}

	// 다음에 제시된 Student클래스가 Comparable인터페이스를 구현하도록 변경해서
	// 이름(name) 이 기본 정렬기준이 되도록 하시오 .
	public int compareTo(Object o) {
		if (o instanceof Student) {
			Student tmp = (Student) o;

			return name.compareTo(tmp.name);
		} else {
			return -1;
		}
	}
} // class Student

class Exercise11_05 {
	static int getGroupCount(TreeSet tset, int from, int to) {
		/* (1) . 알맞은 코드를 넣어 완성하시오 */
		// subSet으로 나누기
		// tset의 각 범위에 속하는 ArrayList 개수 세기 - size()
		// 범위는 평균값인데 이걸 어떻게 가져올까?
		
		return tset.subSet(from, to).size();
	}

	public static void main(String[] args) {
		// TreeSet이 학생들의 평균을 기준으로 정렬
		// [Hint] TreeSet의 subSet(Object from, Object to)를 사용
		TreeSet set = new TreeSet(new Comparator() {
			public int compare(Object o1, Object o2) {
				/* (2) . 알맞은 코드를 넣어 완성하시오 */

				if (o1 instanceof Student && o2 instanceof Student) {
					Student s1 = (Student) o1;
					Student s2 = (Student) o2;
					// 객체의 평균으로 정렬
					return (s1.getAverage() < s2.getAverage() ? -1 : (s1.getAverage() == s2.getAverage() ? 0 : 1));
				} else {
					return -1;
				}

			}
		});

		set.add(new Student("홍길동", 1, 1, 100, 100, 100));
		set.add(new Student("남궁성", 1, 2, 90, 70, 80));
		set.add(new Student("김자바", 1, 3, 80, 80, 90));
		set.add(new Student("이자바", 1, 4, 70, 90, 70));
		set.add(new Student("안자바", 1, 5, 60, 100, 80));

		Iterator it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

		System.out.println("[60~69] :" + getGroupCount(set, 60, 70));
		System.out.println("[70~79] :" + getGroupCount(set, 70, 80));
		System.out.println("[80~89] :" + getGroupCount(set, 80, 90));
		System.out.println("[90~100] :" + getGroupCount(set, 90, 101));
	}
}
//
//class nameSort implements Comparator {
//	public int compare(Object o1, Object o2) {
//		// 이름이 정렬기준?
//		// ArrayList의 첫번째 값을 가지고와서 비교한다. (스트링 비교)
//		// ArrayList의 첫번째 값에는 어떻게 접근하지?
//		// Object get(int index)
//		// 비교하고 형변환한담에 get()
//
//		if (o1 instanceof ArrayList && o2 instanceof ArrayList) {
//			ArrayList a1 = (ArrayList) o1;
//			ArrayList a2 = (ArrayList) o2;
//			
//			if (a1.get(0) instanceof Comparable && a2.get(0) instanceof Comparable) {
//				Comparable c1 = (Comparable) a1.get(0);
//				Comparable c2 = (Comparable) a2.get(0);
//				return c1.compareTo(c2);
//			}
//		}
//
//		return -1;
//	}
//}
