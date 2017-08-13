package com.company.ticTacGame;

public class Board {

	public ActionFigure[][] arrayBoard;



	Board() {
		this.arrayBoard = new ActionFigure[3][3];
	}


	public boolean hasMoreSpace() {
		int freeSpaceCount = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arrayBoard[i][j] == null) {
					freeSpaceCount++;
				}
			}
		}
		return freeSpaceCount >= 2;
	}

	public void print() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arrayBoard[i][j] != null) {
					System.out.print(arrayBoard[i][j].toString() + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

}
