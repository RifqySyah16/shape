package contract;

public interface ShapeFactory {
    Shape createCircle(double radius);

    Shape createRectangle(double width, double height);

    Shape createSquare(double side);
}
