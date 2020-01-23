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

    @Test
    public void givenAPositionValueWhenThirdTurnThenGameShouldMarkX() {
        Position firstPosition = new Position(0, 0);
        Position secondPosition = new Position(0, 1);
        Position thirdPosition = new Position(1, 0);
        game.playAt(firstPosition);
        game.playAt(secondPosition);
        game.playAt(thirdPosition);
        assertEquals('X', game.getTokenAt(thirdPosition));
    }

    @Test(expected = RuntimeException.class)
    public void givenInValidPositionValueWhenOutsideGridSizeThenGameReturnException() {
        new Position(2, 3);
    }

    @Test(expected = RuntimeException.class)
    public void givenPositionValueWhenOccupiedThenGameShouldThrowException() {
        Position firstPosition = new Position(0, 0);
        Position secondPosition = new Position(0, 1);
        Position thirdPosition = new Position(1, 0);
        Position OccupiedPosition = new Position(0, 0);
        game.playAt(firstPosition);
        game.playAt(secondPosition);
        game.playAt(thirdPosition);
        game.playAt(OccupiedPosition);
    }

    @Test
    public void givenFirstHorizontalRowWhenOccupiedWithXTokenThenGameShouldDeclareAsWinner() {
        Position firstPosition = new Position(0, 0);
        Position secondPosition = new Position(1, 0);
        Position thirdPosition = new Position(0, 1);
        Position fourthPosition = new Position(1, 1);
        Position fifthPosition = new Position(0, 2);
        game.playAt(firstPosition);
        game.playAt(secondPosition);
        game.playAt(thirdPosition);
        game.playAt(fourthPosition);
        assertEquals("X is the Winner", game.playAt(fifthPosition));
    }

    @Test
    public void givenSecondHorizontalRowWhenOccupiedWithXTokenThenGameShouldDeclareAsWinner() {
        Position firstPosition = new Position(1, 0);
        Position secondPosition = new Position(0, 0);
        Position thirdPosition = new Position(1, 1);
        Position fourthPosition = new Position(0, 1);
        Position fifthPosition = new Position(1, 2);
        game.playAt(firstPosition);
        game.playAt(secondPosition);
        game.playAt(thirdPosition);
        game.playAt(fourthPosition);
        assertEquals("X is the Winner", game.playAt(fifthPosition));
    }

    @Test
    public void givenThirdHorizontalRowWhenOccupiedWithXTokenThenGameShouldDeclareAsWinner() {
        Position firstPosition = new Position(2, 0);
        Position secondPosition = new Position(0, 0);
        Position thirdPosition = new Position(2, 1);
        Position fourthPosition = new Position(0, 1);
        Position fifthPosition = new Position(2, 2);
        game.playAt(firstPosition);
        game.playAt(secondPosition);
        game.playAt(thirdPosition);
        game.playAt(fourthPosition);
        assertEquals("X is the Winner", game.playAt(fifthPosition));
    }

    @Test
    public void givenFirstVerticalColumnWhenOccupiedWithXTokenThenGameShouldDeclareAsWinner() {
        Position firstPosition = new Position(0, 0);
        Position secondPosition = new Position(0, 2);
        Position thirdPosition = new Position(1, 0);
        Position fourthPosition = new Position(1, 1);
        Position fifthPosition = new Position(2, 0);
        game.playAt(firstPosition);
        game.playAt(secondPosition);
        game.playAt(thirdPosition);
        game.playAt(fourthPosition);
        assertEquals("X is the Winner", game.playAt(fifthPosition));
    }

    @Test
    public void givenSecondVerticalColumnWhenOccupiedWithXTokenThenGameShouldDeclareAsWinner() {
        Position firstPosition = new Position(0, 1);
        Position secondPosition = new Position(0, 0);
        Position thirdPosition = new Position(1, 1);
        Position fourthPosition = new Position(1, 0);
        Position fifthPosition = new Position(2, 1);
        game.playAt(firstPosition);
        game.playAt(secondPosition);
        game.playAt(thirdPosition);
        game.playAt(fourthPosition);
        assertEquals("X is the Winner", game.playAt(fifthPosition));
    }

    @Test
    public void givenThirdVerticalColumnWhenOccupiedWithXTokenThenGameShouldDeclareAsWinner() {
        Position firstPosition = new Position(0, 2);
        Position secondPosition = new Position(0, 1);
        Position thirdPosition = new Position(1, 2);
        Position fourthPosition = new Position(0, 0);
        Position fifthPosition = new Position(2, 2);
        game.playAt(firstPosition);
        game.playAt(secondPosition);
        game.playAt(thirdPosition);
        game.playAt(fourthPosition);
        assertEquals("X is the Winner", game.playAt(fifthPosition));
    }

    @Test
    public void givenTopLeftToBottomRightDiagonalWhenOccupiedWithXTokenThenGameShouldDeclareAsWinner() {
        Position firstPosition = new Position(0, 0);
        Position secondPosition = new Position(0, 1);
        Position thirdPosition = new Position(1, 1);
        Position fourthPosition = new Position(0, 2);
        Position fifthPosition = new Position(2, 2);
        game.playAt(firstPosition);
        game.playAt(secondPosition);
        game.playAt(thirdPosition);
        game.playAt(fourthPosition);
        assertEquals("X is the Winner", game.playAt(fifthPosition));
    }
}