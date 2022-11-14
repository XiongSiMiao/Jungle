package JungleModel;

import JungleModel.PieceType.*;

public class Board {
    private Boolean win;

    public Board() {
        piecesInitialize();
    }

    public Boolean getWon() {
        return null;
    }

    public Boolean setWin(Boolean win) {
        return null;
    }

    public boolean getTurn() {
        return true;
    }

    public boolean setTurn() {
        return false;
    }

    public void reset() {
        this.piecesInitialize();
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

    private void piecesInitialize() {//Set all the pieces in 9x7 board
        Rat r1=new Rat(1,1,2,0);
        Rat r2=new Rat(1,2,6,6);
        Cat c1=new Cat(2,1,1,5);
        Cat c2=new Cat(2,2,7,1);
        Dog d1=new Dog(3,1,1,1);
        Dog d2=new Dog(3,2,7,5);
        Wolf w1=new Wolf(4,1,2,4);
        Wolf w2=new Wolf(4,2,6,2);
        Leopard leo1=new Leopard(5,1,2,2);
        Leopard leo2=new Leopard(5,2,6,4);
        Tiger t1=new Tiger(6,1,0,6);
        Tiger t2=new Tiger(6,2,8,0);
        Lion lion1=new Lion(7,1,0,0);
        Lion lion2=new Lion(7,2,8,6);
        Elephant e1=new Elephant(8,1,2,6);
        Elephant e2=new Elephant(8,2,6,0);
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
