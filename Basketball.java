import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;

import javax.imageio.*;
import javax.swing.*;

public class Basketball implements ActionListener {
	private static final int DIAMETER = 50;
	private int x = (Game.SIZE / 2) - (DIAMETER / 2);
	private int y = Game.SIZE / 2;
	private int acceleration = 1;
	private int speed = 2;
	private BufferedImage img = null;{
		try {
			ImageIO.read(new File("basketball.png"));
		} catch(IOException e) {
			System.out.println("error");
		}
	}

	public Basketball() {

	}

	public void jump() {
		speed = -17;
	}

	public void move() {
		if ((y > 0) && (y < Game.SIZE)) {
			speed += acceleration;
			y += speed;
		} else {
			reset();
			Game.setDead(true);
		}
	}

	public void reset() {
		y = Game.SIZE / 2;
		speed = 2;
		Game.setScore(0);

		Game.setMsg("Try again.");

		Timer timer = new Timer(5000, new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Game.setMsg("");
			};
		});

		timer.start();
	}

	public Rectangle getRect() {
		return new Rectangle(x, y, DIAMETER, DIAMETER);
	}

	public void paint(Graphics g) throws IOException {
		
		g.drawImage(img, x, y, null);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
