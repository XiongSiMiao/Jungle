package test.model;

import org.junit.jupiter.api.Test;

import JungleModel.Board;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    boolean turn = true;//true means onwer 1, false means onwer 2
    Boolean win = null;//true means onwer 1 won, false means onwer 2 won, null means still playing
    @Test
    void getWon() {
        assertEquals(getWon(), win);
    }

    @Test
    void setWin() {
        assertEquals(setWin(), win);
    }

    @Test
    void getTurn() {
        assertEquals(getTurn(),turn);
    }

    @Test
    void setTurn() {
        assertEquals(setTurn(),!turn);//set turn into false if it is true;
    }

    @Test
    void reset() { 
        assertEquals(true, reset());
    }
}