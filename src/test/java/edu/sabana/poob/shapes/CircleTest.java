package edu.sabana.poob.shapes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    private static Circle c1;
    private static Circle c2;
    private static Circle c3;
    private static Circle c4;
    private static Circle c5;
    private static Circle c6;

    @BeforeAll
    public static void setUp() {
        c1 = new Circle(10);
        c2 = new Circle(14.5);
        c3 = new Circle("red", 23.5);
        c4 = new Circle(35);
        c5 = new Circle(45);
        c6 = new Circle("blue", 80.5);
    }

    @Test
    public void shouldCalculateArea() {
        assertEquals(314, (int) c1.getArea());
        assertEquals(660, (int) c2.getArea());
        assertEquals(1734, (int) c3.getArea());
        assertEquals(3848, (int) c4.getArea());
        assertEquals(6361, (int) c5.getArea());
        assertEquals(20358, (int) c6.getArea());
    }

    @Test
    public void shouldCalculatePerimeter() {

        assertEquals(62, (int) c1.getPerimeter());
        assertEquals(91, (int) c2.getPerimeter());
        assertEquals(147, (int) c3.getPerimeter());
        assertEquals(219, (int) c4.getPerimeter());
        assertEquals(282, (int) c5.getPerimeter());
        assertEquals(505, (int) c6.getPerimeter());
    }

    @Test
    public void shouldCalculateDiameter() {

        assertEquals(20, (int) c1.getDiameter());
        assertEquals(29, (int) c2.getDiameter());
        assertEquals(47, (int) c3.getDiameter());
        assertEquals(70, (int) c4.getDiameter());
        assertEquals(90, (int) c5.getDiameter());
        assertEquals(161, (int) c6.getDiameter());
    }

    @Test
    public void shouldPrintCircle() {

        assertEquals("This is a Circle with color NONE and radius 10.0", c1.toString());
        assertEquals("This is a Circle with color NONE and radius 14.5", c2.toString());
        assertEquals("This is a Circle with color red and radius 23.5", c3.toString());
        assertEquals("This is a Circle with color NONE and radius 35.0", c4.toString());
        assertEquals("This is a Circle with color NONE and radius 45.0", c5.toString());
        assertEquals("This is a Circle with color blue and radius 80.5", c6.toString());

    }

}
