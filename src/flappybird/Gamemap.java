package flappybird;

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
	
	public int getSpeed()
	{
		return this.moveLeftSpeed;
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
		boolean col = false;
		int i;
		int n = walls.size();
		Wall temp;
		for(i = 0;i < n;i++)
		{
			temp = walls.get(i);
			if(bd.getWidth() + bd.getX() >= temp.getX() 
					&& bd.getX() <= temp.getX() + temp.getWidth())
			{
				//if not in the space, hits the wall
				if(temp.getType())
				{
					//if upper
					if(bd.getY() < temp.getHeightDelta())
					{
						col = true;
					}
				}
				else
				{
					//if bottom
					if(bd.getY() + bd.getHeight() > height - temp.getHeightDelta())
					{
						col = true;
					}
				}
			}
		}
		return col;
	}

}
