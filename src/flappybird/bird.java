package flappybird;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * 储存bird的position 储存bird的速度 bird的move bird重力 
 * 
 * @author 呆毛王
 *
 */
class bird {
	private int positionX; 

	private int positionY;

	private int step;// 步长,即为速度
	private BufferedImage images;// 储存鸟图
	private int score;// 成绩
	private int speed;// 速度
	// nothing
	final private int g = 1;// 重力

	/**
	 * 初始化bird 给它xy 给它速度
	 * 
	 * @param positionY
	 */

	public bird() {
		this.positionX = 0;
		this.positionY = 250;
		// TODO Auto-generated constructor stub
		this.speed = 10;
		try {
			images = ImageIO.read(new FileInputStream("sources/鸟/上.png"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * move表示一次激励 此处可以直接把bird速度加10试试
	 */
	public int getWidth()
	{
		return images.getWidth();
	}
	
	public int getHeight()
	{
		return images.getHeight();
	}
	public int getX()
	{
		return positionX;
	}
	
	public int getY()
	{
		return positionY;
	}
	
	public BufferedImage getIMG()
	{
		return this.images;
	}
	
	public void move() {
		//this.positionX +=2;
		this.positionY +=5;
		//throw new RuntimeException("bird.move() : no scripts!");
	}
	
	public void changeSpeed()
	{
		this.speed =10;
	}
}
