//아래의 실행결과처럼 가로 세로 크기가 5인 빙고판을 만드시오 그리고 버튼을 ,  .
//누르면 버튼의 배경색이 밝은 회색(Color.LIGHT_GRAY) 으로 바뀌고 누른 버튼의 글자가 , 
//콘솔에 출력되게 하시오.

package day11;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bingo_Awt {
	static String s = "";
	static String[] obj = { "참새", "두루미", "황새", "비둘기", "까오기", "오리", "타조", "부엉이", "올빼미", "뱁새", "꿩", "닭", "구관조", "잉꼬", "매",
			"거위", "독수리", "콘돌", "봉황", "공작", "까치", "까마귀", "앵무새", "꾀꼬리", "고니" };

	public static void main(String[] arg) {
		Frame f = new Frame("Bingo Game"); // 프레임 만들기.
		f.setSize(500, 500);// 사이즈 정하기
		f.setLayout(new GridLayout(5, 5));
		f.addWindowListener(new EventHandler()); // 윈도우 창 닫히게
		Toolkit tk = Toolkit.getDefaultToolkit(); // Toolkit에구현된 객체를 얻는다
		Dimension screenSize = tk.getScreenSize(); // 화면의 크기를 구한다
		// 가운데에 위치시킨다.
		f.setLocation(screenSize.width / 2 - 500, screenSize.height / 2 - 200);

		f.setResizable(false); // 사이즈 크기 변경 불가

		// 25개 넣기
		// 바뀌는 부분 - 참새
		// 바뀌지 않는 부분 - f.add(new Button(
		// 버튼을 개별적으로 만들어서 색 변경을 해야되나?
		// 그냥 클릭하면 배경 색이 바뀌게

		Button[] objButtons = null;

		objButtons = new Button[obj.length];
		for (int i = 0; i < obj.length; i++) {
			objButtons[i] = new Button(obj[i]);
			objButtons[i].addActionListener(new ActionEventHandler());
			f.add(objButtons[i]);
		}

		// 배열 위치를 어떻게 가져오지?
		for(int i =0;i < obj.length; i ++) {
			if(objButtons[i].equals(obj[i]))
			  s = obj[i];
		}		
		System.out.println(s);
		// 화면에 프레임 띄우기
		f.setVisible(true);
	}

}

//누르면 버튼의 배경색이 밝은 회색(Color.LIGHT_GRAY) 으로 바뀌고 
//누른 버튼의 글자가 , 콘솔에 출력되게 하시오.
/**
 * 이벤트 처리 방법 1. 표 13-25에 있는 메서드 중에서 필요한 것을 찾는다. 1. 버튼 클릭시 이벤트
 * actionPeformed(ActonEvent ae) 1) 배경색이 바뀌는 메서드 2) 콘솔에 출력 2. 선택한 메서드가 속해있는
 * 인터페이스를 구현하는 클래스를 작성한다.
 * 
 * 3. 위에서 구현한 클래스의 인스턴스를 생성해서 이벤트 소스에 Listener으로 등록한다.
 */
class ActionEventHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}

}
