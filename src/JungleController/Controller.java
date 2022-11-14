package JungleController;

import JungleModel.Board;
import JungleModel.Piece;
import JungleView.View;
import Exception.WrongMovement;
import Exception.LosePieces;

import java.util.Scanner;

public class Controller {
    public Controller() {

    }

    public static void start() {
        Board board=new Board();
        View view=new View();
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        while(input != "quit"){
        }
    }


    public static void replace(Piece p) throws LosePieces{}//replace the opponent's piece
    public static void movement(Piece p,String dir) throws WrongMovement{
        switch (dir){
            /*
            缺少一个边界检查
             */
            case "w":
                p.move(p.getX(),p.getY()+1);
                break;
            case "a":
                p.move(p.getX()-1,p.getY());
                break;
            case "s":
                p.move(p.getX(),p.getY()-1);
                break;
            case "d":
                p.move(p.getX()+1,p.getY());
                break;
            default:
                break;
        }
    }//change p.locationX and p.locationY

    public boolean moveChecker(Piece p, String dir) {
        return true;
    }

}
