package com.kata.tictactoe;

public class Game {
    private static final char TOKEN_X = 'X';
    private static final char TOKEN_O = 'O';
    private static final int SIZE = 3;
    private static final char EMPTY_SPACE = '\0';
    private char lastPlayerToken;
    GameBoard gameBoard = new GameBoard();

    public Game() {
        gameBoard.createNewLayout();
    }

    public String playAt(Position position) {
        if (isPositionNotAvailable(position)) {
            displayBoard();
            System.out.println("Position is Occupied");
            throw new RuntimeException("Position is Occupied");
        }
        char token = getNextToken();
        lastPlayerToken = token;
        gameBoard.mark(token, position);
        if (isWinIfHorizontalRowOccupiedWithSameToken() || isWinIfVerticalColumnOccupiedWithSameToken() ||
                isWinIfTopLeftToBottomRightDiagonalOccupiedWithSameToken() || isWinIfTopRightToBottomLeftDiagonalOccupiedWithSameToken()) {
            return lastPlayerToken + " is the Winner";
        }
        if (isDraw()) {
            displayBoard();
            System.out.println("Game is draw");
            return "Game is draw";
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

    public boolean isWinIfHorizontalRowOccupiedWithSameToken() {
        char[][] gridlayout = gameBoard.getLayout();
        for (int rows = 0; rows < gridlayout[0].length; rows++) {
            if (gridlayout[rows][0] == gridlayout[rows][1] && gridlayout[rows][1] == gridlayout[rows][2]
                    && gridlayout[rows][0] != EMPTY_SPACE) {
                if (gridlayout[rows][0] == 'X' || gridlayout[rows][0] == 'O') {
                    displayBoard();
                    System.out.println(gridlayout[rows][0] + " is the Winner");
                }
                return true;
            }
        }
        return false;
    }

    public boolean isWinIfVerticalColumnOccupiedWithSameToken() {
        char[][] gridlayout = gameBoard.getLayout();
        for (int columns = 0; columns < gridlayout[0].length; columns++) {
            if (gridlayout[0][columns] == gridlayout[1][columns] && gridlayout[1][columns] == gridlayout[2][columns]
                    && gridlayout[0][columns] != EMPTY_SPACE) {
                if (gridlayout[0][columns] == 'X' || gridlayout[0][columns] == 'O') {
                    displayBoard();
                    System.out.println(gridlayout[0][columns] + " is the Winner");
                }
                return true;
            }
        }
        return false;
    }

    public boolean isWinIfTopLeftToBottomRightDiagonalOccupiedWithSameToken() {
        char[][] gridlayout = gameBoard.getLayout();
        if (gridlayout[0][0] == gridlayout[1][1] && gridlayout[1][1] == gridlayout[2][2]
                && gridlayout[0][0] != EMPTY_SPACE) {
            if (gridlayout[0][0] == 'X' || gridlayout[0][0] == 'O') {
                displayBoard();
                System.out.println(gridlayout[0][0] + " is the Winner");
            }
            return true;
        }
        return false;
    }

    public boolean isWinIfTopRightToBottomLeftDiagonalOccupiedWithSameToken() {
        char[][] gridlayout = gameBoard.getLayout();
        if (gridlayout[0][2] == gridlayout[1][1] && gridlayout[1][1] == gridlayout[2][0]
                && gridlayout[0][2] != EMPTY_SPACE) {
            if (gridlayout[0][2] == 'X' || gridlayout[0][2] == 'O') {
                displayBoard();
                System.out.println(gridlayout[0][2] + " is the Winner");
            }
            return true;
        }
        return false;
    }

    public boolean isDraw() {
        char[][] gridlayout = gameBoard.getLayout();
        for (int row = 0; row < SIZE; row++) {
            for (int column = 0; column < SIZE; column++) {
                if (gridlayout[row][column] == EMPTY_SPACE) {
                    return false;
                }
            }
        }
        return true;
    }

    public void displayBoard() {
        char[][] gridlayout = gameBoard.getLayout();
        System.out.println();
        for (int row = 0; row < SIZE; ++row) {
            for (int column = 0; column < SIZE; ++column) {
                System.out.print("\t" + gridlayout[row][column]);
                if (column != SIZE - 1) {
                    System.out.print(" |");
                }
            }
            System.out.println();
            if (row != SIZE - 1) {
                System.out.println("------------------");
            }
        }
        System.out.println();
    }
}