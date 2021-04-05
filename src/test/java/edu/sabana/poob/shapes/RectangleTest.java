package edu.sabana.poob.shapes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    private static Rectangle r1;
    private static Rectangle r2;
    private static Rectangle r3;
    private static Rectangle r4;
    private static Rectangle r5;
    private static Rectangle r6;

    @BeforeAll
    public static void setUp() {
        r1 = new Rectangle("red", 25,20);
        r2 = new Rectangle("blue",45,55);
        r3 = new Rectangle("yellow",55,65);
        r4 = new Rectangle("Orange",65, 62);
        r5 = new Rectangle("Navy",38,48);
        r6 = new Rectangle("Scarlett",82,75);
    }

    @Test
    public void shouldCalculateArea() {
        assertEquals(500, (int) r1.getArea());
        assertEquals(2475, (int) r2.getArea());
        assertEquals(3575, (int) r3.getArea());
        assertEquals(4030, (int) r4.getArea());
        assertEquals(1824, (int) r5.getArea());
        assertEquals(6150, (int) r6.getArea());
    }

    @Test
    public void shouldCalculatePerimeter() {

        assertEquals(90, (int) r1.getPerimeter());
        assertEquals(200, (int) r2.getPerimeter());
        assertEquals(240, (int) r3.getPerimeter());
        assertEquals(254, (int) r4.getPerimeter());
        assertEquals(172, (int) r5.getPerimeter());
        assertEquals(314, (int) r6.getPerimeter());
    }


    @Test
    public void shouldCalculateDiagonal() {

        assertEquals(32, (int) r1.getDiagonal());
        assertEquals(71, (int) r2.getDiagonal());
        assertEquals(85, (int) r3.getDiagonal());
        assertEquals(89, (int) r4.getDiagonal());
        assertEquals(61, (int) r5.getDiagonal());
        assertEquals(111, (int) r6.getDiagonal());
    }

    @Test
    public void shouldPrintRectangle() {

        assertEquals("This is a Rectangle with color red and width: 25.0 - length: 20.0", r1.toString());
        assertEquals("This is a Rectangle with color blue and width: 45.0 - length: 55.0", r2.toString());
        assertEquals("This is a Rectangle with color yellow and width: 55.0 - length: 65.0", r3.toString());
        assertEquals("This is a Rectangle with color Orange and width: 65.0 - length: 62.0", r4.toString());
        assertEquals("This is a Rectangle with color Navy and width: 38.0 - length: 48.0", r5.toString());
        assertEquals("This is a Rectangle with color Scarlett and width: 82.0 - length: 75.0", r6.toString());

    }


}