// 쓰레드의 동기화 문제 
// [1] 동기화를 하지 않아서 생기는 문제
// ConcurrentModificaionException - 요리사가 음식을 놓는 도중에 손님이 음식을 가져가려 했을때
// IndexOutOfBoundsException	- 음수값
// [2] wait() & notify() 를 하지 않아서 생기는 문제
// 손님 쓰레드가 테이블 객체의 lock을 쥐고 기다리기 때문에
// 요리사 쓰레드가 table을 사용 불가 
// wait()으로 lock을 풀고 기다리다가 음식이 추가되면 notify()로 통보를 받고 다시
// 작업을 진행
// [3] Lock과 condition
// 손님쓰레드와 요리사 쓰레드의 notify 범위를 지정해줌 
// waiting을 좀 더 해소

package ch13;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
         
class Customer implements Runnable {
	private Table table;
	private String food;

	Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
			String name = Thread.currentThread().getName();

			table.remove(food);
			System.out.println(name + " ate a " + food);

//			if (eatFood())
//				System.out.println(name + " ate a " + food);
//			else
//				System.out.println(name + " failed to eat. :(");
		} // while
	}

//	boolean eatFood() {	return table.remove(food);}
}

class Cook implements Runnable {
	private Table table;

	Cook(Table table) {
		this.table = table;
	}

	public void run() {
		while (true) {
			// 임의의 요리를 하나 선택해서 table에 추가한다.
			int idx = (int) (Math.random() * table.dishNum());
			table.add(table.dishNames[idx]);

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		} // while문

	}
}

// 쓰레드 끼리 공유하는 클래스
class Table {
	String[] dishNames = { "donut", "donut", "burger" }; // 도넛이 더 많이 나온다.
	final int MAX_FOOD = 6; // 테이블에 놓을 수 있는 최대 음식의 개수

	private ArrayList<String> dishes = new ArrayList<>();

	// [3]lock추가
	private ReentrantLock lock = new ReentrantLock();
	private Condition forCook = lock.newCondition();
	private Condition forCust = lock.newCondition();

	// 동기화(synchronized를 추가)
//	public synchronized void add(String dish) {
	// [3] lock
	public void add(String dish) {
		lock.lock();
		try {
			// [2]wait() & notify()
			while (dishes.size() >= MAX_FOOD) {
				String name = Thread.currentThread().getName();
				System.out.println(name + "is waiting.");

				try {
//				wait(); // cook쓰레드를 기다리게한다.
					forCook.await(); // Cook쓰레드를 기다리게 한다.
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
			dishes.add(dish);
			forCust.signal();// notify(); // 기다리고 있는 CUST를 깨우기 위함.
			System.out.println("Dishes:" + dishes.toString());
		} finally {
			lock.unlock();
		}
//		// 테이블에 음식이 가득 찼으면 음식을 추가하지 않는다.
//		if (dishes.size() >= MAX_FOOD)
//			return;
	}

//	public boolean remove(String dishName) {
	public void remove(String dishName) {
		// [3]lock
		lock.lock();
		// [1]synchronized
//		synchronized (this) {
		String name = Thread.currentThread().getName();

		try {
			while (dishes.size() == 0) {
				System.out.println(name + " is waiting. ");
				try {
					forCust.await(); // wait(); // CUST쓰레드를 기다리게 한다.
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}

			while (true) {
				// 1번 코드
				// 지정된 요리와 일치하는 요리를 테이블에서 제거한다.
				for (int i = 0; i < dishes.size(); i++) {
					if (dishName.equals(dishes.get(i))) {
						dishes.remove(i);
						forCook.signal(); // notify(); 잠자고있는 COOK을 깨움
						return;
					}
				} // for문의 끝

				try {
					System.out.println(name + " is waiting.");
					forCust.await(); // wait(); // cook쓰레드를 기다리게한다.
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			} // while(true)
				// } // synchronized
		} finally {
			lock.unlock();
		}
//			 return false;
	}

	public int dishNum() {
		return dishNames.length;
	}
}

class ThreadWait {
	public static void main(String[] args) throws Exception {
		Table table = new Table(); // 여러쓰레드가 공유하는 객체

		new Thread(new Cook(table), "COOK1").start();
		new Thread(new Customer(table, "donut"), "CUST1").start();
		new Thread(new Customer(table, "burger"), "CUST2").start();

		Thread.sleep(2000); // 2초 후에 강제 종료된다.
		System.exit(0);

	}
}
