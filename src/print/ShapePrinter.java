package print;

import contract.Shape;

public class ShapePrinter {

    public static void printShapeDetails(Shape shape) {
        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());
    }
}
