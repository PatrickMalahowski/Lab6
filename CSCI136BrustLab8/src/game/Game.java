package game;

import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;

public class Game {

	private static int level;
	private int score;
	private Player burglar;
	private Enemy popo;
	private ArrayList<Item> burgers;
	private MainPanel gamePanel;
	
	
	public Game(MainPanel gamePanel) throws FileNotFoundException {
		Game.level = 1;
		this.score = 0;
		//this.burglar = makePlayer();
		this.burglar = new Player(400, 400, "./src/Images/burgler.jpeg");
		this.popo = new Enemy(0,0, "./src/Images/theFuzz.jpg");
		this.gamePanel = gamePanel;
		this.burgers  = Item.genItems();
	}
	
	public ImageIcon endGame() {
		
		ImageIcon myIcon = new ImageIcon("./src/end.jpg");
		Image newImage = myIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		myIcon.setImage(newImage);
		
		return(myIcon);
		
	}
	
	public static int getLevel() {
		
		return level;
	}
	
	public static void updateLevel() {
		Game.level = Game.level + 1;
	}
	
	public Player getPlayer() {
		
		return burglar;
	}
	
	public void updateScore() {
		
		this.score = this.score + 1;
	}
	
	public Enemy getEnemy() {
		return this.popo;
	}
	
	public MainPanel getPanel() {
		
		return this.gamePanel;
	}
	
	public ArrayList<Item> getItems() {
		return this.burgers;
	}
	
	public Player makePlayer() throws FileNotFoundException {
		
		// initialize random class 
		Random select = new Random();
		  
		 // find all of the files in the player folder 
		 File playerFolder = new  File("./src/playerFiles/");
		 File[] listFiles = playerFolder.listFiles();
		  
		 // randomly choose one of them 
		 File useFile = listFiles[select.nextInt(listFiles.length)];
		  
		 int playX = 0; int playY = 0; String playImg = null;
		  
		 Scanner playerScanner = new Scanner(useFile);
		 while(playerScanner.hasNextLine()) { 
			 String line = playerScanner.nextLine();
			 Scanner myLineScanner = new Scanner(line); 
			 myLineScanner.useDelimiter(",");
			 while(myLineScanner.hasNext()) {
				 playX = myLineScanner.nextInt(); 
				 playY = myLineScanner.nextInt(); 
				 playImg = myLineScanner.next(); 
				 } 
			 }
		 
		 Player playReturn = new Player(playX, playY, playImg);
		 return (playReturn);
		 
	
	}
}
