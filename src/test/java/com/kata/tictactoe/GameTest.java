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
}