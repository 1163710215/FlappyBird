package flappybird;

import java.lang.reflect.Array;
import java.util.List;

/**
 * ��Ϸmap ������ײ���� bird��wall,groundʵ���� map height��width wall���ɼ����
 * 
 * @author ��ë��
 *
 */
class Gamemap {
	public bird bd;
	public List<Wall> walls;
	private int moveLeftSpeed; 
	private int width;
	private int height;

	Gamemap() {
		this.width = 674;
		this.height = 432;
		this.moveLeftSpeed = 3;
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}

	/**
	 * ����wall Ҫ����Ƿ��ܹ�ͨ�� �������wall֮��ľ����Ƿ����
	 */
	public void createWall() {
		Wall tempWallUpper = new Wall(true);
		Wall tempWallBottom = new Wall(false);
		walls.add(tempWallUpper);
		walls.add(tempWallBottom);
	}

	/**
	 * ��ײ����false
	 * 
	 * @return
	 */
	public boolean collision() {
		return true;
	}

}
