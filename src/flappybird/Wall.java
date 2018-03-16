package flappybird;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * 墙体位置 墙体高度 墙体属性--是从上往下还是从下向上
 * 
 * @author 呆毛王
 *
 */
class Wall {
	private int positionX; 
	private int height;//露出边缘的长度
	private boolean type;// 种类
	private BufferedImage img; 

	/**
	 * 随机生成墙,type表示种类 注意要生成可以通过的
	 */
	public Wall(boolean type) {
		if(type)
		{
			try {
				img = ImageIO.read(new FileInputStream("/sources/柱子/反.png"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			try {
				img = ImageIO.read(new FileInputStream("/sources/柱子/正.png"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//throw new RuntimeException("Wall.Wall() : no scripts!");
	}

	public int getWidth()
	{
		return img.getWidth(null);
	}
	
	public int getHeightDelta()
	{
		//get displayed height
		return height;
	}
	
	public int getHeight()
	{
		//get total height
		return img.getHeight();
	}
	
	public int getX()
	{
		return positionX;
	}
	
	public boolean getType()
	{
		//get upper or bottom
		return type;
	}
	
	/**
	 * 向左移动
	 */
	public void move() {
		throw new RuntimeException("Wall.move() : no scripts!");
	}

}
