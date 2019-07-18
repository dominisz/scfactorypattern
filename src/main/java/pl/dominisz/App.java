package pl.dominisz;

public class App {
  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();

    Shape circle = shapeFactory.getShape("circle");
    Shape square = shapeFactory.getShape("square");
    Shape rectangle = shapeFactory.getShape("rectangle");
    Shape rectangle2 = shapeFactory.getShape("rectagle");
    Shape nullShape = shapeFactory.getShape(null);

    circle.draw();
    square.draw();
    rectangle.draw();
    rectangle2.draw();
    nullShape.draw();
  }
}
