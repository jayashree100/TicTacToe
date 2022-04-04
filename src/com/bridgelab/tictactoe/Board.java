package com.bridgelab.tictactoe;

public class Board {
	int[][] board;

	public Board(int[][] board) {
		board = new int[3][];
		for (int i = 0; i < board.length; i++) {
			board[i] = new int[3];
		}
	}

	public Board(int size) {
		board = new int[size][];
		for (int i = 0; i < board.length; i++) {
			board[i] = new int[size];
		}
	}

}
