package com.bmpl.game.player;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import com.bmpl.game.board.GameScreen;
import com.bmpl.game.utils.Constants;

public class Ryu extends JPanel implements Constants {
	BufferedImage playerImg;
	private int x;
	private int y;
	private int w;
	private int h;
	private int speed;
	public Ryu() {
		x = 300;
		w = 300;
		h = 400;
		y = GROUND - h;
		speed = SPEED;
		loadIdleImages();
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void move() {
		x += speed;
	}
	
	
	public void showPlayer(Graphics pen) {
		// x,y,w,h
		//pen.drawImage(idleImg, 0, 0, 400, 600, null);
		BufferedImage idleImg = playerImg.getSubimage(5, 10, 64, 96);
		pen.drawImage(idleImg, x, y, w, h, null);
	}
	
	private void loadIdleImages() {
		try {
			playerImg = ImageIO.read(Ryu.class.getResource("ryu_player.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
