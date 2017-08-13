package com.company.ticTacGame;

public class Move {
	private int x;
	private int y;
	private ActionFigure figure;

	public Move(int x, int y, ActionFigure figure) {
		this.x = x;
		this.y = y;
		this.figure = figure;
	}


	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public ActionFigure getFigure() {
		return figure;
	}

	public void setFigure(ActionFigure figure) {
		this.figure = figure;
	}
}
