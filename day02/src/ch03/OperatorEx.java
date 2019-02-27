package ch03;

public class OperatorEx {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
//		byte c = a + b;	// 연산 결과는 int 형이기 때문에 byte에 넣을 때 오류발생
		byte c = (byte) (a + b);	// 명시적 형변환 - 괄호 없으면 단항인 a의 형변환이 먼저됨
		System.out.println(c);
	}

}
