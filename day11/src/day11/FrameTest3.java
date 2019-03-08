// 이벤트 처리 Event handling - 이벤트 발생시 수행될 코드
//메서드 중에서 필요한 것을 찾는다.
//인터페이스를 구현하는 클래스 작성
//인스턴스 생성해서 이벤트 소스에 리스너로 등럭

package day11;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class FrameTest3 {
	public static void main(String args[]) {
		Frame f = new Frame("Login"); // Frame . 객체를 생성한다
		f.setSize(300, 200); // Frame . 의 크기를 설정한다
// EventHandler Frame WindowListener . 클래스의 객체를 생성해서 의 로 등록한다
		// 2. 이벤트 소스와 이벤트 처리기를 연결
		f.addWindowListener(new EventHandler());
		f.setVisible(true); // Frame . 생성한 을 화면에 보이도록 한다
		
		f.addKeyListener(new KeyEventHandler());
		// 이벤트 처리기(MouseEventHandler)를 생성해서 이벤트 소스(Frame)와 연결
		f.addMouseListener(new MouseEventHandler());

		Button b = new Button("Ok");
		f.add(b);

		
		f.setVisible(true);
	}
}

// 1. 클래스 생성
class MouseEventHandler implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("MouseEvent");

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}

class KeyEventHandler implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("keyPressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}

// 1. 이벤트 처리기 작성
class EventHandler implements WindowListener {
	public void windowOpened(WindowEvent e) {
	}

	public void windowClosing(WindowEvent e) { // Frame . 의 닫기 버튼을 눌렀을 때 호출된다
		e.getWindow().setVisible(false); // Frame을 화면에서 보이지 않도록 하고
		e.getWindow().dispose(); // . 메모리에서 제거한다
		System.exit(0); // . 프로그램을 종료한다
	}

	public void windowClosed(WindowEvent e) {
	} // 아무내용도 없는 메서드 구현

	public void windowIconified(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}
}
