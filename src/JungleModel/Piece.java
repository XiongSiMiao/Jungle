package JungleModel;

public abstract class Piece {
    public int rank;
    public int owner;// owner=1-->player1 ; owner=2-->player2
    public int locationX;
    public int locationY;

    public Piece() {
    }
    public Piece setPiece(int rank, int owner, int locationX, int locationY) {
        this.rank=rank;
        this.owner=owner;
        this.locationY=locationY;
        this.locationX=locationX;
        return this;
    }

    public boolean canReplace(Piece p2) {
        return true;
    }

    protected abstract String getName();

    public void move(int locationX, int locationY) {
        this.locationX=locationX;
        this.locationY=locationY;
    }

    public int getX() {
        return this.locationX;
    }

    public int getY() {
        return this.locationY;
    }
    public int getRank() {return this.rank;}
    public int getOwner() {
        return this.owner;
    }

}
