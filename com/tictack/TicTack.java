package com.tictack;

import java.util.Scanner;

public class TicTack {

	static char playerSymbol, computerSymbol;
	static Scanner sc = new Scanner(System.in);

	//UC-1 Creating an empty Board 
	public static char[] createEmptyBoard() 
	{
		char[] board = new char[10];
		for (int i = 1; i < board.length; i++) 
		{
			board[i] = ' ';
		}
		return board;
	}

	//UC-2 Taking Input from player to choose between X or O 
	public static char chooseXorO() {
		System.out.println("Enter the symbol:'X' or 'O' ");
		char symbol = Character.toUpperCase(sc.next().charAt(0));
		if (symbol == 'X' || symbol == 'O') {
			playerSymbol(symbol);
			return symbol;
		} else {
			System.out.println("Invalid Character. Try Again.");
			return chooseXorO();
		}
	}

	// Determine letter for player and computer 
	public static void playerSymbol(char playerSymbols) {

		if(playerSymbols == 'X')
		{
			playerSymbol = 'X';
			computerSymbol = 'O';
		}
		else if(playerSymbols == 'O')
		{
			playerSymbol = 'O';
			computerSymbol = 'X';
		}
		System.out.println("player letter to play is "+playerSymbol);
		System.out.println("computer letter to play is "+computerSymbol);

	}


	public static void main(String[] args) {

		char[] board = createEmptyBoard();
		playerSymbol = chooseXorO();

	}

}


