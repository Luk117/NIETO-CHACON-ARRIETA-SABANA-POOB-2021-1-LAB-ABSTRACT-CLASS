package edu.sabana.poob.shapes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    private static Square s1;
    private static Square s2;
    private static Square s3;
    private static Square s4;
    private static Square s5;
    private static Square s6;

    @BeforeAll
    public static void setUp() {
        s1 = new Square("red", 25.5);
        s2 = new Square("blue",55.5);
        s3 = new Square("yellow",65);
        s4 = new Square("Orange",62);
        s5 = new Square("Navy",38.5);
        s6 = new Square("Scarlett",75);
    }

    @Test
    public void shouldCalculateArea() {
        assertEquals(650, (int) s1.getArea());
        assertEquals(3080, (int) s2.getArea());
        assertEquals(4225, (int) s3.getArea());
        assertEquals(3844, (int) s4.getArea());
        assertEquals(1482, (int) s5.getArea());
        assertEquals(5625, (int) s6.getArea());
    }

    @Test
    public void shouldCalculatePerimeter() {

        assertEquals(102, (int) s1.getPerimeter());
        assertEquals(222, (int) s2.getPerimeter());
        assertEquals(260, (int) s3.getPerimeter());
        assertEquals(248, (int) s4.getPerimeter());
        assertEquals(154, (int) s5.getPerimeter());
        assertEquals(300, (int) s6.getPerimeter());
    }


    @Test
    public void shouldCalculateDiagonal() {

        assertEquals(36, (int) s1.getDiagonal());
        assertEquals(78, (int) s2.getDiagonal());
        assertEquals(91, (int) s3.getDiagonal());
        assertEquals(87, (int) s4.getDiagonal());
        assertEquals(54, (int) s5.getDiagonal());
        assertEquals(106, (int) s6.getDiagonal());
    }

    @Test
    public void shouldPrintRectangle() {

        assertEquals("This is a Square with color red and width: 25.5 - length: 25.5", s1.toString());
        assertEquals("This is a Square with color blue and width: 55.5 - length: 55.5", s2.toString());
        assertEquals("This is a Square with color yellow and width: 65.0 - length: 65.0", s3.toString());
        assertEquals("This is a Square with color Orange and width: 62.0 - length: 62.0", s4.toString());
        assertEquals("This is a Square with color Navy and width: 38.5 - length: 38.5", s5.toString());
        assertEquals("This is a Square with color Scarlett and width: 75.0 - length: 75.0", s6.toString());

    }


}