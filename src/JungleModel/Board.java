package JungleModel;

public class Board {
    private Boolean win;

    public Board() {
    }

    public Boolean getWon() {
        return null;
    }

    public Boolean setWin(Boolean win) {
        return null;
    }

    public boolean getTurn() {
        return true;
    }

    public boolean setTurn() {
        return false;
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

    public boolean inTrap() {
        return true;
    }

    public boolean jumpOverRiver() {
        return true;
    }
}
