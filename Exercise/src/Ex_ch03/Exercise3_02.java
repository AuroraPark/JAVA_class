/* 아래의 코드는 사과를 담는데 필요한 바구니 버켓 의 수를 구하는 코드이다 만일 ( ) .
사과의 수가 개이고 하나의 바구니에는 개의 사과를 담을 수 있다면 개의 바구니 123 10 , 13
가 필요할 것이다 */
package Ex_ch03;

public class Exercise3_02 {
	public static void main(String[] args) {
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기 (바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = ((0 == (numOfApples % sizeOfBucket)) ? numOfApples / sizeOfBucket
				: numOfApples / sizeOfBucket + 1); // 모든 사과를 담는데 필요한 바구니의 수
		// 개선 코드  : numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0))
		/*
		 * 중복되는 코드를 줄여준다.
		 * numOfApples/sizeOfBucket 가 중복
		 * 나머지가 있으면 1 나머지 없으면 추가 없음 (0)
		 * numOfApples/sizeOfBucket +(numOfApples%sizeOfBucket>0)? 1 : 0)
		 * 
		 */
		System.out.println(" :" + numOfBucket); // D // C
	}

}
