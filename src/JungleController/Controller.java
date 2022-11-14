package JungleController;

import JungleModel.Board;
import JungleModel.Piece;
import Exception.WrongMovement;
import Exception.LosePieces;
public class Controller {
    public Controller() {
    }

    public static void start() {
        Board board=new Board();
    }
    

    public static void replace(Piece p) throws LosePieces{}//replace the opponent's piece
    public static void movement(Piece p,String dir) throws WrongMovement{
        switch (dir){
            /*
            缺少一个边界检查
             */
            case "w":
                p.locationY=p.locationY+1;
                break;
            case "a":
                p.locationX=p.locationX-1;
                break;
            case "s":
                p.locationY=p.locationY-1;
                break;
            case "d":
                p.locationX=p.locationX+1;
                break;
        }
    }//change p.locationX and p.locationY

    public boolean moveChecker(Piece p, String dir) {
        return true;
    }

}
