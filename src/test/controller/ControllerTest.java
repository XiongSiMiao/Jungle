package test.controller;

import JungleController.Controller;
import JungleModel.Board;
import JungleModel.Piece;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {


    Controller controller=new Controller();
    Board board=new Board();
    Piece pTest=board.tile[0][0];
    Piece pastPiece=new Controller.emptyPiece(pTest.getX(),pTest.getY());
    @Test
    void replace() {
    }

    @Test
    void movement() {
    }

    @Test
    void moveChecker() {
    }
}