package com.kata.tictactoe;
import org.junit.Assert;
import org.junit.Test;

public class GameTest {
    @Test
    public void givenAPositionWhenFirstTurnThenGameShouldMarkX(){
        GameBoard gameboard = new GameBoard();
        Position position = new Position();
        Game game = new Game();
        game.playAt(position);
        Assert.assertEquals("X",gameboard.getTokenAt(position));
    }
}