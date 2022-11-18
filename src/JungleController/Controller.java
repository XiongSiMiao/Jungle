package JungleController;

import JungleModel.Board;
import JungleModel.Piece;
import JungleView.View;

import java.util.Scanner;

public class Controller {
    public Controller() {

    }

    public static void start() {
        /*
         -------->y
         |
         |
         |
         x
         */
        
        int turn=1;//player 1
        Board board=new Board();
        View v=new View();
        Boolean win=board.getWon(turn,board);
        v.viewAll(board);
        System.out.println("Player"+turn+" to input (format:xy w/a/s/d;or enter r to restart) :\t");//例如輸入11 s，讓坐標（1，1）的棋子向下移動一格
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        while(win==null){
            int x,y;
            try {//輸入r重設游戲
                x=Integer.valueOf(input.substring(0, 1))-1;//讓用戶輸入（1，1），其實真實坐標是（0，0）
                y=Integer.valueOf(input.substring(1, 2))-1;
                if(moveChecker(board.tile[x][y],input.substring(3,4),board)){//check whether the piece can move in this way or not
                    movement(board.tile[x][y],input.substring(3,4),board);
                }
                else{//moving in a wrong direction
                    v.viewAll(board);
                    System.out.println("Wrong movement!\nYou are not allowed to move in this way.\nPlease try again.");//wrong movement will re-enter
                    System.out.println("Player"+turn+" to input (format:xy w/a/s/d;or enter r to restart) :\t");
                    input=scan.nextLine();
                    continue;
                }
                v.viewAll(board);
                win=board.getWon(turn,board);//check if the player wins
                if(win==null){
                    turn=2/turn;//turn to another player
                    System.out.println("Player"+turn+" to input (format:xy w/a/s/d;or enter r to restart) :\t");
                    input=scan.nextLine();
                }else{
                    System.out.println("\nCongratulations!\nPlayer"+turn+" wins!");
                }
            } catch (NumberFormatException e) {//restart the game
                char reset = input.charAt(0);
                if(reset == 'r'){
                    board.reset();
                    turn = 1;
                    v.viewAll(board);
                    win = board.getWon(turn, board);
                    System.out.println("The game has reseted.");
                    System.out.println("Player"+turn+" to input (format:xx w/a/s/d) :\t");
                    input=scan.nextLine();
                }
            }
        }

    }


    public void replace(Piece p, Board board) {//clean up the captured pieces
        Piece pastPiece=new emptyPiece(p.getX(),p.getY());
        board.tile[p.getX()][p.getY()]=pastPiece;
    }

    public static class emptyPiece extends Piece{//set an empty piece
        public emptyPiece(int locationX, int locationY){
            this.locationX=locationX;
            this.locationY=locationY;
            this.owner=0;
            this.rank=0;
            this.name="    ";
        }

        @Override
        protected String getName() {
            return "    ";
        }
    }
    public static void movement(Piece p, String dir, Board board){
        Piece pastPiece=new emptyPiece(p.getX(),p.getY());
        if((p.getRank() != 6)&&(p.getRank()!=7)){//when the piece is not tiger, then only move one space at a time.
            switch (dir){
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
        else{//when selecting tiger/lion
            int tempX = 0 ,tempY=0 ;//Assume the location when just moving one space
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
            if(board.map[tempX][tempY].getName()!=" 水 "){//when destination is not "river"
                board.tile[p.getX()][p.getY()]=pastPiece;
                p.move(tempX,tempY);//change p's location
                board.tile[p.getX()][p.getY()]=p;//move p
            }
            else{//when destination is in river
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
                board.tile[p.getX()][p.getY()]=pastPiece;//set the original place empty
                p.move(tempX,tempY);//change p's location
                board.tile[p.getX()][p.getY()]=p;//move p
            }
        }
    }//change p.locationX and p.locationY

    public static boolean moveChecker(Piece p, String dir,Board board) {
        boolean flag=true;
        int tempX = 0,tempY=0;
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
        if(p.getRank()!=1 && p.getRank()!=6 && p.getRank()!=7){//Cat,dog,elephant,leopard,wolf can't move if the destination has water
            if(board.map[tempX][tempY].getName()==" 水 "){//there exists river in the destination
                flag=false;
            }
            else{//there is no river
                if(board.tile[tempX][tempY].name != "    "){//there exists a piece in the destination
                    if(!p.canReplace(board.tile[tempX][tempY],board)){//if this piece cannot replace that piece in the destination
                        flag=false;
                    }
                }
            }
        }
        else{//when moving rat/tiger.lion
            if(p.getRank()==1){//rat
                if(board.map[p.getX()][p.getY()].getName()==" 水 "){//rat is in river
                    if(board.map[tempX][tempY].getName() != " 水 " && board.tile[tempX][tempY].rank==8){//when destination is on land but there is an elephant.
                        flag=false;
                    }
                }
            }
            else{//moving tiger/lion
                if(board.map[tempX][tempY].getName()!=" 水 "){//when destination has no river
                    if(board.tile[tempX][tempY].name != "    "){//there is a piece in destination
                        if(!p.canReplace(board.tile[tempX][tempY],board)){//if the piece there can't be replaced
                            flag=false;
                        }
                    }
                }
                else{//when destination is in river
                    switch(dir){//change the destination
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
                    if(board.tile[tempX][tempY].name != "    "){//there is a piece
                        if(!p.canReplace(board.tile[tempX][tempY],board)){//the piece there cannot be replaced
                            flag=false;
                        }
                    }
                }
            }
        }


        return flag;
    }

}
