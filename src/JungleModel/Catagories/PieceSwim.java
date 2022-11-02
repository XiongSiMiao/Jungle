package JungleModel.Catagories;

import JungleModel.Piece;

public abstract class PieceSwim extends Piece {
    public PieceSwim(){}
    final int category=3;//category flag
    public int getCategory(){
        return this.category;
    }
}
