package JungleModel.PieceType;

import JungleModel.Catagories.PieceSwim;

public class Rat extends PieceSwim {

    public  Rat(){
    }
    public Rat(int rank,int owner,int locationX,int locationY){
        this.locationX=locationX;
        this.locationY=locationY;
        this.owner=owner;
        this.rank=rank;
    }
    public String getName() {
        return "Rat";
    }
}
