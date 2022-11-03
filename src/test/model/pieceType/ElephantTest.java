package test.model.pieceType;

import JungleModel.PieceType.Elephant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElephantTest {

    Elephant e = new Elephant(8,2,3,3);
    @Test
    void getCategory() {
        assertEquals(1,e.getCategory());
    }


    @Test
    void getX() {
        assertEquals(3,e.getX());
    }

    @Test
    void getY() {
        assertEquals(3,e.getY());
    }

    @Test
    void getName() {
        assertEquals("Elephant",e.getName());
    }
    @Test
    void getOwner() {assertEquals(2,e.getOwner());}
    @Test
    void getRank() {assertEquals(8,e.getRank());}
}