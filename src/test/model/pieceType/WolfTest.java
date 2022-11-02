package test.model.pieceType;

import JungleModel.PieceType.Wolf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WolfTest {

    Wolf w = new Wolf(4,1,3,8);
    @Test
    void getCategory() {
        assertEquals(1,w.getCategory());
    }

    @Test
    void getX() {assertEquals(3,w.getX());}

    @Test
    void getY() {assertEquals(8,w.getY());}

    @Test
    void getName() {assertEquals("Wolf",w.getName());}
}