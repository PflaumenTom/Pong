package game;

import gui.Draw;
import gui.Gui;

public class Ball {
	
	private static int x = Gui.getWidth() / 2 -200;
	private static int y = Gui.getHeight() / 2 - 50;
	private static int xa = 2;
	private static int ya = 2;

	public static void score() {
		
		if(x <= 0 - 40) {
			xa = 2;
			PlayerTwo.plusScore(1);
			if(checkWinTwo()) {
				PlayerTwo.resetScore();
				Draw.win = true;
				Draw.player = "Player One";
				PlayerOne.resetScore();
				PlayerTwo.resetScore();
			}
			restet();
		}else if( x >= Gui.getWidth() ) {
			xa = -2;
			PlayerOne.plusScore(1);
			if(checkWinOne()) {
				PlayerOne.resetScore();
				Draw.win = true;
				Draw.player = "Player Two";
				PlayerOne.resetScore();
				PlayerTwo.resetScore();
			}
			restet();
		}
	}
	public static boolean checkWinOne() {
		boolean help = false;
		if(PlayerOne.getScore() == 10) {
			help = true;
		}
		return help;
	}
	public static void restet() {
		x = Gui.getWidth() / 2 -50;
		y = Gui.getHeight() / 2 - 50;
	}
	public static boolean checkWinTwo() {
		boolean help = false;
		if(PlayerTwo.getScore() == 10) {
			help = true;
		}
		return help;
	}
	public static void movement() {
		if(y>= Gui.getHeight() - 75) {
			ya = -2;
		}else if(y <= 0) {
			ya = 2;
		}
			y += ya;
		//PlayerOne Collision 
		if(x == PlayerOne.getX() -20 && y > PlayerOne.getY() - 50 && y < PlayerOne.getY()+100) {
			if(x == PlayerOne.getX() -20 && y > PlayerOne.getY() +50 && y < PlayerOne.getY()+ 100) {
				xa = -2;
				ya = 2;
			}else {
				xa = -2;
				ya = -2;
			}
		}
		//PlayerTwo Collision
		if(x == PlayerTwo.getX() +20 && y > PlayerTwo.getY() - 50 && y < PlayerTwo.getY()+100) {
			
			if(x == PlayerTwo.getX() +20 && y > PlayerTwo.getY() +50 && y < PlayerTwo.getY()+ 100) {
				xa = 2;
				ya = 2;
			}else {
				xa = 2;
				ya = -2;
			}
		}
			x += xa;
		
		score();
		
	}
	public static int getX() {
		return x;
	}
	public static void setX(int x) {
		Ball.x = x;
	}
	public static int getY() {
		return y;
	}
	public static void setY(int y) {
		Ball.y = y;
	}
	
	
	
}
