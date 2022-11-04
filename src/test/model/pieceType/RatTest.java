package test.model.pieceType;

import JungleModel.PieceType.Rat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RatTest {

    Rat r = new Rat(1,1,4,6);
    //Set a rat to be tested and also test the construction methods of class rat
    @Test
    void getCategory() {
        assertEquals(3,r.getCategory());
    }// Test getCategory() in class PieceSwim
    @Test
    void getX() {// Test getX() in class Piece
        assertEquals(4,r.getX());
    }

    @Test
    void getY() {// Test getY() in class Piece
        assertEquals(6,r.getY());
    }

    @Test
    void getName() {// Test getName() in class Rat
        assertEquals("Rat",r.getName());
    }
    @Test
    void getOwner() {assertEquals(1,r.getOwner());}// Test getOwner() in class Piece
    @Test
    void getRank() {assertEquals(1,r.getRank());}// Test getRank() in class Piece
}