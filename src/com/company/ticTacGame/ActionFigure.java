package com.company.ticTacGame;

/**
 * Created by user on 09.08.2017
 */
enum  ActionFigure {
    NOUGHT, CROSS;

    @Override
    public String toString() {
        switch (this) {
            case CROSS: return "x";
            case NOUGHT: return "o";
            default: return " ";
        }
    }
}
