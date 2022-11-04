package test.model.pieceType;

import JungleModel.PieceType.Wolf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WolfTest {

    Wolf w = new Wolf(4,1,3,8);
    //Set a wolf to be tested and also test the construction methods of class wolf
    @Test
    void getCategory() {//Test getCategory() in class NormalPiece
        assertEquals(1,w.getCategory());
    }

    @Test
    void getX() {assertEquals(3,w.getX());} //Test getX() in class Piece

    @Test
    void getY() {assertEquals(8,w.getY());} //Test getY() in class Piece

    @Test
    void getName() {assertEquals("Wolf",w.getName());} // Test getName() in class Wolf
    @Test
    void getOwner() {assertEquals(1,w.getOwner());} // Test getOwner() in class Piece
    @Test
    void getRank() {assertEquals(4,w.getRank());} // Test getRank() in class Piece
}