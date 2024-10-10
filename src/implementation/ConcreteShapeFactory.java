package implementation;

import contract.Shape;
import contract.ShapeFactory;

public class ConcreteShapeFactory implements ShapeFactory {

    @Override
    public Shape createCircle(double radius) {
        return new Circle(radius);
    }

    @Override
    public Shape createRectangle(double width, double height) {
        return new Rectangle(width, height);
    }

    @Override
    public Shape createSquare(double side) {
        return new Square(side);
    }
}
