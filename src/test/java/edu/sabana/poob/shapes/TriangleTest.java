package edu.sabana.poob.shapes;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    private static Triangle t1;
    private static Triangle t2;
    private static Triangle t3;
    private static Triangle t4;
    private static Triangle t5;
    private static Triangle t6;

    @BeforeAll
    public static void setUp() {
        t1 = new Triangle("red", 20,20,20);
        t2 = new Triangle("blue",30,30,30);
        t3 = new Triangle("yellow",50,10,50);
        t4 = new Triangle("Orange",40,30,30);
        t5 = new Triangle("Navy",15,15,15);
        t6 = new Triangle("Scarlett",60,60,30);
    }

    @Test
    public void shouldCalculateArea() {
        assertEquals(173, (int) t1.getArea());
        assertEquals(389, (int) t2.getArea());
        assertEquals(248, (int) t3.getArea());
        assertEquals(447, (int) t4.getArea());
        assertEquals(97, (int) t5.getArea());
        assertEquals(871, (int) t6.getArea());
    }

    @Test
    public void shouldCalculatePerimeter() {

        assertEquals(60, (int) t1.getPerimeter());
        assertEquals(90, (int) t2.getPerimeter());
        assertEquals(110, (int) t3.getPerimeter());
        assertEquals(100, (int) t4.getPerimeter());
        assertEquals(45, (int) t5.getPerimeter());
        assertEquals(150, (int) t6.getPerimeter());
    }


    @Test
    public void shouldPrintTriangle() {

        assertEquals("This is a Triangle with color red and sides: 20.0,20.0,20.0", t1.toString());
        assertEquals("This is a Triangle with color blue and sides: 30.0,30.0,30.0", t2.toString());
        assertEquals("This is a Triangle with color yellow and sides: 50.0,10.0,50.0", t3.toString());
        assertEquals("This is a Triangle with color Orange and sides: 40.0,30.0,30.0", t4.toString());
        assertEquals("This is a Triangle with color Navy and sides: 15.0,15.0,15.0", t5.toString());
        assertEquals("This is a Triangle with color Scarlett and sides: 60.0,60.0,30.0", t6.toString());

    }
    @Test
    public void ItsEquilateral() {

        Assertions.assertTrue(t1.isEquilateral());
        Assertions.assertTrue(t2.isEquilateral());
        Assertions.assertFalse(t3.isEquilateral());
        Assertions.assertFalse(t4.isEquilateral());
        Assertions.assertTrue(t5.isEquilateral());
    }

    @Test
    public void ItsIsosceles() {
        Assertions.assertFalse(t1.isIsosceles());
        Assertions.assertFalse(t2.isIsosceles());
        Assertions.assertTrue(t3.isIsosceles());
        Assertions.assertTrue(t4.isIsosceles());
        Assertions.assertFalse(t5.isIsosceles());
        Assertions.assertTrue(t6.isIsosceles());
    }


}