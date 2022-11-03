package test.model.pieceType;

import JungleModel.PieceType.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    Dog d = new Dog(3,1,1,7);

    @Test
    void getCategory() {
        assertEquals(1,d.getCategory());
    }


    @Test
    void getX() {
        assertEquals(1,d.getX());
    }

    @Test
    void getY() {
        assertEquals(7,d.getY());
    }

    @Test
    void getName() {
        assertEquals("Dog", d.getName());
    }
    @Test
    void getOwner() {assertEquals(1,d.getOwner());}
    @Test
    void getRank() {assertEquals(3,d.getRank());}
}