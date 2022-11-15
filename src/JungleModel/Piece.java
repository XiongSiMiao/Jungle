package JungleModel;

public abstract class Piece {
    public int rank;
    public int owner;// owner=1-->player1 ; owner=2-->player2
    public int locationX;
    public int locationY;
    public String name;

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
        /* if 2 pieces are at the same place,
        and rank of piece1 >= rank of piece2 (except rat and elephant),
        then piece1 can replace piece2.
        */
        boolean flag=false;
        int rank1=this.getRank();
        int rank2=p2.getRank();
        int owner1=this.getOwner();
        int owner2= p2.getOwner();
        if(owner1!=owner2){// two pieces are at the same place and have different owners.
            if(rank1==1&&rank2==8){//rat can eat elephant
                flag=true;
            }
            if(rank1>=rank2){
                flag=true;
                if(rank1==8&&rank2==1){//elephant can not eat rat
                    flag=false;
                }
            }
        }
        return flag;
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
