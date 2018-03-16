package flappybird;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class birdFrame extends JFrame {

	Birdpanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { 
			public void run() {
				try {

					birdFrame frame = new birdFrame();
					frame.setVisible(true);
					frame.panel.action();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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
		setSize(674, 432);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);

	}

}
