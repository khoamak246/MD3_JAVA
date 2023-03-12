package point2Dand3D;

public class Main {
    public static void main(String[] args) {
        printTestRange("POINT2D");
        Point2D pnt = new Point2D();
        System.out.println(pnt);
        Point2D pnt1 = new Point2D(10, 20);
        System.out.println(pnt1);
        printTestRange("POINT3D");
        Point3D pnt2 = new Point3D();
        System.out.println(pnt2);
        Point3D pnt3 = new Point3D(10,20,30);
        System.out.println(pnt3);


    }
    public static void printTestRange(String value){
        System.out.println();
        System.out.println("------------- " + value + " -------------");
        System.out.println();
    }
}
