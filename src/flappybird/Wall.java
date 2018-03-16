package flappybird;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * ǽ��λ�� ǽ��߶� ǽ������--�Ǵ������»��Ǵ�������
 * 
 * @author ��ë��
 *
 */
class Wall {
	private int positionX; 
	private int positionY;
	private boolean type;// ����
	private BufferedImage img; 

	/**
	 * �������ǽ,type��ʾ���� ע��Ҫ���ɿ���ͨ����
	 */
	public Wall(boolean type, int y) {
		this.positionX = 432;
		this.type = type;
		if(type)
		{
			try {
				img = ImageIO.read(new FileInputStream("sources/����/��.png"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.positionY = y - this.img.getHeight() - 50;
		}
		else
		{
			try {
				img = ImageIO.read(new FileInputStream("sources/����/��.png"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.positionY = 650 - y;
		}
		//throw new RuntimeException("Wall.Wall() : no scripts!");
	}

	public int getWidth()
	{
		return img.getWidth();
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
	
	public int getY()
	{
		return positionY;
	}
	
	
	public boolean getType()
	{
		//get upper or bottom
		return this.type;
	}
	
	public BufferedImage getIMG()
	{
		//get upper or bottom
		return img;
	}
	
	/**
	 * �����ƶ�
	 */
	public void move() {
		positionX -= 3;
		//throw new RuntimeException("Wall.move() : no scripts!");
	}

}
