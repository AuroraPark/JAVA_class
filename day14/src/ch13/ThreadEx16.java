package ch13;

import javax.swing.JOptionPane;

public class ThreadEx16 {
	public static void main(String[] args) {
		RunImplEx16 r1 = new RunImplEx16();
		RunImplEx16 r2 = new RunImplEx16();
		RunImplEx16 r3 = new RunImplEx16();
		Thread th1 = new Thread(r1, "*");
		Thread th2 = new Thread(r2, "**");
		Thread th3 = new Thread(r3, "***");
		th1.start();
		th2.start();
		th3.start();

		try {
			Thread.sleep(2000);
			r1.suspend();
			Thread.sleep(2000);
			r2.suspend();
			Thread.sleep(3000);
			r1.resume();
			Thread.sleep(3000);
			r1.stop();
			r2.stop();
			Thread.sleep(2000);
			r3.stop();
		} catch (InterruptedException e) {
		}
	}
}

class RunImplEx16 implements Runnable {
	// 잘안되면 volatile 사용
//	volatile boolean suspended = false; // iv 변수 이용
//	volatile boolean stopped = false;
	boolean suspended = false; // iv 변수 이용
	boolean stopped = false;

	public void run() {
		while (!stopped) {
			if (!suspended) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		}
		System.out.println(Thread.currentThread().getName() + " - stopped");
	}

	public void suspend() {
		suspended = true;
	}

	public void resume() {
		suspended = false;
	}

	public void stop() {
		stopped = true;
	}

}