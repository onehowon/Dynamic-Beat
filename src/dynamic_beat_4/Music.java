package dynamic_beat_4;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import com.sun.java.util.jar.pack.Package.File;

import javazoom.jl.player.Player;

public class Music extends Thread {
	
	private Player player;
	private boolean isLoop;
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;{
		try {
			this.isLoop = isLoop;
			file = new File(Main.class.getResource("../music/"+ name).toURI());
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public int getTime() {
		if (player == null)
			return 0;
		return player.getPosition()
				
	}
	
	public void close() {
		isLoop = false;
		player.close();
		this.interrupt(); // 곡을 종료해줌
	}
	
	@Override
	public void run() {
		try {
			do {
				player.play();
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				player = new Player(bis);
			} while(isLoop); // isLoop가 True라면 무한 재생됨
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
