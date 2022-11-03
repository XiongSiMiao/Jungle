package test.model;

import JungleModel.PieceType.Cat;
import JungleModel.PieceType.Rat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PieceTest {

    Cat c=new Cat(2,1,5,5);
    Rat r=new Rat(1,2,5,5);
    @Test
    void canReplace(){
        assertTrue(c.canReplace(r));
    }

    @Test
    void move() {
        /*just assumption
        char movement= 'a';
        assertEquals(4,--c.locationX);
        */
    }
}