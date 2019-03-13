package ch13;

import javax.swing.JOptionPane;

public class MultiThread {
	public static void main(String[] args) throws Exception {
		MultiThread_1 th1 = new MultiThread_1();
		th1.start();

		String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");

	}
}

class MultiThread_1 extends Thread {
	public void run() {

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // 1초 시간을 지연한다.
			} catch (Exception e) {

			}

		} // run 끝
	}
}
