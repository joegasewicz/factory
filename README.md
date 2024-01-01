# Factory
Abstract factory pattern library.

### Usage
See the doc strings for full instructions.

```java
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
```

Abstract Creator
```java
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

RectangleFactory rectangleFactory = new RectangleFactory();
Rectangle rectangle = (Rectangle) rectangleFactory.getInstance();
```

Creator
```java
class ShapeFactory extends Creator<Shape> {

    @Override
    protected Shape getInstance(String instanceType) {
        if (instanceType == null) {
            return null;
        } else if (instanceType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (instanceType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else {
            return null;
        }
    }
}

ShapeFactory shapeFactory = new ShapeFactory();
Shape rectangle = shapeFactory.getInstance("rectangle");
```