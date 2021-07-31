package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame { // JFrame을 통해 DyanmicBeat라는 class를 만들어줌
	
	public DynmaicBeat() { // 생성자(자신이 클래스와 같은 이름을 가진 메소드)
		setTitle("Dyanmic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTO(null); // 실행했을 때 게임 만든 창이 정중앙에 배치됨
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x 표시를 누를 때 게임이 정상적으로 종료될 수 있도록
		setVisible(true);
	}

}
