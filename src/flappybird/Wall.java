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
	private int height;//¶����Ե�ĳ���
	private boolean type;// ����
	private BufferedImage img; 

	/**
	 * �������ǽ,type��ʾ���� ע��Ҫ���ɿ���ͨ����
	 */
	public Wall(boolean type) {
		if(type)
		{
			try {
				img = ImageIO.read(new FileInputStream("/sources/����/��.png"));
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
				img = ImageIO.read(new FileInputStream("/sources/����/��.png"));
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
	 * �����ƶ�
	 */
	public void move() {
		throw new RuntimeException("Wall.move() : no scripts!");
	}

}
