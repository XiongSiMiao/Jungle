package JungleModel.PieceType;

import JungleModel.Catagories.NormalPiece;

public class Elephant extends NormalPiece {
    public  Elephant(){
    }
    public Elephant(int rank,int owner,int locationX,int locationY){
        this.locationX=locationX;
        this.locationY=locationY;
        this.owner=owner;
        this.rank=rank;
        setName();
    }
    public String getName() {
        if(this.owner==1)
            return "1象 ";
        else
            return " 象2";
    }
    public void setName(){//new added
        this.name=getName();
    }
}
