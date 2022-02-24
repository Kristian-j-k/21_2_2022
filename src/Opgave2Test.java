import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Opgave2Test {

    @Test
    void smallerOfTwo() {
        Opgave2 p =new Opgave2();
        assertEquals(p.smallerOfTwo(1,5),1);
    }

    @Test
    void greaterOfTwo() {
        Opgave2 p =new Opgave2();
        assertEquals(p.greaterOfTwo(1,5),5);
    }

    @Test
    void smallestOfThree() {
        Opgave2 p =new Opgave2();
        assertEquals(p.smallestOfThree(-5,5,100),-5);
        assertEquals(p.smallestOfThree(5,5,100),-1);
    }

    @Test
    void greatestOfThree() {
        Opgave2 p =new Opgave2();
        assertEquals(p.greatestOfThree(-5,5,100),100);
        assertEquals(p.greatestOfThree(5,100,100),-1);
    }

    @Test
    void smallestOfArray() {
        Opgave2 p =new Opgave2();
        assertEquals(p.smallestOfArray(new int[] {8,6,4,50,20000,-9}),-9);
    }

    @Test
    void greatestOfArray() {
        Opgave2 p =new Opgave2();
        assertEquals(p.greatestOfArray(new int[] {8,6,4,50,200,-9}),200);
    }

    @Test
    void sumOfArray() {
        Opgave2 p =new Opgave2();
        assertEquals(p.sumOfArray(new int[] {6,4,50,20,-10}),70);
    }

    @Test
    void averageOfArray() {
        Opgave2 p =new Opgave2();
        assertEquals(p.averageOfArray(new int[] {8,16,0,4,12}),8);
    }

}