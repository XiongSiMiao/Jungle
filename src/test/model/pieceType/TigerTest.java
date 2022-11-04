package test.model.pieceType;

import JungleModel.PieceType.Tiger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TigerTest {

    Tiger t = new Tiger(6,2,5,1);
    //Set a tiger to be tested and also test the construction methods of class tiger
    @Test
    void getCategory() {
        assertEquals(2,t.getCategory());
    }// Test getCategory() in class PieceJumpOverWater

    @Test
    void getX() {assertEquals(5,t.getX());}// Test getX() in class Piece

    @Test
    void getY() {assertEquals(1,t.getY());}// Test getY() in class Piece

    @Test
    void getName() {assertEquals("Tiger",t.getName());}// Test getName() in class Tiger
    @Test
    void getOwner() {assertEquals(2,t.getOwner());}// Test getOwner() in class Piece
    @Test
    void getRank() {assertEquals(6,t.getRank());}// Test getRank() in class Piece
}