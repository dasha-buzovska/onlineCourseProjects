package com.company.ticTacGame;



class Referee {

	void put(Move move, Board board) {
		board.arrayBoard[move.getX()][move.getY()] = move.getFigure();
	}

	boolean isWin(Move move, Board board) {
		int horizontalLine = 0, verticalLine = 0, rightDiagonalLine = 0, leftDiagonalLine = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (move.getFigure() == board.arrayBoard[i][j]) {
					if (i == j) {
						rightDiagonalLine++;
					}
					if (i == 2 - j) {
						leftDiagonalLine++;
					}
					if (i == move.getX()) {
						horizontalLine++;
					}
					if (j == move.getY()) {
						verticalLine++;
					}
				}
			}
		}
		return Math.max(Math.max(horizontalLine,verticalLine), Math.max(leftDiagonalLine,rightDiagonalLine)) == 3;
	}

}
