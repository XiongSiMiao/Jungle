import JungleController.Controller;
import JungleModel.Board;
import JungleView.View;//for test

public class Player {
    public static void main(String[] args) {
        Board board=new Board();
        View v=new View();
        v.printBoard(board);
        v.printPieces(board);
        //Controller.start();
    }
}
