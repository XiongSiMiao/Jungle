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
    }
    public String getName() {
        return "Cat";
    }
}
