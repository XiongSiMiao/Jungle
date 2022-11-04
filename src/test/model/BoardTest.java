package test.model;

import org.junit.jupiter.api.Test;

import JungleModel.Board;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    Board board = new Board();
    boolean turn = true;//true means owner 1, false means owner 2
    Boolean win = null;//true means owner 1 won, false means owner 2 won, null means still playing
    @Test
    void getWon() {
        assertEquals(win,board.getWon());
    }

    @Test
    void setWin() {
        assertEquals(win, board.setWin(turn));
    }

    @Test
    void getTurn() {
        assertEquals(turn,board.getTurn());
    }

    @Test
    void setTurn() {
        assertEquals(!turn,board.setTurn());//set turn into false if it is true;
    }

    @Test
    void reset() { 
        assertEquals(true,board.reset());
    }
}