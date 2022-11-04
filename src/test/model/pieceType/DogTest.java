package test.model.pieceType;

import JungleModel.PieceType.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    Dog d = new Dog(3,1,1,7);
    //Set a dog to be tested and also test the construction methods of class dog

    @Test
    void getCategory() {
        assertEquals(1,d.getCategory());
    }// Test getCategory() in class NormalPiece


    @Test
    void getX() {
        assertEquals(1,d.getX());
    }// Test getX() in class Piece

    @Test
    void getY() {
        assertEquals(7,d.getY());
    }// Test getY() in class Piece

    @Test
    void getName() {
        assertEquals("Dog", d.getName());
    }// Test getName() in class Dog
    @Test
    void getOwner() {assertEquals(1,d.getOwner());}// Test getOwner() in class Piece
    @Test
    void getRank() {assertEquals(3,d.getRank());}// Test getRank() in class Piece
}