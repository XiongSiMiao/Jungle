package test.model.pieceType;

import JungleModel.PieceType.Rat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RatTest {

    Rat r = new Rat(1,1,4,6);
    @Test
    void getCategory() {
        assertEquals(3,r.getCategory());
    }
    @Test
    void getX() {
        assertEquals(4,r.getX());
    }

    @Test
    void getY() {
        assertEquals(6,r.getY());
    }

    @Test
    void getName() {
        assertEquals("Rat",r.getName());
    }
    @Test
    void getOwner() {assertEquals(1,r.getOwner());}
    @Test
    void getRank() {assertEquals(1,r.getRank());}
}