package test.model;

import org.junit.jupiter.api.Test;

import JungleModel.Board;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    boolean turn = true;//true means owner 1, false means owner 2
    Boolean win = null;//true means owner 1 won, false means owner 2 won, null means still playing
    @Test
    void getWon() {
        assertEquals(win,getWon());
    }

    @Test
    void setWin() {
        assertEquals(win, setWin());
    }

    @Test
    void getTurn() {
        assertEquals(turn,getTurn());
    }

    @Test
    void setTurn() {
        assertEquals(!turn,setTurn());//set turn into false if it is true;
    }

    @Test
    void reset() { 
        assertEquals(reset(),true);
    }
}