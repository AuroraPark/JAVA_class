import java.awt.*;
import java.awt.event.*;

class Bingo extends Frame {

	final int SIZE = 5; // 빙고판의 크기
	int bingoCnt = 0; // 완성된 라인의 수

	Button[] btnArr = null;
	boolean[][] bArr = new boolean[SIZE][SIZE]; // 빙고판 체크여부 확인을 위한 배열

	// 빙고판 버튼에 사용할 문자열, 빙고판의 크기에 따라 이들의 일부만 사용될 수 있다.
	String[] values = { "글쎄", "기로로", "김창우", "김천대표", "까꿍", "남궁성", "낭군이", "넓게보기", "네라주리", "다밀", "더클레오", "들개", "디벨로", "레몬",
			"루션", "루이지노", "무색이", "문학청년", "사천사", "상상", "세피룸", "스쿨쥐", "쌩", "쏭양", "씨드", "양수호", "에노야", "에비츄", "에이스", "엔즈",
			"오이날다", "오케클릭", "용주니", "우기파파", "잠탱이", "제러스", "조땜", "지냔", "카라", "캉스", "태연", "파티쉐", "페르소마", "폭풍", "핏빛노을",
			"핑크팬더", "하늘이", "하루", "한경훈", "헐레벌떡", "화염병", "Hyoni.K" };

	Bingo() {
		this("Bingo Game Ver1.0");
	}

	Bingo(String title) {
		super(title);

		setLayout(new GridLayout(SIZE, SIZE));

		MyEventHandler handler = new MyEventHandler();
		addWindowListener(handler);

		btnArr = new Button[SIZE * SIZE];

		shuffle();

		// Frame에 버튼을 추가한다.
		for (int i = 0; i < SIZE * SIZE; i++) {
			btnArr[i] = new Button(values[i]); // 문자열배열 values의 값을 버튼의 Label로 한다.
			add(btnArr[i]);
			btnArr[i].addActionListener(handler);
		}

		setBounds(500, 200, 300, 300);
		setVisible(true);
	}

	void shuffle() {
		for (int i = 0; i < values.length * 2; i++) {
			int r1 = (int) (Math.random() * values.length);
			int r2 = (int) (Math.random() * values.length);

			String tmp = values[r1];
			values[r1] = values[r2];
			values[r2] = tmp;
		}
	}

	void print() { // 배열 bArr을 출력한다.
		for (int i = 0; i < bArr.length; i++) {
			for (int j = 0; j < bArr.length; j++) {
				System.out.print(bArr[i][j] ? "O" : "X");
			}
			System.out.println();
		}
		System.out.println("----------------");
//             System.out.println(bingoCnt); 
	}

