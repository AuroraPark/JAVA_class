/** 
 * 다음의 문장들을 조건식으로 표현하라.
1. int형 변수 x가 보다 10크고 20보다 작을 때 true인 조건식
2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
3. char형 변수 ch가 ‘x'또는 ’X'일 때 true인 조건식
4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식 
5. char형 변수 ch가 영문자 (대문자 또는 소문자) 일 때 true인 조건식
6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지
않을 때 true인 조건식 
7. boolean형 변수 powerOn가 false일 때 true인 조건식
8. str문자열 참조변수 이 “yes”일 때 true인 조건식
 */

package Ex_ch04;

public class Exercise4_01 {
	public static void main(String[] args) {
		int x = 0;
		char ch = ' ';
		int year = 0;
		boolean powerOn = true;
		String str = "";
		boolean result = false;
		
		//1
		if(10 < x && x < 20)	result = true;
		//2
		if(ch != ' '|| ch !='\t') result = true;
		//3
		if(ch == 'x' || ch == 'X') result = true;
		//4
		if('0' <= ch || ch <= '9') result = true;
		//5
		if('a' <= ch && ch <= 'z' || ch >= 'A' && ch <= 'Z') result = true;
		//6
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) result = true;
		//7
		if(powerOn==false) result = true;
	//	if(!powerOn) result = true;
		//8
		if(str=="yes") result = true;
// 개선 코드 : str.equals("yes") or "yes".equals(str)
	}

}
