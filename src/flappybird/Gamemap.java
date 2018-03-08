package flappybird;

/**
 * 游戏map 包括碰撞检验 bird和wall,ground实例化 map height和width wall生成及检测
 * 
 * @author 呆毛王
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
	 * 生成wall 要检测是否能够通过 检测上下wall之间的距离是否合理
	 */
	public void createWall() {

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
