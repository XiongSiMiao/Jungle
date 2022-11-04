package test.model.pieceType;

import JungleModel.PieceType.Elephant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElephantTest {

    Elephant e = new Elephant(8,2,3,3);
    //Set an elephant to be tested and also test the construction methods of class elephant
    @Test
    void getCategory() {
        assertEquals(1,e.getCategory());
    }// Test getCategory() in class NormalPiece


    @Test
    void getX() {
        assertEquals(3,e.getX());
    }// Test getX() in class Piece

    @Test
    void getY() {
        assertEquals(3,e.getY());
    }// Test getY() in class Piece

    @Test
    void getName() {// Test getName() in class Elephant
        assertEquals("Elephant",e.getName());
    }
    @Test
    void getOwner() {assertEquals(2,e.getOwner());}// Test getOwner() in class Piece
    @Test
    void getRank() {assertEquals(8,e.getRank());}// Test getRank() in class Piece
}