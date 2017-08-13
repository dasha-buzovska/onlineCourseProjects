package com.company.ticTacGame;

//створює гравця, перевіряє чи може він походити в тій чи іншій клітинці
class Player {

	private ActionFigure figure;


	Player(ActionFigure figure) {
		this.figure = figure;
	}

	Move turn(Board board) {
		Move step = new Move((int)Math.floor(Math.random()*3), (int)Math.floor(Math.random()*3), figure);
		//generate one more time
		while (board.arrayBoard[step.getX()][step.getY()] != null) {
			step = new Move((int)Math.floor(Math.random()*3), (int)Math.floor(Math.random()*3), figure);
		}
		return step;
	}

}
