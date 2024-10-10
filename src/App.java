import contract.Shape;
import implementation.Circle;
import implementation.Rectangle;
import implementation.Square;

public class App {
    public static void main(String[] args) throws Exception {
        Shape rectangle = new Rectangle(10.5, 5);
        Shape circle = new Circle(10);
        Shape square = new Square(4);

        printShapeDetails(rectangle);
        printShapeDetails(circle);
        printShapeDetails(square);
    }

    public static void printShapeDetails(Shape shape) {
        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());
    }
}
