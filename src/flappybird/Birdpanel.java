package flappybird;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Birdpanel extends JPanel { 
	Wall w1, w2;
	BufferedImage background;
	BufferedImage startImage;
	BufferedImage overImage;
	ground gr;
	bird bd;
	
	int score;
	boolean gameover;
	boolean start;

	/**
	 * Create the panel.
	 */
	public Birdpanel() {
		gameover = false;
		start = false;
		try {
			gr = new ground();
			bd = new bird();
			background = ImageIO.read(new FileInputStream("sources/����/����.png"));
			startImage = ImageIO.read(new FileInputStream("sources/����/��ʼ.png"));
			//background = ImageIO.read(this.getClass().getResource("/sources/����/����.png"));
		    //startImage = ImageIO.read(this.getClass().getResource("/sources/����/��ʼ.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * �˴�draw
	 */
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(background, 0, 0, null);
		if(!start)
		{
			g.drawImage(startImage, 337, 216, null);
		}
		else
		{
			//g.clearRect(0, 0, 674, 432);
			g.drawImage(background, 0, 0, null);
		}
		if(gameover)
		{
			g.drawImage(overImage, 337, 216, null);
		}
	}

	/**
	 * ����Ϸδ��ʼʱ��ʼ ��ʼ��ı��ٶ�
	 */

	public void action() {
		//initialize
		Gamemap map=new Gamemap();
		map.bd = bd;
		//enter frame
		//add listener function of mouse
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(!start)
				{
					//start the game
					start = true;
				}
				else
				{
					//change the speed
					map.bd.changeSpeed();
				}
			}
		});
		//runtime function
		while(true)
		{
			//contents
			if(!gameover && start)
			{
				//TODO when gaming 
			}
		}
	}

}
