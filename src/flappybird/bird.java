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

	// private int step;// 步长,即为速度
	private BufferedImage[] images = new BufferedImage[3];// 储存鸟图
	// private int score;// 成绩
	private double speed;// 速度
	// nothing
	final private double g = 2;// 重力
	final private double t = 0.25;

	/**
	 * 初始化bird 给它xy 给它速度
	 * 
	 * @param positionY
	 */

	public bird() {
		this.positionX = 50;
		this.positionY = 250;
		// TODO Auto-generated constructor stub
		this.speed = 20;
		try {
			images[0] = ImageIO.read(new FileInputStream("sources/鸟/上.png"));
			images[1] = ImageIO.read(new FileInputStream("sources/鸟/中.png"));
			images[2] = ImageIO.read(new FileInputStream("sources/鸟/下.png"));
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
	public int getWidth() {
		return images[0].getWidth();
	}

	public int getHeight() {
		return images[0].getHeight();
	}

	public int getX() {
		return positionX;
	}

	public int getY() {
		return positionY;
	}

	public BufferedImage[] getIMG() {
		return this.images;
	}

	public void move() {
		// this.positionX +=2;
		double v0 = speed;
		double v = v0 - g * t;
		speed = v;
		this.positionY -= (int) (v0 * t - 0.5 * g * t * t);

		// throw new RuntimeException("bird.move() : no scripts!");
	}

	public void changeSpeed() {
		this.speed = 20;
	}
}
