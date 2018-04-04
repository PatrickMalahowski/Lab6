package game;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;

public class Item {

	private int x;
	private int y;
	private String imagePath;
	
	
	public Item(int x, int y, String imagePath)
	{
		this.x = x;
		this.y  = y;
		this.imagePath = imagePath;

	}
	
	public ImageIcon makeIcon() {
		
		ImageIcon myIcon = new ImageIcon(imagePath);
		Image newImage = myIcon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
		myIcon.setImage(newImage);
		
		return(myIcon);
	
	}
	
	public static ArrayList<Item> genItems() {
		
		Random randCoords = new Random();
		Item burger;
		
		int itemCount = 5 + ((Game.getLevel()-1)*2);
		
		ArrayList<Item> itemList = new ArrayList<Item>();
		
		for(int i = 0; i < itemCount; i++) {
			
			int randX = randCoords.nextInt(801);
			int randY = randCoords.nextInt(801);
			
			burger = new Item(randX, randY, "./src/Images/burger.jpg");
			itemList.add(burger);
			
		}
		
		return itemList;
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
