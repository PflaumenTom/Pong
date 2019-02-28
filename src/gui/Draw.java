package gui;

import java.awt.*;

import javax.swing.JLabel;

import game.Ball;
import game.PlayerOne;
import game.PlayerTwo;

public class Draw extends JLabel{
	
	public static boolean win = false;
	public static String player = "";
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
		
		//Draw Background
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Gui.getWidth(), Gui.getHeight());
		//Draw PlayerOne
		g.setColor(Color.WHITE);
		g.fillRect(PlayerOne.getX(), PlayerOne.getY(), 20, 100);
		//Draw PlayerTwo
		g.setColor(Color.WHITE);
		g.fillRect(PlayerTwo.getX(), PlayerTwo.getY(), 20, 100);
		// Draw Ball
		g.setColor(Color.WHITE);
		g.fillRect(Ball.getX(), Ball.getY(), 25, 25);
		//Draw Score
		g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 50));
        g.drawString(""+PlayerOne.getScore(), 95,60);
        g.drawString(""+PlayerTwo.getScore(), 655,60);
		
        if(win) {
        	g.setFont(new Font("Arial", Font.BOLD, 30));
        	g.drawString(player +" Win`s", 300, 60);
        }
        
		repaint();
	}
	
	
}
