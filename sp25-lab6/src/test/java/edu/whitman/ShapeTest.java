package edu.whitman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

public class ShapeTest{

    @Test
    public void testCircle(){
        Shape circle = new Circle(5);
        assertEquals(Math.PI * 5 * 5, circle.calculateArea());
    }

    @Test
    public void testRectangleArea(){
        Shape rectangle = new Rectangle(4,6);
        assertEquals(4*6, rectangle.calculateArea());
    }

    @Test
    public void testTriangleArea(){
        Shape triangle = new Triangle(4,6);
        assertEquals(0.5*4*6, triangle.calculateArea());
    }

    @Test
    public void testSquareArea(){
        Shape square = new Square(4);
        assertEquals(4*4, square.calculateArea());
    }
}