package JungleModel;

public abstract class Piece {
    private int rank;
    private int owner;//owner=1-->player1 ; owner=2-->player2

    public Piece() {
    }
    public static Piece setPiece(int rank,int owner){
        return  null;
    }

    private boolean canReplace(Piece p2){
        return true;
    }
    protected abstract String getName();

    protected void move(){}

}
