package flappybird;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
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
		try {
			gr = new ground();
			bd = new bird();
			background = ImageIO.read(this.getClass().getResource("/sources/����/����.png"));
			startImage = ImageIO.read(this.getClass().getResource("/sources/����/��ʼ.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * �˴�draw
	 */
	@Override
	public void paint(Graphics g) {
		super.paint(g);

	}

	/**
	 * ����Ϸδ��ʼʱ��ʼ ��ʼ��ı��ٶ�
	 */

	public void action() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
	}

}
