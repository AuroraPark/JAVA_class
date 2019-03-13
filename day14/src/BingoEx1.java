


import java.awt.*;
import java.awt.event.*;

class BingoEx1 extends Frame {

	final int SIZE = 5; 
	int bingoCnt = 0; 

	Button[] btnArr = null;
	boolean[][] bArr = new boolean[SIZE][SIZE]; 

	BingoEx1() {
		this("Bingo Game Ver1.0");
	}

	BingoEx1(String title) {
		super(title);

		setLayout(new GridLayout(SIZE, SIZE));

		MyEventHandler handler = new MyEventHandler();
		addWindowListener(handler);

		btnArr = new Button[SIZE * SIZE];

		// Frame에 버튼을 추가한다.
		for (int i = 0; i < SIZE * SIZE; i++) {
			btnArr[i] = new Button(i + 1 + "");
			add(btnArr[i]);
			btnArr[i].addActionListener(handler);
		}

		setBounds(500, 200, 300, 300);
		setVisible(true);
	}

	void print() { 
	}
//
//	}

	public static void main(String args[]) {
		BingoEx1 win = new BingoEx1("Bingo Game Ver1.0");
		win.show();
	}

	class MyEventHandler extends WindowAdapter implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			Button btn = (Button) ae.getSource();


		}

		public void windowClosing(WindowEvent e) {
			e.getWindow().setVisible(false);
			e.getWindow().dispose();
			System.exit(0);
		}
	}
}