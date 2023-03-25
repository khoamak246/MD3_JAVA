package factoryMethod;

public class ShapeFactory {
    public Shape getShape(String type){
        if (type.equals("rectangle"))
            return new Rectangle();
        else if (type.equals("Square"))
            return new Square();
        else
            return new Circle();
    }
}
