package test.model;

import org.junit.jupiter.api.Test;

import JungleModel.Board;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    Board board = new Board();
    boolean turn = true;//true means owner 1, false means owner 2
    Boolean win = null;//true means owner 1 won, false means owner 2 won, null means still playing
    @Test
    void getWon() {//Test getWon() in class Board
        assertEquals(win,board.getWon());
    }
    @Test
    void getTurn() {//Test getTurn in class Board
        assertEquals(turn,board.getTurn());
    }

    @Test
    void jumpOverRiver(){//Test jumpOverRiver in class Board
        assertTrue(board.jumpOverRiver());
    }

    @Test
    void inTrap(){// Test inTrap in class Board
        assertTrue(board.inTrap());
    }

    @Test
    void setWin(){
        assertEquals(null,board.setWin(win));
    }
    @Test
    void setTurn() {
        assertEquals(!turn,board.setTurn());
        //Test setTurn() in class board(set turn into false if it is true;)
    }
}