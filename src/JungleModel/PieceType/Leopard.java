package JungleModel.PieceType;

import JungleModel.Catagories.NormalPiece;

public class Leopard extends NormalPiece {
    public  Leopard(){
    }
    public Leopard(int rank,int owner,int locationX,int locationY){
        this.locationX=locationX;
        this.locationY=locationY;
        this.owner=owner;
        this.rank=rank;
        setName();
    }
    public String getName() {
        if(this.owner==1)
            return "1豹 ";
        else
            return " 豹2";
    }
    public void setName(){//new added
        this.name=getName();
    }
}
