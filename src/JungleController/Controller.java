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
        以下都為檢測輸出結果
        因為橫著更對不起導致坐標有點怪異
         -------->y
         |
         |
         |
         x
         */
        int turn=1;//玩家一
        Board board=new Board();
        View v=new View();
        Boolean win=board.getWon(turn,board);
        v.viewAll(board);
        System.out.println("Player"+turn+" to input (format:xx w/a/s/d) :\t");//例如輸入11 s，讓坐標（1，1）的棋子向下移動一格
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        while(win==null){
            int x,y;
            x=Integer.valueOf(input.substring(0, 1))-1;//讓用戶輸入（1，1），其實真實坐標是（0，0）
            y=Integer.valueOf(input.substring(1, 2))-1;
            if(moveChecker(board.tile[x][y],input.substring(3,4),board)){//檢查發現可以通行
                movement(board.tile[x][y],input.substring(3,4),board);
            }
            else{//檢查發現不能這麼走
                System.out.println("Wrong movement!\nYou are not allowed to move now.");
            }
            v.viewAll(board);
            win=board.getWon(turn,board);//檢查勝負
            if(win==null){
                turn=2/turn;//在玩家一二切換
                System.out.println("Player"+turn+" to input (format:xx w/a/s/d) :\t");
                input=scan.nextLine();
            }
        }
        System.out.println("\nCongratulations!\nPlayer"+turn+" wins!");

    }


    public void replace(Piece p, Board board) {//清理被吃掉的棋子,實際上沒用到，因為判斷可以移動後就直接取代了棋盤上該棋子的位置
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
        if((p.getRank() != 6)&&(p.getRank()!=7)){//當移動的棋子不為老虎獅子的時候，每次移動都只能移動一格
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

    public static boolean moveChecker(Piece p, String dir,Board board) {
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
        if(p.getRank()!=1 && p.getRank()!=6 && p.getRank()!=7){//Cat,dog,elephant,leopard,wolf can't move if the destination has water
            if(board.map[tempX][tempY].getName()==" 水 "){//前方有水不能走
                flag=false;
            }
            else{//前方沒水
                if(board.tile[tempX][tempY].name != "    "){//前方有棋子的情況
                    if(!p.canReplace(board.tile[tempX][tempY],board)){//如果不能吃掉，則不能通行
                        flag=false;
                    }
                }
            }
        }
        else{//選擇移動的棋子為老鼠、老虎、獅子
            if(p.getRank()==1){//棋子為老鼠時
                if(board.map[p.getX()][p.getY()].getName()==" 水 "){//老鼠在河裡時
                    if(board.map[tempX][tempY].getName() != " 水 " && board.tile[tempX][tempY].rank==8){//當目的地在岸上但岸上有大象
                        flag=false;
                    }
                }
            }
            else{//棋子為老虎獅子
                if(board.map[tempX][tempY].getName()!=" 水 "){//當目標地點不是水
                    if(board.tile[tempX][tempY].name != "    "){//目標地點有棋子
                        if(!p.canReplace(board.tile[tempX][tempY],board)){//如果不能吃掉，則不能通行
                            flag=false;
                        }
                    }
                }
                else{//當目的地在水中
                    switch(dir){//修正目的地正確位置
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
                    if(board.tile[tempX][tempY].name != "    "){//目標地點有棋子
                        if(!p.canReplace(board.tile[tempX][tempY],board)){//如果不能吃掉，則不能通行
                            flag=false;
                        }
                    }
                }
            }
        }


        return flag;
    }

}
