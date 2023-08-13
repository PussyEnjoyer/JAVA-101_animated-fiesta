import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
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
		
	private MapGenerator map;
	
	public Gameplay() {
		map = new MapGenerator(3,7);
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
		//BOLKI mc D:D
		map.draw((Graphics2D)g);
		
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
		if(play) {
			if(new Rectangle(ballposX,ballposY,20,20).intersects(new Rectangle(playerX,550,100,8))) {
				balldirY = - balldirY;
			}
			
			A: for(int i =0;i<map.map.length;i++) {
				for(int j =0;j<map.map[0].length;j++) {
					if(map.map[i][j]>0) {
						int brickX = j*map.brickW+80;
						int brickY = i*map.brickH+50;
						int brickW = map.brickW;
						int brickH = map.brickH;
						
						Rectangle rect = new Rectangle(brickX, brickY, brickW, brickH);
						Rectangle ballRect = new Rectangle(ballposX,ballposY,20,20);
						Rectangle brickRect = rect;
						
						if(ballRect.intersects(brickRect)) {
							map.setBrickValue(0, i, j);
							totalbricks--;
							score+=5;
							if(ballposX+19<=brickRect.x||ballposX+1>=brickRect.x+brickRect.width) {
								balldirX=-balldirX;
							} else {
								balldirY=-balldirY;
							}
							
							break A;
						}
					}
				}
			}
			
			
			
			ballposX += balldirX;
			ballposY += balldirY;
			if(ballposY < 0) {
				balldirY = - balldirY;
			} 
			if(ballposX < 0) {
				balldirX = - balldirX;
			}
			if(ballposX > 670) {
				balldirX = - balldirX;
			}
		}
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
