package com.bmpl.game.board;

import javax.swing.JFrame;

import com.bmpl.game.utils.Constants;

public class GameBoard extends JFrame implements Constants {
	
	public GameBoard() {
		setTitle(TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// set size (width and height) of screen
		setSize(SCREENWIDTH,SCREENHEIGHT);
		setLocationRelativeTo(null);
		GameScreen screen = new GameScreen();
		add(screen);
		setResizable(false);
		// set screen visibility true
		setVisible(true);
	}
	
	public static void main(String[] args) {
		GameBoard obj = new GameBoard();
	}
}
