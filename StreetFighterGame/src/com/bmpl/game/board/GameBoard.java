package com.bmpl.game.board;

import javax.swing.JFrame;

public class GameBoard extends JFrame {
	
	public GameBoard() {
		setTitle("Street Fighter Game By Brain Mentors");
		// set size (width and height) of screen
		setSize(1800,800);
		setLocationRelativeTo(null);
		GameScreen screen = new GameScreen();
		add(screen);
		// set screen visibility true
		setVisible(true);
	}
	
	public static void main(String[] args) {
		GameBoard obj = new GameBoard();
	}
}
