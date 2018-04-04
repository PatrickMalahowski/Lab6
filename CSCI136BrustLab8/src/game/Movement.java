package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Movement implements KeyListener {
	
	MainPanel panelPointer;
	Player panelPlayer;

	// initialize attributes
	public Movement(MainPanel panelPointer) {
		this.panelPointer = panelPointer;
		panelPlayer = panelPointer.getPlayer();
		panelPointer.addKeyListener(this);
		panelPointer.setFocusable(true);
		panelPointer.requestFocus();
	}
	
	@Override
	public void keyTyped(KeyEvent arg0) {

	}
	
	public static boolean collision(int r1TopLeftX, int r1BottomRightX, int r1TopLeftY, int r1BottomRightY,
			int r2TopLeftX, int r2BottomRightX, int r2TopLeftY, int r2BottomRightY) {
		if (r1TopLeftX < r2BottomRightX && r1BottomRightX > r2TopLeftX && r1TopLeftY < r2BottomRightY
				&& r1BottomRightY > r2TopLeftY) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) {

		if (arg0.getKeyCode() == KeyEvent.VK_A) {

			panelPlayer.setX(panelPlayer.getX() - 50);
		}

		else if (arg0.getKeyCode() == KeyEvent.VK_D) {
			panelPlayer.setX(panelPlayer.getX() + 50);
		}

		else if (arg0.getKeyCode() == KeyEvent.VK_W) {
			panelPlayer.setY(panelPlayer.getY() - 50);
		}

		else if (arg0.getKeyCode() == KeyEvent.VK_S) {
			panelPlayer.setY(panelPlayer.getY() + 50);
		}
		panelPointer.repaint();


	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
