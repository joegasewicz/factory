package com.joegasewicz;

import com.joegasewicz.factory.AbstractCreator;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

interface Shape {
    String draw();
}

class Rectangle implements Shape {
    @Override
    public String draw() {
        return "Rectangle.draw()";
    }
}

class Square implements Shape {
    @Override
    public String draw() {
        return "Square.draw()";
    }
}

class RectangleFactory extends AbstractCreator<Shape> {
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}

class SquareFactory extends AbstractCreator<Shape> {
    protected Shape factoryMethod() {
        return new Square();
    }
}

public class AbstractCreatorTest extends TestCase {

    public AbstractCreatorTest(String testName) {
        super(testName);
    }


    public static Test suite() {
        return new TestSuite(AbstractCreatorTest.class);
    }

    public void testAbstractCreatorTest() {
        RectangleFactory rectangleFactory = new RectangleFactory();
        Rectangle rectangle = (Rectangle) rectangleFactory.getInstance();
        assertNotNull(rectangle);
        assertEquals("Rectangle.draw()", rectangle.draw());

        SquareFactory squareFactory = new SquareFactory();
        Square square = (Square) squareFactory.getInstance();
        assertNotNull(square);
        assertEquals("Square.draw()", square.draw());
    }
}
