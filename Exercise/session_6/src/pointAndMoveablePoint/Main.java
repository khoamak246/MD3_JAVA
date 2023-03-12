package pointAndMoveablePoint;

public class Main {
    public static void main(String[] args) {
        printTestRange("POINT");
        Point pt1 = new Point();
        System.out.println(pt1);
        Point pt2 = new Point(10, 20);
        System.out.println(pt2);
        printTestRange("MOVEABLEPOINT");
        MoveablePoint mv1 = new MoveablePoint();
        System.out.println(mv1);
        System.out.println(mv1.move());
        MoveablePoint mv2 = new MoveablePoint(10, 20, 30, 40);
        System.out.println(mv2);
        System.out.println(mv2.move());
    }
    public static void printTestRange(String value){
        System.out.println();
        System.out.println("------------- " + value + " -------------");
        System.out.println();
    }
}
