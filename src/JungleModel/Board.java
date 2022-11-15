package JungleModel;

import JungleController.Controller;
import JungleModel.PieceType.*;

public class Board {
    public Boolean win;
    public Piece[][] tile = new Piece[20][20];//contain all the pieces, new added
    public final boardTypes[][] map=new boardTypes[20][20];// contain all the boardTypes, new added

    public Board() {
        piecesInitialize();
        boardInitialize();
    }

    public Boolean getWon(int turn,Board board) {
        if(turn==1){//Player 1 wins
            if(board.tile[8][3].getOwner()==1){//player1's piece reach the player2's den
                win=true;
            }
            else{
                win=true;
                for(int i=0;i<9;i++){
                    for(int j=0;j<7;j++){
                        if (board.tile[i][j].getOwner()==2) {
                            win=null;
                        }
                    }
                }
            }
        }
        if(turn==2){//player2 wins
            if(board.tile[0][3].getOwner()==2){//player2's piece reach the player1's den
                win=false;
            }
            else{
                win=false;
                for(int i=0;i<9;i++){
                    for(int j=0;j<7;j++){
                        if (board.tile[i][j].getOwner()==1) {//if find player1's piece then continue, else player2 wins
                            win=null;
                        }
                    }
                }
            }
        }
        return win;
    }

    public Boolean setWin(Boolean win) {
        return null;
    }

    /*
    下面兩個關於Turn的函數不好調用，我用數學方法完成了turn的轉換
     */
    public boolean getTurn() {
        return true;
    }

    public boolean setTurn() {
        return false;
    }

    public void reset() {
        piecesInitialize();
    }

    public static enum boardTypes {
        River(" 水 "),
        Den  (" 穴 "),
        Trap (" 陷 "),
        Land ("   ");

        private final String name;
        boardTypes(String name) {
            this.name=name;
        }
        public String getName() {
            return name;
        }
    }
    private void boardInitialize(){//new added
        map[0][3]=boardTypes.Den;
        map[8][3]=boardTypes.Den;
        map[0][2]=boardTypes.Trap;
        map[0][4]=boardTypes.Trap;
        map[8][2]=boardTypes.Trap;
        map[8][4]=boardTypes.Trap;
        map[1][3]=boardTypes.Trap;
        map[7][3]=boardTypes.Trap;
        for(int j=0;j<7;j++){
            for (int i=0;i<9;i++){
                if((i==3||i==4||i==5)&&(j==1||j==2||j==4||j==5)){
                    map[i][j]=boardTypes.River;
                }
                if(map[i][j]==null)
                    map[i][j]=boardTypes.Land;
            }
        }
    }

    private void piecesInitialize() {//Set all the pieces in 9x7 board
        for(int i=0;i<9;i++){
            for(int j=0;j<7;j++){
                Piece nullPiece=new Controller.emptyPiece(i,j);
                tile[i][j]=nullPiece;
            }
        }

        Rat r1=new Rat(1,1,2,0);
        tile[2][0]=r1;
        Rat r2=new Rat(1,2,6,6);
        tile[6][6]=r2;
        Cat c1=new Cat(2,1,1,5);
        tile[1][5]=c1;
        Cat c2=new Cat(2,2,7,1);
        tile[7][1]=c2;
        Dog d1=new Dog(3,1,1,1);
        tile[1][1]=d1;
        Dog d2=new Dog(3,2,7,5);
        tile[7][5]=d2;
        Wolf w1=new Wolf(4,1,2,4);
        tile[2][4]=w1;
        Wolf w2=new Wolf(4,2,6,2);
        tile[6][2]=w2;
        Leopard leo1=new Leopard(5,1,2,2);
        tile[2][2]=leo1;
        Leopard leo2=new Leopard(5,2,6,4);
        tile[6][4]=leo2;
        Tiger t1=new Tiger(6,1,0,6);
        tile[0][6]=t1;
        Tiger t2=new Tiger(6,2,8,0);
        tile[8][0]=t2;
        Lion lion1=new Lion(7,1,0,0);
        tile[0][0]=lion1;
        Lion lion2=new Lion(7,2,8,6);
        tile[8][6]=lion2;
        Elephant e1=new Elephant(8,1,2,6);
        tile[2][6]=e1;
        Elephant e2=new Elephant(8,2,6,0);
        tile[6][0]=e2;
    }

    private boolean capture() {
        return true;
    }

    public boolean inTrap(Piece p) {//check if the piece is in trap
        boolean flag=false;
        if(p.getOwner()==2){
            if((p.getY()==3&&p.getX()==1)||(p.getY()==5&&p.getX()==1)||(p.getY()==4&&p.getX()==2)){
                flag=true;
            }
        }
        else{
            if((p.getY()==3&&p.getX()==9)||(p.getY()==5&&p.getX()==9)||(p.getY()==4&&p.getX()==8)){
                flag=true;
            }
        }
        return flag;
    }

    public boolean jumpOverRiver() {

        return true;
    }
}
