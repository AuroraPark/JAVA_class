// 지네릭스


package ch12;

import java.util.ArrayList;

class Fruit 				{ public String toString() { return "Fruit"; } }
class Apple extends Fruit 	{ public String toString() { return "Apple"; } }
class Grape extends Fruit 	{ public String toString() { return "Grape"; } }
class Toy					{ public String toString() { return "Toy"  ; } }


public class FruitBoxEx1 {
	public static void main(String[] args) {
		Box<Fruit> 	fruitBox = new Box<Fruit> (); // 일치
		Box<Apple> 	appleBox = new Box<Apple> (); // 일치
		Box<Toy> 	toyBox 	 = new Box<Toy> ();   // 일치 
//		Box<Grape> 	grapeBox = new Box<Apple> ();	// 에러 타입불일치
		
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());	// ok, void add(Fruit item)
		
		appleBox.add(new Apple());  // 오케
		appleBox.add(new Apple()); // 오케
//		appleBox.add(new Toy()); // 에러 Box<Apple>에는 Apple만 담을 수 있음
		
		toyBox.add(new Toy()); // 토이박스에 토이
//		toyBox.add(new Apple()); // 에러 Box<Toy>에는 Apple을 담을 수 없음
		
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
		
	}//main의 끝

}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item);		}
	T get(int i) 	 { return list.get(i); 	}
	int size() 		 { return list.size(); 	}
	public String toString() {return list.toString();}
}
