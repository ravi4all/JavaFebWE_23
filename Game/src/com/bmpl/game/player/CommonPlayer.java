package com.bmpl.game.player;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import com.bmpl.game.utils.Constants;

abstract class CommonPlayer extends JPanel implements Constants{
	BufferedImage playerImg;
	protected int x;
	protected int y;
	protected int w;
	protected int h;
	protected int speed;
	protected int imageIndex;
	protected int currentMove;
	
	abstract BufferedImage defaultImage();
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getCurrentMove() {
		return currentMove;
	}

	public void setCurrentMove(int currentMove) {
		this.currentMove = currentMove;
	}

	public void paintPlayer(Graphics pen) {
		pen.drawImage(defaultImage(), x, y, w, h, null);
	}
	
}
