package flappybird;

/**
 * ��Ϸmap ������ײ���� bird��wall,groundʵ���� map height��width wall���ɼ����
 * 
 * @author ��ë��
 *
 */
class Gamemap {
	bird A;
	Wall[] B;
	private int moveLeftSpeed;
	private int width;
	private int height;

	Gamemap() {

	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.width;
	}

	/**
	 * ����wall Ҫ����Ƿ��ܹ�ͨ�� �������wall֮��ľ����Ƿ����
	 */
	public void createWall() {

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
