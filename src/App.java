import contract.Shape;
import contract.ShapeFactory;
import implementation.ConcreteShapeFactory;

public class App {
    public static void main(String[] args) throws Exception {
        ShapeFactory shapeFactory = new ConcreteShapeFactory();

        Shape circle = shapeFactory.createRectangle(10.5, 5);
        Shape rectangle = shapeFactory.createCircle(10);
        Shape square = shapeFactory.createSquare(4);

        printShapeDetails(circle);
        printShapeDetails(rectangle);
        printShapeDetails(square);
    }

    public static void printShapeDetails(Shape shape) {
        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());
    }
}
