package test.view;

import JungleModel.Board;
import JungleModel.PieceType.Cat;
import JungleView.View;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ViewTest {
    Cat cat=new Cat(2,1,0,0);
    Board specialBoard=new Board();//for testing

    public Board getSpecialBoard() {//設計了一格在(0,0)位置的貓和出現在(1,0)處的水
        specialBoard.tile[0][0]=cat;
        specialBoard.map[1][0]= Board.boardTypes.River;
        return specialBoard;
    }

    View view=new View();

    @Test
    void viewAll() {
        getSpecialBoard();
        view.viewAll(specialBoard);//Observe the result that print whether is true
    }

    @Test
    void printBoard() {
        getSpecialBoard();
        view.printBoard(specialBoard);
    }

    @Test
    void printPieces() {
        getSpecialBoard();
        view.printPieces(specialBoard);
    }
}