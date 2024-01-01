package com.joegasewicz.factory;

/**
 * A simplified factory class where you only need to implement a single
 * creator class. Specific subclasses are NOT required for each product.
 * @param <T>
 */
public abstract class Creator<T> {
    /**
     *  Example shows how to implement the {@link #getInstance(String)} method.
     *  <pre>
     *  class Shape2Factory extends Creator<Shape2> {
     *
     *     @Override
     *     protected Shape2 getInstance(String instanceType) {
     *         if (instanceType == null) {
     *             return null;
     *         } else if (instanceType.equalsIgnoreCase("RECTANGLE2")) {
     *             return new Rectangle2();
     *         } else if (instanceType.equalsIgnoreCase("SQUARE2")) {
     *             return new Square2();
     *         } else {
     *             return null;
     *         }
     *     }
     *  }
     *  </pre>
     * @param instanceType The instance name that gets created by the factory class.
     * @return T
     */
    protected abstract T getInstance(String instanceType);
}
