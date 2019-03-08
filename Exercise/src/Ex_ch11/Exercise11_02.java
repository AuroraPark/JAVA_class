package Ex_ch11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Exercise11_02 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		// [3, 6, 2, 2, 7]
		HashSet set = new HashSet(list); // 중복제거 [3, 6, 2, 7]
		TreeSet tset = new TreeSet(set); // 순서 [2, 3, 6, 7]
		Stack stack = new Stack();		
		stack.addAll(tset);	
		
		while (!stack.empty())
			System.out.println(stack.pop());	//FILO [7, 6, 3, 2]
	}

}
