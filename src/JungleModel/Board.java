package JungleModel;

public class Board {
    private boolean win;

    public Board() {
    }

    public boolean getWon() {
        return true;
    }

    public void setWin(boolean win) {
    }

    public boolean getTurn() {
        return true;
    }

    public boolean setTurn() {
        return true;
    }

    public void reset() {
    }

    private static enum boardTypes {
        River, Den, Trap, Land;
    }

    private void piecesInitialize() {
    }

    private boolean capture() {
        return true;
    }

    private boolean inTrap() {
        return true;
    }

    private boolean jumpOverRiver() {
        return true;
    }
}
