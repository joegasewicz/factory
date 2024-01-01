package com.joegasewicz;


import com.joegasewicz.factory.Creator;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

interface Shape2 {
    String draw();
}

class Rectangle2 implements Shape2 {
    @Override
    public String draw() {
        return "Rectangle.draw()";
    }
}

class Square2 implements Shape2 {
    @Override
    public String draw() {
        return "Square.draw()";
    }
}

class Shape2Factory extends Creator<Shape2> {

    @Override
    protected Shape2 getInstance(String instanceType) {
        if (instanceType == null) {
            return null;
        } else if (instanceType.equalsIgnoreCase("RECTANGLE2")) {
            return new Rectangle2();
        } else if (instanceType.equalsIgnoreCase("SQUARE2")) {
            return new Square2();
        } else {
            return null;
        }
    }
}


public class CreatorTest extends TestCase {
    public CreatorTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(CreatorTest.class);
    }

    public void testConcreteCreator() {
        Shape2Factory shape2Factory = new Shape2Factory();
        Shape2 rectangle2 = shape2Factory.getInstance("rectangle2");
        assertNotNull(rectangle2);
        assertEquals("Rectangle.draw()", rectangle2.draw());

        Shape2 square2 = shape2Factory.getInstance("square2");
        assertNotNull(square2);
        assertEquals("Square.draw()", square2.draw());
    }
}
