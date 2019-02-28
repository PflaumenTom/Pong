package game;

import gui.Gui;

public class PlayerOne {
	
	private static int score;
	private static int x = Gui.getWidth() - 50,y  = Gui.getHeight() / 2 - 60;
	

	
	public static int getX() {
		return x;
	}


	public static void setX(int x) {
		PlayerOne.x = x;
	}

	public static void plusY() {
		if(! (y >= Gui.getHeight() - 150))
			y += 50;
	}
	public static void minusY() {
		if(! (y <= 0))
		y -= 50;
	}
	
	public static int getY() {
		return y;
	}


	public static void setY(int y) {
		PlayerOne.y = y;
	}
	
	public static int getScore() {
		return score;
	}
	
	public static void resetScore() {
		score = 0;
	}
	
	public static void setScore(int pScore) {
		score = pScore;
	}
	
	public static void plusScore(int pScore) {
		score += pScore;
	}
	
	
}
