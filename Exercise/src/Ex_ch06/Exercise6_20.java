/* 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
	[주의]  Math.random()을 사용하는 경우 실행결과와 다를 수 있음	
	메서드명 : shuffle
	기 능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다 : .
	   처리한 배열을 반환한다.
	반환타입 : int[]
	매개변수: int[] arr - 정수값이 담긴 배열
*/

package Ex_ch06;

public class Exercise6_20 {
	/* (1)shuffle 메서드를 작성하시오. */
	static int[] shuffle(int[] arr) {
		// 유효성 체크
		// arr가 null 이거나 길이가 0인경우
		if(arr==null || arr.length==0)
			return arr;
		
		// 셔플하는 코드(Math.random()) 사용한다.
		for (int i = 0; i < arr.length; i++) {
//			int n = (int) (Math.random() * 9) + 1;
			// 개선 코드
			int n = (int) (Math.random() * arr.length);
			
			
			int tmp = arr[0];
			arr[0] = arr[n];
			arr[n] = tmp;
		}
		// 반환타입 int[]
		return arr;
	}

	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(java.util.Arrays.toString(original));

		int[] result = shuffle(original); // 객체 생성이 없으니 cm으로 만든다.
		System.out.println(java.util.Arrays.toString(result));

	}

}
