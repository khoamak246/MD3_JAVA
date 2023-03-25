package factoryMethod;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape("rectangle").draw();
        shapeFactory.getShape("square").draw();
        shapeFactory.getShape("circle").draw();

    }
}
