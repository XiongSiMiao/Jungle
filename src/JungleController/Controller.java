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
        System.out.println("Input (format:xx w/a/s/d) :\t");//例如輸入11 s，讓坐標（1，1）的棋子向下移動一格
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        while(input!="quit"){
            int x,y;
            x=Integer.valueOf(input.substring(0, 1))-1;//讓用戶輸入（1，1），其實真實坐標是（0，0）
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
        if((p.getRank() != 6)&&(p.getRank()!=7)){//當移動的棋子不為老虎的時候，每次移動都只能移動一格
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
        }
        else{//當選擇的棋子為老虎獅子的時候
            int tempX = 0 ,tempY=0 ;//假設移動一格棋子將移動到的坐標
            switch(dir){
                case "d":
                    tempX =p.getX();
                    tempY=p.getY()+1;
                    break;
                case "w":
                    tempX =p.getX()-1;
                    tempY=p.getY();
                    break;
                case "a":
                    tempX =p.getX();
                    tempY=p.getY()-1;
                    break;
                case "s":
                    tempX =p.getX()+1;
                    tempY=p.getY();
                    break;
            }
            if(board.map[tempX][tempY].getName()!=" 水 "){//當目標地點不是水
                board.tile[p.getX()][p.getY()]=pastPiece;
                p.move(tempX,tempY);//改變p的坐標
                board.tile[p.getX()][p.getY()]=p;//將p從棋盤上移動到新地方
            }
            else{//目標移動地點有水
                switch(dir){
                    case "d":
                        tempY=tempY+2;
                        break;
                    case "w":
                        tempX =p.getX()-4;
                        break;
                    case "a":
                        tempY=p.getY()-2;
                        break;
                    case "s":
                        tempX =p.getX()+4;
                        break;
                }
                board.tile[p.getX()][p.getY()]=pastPiece;//將原來的地方清空
                p.move(tempX,tempY);//改變p的坐標
                board.tile[p.getX()][p.getY()]=p;//將p從棋盤上移動到新地方
            }
        }
    }//change p.locationX and p.locationY

    public boolean moveChecker(Piece p, String dir,Board board) {
        boolean flag=true;
        int tempX = 0,tempY=0;//棋子將移動到的坐標
        switch(dir){
            case "d":
                tempX =p.getX();
                tempY=p.getY()+1;
                break;
            case "w":
                tempX =p.getX()-1;
                tempY=p.getY();
                break;
            case "a":
                tempX =p.getX();
                tempY=p.getY()-1;
                break;
            case "s":
                tempX =p.getX()+1;
                tempY=p.getY();
                break;
        }
        if(board.tile[tempX][tempY].name=="   "){//檢測移動目標有沒有棋子

        }


        return flag;
    }

}
