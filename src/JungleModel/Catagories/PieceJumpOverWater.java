package JungleModel.Catagories;

import JungleModel.Piece;

public abstract class PieceJumpOverWater extends Piece {
    public PieceJumpOverWater(){}
    final int category=2;//category flag
    public int getCategory(){
        return this.category;
    }
}
