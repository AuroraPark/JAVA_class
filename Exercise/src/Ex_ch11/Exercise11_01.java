//다음은 정수집합 1,2,3,4와 3,4,5,6 의 교집합 차집합 합집합을 구하는 코드이다 
//코드를 완성하여 실행결과와 같은 결과를 출력하시오.
//[Hint] ArrayList addAll(), removeAll(), retainAll() . 

package Ex_ch11;

import java.util.*;

public class Exercise11_01 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList kyo = new ArrayList(); // 교집합
		ArrayList cha = new ArrayList(); // 차집합
		ArrayList hap = new ArrayList(); // 합집합

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);

		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);

		/* (1) . 알맞은 코드를 넣어 완성하시오 */
		// 교집합(kyo)
		// 교집합을 구하려면 어떻게하지?
		// 배열의 원소끼리 비교해서 같으면 넣고 아니면 안넣고
		kyo.addAll(list1);
		for(int i = list2.size()-1; i>=0; i--) {
			if(kyo.contains(list2.get(i)))
				kyo.remove(i);
		}

		// 차집합(cha)
		// 차집합을 구하려면 어떻게 하지?
		// cha집합에 list1의 객체들을 넣고 
		// list2에 저장된 것과 동일한 객체들을 제거!
		cha.addAll(list1);
		for(int i = kyo.size()-1; i>=0; i--) {
			if(cha.contains(kyo.get(i)))
				cha.remove(kyo.get(i));
		}
		
		// 합집합(hap)
		// 합집합을 구하려면 어떻게 하지?
		// 합집합 = list1 + list2 - 교집합
		hap.addAll(list1);
		hap.addAll(list2);
		for(int i = kyo.size()-1; i>=0; i--) {
			if(hap.contains(kyo.get(i)))
				hap.remove(kyo.get(i));
		}
		

		System.out.println("list1=" + list1);
		System.out.println("list2=" + list2);
		System.out.println("kyo=" + kyo);
		System.out.println("cha=" + cha);
		System.out.println("hap=" + hap);
	}
}
