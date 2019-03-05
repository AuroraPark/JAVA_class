// 익명클래스 변환하기
package ch07;

import java.awt.*;
import java.awt.event.*;

//원래 코드
//public class AnnoyMous {
//	public static void main(String[] args) {
//		Button b = new Button("Start");
//		b.addActionListener(new EventHandler());
//	}
//}

//class EventHandler implements ActionListener {
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("ActionEvent occurred!!!");
//	}
//}

// 익명클래스로 만들어보기 - 생성과 선언 합치기
public class AnnoyMous {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
			}
		}// 익명 클래스의 끝
		);
	} // main의 끝
} // InnerEx8의 끝
