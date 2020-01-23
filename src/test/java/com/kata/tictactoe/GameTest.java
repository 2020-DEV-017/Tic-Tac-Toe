package com.kata.tictactoe;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    @Test
    public void givenAPositionWhenFirstTurnThenGameShouldMarkX(){
        GameBoard gameboard = new GameBoard();
        Position position = new Position();
        Game game = new Game();
        game.playAt(position);
        assertEquals("X",gameboard.getTokenAt(position));
    }
    @Test
    public void givenAPositionValueWhenSecondTurnThenGameShouldMarkO(){
        Position firstPosition = new Position(0,0);
        Position secondPosition = new Position(0,1);
        Game game = new Game();
        game.playAt(firstPosition);
        game.playAt(secondPosition);
        assertEquals('O',game.getTokenAt(secondPosition));
    }

}