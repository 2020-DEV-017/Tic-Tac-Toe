package com.kata.tictactoe;

public class Position {
    private int row;
    private int column;

    public Position(int row, int column) {
        checkBeyondGrid(row, column);
        this.row = row;
        this.column = column;
    }

    private Position() {

    }

    private void checkBeyondGrid(int row, int column) {
        if (row < 0 || row > 2 || column < 0 || column > 2) {
            throw new RuntimeException("Position is beyond gird");
        }
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

}