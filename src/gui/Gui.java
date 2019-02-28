package gui;

import javax.swing.JFrame;

import action.KeyHandler;

public class Gui {

	Draw d;
	
	JFrame JF;
	
	private static int width = 800, height = 600;
	
	public void creat() {
		
		JF = new JFrame();
		JF.setName("Pong");
		JF.setSize(width, height);
		JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JF.setLocationRelativeTo(null);
		JF.setResizable(false);
		JF.setLayout(null);
		JF.addKeyListener(new KeyHandler());
		
		d = new Draw();
		d.setBounds(0, 0, width, height);
		d.setVisible(true);
		JF.add(d);
		
		JF.requestFocus();
		JF.setVisible(true);
	}

	public static int getWidth() {
		return width;
	}

	public static int getHeight() {
		return height;
	}
}
