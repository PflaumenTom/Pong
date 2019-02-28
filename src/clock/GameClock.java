package clock;

import game.*;

public class GameClock extends Thread{
    public static boolean running = true;

    public void run(){
    	
        while(running){
        	try {
				sleep(7);
				Ball.movement();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            
        }
        
    }

}
