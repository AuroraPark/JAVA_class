// 실행 결과를 예측 하여 적으시오
// 그림 그려보기

package Ex_ch06;

public class Exercise6_19 {
	public static void change(String str) { //참조형
		str += "456";
	}

	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change:" + str);	// ABC123
	}
}
