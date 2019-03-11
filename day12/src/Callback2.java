//
//
//interface Callback2 {
//	public void run(int i);
//}
//
//public class Callback {
//	public static void main(String[] args) {
//		ForIn(1, 5, i -> {
//			ForIn(1, 5, i -> {
//				System.out.println("*");
//			});
//			System.out.println();
//		});
//	}
//
//	private static void ForIn(int start, int end, Object callback) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public static void ForIn(int start, int end, Callback callback) {
//		if (start <= end) {
//			callback.run(start);
//			ForIn(start + 1, end, callback);
//		}
//	}
//}
