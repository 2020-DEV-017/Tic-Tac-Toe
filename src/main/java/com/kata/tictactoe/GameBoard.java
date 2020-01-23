package com.kata.tictactoe;

public class GameBoard {
    private char[][] gridLayout;

    public String getTokenAt(Position position) {
        return "X";
    }

    public void createNewLayout() {
        gridLayout = new char[3][3];
    }

    public void mark(char token, Position position) {
        if (position != null)
            gridLayout[position.getRow()][position.getColumn()] = token;
    }

    public char getToken(Position position) {
        return gridLayout[position.getRow()][position.getColumn()];
    }
}