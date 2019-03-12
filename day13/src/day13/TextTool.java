//이번엔 간단한 AWT프로그램을 이용해서... Text데이터를 편집하는데 도움이 되는 기능들을 하나씩 구현해나가는 예제입니다.
//이 문제들을 응용해서 필요한 기능들을 추가해서 사용하면 Text데이터를 처리하는데 도움이 될 것입니다.
//
//[문제1] 짝수 줄을 삭제하는 버튼의 기능을 구현하세요.

//[문제2] 작업 이전 상태로 되돌리는 Undo기능을 구현하세요. 예를 들어 짝수줄삭제버튼을 누른 다음에 Undo버튼을 누르면
//            TextArea의 내용이 짝수줄삭제버튼을 누르기 이전의 상태로 되돌아가야 합니다.
//[문제3] TextArea의 데이터 중에서 Param1에 입력된 문자 또는 문자들을 제거하는 기능의 '문자삭제'버튼의 기능을
//           완성하세요.
//[문제4] TextArea의 데이터에서 각 라인의 앞뒤 공백을 제거하는 버튼 'trim'과 빈 줄을 제거하는 기능의 '빈줄삭제'버튼의 기능을
//           완성하세요.
//[문제5] TextArea의 각 라인의 앞에는 param1에 입력된 문자열을, 뒤에는 param2에 입력된 문자열을 붙이는 기능의
//            '접두사추가'버튼을 구현하세요.
//[문제6] TextArea의 각 라인의 앞에는 param1에 입력된 문자열을, 뒤에는 param2에 입력된 문자열을 제거 기능의
//            'substring'버튼을 구현하세요..
//[문제7] TextArea의 각 라인에서 param1에 입력된 문자열과 param2에 입력된 문자열을 찾아서 두 문자열 사이의 텍스트만
//           남기고 삭제하는 기능의 'substring2'버튼을 구현하세요.
package day13;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.*;

public class TextTool extends Frame implements WindowListener {
	TextArea ta;
	TextField tfParam1, tfParam2;
	Panel pNorth, pSouth;
	Label lb1, lb2;

	String[] btnName = { "Undo", // 작업이전 상태로 되돌림
			"짝수줄삭제", // 짝수줄을 삭제하는 기능
			"문자삭제", // param1에 지정된 문자들을 삭제하는 기능
			"trim", // 라인의 앞뒤 공백을 제거
			"빈줄삭제", // 빈 줄 삭제
			"접두사추가", // Param1과 Param2의 문자열을 각 라인의 앞뒤에 붙이는 기능
			"substring", // Param1과 Param2에 지정된 문자열을 각 라인에서 제거하는 기능
			"substring2", // Param1과 Param2에 지정된 문자열로 둘러싸인 부분을 남기고 제거하는 기능

	};

	Button[] btn = new Button[btnName.length];

	private final String CR_LF = System.getProperty("line.separator"); // 개행문자(줄바꿈문자)

	private String prevText = ""; // TextArea ta의 내용을 저장하기 위한 변수

