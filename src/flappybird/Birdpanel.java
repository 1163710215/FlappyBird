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
			background = ImageIO.read(new FileInputStream("sources/背景/白天.png"));
			startImage = ImageIO.read(new FileInputStream("sources/其他/开始.png"));
			//background = ImageIO.read(this.getClass().getResource("/sources/背景/白天.png"));
		    //startImage = ImageIO.read(this.getClass().getResource("/sources/其他/开始.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 此处draw
	 */
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(background, 0, 0, 432, 600, null);
		g.drawImage(gr.getIMG(), gr.getX(), 600, 864, 74, null);
		if(!start)
		{
			g.drawImage(startImage,  0, 100, 432, 500, null);
		}
		else
		{
			if(!gameover)
			{
				g.clearRect(0, 0, 432, 674);
				g.drawImage(background, 0, 0, 432, 600, null);
				g.drawImage(gr.getIMG(), gr.getX(), 600, 864, 74, null);
				g.drawImage(bd.getIMG(), bd.getX(), bd.getY(), null);
			}
		}
		if(gameover)
		{
			g.drawImage(overImage, 0, 0, null);
		}
	}

	/**
	 * 当游戏未开始时开始 开始后改变速度
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
					if(!gameover)
					{
						map.bd.changeSpeed();
					}
				}
			}
		});
		//runtime function
		while(true)
		{
			paint(null);
			//contents
			if(!gameover && start)
			{
				//TODO when gaming 
			}
		}
	}

}
