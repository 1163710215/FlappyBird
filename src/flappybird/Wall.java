package flappybird;

import java.awt.image.BufferedImage;

/**
 * ǽ��λ�� ǽ��߶� ǽ������--�Ǵ������»��Ǵ�������
 * 
 * @author ��ë��
 *
 */
class Wall {
	private int positionX;
	private int height;
	boolean type;// ����
	private BufferedImage img; 

	/**
	 * �������ǽ,type��ʾ���� ע��Ҫ���ɿ���ͨ����
	 */
	public Wall(boolean type) {
		throw new RuntimeException("Wall.Wall() : no scripts!");
	}

	/**
	 * �����ƶ�
	 */
	public void move() {
		throw new RuntimeException("Wall.move() : no scripts!");
	}

}
