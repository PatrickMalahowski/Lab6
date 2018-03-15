package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Player implements KeyListener {
	
	private int x;
	private int y;
	private String imagePath;
	private JPanel myPanel;
	
	public Player(int x, int y, String imagePath, JPanel myPanel)
	{
		this.x = x;
		this.y  = y;
		this.imagePath = imagePath;
		this.myPanel = myPanel;
		
		myPanel.addKeyListener(this);

		
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	
	@Override
	public void keyTyped(KeyEvent arg0) {
		
		if(arg0.getKeyCode() == KeyEvent.VK_A)
		{
			
			setX(getX() - 20);
			
		}
		
		else if(arg0.getKeyCode() == KeyEvent.VK_D)
		{
			setX(getX() + 20);
		}
		
		else if(arg0.getKeyCode() == KeyEvent.VK_W)
		{
			setY(getY() + 20);
		}
		
		else if(arg0.getKeyCode() == KeyEvent.VK_S)
		{
			setY(getY() - 20);
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