	boolean checkBingo() { // 빙고가 완성되었는지를 확인한다.
		// 빙고 완성된 줄수
		bingoCnt = 0;
		// 가로줄이 완성되었는지 확인하는 변수
		int garoCnt = 0;
		// 세로줄이 완성되었는지 확인하는 변수
		int seroCnt = 0;
		// 대각선 1 줄이 완성되었는지 확인하는 변수 5가되면 빙고를 외친다!
		int crossCnt1 = 0;
		// 대각선 2 줄이 완성되었는지 확인하는 변수 5가되면 빙고를 외친다.
		int crossCnt2 = 0;

		// i는 세로
		for (int i = 0; i < SIZE; i++) {
			// j는 가로줄이 된다.
			for (int j = 0; j < SIZE; j++) {
				if (i + j == SIZE - 1 && bArr[i][j])
					crossCnt2++;
				if (i == j && bArr[i][j])
					crossCnt1++;
				// 가로카운트
				if (bArr[i][j]) {
					garoCnt++;
//					if (garoCnt == 5) {
//						switch (i) {
//						case 0:
//							for (int k = 0; k < SIZE; k++)
//								btnArr[i * SIZE + k].setBackground(Color.GREEN);
//						case 1:
//							for (int k = 0; k < SIZE; k++)
//								btnArr[i * SIZE + j].setBackground(Color.GREEN);
//						case 2:
//							for (int k = 0; k < SIZE; k++)
//								btnArr[i * SIZE + j].setBackground(Color.GREEN);
//						case 3:
//							for (int k = 0; k < SIZE; k++)
//								btnArr[i * SIZE + j].setBackground(Color.GREEN);
//						case 4:
//							for (int k = 0; k < SIZE; k++)
//								btnArr[i * SIZE + j].setBackground(Color.GREEN);
//						}

//					}
				}

				if (bArr[j][i]) {
					seroCnt++;
//					if (seroCnt == SIZE) {
//						for (int a = i, b = SIZE; a < btnArr.length && b > 0; a += SIZE, b--) {
//							btnArr[a].setBackground(Color.green);
//						}
//					}

				}
			}

			// 가로 카운트가 5되면 bingo카운트 증가
			// 빙고 카운트가 5되면 가로카운트가 5인 가로를
			// 배경색을 초록색으로 바꿔줌
			// 빙고를 외치면서 가로카운트가 증가되면
			// 해당줄의 색을 초록색으로 바꾼다.
			// 해당 줄번호는 어떻게 알지
			if (garoCnt == SIZE) {
				bingoCnt++;
			}
			if (seroCnt == SIZE) {
				bingoCnt++;
			}
//                   if(bingoCnt>=SIZE) return true; 

			garoCnt = 0;
			seroCnt = 0;
		} // for

		if (crossCnt1 == SIZE)
			bingoCnt++;
		if (crossCnt2 == SIZE)
			bingoCnt++;

		// Bingo~!!를 외쳤을때
		if (bingoCnt >= SIZE) {

// 가로			
			for (int i = 0; i < SIZE; i++) {
				// j는 가로줄이 된다.
				for (int j = 0; j < SIZE; j++) {
					if (bArr[i][j]) {
						garoCnt++;
						if (garoCnt == 5) {
							// j는 가로줄이 된다.
							for(int a=i*SIZE, b=SIZE; a<btnArr.length&&b>0; a++,b--){
								btnArr[a].setBackground(Color.green);
							}
						}
					}

					if (bArr[j][i]) {
						seroCnt++;
						if (seroCnt == SIZE) {
							for (int a = i, b = SIZE; a < btnArr.length && b > 0; a += SIZE, b--) {
								btnArr[a].setBackground(Color.green);
							}
						}

					}
				}

				// 가로 카운트가 5되면 bingo카운트 증가
				// 빙고 카운트가 5되면 가로카운트가 5인 가로를
				// 배경색을 초록색으로 바꿔줌
				// 빙고를 외치면서 가로카운트가 증가되면
				// 해당줄의 색을 초록색으로 바꾼다.
				// 해당 줄번호는 어떻게 알지
				if (garoCnt == SIZE) {
					bingoCnt++;
				}
				if (seroCnt == SIZE) {
					bingoCnt++;
				}

				garoCnt = 0;
				seroCnt = 0;
			}

			// 여기까지

			// 대각선일때 그린으루
			if (crossCnt1 == SIZE) {
				// 어디를 그린으로 바꿔주지?
				// i와 j가 같은곳
				for (int i = 0; i < SIZE; i++) {
					btnArr[i * SIZE + i].setBackground(Color.GREEN);
				}
			}
			// 대각선2일때 그린으루
			if (crossCnt2 == SIZE) {
				// 어디를 그린으로 바꿔주지?
				// i + j == SIZE - 1 가 되는곳
				// 값 4 8 12 16
				// i 0 1 2 3
				// 수식 (i+1)*4
				for (int i = 0; i < SIZE; i++) {
					btnArr[(i + 1) * 4].setBackground(Color.GREEN);
				}
			}
		}
		System.out.println(bingoCnt);
		return bingoCnt >= SIZE;

	}

	public static void main(String args[]) {
		Bingo win = new Bingo("Bingo Game Ver3.0");
		win.show();
	}

	class MyEventHandler extends WindowAdapter implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			Button btn = (Button) ae.getSource();

			System.out.println(btn.getLabel()); // 눌러진 버튼의 Label을 콘솔에 출력한다.

			for (int i = 0; i < btnArr.length; i++) {
				if (btnArr[i] == btn) {
					bArr[i / SIZE][i % SIZE] = true;
					break;
				}
			}

			btn.setBackground(Color.YELLOW);
			print();
			if (checkBingo()) {
				System.out.println("Bingo~!!!");
			}
		}

		public void windowClosing(WindowEvent e) {
			e.getWindow().setVisible(false);
			e.getWindow().dispose();
			System.exit(0);
		}
	}
}