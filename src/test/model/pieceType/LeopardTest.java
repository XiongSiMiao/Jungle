package test.model.pieceType;

import JungleModel.PieceType.Leopard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeopardTest {

    Leopard lp=new Leopard(5,2,1,1);
    //Set a leopard to be tested and also test the construction methods of class leopard
    @Test
    void getCategory() {
        assertEquals(1,lp.getCategory());
    }// Test getCategory() in class NormalPiece
    @Test
    void getX() {assertEquals(1,lp.getX());}// Test getX() in class Piece

    @Test
    void getY() {assertEquals(1,lp.getY());}// Test getY() in class Piece

    @Test
    void getName() {assertEquals("Leopard",lp.getName());}// Test getName() in class Leopard
    @Test
    void getOwner() {assertEquals(2,lp.getOwner());}// Test getOwner() in class Piece
    @Test
    void getRank() {assertEquals(5,lp.getRank());}// Test getRank() in class Piece
}