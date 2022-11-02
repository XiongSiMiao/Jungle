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
    }
    public String getName() {
        return "Dog";
    }
}
