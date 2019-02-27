/*  아래는 화씨(Fahrenheit) 를 섭씨(Celcius) 로 변환하는 코드이다 
 * 변환공식이 'C = 5/9 ×(F - 32)'라고 할 때 에 알맞은 코드를 넣으시오 
 * 단 변환 결과값은 소수점셋째자리에서 반올림해야한다 Math.round()를 사용하지 않고 처리할 것 .
 * */
package Ex_ch03;

public class Exercise3_07 {
	public static void main(String[] args) {
		int fahrenheit = 100;

		// 두번에 나눠서 형변환
		float celcius = 5 / 9f * (float) (fahrenheit - 32);
		float celcius2 = (int) (celcius * 100 + 0.5) / 100f;

		// 한번에 형변환
		float celcius3 = (int) ((5 / 9f * (fahrenheit - 32)) * 100 + 0.5) / 100f;

		// Math.random() 이용 하여 형변환
		double celcius4 = Math.round(celcius * 100) / 100.0;

		System.out.println("Fahrenheit:" + fahrenheit);
		System.out.println("Celcius:" + celcius);
		System.out.println("Celcius:" + celcius2);
		System.out.println("Celcius:" + celcius3);
		System.out.println("Celcius:" + celcius4);
	}
}