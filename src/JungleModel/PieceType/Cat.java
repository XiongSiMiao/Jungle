package JungleModel.PieceType;

import JungleModel.Catagories.NormalPiece;

public class Cat extends NormalPiece {
    public  Cat(){
    }
    public Cat(int rank,int owner,int locationX,int locationY){
        this.locationX=locationX;
        this.locationY=locationY;
        this.owner=owner;
        this.rank=rank;
        setName();
    }
    public String getName() {
        if(this.owner==1)
            return "1貓 ";
        else
            return " 貓2";
    }
    public void setName(){//new added
        this.name=getName();
    }
}
