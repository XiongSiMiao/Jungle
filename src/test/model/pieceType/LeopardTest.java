package test.model.pieceType;

import JungleModel.PieceType.Leopard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeopardTest {

    Leopard lp=new Leopard(5,2,1,1);
    @Test
    void getCategory() {
        assertEquals(1,lp.getCategory());
    }
    @Test
    void getX() {assertEquals(1,lp.getX());}

    @Test
    void getY() {assertEquals(1,lp.getY());}

    @Test
    void getName() {assertEquals("Leopard",lp.getName());}
    @Test
    void getOwner() {assertEquals(2,lp.getOwner());}
    @Test
    void getRank() {assertEquals(5,lp.getRank());}
}