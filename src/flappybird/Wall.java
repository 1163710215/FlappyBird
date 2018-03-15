package flappybird;

import java.awt.image.BufferedImage;

/**
 * 墙体位置 墙体高度 墙体属性--是从上往下还是从下向上
 * 
 * @author 呆毛王
 *
 */
class Wall {
	private int positionX;
	private int height;
	boolean type;// 种类
	private BufferedImage img; 

	/**
	 * 随机生成墙,type表示种类 注意要生成可以通过的
	 */
	public Wall(boolean type) {
		throw new RuntimeException("Wall.Wall() : no scripts!");
	}

	/**
	 * 向左移动
	 */
	public void move() {
		throw new RuntimeException("Wall.move() : no scripts!");
	}

}
