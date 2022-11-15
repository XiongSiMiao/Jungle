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
        /*
        以下都為檢測輸出結果
        因為橫著更對不起導致坐標有點怪異
         -------->y
         |
         |
         |
         x
         */
        Board board=new Board();
        View v=new View();
        v.viewAll(board);
        System.out.println("Input (format:xx w/a/s/d) :\t");
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        while(input!="quit"){
            int x,y;
            x=Integer.valueOf(input.substring(0, 1))-1;//讓用戶輸入（1，1），其實算法是（0，0）
            y=Integer.valueOf(input.substring(1, 2))-1;
            movement(board.tile[x][y],input.substring(3,4),board);
            v.viewAll(board);
            input=scan.nextLine();
        }

    }


    public static void replace(Piece p) {}//replace the opponent's piece

    public static class emptyPiece extends Piece{//set an empty piece
        public emptyPiece(int locationX, int locationY){
            this.locationX=locationX;
            this.locationY=locationY;
            this.owner=0;
            this.rank=0;
            this.name="   ";
        }

        @Override
        protected String getName() {
            return "   ";
        }
    }
    public static void movement(Piece p, String dir, Board board){
        Piece pastPiece=new emptyPiece(p.getX(),p.getY());
        switch (dir){
            /*
            缺少一个边界检查
             */
            case "d":
                board.tile[p.getX()][p.getY()]=pastPiece;
                p.move(p.getX(),p.getY()+1);
                board.tile[p.getX()][p.getY()]=p;
                break;
            case "w":
                board.tile[p.getX()][p.getY()]=pastPiece;
                p.move(p.getX()-1,p.getY());
                board.tile[p.getX()][p.getY()]=p;
                break;
            case "a":
                board.tile[p.getX()][p.getY()]=pastPiece;
                p.move(p.getX(),p.getY()-1);
                board.tile[p.getX()][p.getY()]=p;
                break;
            case "s":
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
