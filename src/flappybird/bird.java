package flappybird;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * ����bird��position ����bird���ٶ� bird��move bird����
 * 
 * @author ��ë��
 *
 */
class bird {
	private int positionX;

	private int positionY;

	// private int step;// ����,��Ϊ�ٶ�
	private BufferedImage[] images = new BufferedImage[3];// ������ͼ
	// private int score;// �ɼ�
	private double speed;// �ٶ�
	// nothing
	final private double g = 2;// ����
	final private double t = 0.25;

	/**
	 * ��ʼ��bird ����xy �����ٶ�
	 * 
	 * @param positionY
	 */

	public bird() {
		this.positionX = 50;
		this.positionY = 250;
		// TODO Auto-generated constructor stub
		this.speed = 20;
		try {
			images[0] = ImageIO.read(new FileInputStream("sources/��/��.png"));
			images[1] = ImageIO.read(new FileInputStream("sources/��/��.png"));
			images[2] = ImageIO.read(new FileInputStream("sources/��/��.png"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * move��ʾһ�μ��� �˴�����ֱ�Ӱ�bird�ٶȼ�10����
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
