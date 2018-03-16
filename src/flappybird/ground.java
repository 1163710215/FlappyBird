package flappybird;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * 地面高度 以及地面
 * 
 * @author 呆毛王
 *
 */
class ground {
	/**
	 * 初始化地面
	 */
	private BufferedImage img;
	private int positionX;
	
	public ground() { 
		//throw new RuntimeException("ground.ground() : no scripts!");
		this.positionX = 0;
		try {
			img = ImageIO.read(new FileInputStream("sources/背景/地.png"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int getX()
	{
		return this.positionX; 
	}
	
	public BufferedImage getIMG()
	{
		return this.img;
	}
	
	/**
	 * 地面移动
	 */
	public void move() {
		int nextNum = this.positionX - 3;
		if(nextNum >= -432)
		{
			this.positionX = nextNum;
		}
		else
		{
			this.positionX = 0;
		}
		//throw new RuntimeException("ground.move() : no scripts!"); 
	}

}
