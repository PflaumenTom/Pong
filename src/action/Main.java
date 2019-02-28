package action;

import clock.GameClock;
import game.Ball;

import gui.Gui;

public class Main {
	
	public static void main(String[] ages) {
		Gui g = new Gui();
		GameClock gc = new GameClock();
		
		g.creat();
		gc.run();
		
	}
	
}
