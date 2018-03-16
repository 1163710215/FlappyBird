package flappybird;

import java.awt.image.BufferedImage;

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
		// TODO Auto-generated constructor stub
		speed = 10;
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
	public void move() {
		throw new RuntimeException("bird.move() : no scripts!");
	}
	
	public void changeSpeed()
	{
		this.speed = 10;
	}
}
