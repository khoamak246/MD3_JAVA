package shapeAndTriangle;

public class Main {
    public static void main(String[] args) {
        printTestRange("SHAPE");
        Shape shape = new Shape();
        System.out.println(shape);
        Shape shape1 = new Shape("blue", false);
        System.out.println(shape1);
        printTestRange("TRIANGLE");
        Triangle tri = new Triangle();
        System.out.println(tri);
        Triangle tri1 = new Triangle("Orange", true, 6,6,6);
        System.out.println(tri1);
    }
    public static void printTestRange(String value){
        System.out.println();
        System.out.println("------------- " + value + " -------------");
        System.out.println();
    }
}
