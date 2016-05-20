import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;

import javax.imageio.*;
import javax.swing.*;
public class Game extends JPanel {
	public static final int SIZE = 800;
	Basketball ball = new Basketball();
	Wall wall1 = new Wall(WIDTH);
	Wall wall2 = new Wall(WIDTH * 3 / 2);
	private static int score = 0;
	private int scroll = 0;
	private static boolean dead = false;
	private static String msg = "";
	private BufferedImage img = null;{
		try {
			ImageIO.read(new File("court.jpg"));
		} catch(IOException e) {
			System.out.println("error");
		}
	}
	public Game() {
		this.addMouseListener(new MouseAdapter(){

			public void mousePressed(MouseEvent arg0) {
				ball.jump();
			}
		
		});	
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawImage(img, 0, 0, null);
		g.drawImage(img, scroll + SIZE, 0, null);
		
		try {
			wall1.paint(g);
			wall2.paint(g);
			ball.paint(g);
		} catch(IOException e) {
			
		}
		
		
	}
	
	public void move() {
		wall1.move();
		wall2.move();
		ball.move();
		scroll += wall1.getSpeed();
		if(scroll == -SIZE) {
			scroll = 0;
		}
		
		if(dead) {
			wall1.setX(WIDTH / 2);
			wall2.setX(WIDTH + (WIDTH / 2));
			dead = false;
		}
		
		if((wall1.getX() == ball.getX()) || (wall2.getX() == ball.getX())) {
			score();
		}
	}
	
	public void score() {
		score++;
	}

	public int getScore() {
		return score;
	}

	public static void setScore(int newScore) {
		score = newScore;
	}

	public boolean isDead() {
		return dead;
	}

	public static void setDead(boolean isDead) {
		dead = isDead;
	}

	public String getMsg() {
		return msg;
	}

	public static void setMsg(String newMsg) {
		msg = newMsg;
	}
}
