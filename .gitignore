import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;

import javax.imageio.*;
import javax.swing.*;
public class Main {
	private static Menu menu = new Menu();
	private static Game game = new Game();
	public static void main(String args[]) throws InterruptedException {
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.setVisible(true);
		menu.pack();
		
		game();
	}
	
	public static void game() throws InterruptedException {
		
		
		Timer timer = new Timer(5000, new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				game.repaint();
				game.move();
			};
		});
		
//		frame.add(menu);
//		menu.setVisible(true);
//		frame.revalidate();
//		frame.repaint();
//		
//		while(menu.getStartGame() == false) {
//			Thread.sleep(10);
//		}
//		
//		frame.remove(menu);
//		frame.add(game);
//		game.setVisible(true);
//		frame.revalidate();
//		
//		timer.start();
	}
	
}
