/*이클립스에서 문자열 받기
 * [Run] - [Run Configuration] - [Arguments] 탭
 * 
 */


package ch05;

class ArrayEx16 {
	public static void main(String[] args) {
		System.out.println("매개변수의 개수:"+args.length);

		for(int i=0;i< args.length;i++) {
			System.out.println("args[" + i + "] = \""+ args[i] + "\"");
		}
	}
}
