package com.kata.tictactoe;

public class Game {
    private static final char TOKEN_X = 'X';
    private static final char TOKEN_O = 'O';
    private static final char EMPTY_SPACE = '\0';
    private char lastPlayerToken;
    GameBoard gameBoard = new GameBoard();

    public Game() {
        gameBoard.createNewLayout();
    }

    public String playAt(Position position) {
        if (isPositionNotAvailable(position)) {
            throw new RuntimeException("Position is Occupied");
        }
        char token = getNextToken();
        lastPlayerToken = token;
        gameBoard.mark(token, position);
        if (isWinIfHorizontalRowOccupiedWithX() || isWinIfVerticalColumnOccupiedWithX() ||
                isWinIfTopLeftToBottomRightDiagonalOccupiedWithX()) {
            return lastPlayerToken + " is the Winner";
        }
        return null;
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

    public boolean isWinIfHorizontalRowOccupiedWithX() {
        char[][] gridlayout = gameBoard.getLayout();
        for (int rows = 0; rows < gridlayout[0].length; rows++) {
            if (gridlayout[rows][0] == gridlayout[rows][1] && gridlayout[rows][1] == gridlayout[rows][2]
                    && gridlayout[rows][0] != EMPTY_SPACE) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinIfVerticalColumnOccupiedWithX() {
        char[][] gridlayout = gameBoard.getLayout();
        for (int columns = 0; columns < gridlayout[0].length; columns++) {
            if (gridlayout[0][columns] == gridlayout[1][columns] && gridlayout[1][columns] == gridlayout[2][columns]
                    && gridlayout[0][columns] != EMPTY_SPACE) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinIfTopLeftToBottomRightDiagonalOccupiedWithX() {
        char[][] gridlayout = gameBoard.getLayout();
        if (gridlayout[0][0] == gridlayout[1][1] && gridlayout[1][1] == gridlayout[2][2]
                && gridlayout[0][0] != EMPTY_SPACE) {
            return true;
        }
        return false;
    }
}