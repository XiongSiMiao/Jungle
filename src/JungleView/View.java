package JungleView;

import JungleModel.Board;

public class View {
    public View(){}
    public void viewAll(Board  board){
        for(int i=0;i<9;i++){
            for(int j=0;j<7;j++){
                if(board.tile[i][j].name!="    ") {//if there is a piece here then print piece ,otherwise print board
                    System.out.printf("|"+"%s"+"|",board.tile[i][j].name);
                }
                else
                    System.out.printf("|"+"%s"+"|",board.map[i][j].getName());
            }
            System.out.println();
        }
    }
    public void printBoard(Board board){
        for(int i=0;i<9;i++){
            for(int j=0;j<7;j++){
                System.out.printf("|"+"%s"+"|",board.map[i][j].getName());
            }
            System.out.println();
        }
    }
    public void printPieces(Board board){
        for(int i=0;i<9;i++){
            for(int j=0;j<7;j++){
                System.out.printf("|"+"%s"+"|",board.tile[i][j].name);
            }
            System.out.println();
        }
    }
}
