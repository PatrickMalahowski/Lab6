package game;

import java.io.FileNotFoundException;

import javax.swing.JFrame;

import game.MainPanel;

public class MainFrame {

	public static void main(String[] args) throws FileNotFoundException {
		
	  // create the instance of the frame
    	JFrame myFrame = new JFrame("Fun Game");
    	
    	// set up the default close operation        	
    	myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // create the instance of the panel
    	MainPanel newPanel = new MainPanel();
    
    // add panel to the frame
    	myFrame.getContentPane().add(newPanel);
    
    // pack the frame
    	myFrame.pack();

    // set visibility of the frame to true
    	myFrame.setVisible(true);
		// TODO Auto-generated method stub

	}

}
