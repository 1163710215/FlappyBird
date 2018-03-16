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

	private int step;// ����,��Ϊ�ٶ�
	private BufferedImage images;// ������ͼ
	private int score;// �ɼ�
	private int speed;// �ٶ�
	// nothing
	final private double g = 1;// ����

	/**
	 * ��ʼ��bird ����xy �����ٶ�
	 * 
	 * @param positionY
	 */

	public bird() {
		this.positionX = 50;
		this.positionY = 250;
		// TODO Auto-generated constructor stub
		this.speed = -20;
		try {
			images = ImageIO.read(new FileInputStream("sources/��/��.png"));
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
		this.positionY +=this.speed;
		this.speed += g;
		//throw new RuntimeException("bird.move() : no scripts!");
	}
	
	public void changeSpeed()
	{
		this.speed = -10;
	}
}
