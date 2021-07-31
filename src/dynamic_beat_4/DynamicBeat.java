package dynamic_beat_4;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DynamicBeat extends JFrame { // JFrame을 통해 DyanmicBeat라는 class를 만들어줌
	
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image introBackground;
	
	public DynmaicBeat() { // 생성자(자신이 클래스와 같은 이름을 가진 메소드)
		setTitle("Dyanmic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null); // 실행했을 때 게임 만든 창이 정중앙에 배치됨
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x 표시를 누를 때 게임이 정상적으로 종료될 수 있도록
		setVisible(true);
		
		introBackground = new ImageIcon(Main.class.getResource("..//images/intro.jpg")).getImage();
		
		Music introMusic = new Music("intromusic.mp3", true);
		introMusic.start();
	}
	
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		this.repaint(); // 전체 화면이 실행 순간부터 종료 순간까지 왔다갔다 함.
	}

}
