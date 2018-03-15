package game;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MainPanel extends JPanel {

	JPanel GamePanel;
	
	Player myPlayer = new Player(200,150, "./src/images/cow.jpg", GamePanel);
	Player myPlayer2 = new Player(0,0, "./src/images/milk.jpg", GamePanel);
	
	ImageIcon myIcon = new ImageIcon(myPlayer.getImagePath());
	Image newImage = myIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
	
	ImageIcon myIcon2 = new ImageIcon(myPlayer2.getImagePath());
	Image newImage2 = myIcon2.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
	
	JButton myButton;
	JButton myButton2;
	Timer myTimer = new Timer(500, new timerListener());
	
	public MainPanel()
	{
		setPreferredSize(new Dimension(800,800));
		myIcon.setImage(newImage);
		myIcon2.setImage(newImage2);
		
		
		setFocusable(true);



		myTimer.start();
	}
	
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		page.drawImage(myIcon.getImage(), myPlayer.getX(), myPlayer.getY(), null);
		page.drawImage(myIcon2.getImage(), myPlayer2.getX(), myPlayer2.getY(), null);
	}

	
private class timerListener implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		myPlayer2.setX(myPlayer2.getX() + 5);
		repaint();
	}
	
}

}
