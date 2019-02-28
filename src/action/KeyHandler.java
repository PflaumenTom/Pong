package action;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import game.PlayerOne;
import game.PlayerTwo;

public class KeyHandler implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		
		case KeyEvent.VK_UP:
			PlayerOne.minusY();
			break;
		case KeyEvent.VK_DOWN:
			PlayerOne.plusY();
			break;
		
		case KeyEvent.VK_W:
			PlayerTwo.minusY();
			break;
		case KeyEvent.VK_S:
			PlayerTwo.plusY();
			break;
		}
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
	

}
