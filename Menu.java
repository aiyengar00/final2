import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Menu extends JFrame implements ImageObserver {
	private ImageIcon image1;
	private JLabel label1;
	private ImageIcon image2;
	private JLabel label2;
	private int highscore;
	private BufferedImage img = null;
	private boolean startGame = false;

	public Menu() {
		setFocusable(true);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				startGame = true;
			}

		});
		{
			try {
				img = ImageIO.read(new File("text.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}

			JFrame myJFrame = new JFrame();
			myJFrame.setContentPane(new Picture(img));
			myJFrame.setSize(800, 800);
			myJFrame.setVisible(true);
			myJFrame.setResizable(false);
		}
	}


	public void mouseClicked(MouseEvent e) {
		startGame = true;
	}

	public boolean getStartGame() {
		return startGame;
	}

}
