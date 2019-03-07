package day04;

import static org.junit.Assert.*;

import org.junit.Test;

public class baseBallCheck {

// 야구게임 만들기

	String baseBallCheck(int[] arr1, int[] arr2) {
		int s = 0;
		int b = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) { // i와 j가 같을 때 s, 다를 때 b
					if (i == j)
						s++;
					else
						b++;
				}
			}
		}

		return s + "S" + b + "B";

	}


}
