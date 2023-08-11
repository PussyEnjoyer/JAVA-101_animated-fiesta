import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;


public class Gameplay extends JPanel implements KeyListener, ActionListener {

	private boolean play = false;
	private int score = 0;
	private int totalbricks = 21;//savage
	private Timer timer;
	private int delay = 8;
	
	private int playerX = 310;
	
	private int ballposX = 120;
	private int ballposY = 350;
	
	private int balldirX = -1;
	private int balldirY = -2;
	
	public Gameplay() {
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer = new Timer(delay, this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		//background kolorki ezz
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 700, 700);
		//granice cece borderki zenon playlista ez polecam :D
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, 3, 692);
		g.fillRect(0, 0, 692, 3);
		g.fillRect(684, 0, 3, 692);
		
		//paletka wiktor referencja 
		g.setColor(Color.CYAN);
		g.fillRect(playerX, 550, 100, 8);
		//ball🗿🗿🗿🗿🗿🗿🗿🗿🗿🗿🗿🗿🗿🗿
		g.setColor(Color.CYAN);
		g.fillOval(ballposX, ballposY, 20, 20);
		
		g.dispose();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		timer.start();
		repaint();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {/*nie potrzebujemy*/}
	@Override
	public void keyReleased(KeyEvent e) {/*nie potrzebujemy*/}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()== KeyEvent.VK_RIGHT){
			if(playerX >= 600) {
				playerX = 600;
			} else {
				moveR();
			}
		}
		if(e.getKeyCode()== KeyEvent.VK_LEFT)
		{
			if(playerX < 10) {
				playerX = 10;
			} else {
				moveL();
			}
			
		}		
	}
	public void moveR() {
		play = true;
		playerX+=20;
	}
	public void moveL() {
		play = true;
		playerX-=20;
	}

	

}
