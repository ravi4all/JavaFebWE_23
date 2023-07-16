package com.bmpl.game.board;

import java.io.IOException;

import javax.swing.JFrame;

import com.bmpl.game.utils.Constants;

public class GameBoard extends JFrame implements Constants {
	
	public GameBoard() throws IOException {
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
	
	public static void main(String[] args) throws IOException {
		GameBoard obj = new GameBoard();
	}
}
