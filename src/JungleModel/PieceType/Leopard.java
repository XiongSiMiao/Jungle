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
    }
    public String getName() {
        return "Leopard";
    }
}
