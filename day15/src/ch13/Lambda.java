// 람다 식을 이용하여  변수처럼 메서드를 주고받기.


package ch13;

@FunctionalInterface
interface MyFunction {
	void run(); // public abstract void run();
}

class Lambda {
	static void excute(MyFunction f) { // 매개변수 타입이 Myfunction 인 메서드
		f.run();
	}

	static MyFunction getMyFunction() { // 반환타입이 Myfunction인 메서트
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}

	public static void main(String[] args) {
		// 람다식으로 Myfunction의 run()을 구현
		MyFunction f1 = () -> System.out.println("f1.run()");

		MyFunction f2 = new MyFunction() { // 익명클래스로 run()을 구현
			public void run() {// public을 반드시 붙여야함
				System.out.println("f2.ru()");
			}
		};
		MyFunction f3 = getMyFunction();

		f1.run();
		f2.run();
		f3.run();

		excute(f1);
		excute(() -> System.out.println("run()"));
	}
}
