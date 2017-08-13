package com.company.ticTacGame;

public class TheGame {

	public static void main(String[] args) {
		Referee referee = new Referee();

		Player player1 = new Player(ActionFigure.NOUGHT);
		Player player2 = new Player(ActionFigure.CROSS);

		Board board = new Board(); 

		while (board.hasMoreSpace()) {
			Move move = player1.turn(board);
			referee.put(move, board);
			board.print();
			if (referee.isWin(move, board)) {
				System.out.println("Winner is player 1");
				return;
			}
			move = player2.turn(board);
			referee.put(move, board);
			board.print();
			if (referee.isWin(move, board)) {
				System.out.println("Winner is player 2");
				return;
			}
		}

		System.out.println("Draw");
	}
}
