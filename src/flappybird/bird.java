package flappybird;

import java.awt.image.BufferedImage;

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
	final private int g = 1;// ����

	/**
	 * ��ʼ��bird ����xy �����ٶ�
	 * 
	 * @param positionY
	 */

	public bird(int x ,int y, int speed) {
	    this.positionX = x;
	    this.positionY = y;
		this.speed = speed;
	}

	/**
	 * move��ʾһ�μ��� �˴�����ֱ�Ӱ�bird�ٶȼ�10����
	 */
	public void move() {
		this.speed+=10;
		//throw new RuntimeException("bird.move() : no scripts!");
	}
	
	public void changeSpeed()
	{
		this.speed = 20;
	}
}
