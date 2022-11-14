package JungleModel.PieceType;

import JungleModel.Catagories.PieceJumpOverWater;

public class Tiger extends PieceJumpOverWater {
    public  Tiger(){
    }
    public Tiger(int rank,int owner,int locationX,int locationY){
        this.locationX=locationX;
        this.locationY=locationY;
        this.owner=owner;
        this.rank=rank;
    }
    public String getName() {
        if(this.owner==1)
            return "1虎 ";
        else
            return " 虎2";
    }
}
