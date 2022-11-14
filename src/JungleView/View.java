package JungleView;

import JungleModel.Board;

public class View {
    public View(){}
    public void printMap(Board board){
        for(int i=0;i<9;i++){
            for (int j=0;j<7;j++){
                System.out.print(board);
            }
        }
    }

    public void printBoard(){
        //在报错！没对齐！！
        for(int j=0;j<7;j++){
            for (int i=0;i<10;i++){
                if(i==9){
                    System.out.println();
                }
                if((i==0&&j==3)||(i==8&&j==3)){
                    System.out.print(Board.boardTypes.Den.getName());
                }
                if((i==0&&j==2)||(i==0&&j==4)||(i==8&&j==2)||(i==8&&j==4)||(i==1&&j==3)||(i==7&&j==3)){
                    System.out.print(Board.boardTypes.Trap.getName());
                }
                if((i==3||i==4||i==5)&&(j!=0||j!=3||j!=6)){
                    System.out.print(Board.boardTypes.River.getName());
                }
                else
                    System.out.print(Board.boardTypes.Land.getName());
            }
        }
    }

    public void printPieces(){}
}
