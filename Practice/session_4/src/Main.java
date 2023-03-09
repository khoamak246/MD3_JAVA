public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(8.0, 5.5 );
        double area = rec.getArea();
        double perimeter = rec.getPerimeter();
        System.out.println("Area: " + area + "\n" + "Perimeter: " + perimeter + "\n" + rec);
    }
}
