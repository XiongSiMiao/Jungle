package test.model.pieceType;

import JungleModel.PieceType.Tiger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TigerTest {

    Tiger t = new Tiger(6,2,5,1);
    @Test
    void getCategory() {
        assertEquals(2,t.getCategory());
    }

    @Test
    void getX() {assertEquals(5,t.getX());}

    @Test
    void getY() {assertEquals(1,t.getY());}

    @Test
    void getName() {assertEquals("Tiger",t.getName());}
    @Test
    void getOwner() {assertEquals(2,t.getOwner());}
    @Test
    void getRank() {assertEquals(6,t.getRank());}
}