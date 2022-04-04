package com.bridgelab.tictactoe;

public class Board {
	int[][] board;

	public Board(int[][] board) {

		this.board = board;
	}
	
	public Board(int size ) {
		board = new int[size][];
		for(int i =0; i < board.length; i++) {
			board[i] = new int[size];
		}
	}

}
