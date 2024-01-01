package com.joegasewicz.factory;

/**
 * A strict implementation of the factory pattern.
 * Subclass the {@link AbstractCreator} & implement the {@link #factoryMethod()} method.
 * Your implementation of the {@link #factoryMethod()} method should return a
 * specified product type you are interested in creating.
 * @param <T>
 * <pre>
 *  interface Shape {
 *     String draw();
 *  }
 *
 *  class Rectangle implements Shape {
 *     @Override
 *     public String draw() {
 *         return "Rectangle.draw()";
 *     }
 *  }
 *
 *  class RectangleFactory extends AbstractCreator<Shape> {
 *     protected Shape factoryMethod() {
 *         return new Rectangle();
 *     }
 *  }
 *
 *  RectangleFactory rectangleFactory = new RectangleFactory();
 *  Rectangle rectangle = (Rectangle) rectangleFactory.getInstance();
 * </pre>
 */
public abstract class AbstractCreator<T> {
    /**
     *
     * @return T
     */
    protected abstract T factoryMethod();

    /**
     *
     * @return T
     */
    public T getInstance() {
        return factoryMethod();
    }
}
