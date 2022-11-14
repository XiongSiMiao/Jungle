package JungleModel.PieceType;

import JungleModel.Catagories.PieceJumpOverWater;

public class Lion extends PieceJumpOverWater {
    public  Lion(){
    }
    public Lion(int rank,int owner,int locationX,int locationY){
        this.locationX=locationX;
        this.locationY=locationY;
        this.owner=owner;
        this.rank=rank;
    }
    public String getName() {
        if(this.owner==1)
            return "1狮 ";
        else
            return " 狮2";
    }
}
