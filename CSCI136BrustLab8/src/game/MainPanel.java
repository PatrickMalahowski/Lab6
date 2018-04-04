package game;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JPanel;
import javax.swing.Timer;

public class MainPanel extends JPanel {

	MainPanel GamePanel;
	Game gamePlay = new Game(this);
	Player burglar = gamePlay.getPlayer();
	//Player burglar = new Player(400, 400, "./src/Images/burgler.jpeg");
	Movement m = new Movement(this);
	Enemy badGuy = gamePlay.getEnemy();

	ArrayList<Item> burgers = gamePlay.getItems();
	Timer myTimer = new Timer(500, new timerListener());
	
	public MainPanel() throws FileNotFoundException
	{
		setPreferredSize(new Dimension(800,800));
		setFocusable(true);
		myTimer.start();
	}
	
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		for(int i = 0; i < burgers.size(); i++) {
			page.drawImage(burgers.get(i).makeIcon().getImage(), burgers.get(i).getX(), burgers.get(i).getY(), null);
			
		}
		
		page.drawImage(burglar.makeIcon().getImage(), burglar.getX(), burglar.getY(), null);
		page.drawImage(badGuy.makeIcon().getImage(), badGuy.getX(), badGuy.getY(), null);
		
	}
	
	public Player getPlayer() {
		return burglar;
	}

private class timerListener implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		badGuy.setX(badGuy.getX() + 5);
		badGuy.setY(badGuy.getY() + 5);
		repaint();
	}
	
}

}
