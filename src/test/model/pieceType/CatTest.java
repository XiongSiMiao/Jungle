package test.model.pieceType;

import JungleModel.PieceType.Cat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    Cat c = new Cat(2,1,5,2);
    //Set a cat to be tested and also test the construction methods of class cat


    @Test
    void getCategory() {
        assertEquals(1,c.getCategory());
    }

    @Test
    void getX() {
        assertEquals(5,c.getX());
    }

    @Test
    void getY() {
        assertEquals(2,c.getY());
    }

    @Test
    void getName() {
        assertEquals("Cat",c.getName());
    }
    @Test
    void getOwner() {assertEquals(1,c.getOwner());}
    @Test
    void getRank() {assertEquals(2,c.getRank());}
}