import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;

import javax.imageio.*;
import javax.swing.*;
public class Picture extends JComponent {
	private Image img;
	public Picture(Image img) {
		this.img = img;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0, this);
	}
}
