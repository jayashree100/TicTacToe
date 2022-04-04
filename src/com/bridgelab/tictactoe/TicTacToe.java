package com.bridgelab.tictactoe;

import java.util.Scanner;

public class TicTacToe {
	public static char userTurn;
	public static char computerTurn;
	public static char[] gameArray = new char[10];
	public static Scanner scanner = new Scanner(System.in);
	
	public static void ticTacToe() {
		for(int i = 0; i < gameArray.length; i++) {
			gameArray[i] = ' ';
		}
	}
	
	public static char user(Scanner scanner) {
		System.out.println("Enter your choice X or O only");
		return scanner.next().toUpperCase().charAt(0);
	}
	
	public static void main(String args[]) {
		ticTacToe();
		userTurn = user(scanner);
		computerTurn = (userTurn == 'X') ? 'O' : 'X';
	}

}
