package com.kata.tictactoe;

public class Game {
    private static final char TOKEN_X = 'X';
    private static final char TOKEN_O = 'O';
    private char lastPlayerToken;
    GameBoard gameBoard = new GameBoard();

    public Game() {
        gameBoard.createNewLayout();
    }

    public void playAt(Position position) {
        if (isPositionNotAvailable(position)) {
            throw new RuntimeException("Position is Occupied");
        }
        char token = getNextToken();
        lastPlayerToken = token;
        gameBoard.mark(token, position);
    }

    private boolean isPositionNotAvailable(Position position) {
        return !(getTokenAt(position) != TOKEN_X && getTokenAt(position) != TOKEN_O);
    }

    private char getNextToken() {
        if (lastPlayerToken == TOKEN_X) {
            return TOKEN_O;
        }
        return TOKEN_X;
    }

    public char getTokenAt(Position position) {
        return gameBoard.getToken(position);
    }
}