	private void registerEventHandler() {
		addWindowListener(this);

		int n = 0; // 버튼순서

		// Text데이터 편집도우미2 - 간단한 Undo
		btn[n++].addActionListener(new ActionListener() { // Undo - 작업이전 상태로 되돌림
			public void actionPerformed(ActionEvent ae) {
				/* 다음의 코드를 완성하세요. */
				// sb에 담은 소스를 다시 출력?
				// 작업 이전 상태로 되돌린다?
				// 1. btn[1]을 누르기 전 상태를 저장했다가 출력한다.
				// 2. 삭제된 데이터를 저장해놨다가 출력한다.
				// 3. 이전의 textArea ta 내용(prevText)을 출력한다
//				String tmp = ta.getText();
//				ta.setText(prevText);
//				prevText = tmp;

				String curText = ta.getText();

				if (!prevText.equals("")) { // 빈 칸일 경우
					ta.setText(prevText);
				}

				prevText = curText;

			}
		});

		btn[n++].addActionListener(new ActionListener() { // 짝수줄삭제 - 짝수줄을 삭제하는 기능
			public void actionPerformed(ActionEvent ae) {

//				 * 다음의 코드를 완성하세요.
//				 * 1. TextArea ta의 텍스트를 가져온다.(getText()사용)
				// 새로운 텍스트를 담을 변수 curText
				String curText = ta.getText();

				prevText = curText;

//				 * 2. 작업의 결과를 저장할 StringBuffer sb를 생성한다.
				// curText의 길이 만큼 생성
				StringBuffer sb = new StringBuffer(curText.length());
//				 * 3. Scanner클래스와 반복문을 이용해서 1에서 가져온 텍스트를 라인단위로 읽는다.
//				 * (Scanner클래스의 hasNextLine(), nextLine()사용)

				// data를 읽어온다
				Scanner sc = new Scanner(curText);

				for (int i = 0; sc.hasNextLine(); i++) {
//					 * 1. 파일로부터 데이터를 라인별로 읽어서(반복문과 Scanner클래스의 nextLine()사용)
					String line = sc.nextLine();

//				 * 4. 조건문을 사용해서 짝수줄인 경우에만 sb에 담는다
					if (i % 2 == 0) {
						sb.append(line).append(CR_LF);
					}
				}
//				 * 5. 작업이 끝난 후에 sb에 담긴 내용을 ta에 보여준다.(setText()사용)
				ta.setText(sb.toString());

			}
		});

		btn[n++].addActionListener(new ActionListener() { // 문자삭제 - Param1에 지정된 문자를 삭제하는 기능

			public void actionPerformed(ActionEvent ae) {

				String curText = ta.getText();
				StringBuffer sb = new StringBuffer(curText.length());

				prevText = curText;

//				 * 다음의 코드를 완성하세요.
//				 * 1. TextField Param1의 값을 가져온다.(getText()사용)
				String delText = tfParam1.getText();
//                2. 반복문을 이용해서 curText를 한글자씩 읽어서
				for (int i = 0; i < curText.length(); i++) {
//                   Param1에서 가져온 문자열에 포함되어 있는지 확인한다.
					// charAt(int i) - 지정된 위치에 있는 문자를 알려준다.
					char ch = curText.charAt(i);

					// indexOf(char ch) - ch가 존재하는지 확인 (없으면 -1)
					if (delText.indexOf(ch) == -1)
						sb.append(ch);
				}
//                3. 작업이 끝난 후에 sb에 담긴 내용을 ta에 보여준다.(setText()사용)
				ta.setText(sb.toString());

			}
		});

		btn[n++].addActionListener(new ActionListener() { // trim - 라인의 좌우공백을 제거하는 기능
			public void actionPerformed(ActionEvent ae) {
				String curText = ta.getText();
				StringBuffer sb = new StringBuffer(curText.length());

				prevText = curText;

//				 * 다음의 코드를 완성하세요.
//				 * 1. Scanner클래스와 반복문을 이용해서 curText를 라인단위로 읽는다.
//				 * (Scanner클래스의 hasNextLine(), nextLine()사용)
				Scanner sc = new Scanner(curText);
				while (sc.hasNextLine()) {
//				 * 2. 읽어온 라인의 왼쪽공백과 오른쪽 공백을 제거한다.(String클래스의 trim()사용)
					String line = sc.nextLine().trim();
					sb.append(line).append(CR_LF);
				}
//				 * 3. 작업이 끝난 후에 sb에 담긴 내용을 ta에 보여준다.(setText()사용)
				ta.setText(sb.toString());
			}
		});

		btn[n++].addActionListener(new ActionListener() { // 빈줄삭제 - 빈 줄 삭제
			public void actionPerformed(ActionEvent ae) {
				String curText = ta.getText();
				StringBuffer sb = new StringBuffer(curText.length());

				prevText = curText;

//				 * 다음의 코드를 완성하세요.
//				 * 1. Scanner클래스와 반복문을 이용해서 curText를 라인단위로 읽는다.
//				 * (Scanner클래스의 hasNextLine(), nextLine()사용)
				Scanner sc = new Scanner(curText);
				while (sc.hasNextLine()) {
					String line = sc.nextLine().trim();
//				 * 2. 읽어온 라인이 내용이 없는 빈 라인이면 sb에 저장하지 않는다.
//					if (!(line.equals("")))
					if (line.trim().length() > 0)
						sb.append(line).append(CR_LF);
//				 * 3. 작업이 끝난 후에 sb에 담긴 내용을 ta에 보여준다.(setText()사용)
				}
				ta.setText(sb.toString());
			}
		});

		btn[n++].addActionListener(new ActionListener() { // 접두사 - 각 라인에 접두사, 접미사 붙이기
			public void actionPerformed(ActionEvent ae) {
				String curText = ta.getText();
				StringBuffer sb = new StringBuffer(curText.length());

				prevText = curText;

//				 * 다음의 코드를 완성하세요.
//				 * 1. param1과 param2의 값을 가져온다.(getText()사용)
				String frontText = tfParam1.getText();
				String backText = tfParam2.getText();
//				 * 2. Scanner클래스와 반복문을 이용해서 curText를 라인단위로 읽는다.
//				 * (Scanner클래스의 hasNextLine(), nextLine()사용)
				Scanner sc = new Scanner(curText);
				while (sc.hasNextLine()) {
					String line = sc.nextLine();
//				 * 3. 읽어온 라인의 앞뒤에 param1과 param2의 값을 붙여서 sb에 담는다.
					sb.append(frontText).append(line).append(backText).append(CR_LF);
				}
//				 * 4. 작업이 끝난 후에 sb에 담긴 내용을 ta에 보여준다.(setText()사용)
				ta.setText(sb.toString());

				// 다른 방법
//				  String prefix = tfParam1.getText(); 
//                  String postfix = tfParam2.getText(); 
//                  
//                  Scanner s = new Scanner(curText); 
//
//                  for(int i=0;s.hasNextLine();i++) { 
//                        String line = s.nextLine(); 
//                  
//                        sb.append(prefix); 
//                        sb.append(line); 
//                        sb.append(postfix); 
//                        sb.append(CR_LF); 
//                  } 
//
//                  ta.setText(sb.toString()); 

			}
		});

		btn[n++].addActionListener(new ActionListener() { // substring - 문자열 자르기
			public void actionPerformed(ActionEvent ae) {
				String curText = ta.getText();
				StringBuffer sb = new StringBuffer(curText.length());

				prevText = curText;

//				 * 다음의 코드를 완성하세요.
//				 * 1. param1과 param2의 값을 가져온다.(getText()사용)
				String frontText = tfParam1.getText();
				String backText = tfParam2.getText();
//				 * 2. Scanner클래스와 반복문을 이용해서 curText를 라인단위로 읽는다.
//				 * (Scanner클래스의 hasNextLine(), nextLine()사용)
				Scanner sc = new Scanner(curText);
				while (sc.hasNextLine()) {
					String line = sc.nextLine();

					if (line.length() < frontText.length() + backText.length())
						return;
//				 * 3. 읽어온 라인을 substring으로 자른다. - param1과 param2의 내용에 관계없이 길이만큼 자른다.
//				 * (param1의 문자열길이와 param2의 문자열 길이를 이용)
					line = line.substring(frontText.length(), line.length());
					line = line.substring(0, line.length() - backText.length());
					sb.append(line).append(CR_LF);
				}
//				 * 4. 작업이 끝난 후에 sb에 담긴 내용을 ta에 보여준다.(setText()사용)
				ta.setText(sb.toString());

				// 다른 방법
//				 int from = tfParam1.getText().length(); 
//                 int to = tfParam2.getText().length(); 
//
//                 Scanner s = new Scanner(curText); 
//
//                 for(int i=0;s.hasNextLine();i++) { 
//                       String line = s.nextLine(); 
//
//                       if(line.length() < from + to) return; 
//
//                       sb.append(line.substring(from, line.length()-to)); 
//                       sb.append(CR_LF); 
//                 } 

			}
		});

		btn[n++].addActionListener(new ActionListener() { // substring2 - 지정된 문자를 찾아서 그 위치까지 잘라내기
			public void actionPerformed(ActionEvent ae) {
				String curText = ta.getText();
				StringBuffer sb = new StringBuffer(curText.length());

				prevText = curText;

//				 * 다음의 코드를 완성하세요.
//				 * 1. param1과 param2의 값을 가져온다.(getText()사용)
//				 * 2. Scanner클래스와 반복문을 이용해서 curText를 라인단위로 읽는다.
//				 * 3. 각 라인에서 param1, param2과 일치하는 문자열의 위치를 찾는다.
//				 * (param1은 라인의 왼쪽끝부터, param2는 라인의 오른쪽끝부터 찾기 시작한다.)
//				 * param1과 param2로 둘러쌓인 부분을 sb에 저장한다.
//				 * 4. sb의 내용을 TextArea에 보여준다.
				ta.setText(sb.toString());
			}
		});

	} // end of registerEventHandler()

