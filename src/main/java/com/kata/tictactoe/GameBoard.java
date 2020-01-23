package com.kata.tictactoe;

public class GameBoard {
    public static final int GRID_SIZE = 3;
    private char[][] gridLayout;

    public void createNewLayout() {
        gridLayout = new char[GRID_SIZE][GRID_SIZE];
    }

    public void mark(char token, Position position) {
        if (position != null)
            gridLayout[position.getRow()][position.getColumn()] = token;
    }

    public char getToken(Position position) {
        return gridLayout[position.getRow()][position.getColumn()];
    }
}