package flappybird;

import java.lang.reflect.Array;
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
		return true;
	}

}
