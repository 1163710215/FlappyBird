package flappybird;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Birdpanel extends JPanel {
	int statement = 0;
	Wall w1, w2;
	BufferedImage background;
	BufferedImage startImage;
	BufferedImage overImage;
	BufferedImage restart;
	ground gr;
	bird bd;
	Gamemap map;
	int counter;

	int score;
	boolean gameover;
	boolean start;

	/**
	 * Create the panel.
	 */
	public Birdpanel() {
		// gameover = false;
		// start = false;
		// counter = 0;// use to spawn a wall
		// score = 0;
		try {
			init();
			// gr = new ground();
			// bd = new bird();
			background = ImageIO.read(new FileInputStream("sources/背景/白天.png"));
			startImage = ImageIO.read(new FileInputStream("sources/其他/开始.png"));
			overImage = ImageIO.read(new FileInputStream("sources/其他/gameover.png"));
			restart = ImageIO.read(new FileInputStream("sources/其他/重来.png"));
			// map = new Gamemap();
			// background =
			// ImageIO.read(this.getClass().getResource("/sources/背景/白天.png"));
			// startImage =
			// ImageIO.read(this.getClass().getResource("/sources/其他/开始.png"));
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

		if (!start) {
			g.drawImage(startImage, 0, 100, 432, 500, null);
			g.drawImage(gr.getIMG(), gr.getX(), 600, 864, 74, null);
		} else {
			if (!gameover) {
				//g.clearRect(0, 0, 432, 674);
				//g.drawImage(background, 0, 0, 432, 600, null);
				for (int i = 0; i < map.walls.size(); i++) {
					g.drawImage(map.walls.get(i).getIMG(), map.walls.get(i).getX(), map.walls.get(i).getY(), null);
				}
				// g.drawImage(gr.getIMG(), gr.getX(), 600, 864, 74, null);
				g.drawImage(gr.getIMG(), gr.getX(), 600, 864, 74, null);
				if (statement >= 3)
					statement = 0;
				g.drawImage(bd.getIMG()[statement], bd.getX(), bd.getY(), null);
				Font font = new Font("楷体", Font.BOLD, 30);
				g.setFont(font);
				g.setColor(Color.white);
				g.drawString("分数" + score, 10, 30);

			}
		}
		if (gameover) {
			// for (int i = 0; i < map.walls.size(); i++) {
			// g.drawImage(map.walls.get(i).getIMG(), map.walls.get(i).getX(),
			// map.walls.get(i).getY(), null);
			// }
			// g.drawImage(gr.getIMG(), gr.getX(), 600, 864, 74, null);
			// g.drawImage(bd.getIMG()[0], bd.getX(), bd.getY(), null);
			//g.clearRect(0, 0, 432, 674);
			g.drawImage(gr.getIMG(), gr.getX(), 600, 864, 74, null);
			g.drawImage(overImage, 80, 200, null);
			g.drawImage(restart, 120, 300, null);
		}
	}

	/**
	 * 当游戏未开始时开始 开始后改变速度
	 */
	public void action() {
		// initialize
		map.bd = bd;
		// enter frame
		// add listener function of mouse
		// addKeyListener(new KeyAdapter() {
		// @Override
		// public void keyReleased(KeyEvent e) {
		// System.out.println("mmmmmmm");
		// int code = e.getKeyCode();
		// if (KeyEvent.VK_SPACE == code) {
		// map.bd.changeSpeed();
		//
		// }
		// }
		// });
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (!start) {
					// start the game
					start = true;
				} else {
					// change the speed
					if (!gameover) {
						map.bd.changeSpeed();
					}
					if (gameover) {
						// restart
						init();

					}
				}
			}
		});

		// runtime function
		while (true) {
			// contents
			if (!gameover && start) {
				try {
					if (statement >= 3)
						statement = 0;

					bd.move();
					if (bd.getY() > 600) {
						gameover = true;
					}
					if (map.collision()) {
						gameover = true;
					}
					gr.move();
					// TODO add walls
					if (counter < 300) {
						counter++;
					} else {
						map.createWall();
						counter = 0;
					}
					for (int i = 0; i < map.walls.size(); i++) {
						map.walls.get(i).move();
						if (map.walls.get(i).getX() < -100) {
							map.walls.remove(map.walls.get(i));
							score += 10;
						}
						// TODO set walls
					}
					Thread.sleep(10);
					statement++;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			//refresh the window
			repaint();
		}
	}

	public void init() {
		gameover = false;
		start = false;
		counter = 0;
		score = 0;
		bd = new bird();
		gr = new ground();
		map = new Gamemap();
		map.bd = bd;
	}

}
