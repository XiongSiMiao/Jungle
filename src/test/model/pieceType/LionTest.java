package test.model.pieceType;

import JungleModel.PieceType.Lion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LionTest {

    Lion l=new Lion(7,2,8,6);

    @Test
    void getCategory() {
        assertEquals(2,l.getCategory());
    }
    @Test
    void getX() {assertEquals(8,l.getX());}

    @Test
    void getY() {assertEquals(6,l.getY());}

    @Test
    void getName() {assertEquals("Lion",l.getName() );}
    @Test
    void getOwner() {assertEquals(2,l.getOwner());}
    @Test
    void getRank() {assertEquals(7,l.getRank());}
}