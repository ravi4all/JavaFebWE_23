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

public class Ryu extends CommonPlayer implements Constants {
	private BufferedImage idleImages[] = new BufferedImage[5];
	private BufferedImage walkImages[] = new BufferedImage[5];
	
	public Ryu() throws IOException {
		x = 300;
		w = 300;
		h = 400;
		y = GROUND - h;
		speed = SPEED;
		imageIndex = 0;
		currentMove = IDLE;	// player in IDLE state
		playerImg = ImageIO.read(Ryu.class.getResource("ryu_player.png"));
		loadIdleImages();
		loadWalkImages();
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
	
	private void loadIdleImages() {
		idleImages[0] = playerImg.getSubimage(5, 10, 64, 96);
		idleImages[1] = playerImg.getSubimage(73, 12, 61, 91);
		idleImages[2] = playerImg.getSubimage(141, 12, 61, 91);
		idleImages[3] = playerImg.getSubimage(210, 8, 56, 95);
		idleImages[4] = playerImg.getSubimage(276, 8, 60, 95);
	}
	
	public BufferedImage showIdle() {
		if(imageIndex > 4) {
			imageIndex = 0;
		}
		BufferedImage img = idleImages[imageIndex];
		imageIndex++;
		return img;
	}
	
	private void loadWalkImages() {
		walkImages[0] = playerImg.getSubimage(76, 128, 63, 92);
		walkImages[1] = playerImg.getSubimage(151, 128, 67, 92);
		walkImages[2] = playerImg.getSubimage(228, 128, 65, 92);
		walkImages[3] = playerImg.getSubimage(303, 127, 59, 93);
		walkImages[4] = playerImg.getSubimage(368, 127, 56, 93);
	}
	
	public BufferedImage showWalk() {
		if(imageIndex > 4) {
			imageIndex = 0;
			currentMove = IDLE;
		}
		BufferedImage img = walkImages[imageIndex];
		imageIndex++;
		return img;
	}
	
	public BufferedImage defaultImage() {
		if(currentMove == WALK) {
			return showWalk();
		}
		else {
			return showIdle();
		}
		
	}
	
}
