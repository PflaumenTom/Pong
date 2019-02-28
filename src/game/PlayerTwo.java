package game;

import gui.Gui;

public class PlayerTwo {

	private static int score;
	private static int x =  30,y = Gui.getHeight() / 2 - 60;
	
	public static void plusY() {
		if(! (y >= Gui.getHeight() - 150))
			y += 50;
	}
	public static void minusY() {
		if(! (y <= 0 ))
			y -= 50;
	}
	public static int getX() {
		return x;
	}
	public static void setX(int x) {
		PlayerTwo.x = x;
	}
	public static int getY() {
		return y;
	}
	public static void setY(int y) {
		PlayerTwo.y = y;
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
