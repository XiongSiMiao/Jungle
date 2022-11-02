package JungleModel.Catagories;

import JungleModel.Piece;

public abstract class NormalPiece extends Piece {
    public NormalPiece(){}
    final int category=1;//category flag
    public int getCategory(){
        return this.category;
    }

}
