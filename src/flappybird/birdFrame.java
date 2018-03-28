package flappybird;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class birdFrame extends JFrame {

	Birdpanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		birdFrame frame = new birdFrame();
		frame.panel.action();
	}

	/**
	 * Create the frame.
	 */
	public birdFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(birdFrame.class.getResource("/\u9E1F/\u4E0B.png")));
		setTitle("Flappy Bird For Test Project - Alpha 0.5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 799, 550);
		panel = new Birdpanel();
		add(panel);
		setSize(432, 674);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);

	}

}
