/* 메서드 추가하기
 * getTotal()과 getAverage()를 추가하시오
 * 1. 메서드명: getTotal 
	기 능 :국어(kor), 영어(eng), 수학 (math) 의 점수를 모두 더해서 반환한다    .
	반환타입 : int
	매개변수 없음 

	2. 메서드명: getAverage 
	기 능 :총점 (국어점수+영어점수+수학점수) 을 과목수로 나눈 평균을 구한다 
		소수점 둘째자리에서 반올림할 것.
	반환타입 : float
	매개변수 없음
 */
package Ex_ch06;

public class Exercise6_03 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름 :" + s.name);
		System.out.println("총점 :" + s.getTotal());
		System.out.println("평균 :" + s.getAverage());

		// 6-5 생성자 추가
		Student s2 = new Student("홍길동", 1, 1, 100, 60, 76);
		// 6-5 info()추가
		System.out.println(s2.info());
	}

}

class Student {
	String name; // 학생 이름
	int ban; // 반
	int no; // 번호
	int kor; // 국어점수
	int eng; // 영어점수
	int math; // 수학점수

	// 총점 구하는 메서드
	int getTotal() { // 국어점수 영어점수 수학점수 합
		return kor + eng + math;
	}

	float getAverage() { // 과목수로 나눈 평균을 구하되 소수점 둘째자리에서 반올림할것
		return Math.round(((float) (kor + eng + math) / 3f) * 10) / 10f;
	}

	// 6-5 생성자와 info()를 추가하시오.
	Student() {
	}

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	String info() {
		return this.name + ", " + this.ban + ", " + this.no + ", " + this.kor + ", " + this.eng
				+ ", " + this.math + ", " + this.getTotal() + ", " + this.getAverage();
	}

}