package JungleController;

import JungleModel.Board;
import JungleModel.Piece;
import Exception.WrongMovement;
import Exception.LosePieces;

public class Controller {
    public Controller() {
    }

    public static void start() {
    }

    public static void replace(Piece p) throws LosePieces{}//replace the opponent's piece
    public static void movement(Piece p,String dir) throws WrongMovement{}//change p.locationX and p.locationY

    public boolean moveChecker(Piece p, String dir) {
        return true;
    }

}
