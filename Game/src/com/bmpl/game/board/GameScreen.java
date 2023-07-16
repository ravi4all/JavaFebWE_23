package com.bmpl.game.board;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.bmpl.game.player.Ken;
import com.bmpl.game.player.Ryu;
import com.bmpl.game.utils.Constants;

public class GameScreen extends JPanel implements Constants {
	BufferedImage imageBg;
	Ryu ryu;
	Ken ken;
	Timer timer;
	public GameScreen() throws IOException {
		ryu = new Ryu();
		ken = new Ken();
		setFocusable(true);
		bindEvents();
		loadBackground();
		gameLoop();
	}
	
	// in every 200 millisecond repaint the screen
	private void gameLoop() {
		timer = new Timer(200, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
			}
		});
		timer.start();
	}
	
	void isColloide() {
		// check distance b/w 2 players using distance formula
	}
	
	void bindEvents() {
		this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
//				System.out.println("Key Typed : " + e.getKeyCode());
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
//				System.out.println("Key Released : " + e.getKeyCode());
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
//				System.out.println("Key Pressed : " + e.getKeyCode());
				// Ryu Movement
				if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					ryu.setSpeed(SPEED);
					ryu.move();
					ryu.setCurrentMove(WALK);
//					repaint();
				}
				else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					ryu.setSpeed(-SPEED);
					ryu.move();
					ryu.setCurrentMove(WALK);
//					repaint();
				}
				
				// Ryu Movement
				if(e.getKeyCode() == KeyEvent.VK_L) {
					ken.setSpeed(SPEED);
					ken.move();
					ken.setCurrentMove(WALK);
//					repaint();
				}
				else if(e.getKeyCode() == KeyEvent.VK_J) {
					ken.setSpeed(-SPEED);
					ken.move();
					ken.setCurrentMove(WALK);
//					repaint();
				}
			}
		});
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		showBackground(g);
		ryu.paintPlayer(g);
		ken.paintPlayer(g);
	}
	
	private void showBackground(Graphics pen) {
		// x,y,w,h
		pen.drawImage(imageBg, 0, 0, SCREENWIDTH, SCREENHEIGHT, null);
	}
	private void loadBackground() {
		try {
			imageBg = ImageIO.read(GameScreen.class.getResource(BACKGROUND_IMAGE));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
