package ch13;

public class ThreadEx1 {
	public static void main(String args[]) {
		ThreadEx1_1 t1 = new ThreadEx1_1(); //Thread의 자손 클래스의 인스턴스를 생성

		Runnable r = new ThreadEx1_2();  // Runnable 을 구현한 클래스의 인스턴스를 구현
		Thread t2 = new Thread(r); // 생성자 Thread(Runnable target)
//		Thread t2 = new Thread(new ThreadEx1_2());  //위의 두 줄을 한줄로 간단히
		
		
		t1.start();
		t2.start();
	}
}

// 작업 1
class ThreadEx1_1 extends Thread {
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName());// 조상인 Thread의 getName()을 호출
		}
	}
}

// 작업 2
class ThreadEx1_2 implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			// Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
			System.out.println(Thread.currentThread().getName());// 조상인 Thread의 getName()을 호출
		}
	}
}