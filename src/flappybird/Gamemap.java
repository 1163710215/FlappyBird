package flappybird;

import java.util.List;

/**
 * 游戏map 包括碰撞检验 bird和wall,ground实例化 map height和width wall生成及检测
 * 
 * @author 呆毛王
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
	 * 生成wall 要检测是否能够通过 检测上下wall之间的距离是否合理
	 */
	public void createWall() {
		Wall tempWallUpper = new Wall(true);
		Wall tempWallBottom = new Wall(false);
		walls.add(tempWallUpper);
		walls.add(tempWallBottom);
	}

	/**
	 * 碰撞返回false
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
