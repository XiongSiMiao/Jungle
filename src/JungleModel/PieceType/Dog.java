package JungleModel.PieceType;

import JungleModel.Catagories.NormalPiece;

public class Dog extends NormalPiece {
    public  Dog(){
    }
    public Dog(int rank,int owner,int locationX,int locationY){
        this.locationX=locationX;
        this.locationY=locationY;
        this.owner=owner;
        this.rank=rank;
        setName();
    }
    public String getName() {
        if(this.owner==1)
            return "1狗 ";
        else
            return " 狗2";
    }
    public void setName(){//new added
        this.name=getName();
    }
}
