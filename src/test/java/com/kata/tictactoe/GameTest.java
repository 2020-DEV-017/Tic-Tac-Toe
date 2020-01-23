package com.kata.tictactoe;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    @Test
    public void givenAPositionWhenFirstTurnThenGameShouldMarkX(){
        Game game = new Game();
        Position firstPosition = new Position(0,0);
        game.playAt(firstPosition);
        assertEquals('X',game.getTokenAt(firstPosition));
    }
    @Test
    public void givenAPositionValueWhenSecondTurnThenGameShouldMarkO(){
        Game game = new Game();
        Position firstPosition = new Position(0,0);
        Position secondPosition = new Position(0,1);
        game.playAt(firstPosition);
        game.playAt(secondPosition);
        assertEquals('O',game.getTokenAt(secondPosition));
    }
}