package com.kata.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    private Game game;

    @Before
    public final void before() {
        game = new Game();
    }

    @Test
    public void givenAPositionWhenFirstTurnThenGameShouldMarkX() {
        Position firstPosition = new Position(0, 0);
        game.playAt(firstPosition);
        assertEquals('X', game.getTokenAt(firstPosition));
    }

    @Test
    public void givenAPositionValueWhenSecondTurnThenGameShouldMarkO() {
        Position firstPosition = new Position(0, 0);
        Position secondPosition = new Position(0, 1);
        game.playAt(firstPosition);
        game.playAt(secondPosition);
        assertEquals('O', game.getTokenAt(secondPosition));
    }
}