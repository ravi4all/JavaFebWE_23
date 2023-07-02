package com.bmpl.game.board;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GameScreen extends JPanel {
	BufferedImage imageBg;
	public GameScreen() {
		loadBackground();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		showBackground(g);
	}
	
	private void showBackground(Graphics pen) {
		// x,y,w,h
		pen.drawImage(imageBg, 0, 0, 1800, 800, null);
	}
	private void loadBackground() {
		try {
			imageBg = ImageIO.read(GameScreen.class.getResource("bg.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
