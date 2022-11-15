package JungleModel;

public abstract class Piece {
    public int rank;
    public int owner;// owner=1-->player1 ; owner=2-->player2
    public int locationX;
    public int locationY;
    public String name;//new added

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
        and rank of piece1 > rank of piece2 (except rat and elephant),
        then piece1 can replace piece2.
        */
        boolean flag=false;
        int x1=this.getX();
        int x2= p2.getX();
        int y1=this.getY();
        int y2= p2.getY();
        int rank1=this.getRank();
        int rank2=p2.getRank();
        int owner1=this.getOwner();
        int owner2= p2.getOwner();
        if((x1==x2)&&(y1==y2)&&(owner1!=owner2)){
            if(rank1==1&&rank2==8){
                flag=true;
            }
            if(rank1>rank2){
                flag=true;
                if(rank1==8&&rank2==1){
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
