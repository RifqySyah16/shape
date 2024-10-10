import contract.Shape;
import contract.ShapeFactory;
import implementation.ConcreteShapeFactory;
import print.ShapePrinter;

public class App {
    public static void main(String[] args) throws Exception {
        ShapeFactory shapeFactory = new ConcreteShapeFactory();

        Shape circle = shapeFactory.createCircle(10);
        Shape rectangle = shapeFactory.createRectangle(10.5, 5);
        Shape square = shapeFactory.createSquare(4);

        ShapePrinter.printShapeDetails(circle);
        ShapePrinter.printShapeDetails(rectangle);
        ShapePrinter.printShapeDetails(square);
    }
}
