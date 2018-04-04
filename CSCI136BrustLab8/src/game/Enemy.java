package game;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Enemy {
	
	private int x;
	private int y;
	private String imagePath;
	
	
	public Enemy(int x, int y, String imagePath)
	{
		this.x = x;
		this.y  = y;
		this.imagePath = imagePath;

	}
	
	public ImageIcon makeIcon() {
		
		ImageIcon myIcon = new ImageIcon(imagePath);
		Image newImage = myIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		myIcon.setImage(newImage);
		
		return(myIcon);
		
		
		
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
	

}
