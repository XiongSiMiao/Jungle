package test.model;

import JungleModel.PieceType.Cat;
import JungleModel.PieceType.Elephant;
import JungleModel.PieceType.Rat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PieceTest {

    //Set two kinds of pieces for following tests
    Cat c=new Cat(2,1,5,5);
    Rat r=new Rat(1,2,5,5);
    Elephant e=new Elephant(8,1,5,5);

    @Test
    void canReplace(){
        assertTrue(c.canReplace(r));
        assertTrue(r.canReplace(e));
        assertTrue(!e.canReplace(r));
    }// Test canReplace() in class Piece


    @Test
    void move() {//Test move() in class Piece, test if r can move to (5,6)
        r.move(5,6);
        assertEquals(5,r.getX());
        assertEquals(6,r.getY());
    }
}