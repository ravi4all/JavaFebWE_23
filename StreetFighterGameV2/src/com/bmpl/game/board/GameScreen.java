package com.bmpl.game.board;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import com.bmpl.game.player.Ryu;
import com.bmpl.game.utils.Constants;

public class GameScreen extends JPanel implements Constants {
	BufferedImage imageBg;
	Ryu ryu;
	public GameScreen() {
		ryu = new Ryu();
		setFocusable(true);
		bindEvents();
		loadBackground();
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
				if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					ryu.setSpeed(SPEED);
					ryu.move();
					repaint();
				}
				else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					ryu.setSpeed(-SPEED);
					ryu.move();
					repaint();
				}
			}
		});
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		showBackground(g);
		ryu.showPlayer(g);
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
