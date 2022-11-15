package test.model.pieceType;

import JungleModel.PieceType.Lion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LionTest {

    Lion l=new Lion(7,2,8,6);
    //Set a lion to be tested and also test the construction methods of class lion

    @Test
    void getCategory() {
        assertEquals(2,l.getCategory());
    }// Test getCategory() in class PieceJumpOverWater
    @Test
    void getX() {assertEquals(8,l.getX());}// Test getX() in class Piece

    @Test
    void getY() {assertEquals(6,l.getY());}// Test getY() in class Piece

    @Test
    void getName() {assertEquals(" 獅2",l.getName() );}// Test getName() in class Lion
    @Test
    void getOwner() {assertEquals(2,l.getOwner());}// Test getOwner() in class Piece
    @Test
    void getRank() {assertEquals(7,l.getRank());}// Test getRank() in class Piece
}