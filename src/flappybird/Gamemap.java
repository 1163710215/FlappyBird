package flappybird;

import java.util.ArrayList;
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
		this.width = 432;
		this.height = 674;
		this.moveLeftSpeed = 3;
		walls = new ArrayList<Wall>();
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
		int temp = (int)(Math.random() * 300) + 100;
		Wall tempWallUpper = new Wall(true, temp);
		Wall tempWallBottom = new Wall(false, 500 - temp);
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
		int delta = 8;//视觉修正值
		int delta2 = 4;
		for(i = 0;i < n;i++)
		{
			temp = walls.get(i);
			if(bd.getWidth() + bd.getX() >= temp.getX() + delta2 
					&& bd.getX() <= temp.getX() + temp.getWidth() - delta2)
			{
				//if not in the space, hits the wall
				if(temp.getType())
				{
					//if upper
					if(bd.getY() < temp.getY() + temp.getHeight())
					{
						col = true;
					}
				}
				else
				{
					//if bottom
					if(bd.getY() + bd.getHeight() > temp.getY() + delta)
					{
						col = true;
					}
				}
			}
		}
		return col;
	}

}
