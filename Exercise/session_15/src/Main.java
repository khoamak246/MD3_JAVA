import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhap canh a:");
                int canhA = Integer.parseInt(sc.nextLine());
                System.out.print("Nhap canh b:");
                int canhB = Integer.parseInt(sc.nextLine());
                System.out.print("Nhap canh c:");
                int canhC = Integer.parseInt(sc.nextLine());
                try {
                    checkTriangleEdges(canhA, canhB, canhC);
                    return;
                } catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }
            } catch (NumberFormatException e) {
                System.err.println("Khong dung dinh dang xin hay nhap lai!");
            }


        }
    }

    public static void checkTriangleEdges(double a, double b, double c) throws IllegalArgumentException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Loi: Tam giac khong hop le!");
        } else {
            System.out.println("Tam giac hop le!");
        }
    }
}
