package com.tictack;

public class TicTack {

	public static char[] createBoard()
	{
		char [] board = new char[10];
		for(int pos=1;pos<10;pos++)
		{
			board[pos] = ' ';
		}
		return board; 
	}

	public static void main(String[] args) {
		char[] board = createBoard();
	}
}
