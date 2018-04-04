package game;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Player {

	private int x;
	private int y;
	private String imagePath;

	public Player(int x, int y, String imagePath) {

		this.x = x;
		this.y = y;
		this.imagePath = imagePath;

	}

	public ImageIcon makeIcon() {

		ImageIcon myIcon = new ImageIcon(imagePath);
		Image newImage = myIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		myIcon.setImage(newImage);

		return (myIcon);

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
	
	public void setPath(String imagePath) {
		
		this.imagePath = imagePath;
	}



}