	public static void main(String[] args) {
		TextTool win = new TextTool("Text Tool");
		win.show();
	}

	public TextTool(String title) {
		super(title);
		lb1 = new Label("param1:", Label.RIGHT);
		lb2 = new Label("param2:", Label.RIGHT);
		tfParam1 = new TextField(15);
		tfParam2 = new TextField(15);

		ta = new TextArea();
		pNorth = new Panel();
		pSouth = new Panel();

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(btnName[i]);
		}

		pNorth.setLayout(new FlowLayout());
		pNorth.add(lb1);
		pNorth.add(tfParam1);
		pNorth.add(lb2);
		pNorth.add(tfParam2);

		pSouth.setLayout(new GridLayout(2, 10));

		for (int i = 0; i < btn.length; i++) { // 버튼배열을 하단 Panel에 넣는다.
			pSouth.add(btn[i]);
		}

		add(pNorth, "North");
		add(ta, "Center");
		add(pSouth, "South");

		setBounds(100, 100, 600, 300);
		ta.requestFocus();
		registerEventHandler();
		setVisible(true);
	} // public TextToolEx1(String title) {

	public void windowOpened(WindowEvent e) {
	}

	public void windowClosing(WindowEvent e) {
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.exit(0);
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}
} // end of class

/*
 * 테스트 데이터 111111111111111111 222222222222222222 333333333333333333
 * 444444444444444444 555555555555555555 666666666666666666 777777777777777777
 * 888888888888888888 999999999999999999 000000000000000000
 */