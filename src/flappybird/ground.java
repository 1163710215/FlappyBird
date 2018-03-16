package flappybird;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * ����߶� �Լ�����
 * 
 * @author ��ë��
 *
 */
class ground {
	/**
	 * ��ʼ������
	 */
	private BufferedImage img;
	private int positionX;
	
	public ground() { 
		//throw new RuntimeException("ground.ground() : no scripts!");
		this.positionX = 0;
		try {
			img = ImageIO.read(new FileInputStream("sources/����/��.png"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int getX()
	{
		return this.positionX; 
	}
	
	public BufferedImage getIMG()
	{
		return this.img;
	}
	
	/**
	 * �����ƶ�
	 */
	public void move() {
		int nextNum = this.positionX - 3;
		if(nextNum >= -432)
		{
			this.positionX = nextNum;
		}
		else
		{
			this.positionX = 0;
		}
		//throw new RuntimeException("ground.move() : no scripts!"); 
	}

}
