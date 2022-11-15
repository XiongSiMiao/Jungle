package JungleController;

import JungleModel.Board;
import JungleModel.Board.*;
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

    public class emptyPiece extends Piece{//set an empty piece
        emptyPiece(int locationX,int locationY){
            this.locationX=locationX;
            this.locationY=locationY;
            this.owner=0;
            this.rank=0;
        }
        @Override
        protected String getName() {
            return "   ";
        }
    }
    public void movement(Piece p, String dir, Board board) throws WrongMovement{
        Piece pastPiece=new emptyPiece(p.getX(),p.getY());
        switch (dir){
            /*
            缺少一个边界检查
             */
            case "w":
                board.tile[p.getX()][p.getY()]=pastPiece;
                p.move(p.getX(),p.getY()+1);
                board.tile[p.getX()][p.getY()]=p;
                break;
            case "a":
                board.tile[p.getX()][p.getY()]=pastPiece;
                p.move(p.getX()-1,p.getY());
                board.tile[p.getX()][p.getY()]=p;
                break;
            case "s":
                board.tile[p.getX()][p.getY()]=pastPiece;
                p.move(p.getX(),p.getY()-1);
                board.tile[p.getX()][p.getY()]=p;
                break;
            case "d":
                board.tile[p.getX()][p.getY()]=pastPiece;
                p.move(p.getX()+1,p.getY());
                board.tile[p.getX()][p.getY()]=p;
                break;
            default:
                break;
        }
    }//change p.locationX and p.locationY

    public boolean moveChecker(Piece p, String dir) {
        return true;
    }

}
