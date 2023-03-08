package displayCubes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //rectangle
        String rectangle = "";
        for (int i = 0; i < 3; i++) {
            rectangle += "\n";
            for (int j = 0; j < 7; j++) {
                rectangle += " * ";
            }
        }

        // right triangle in bottom
        String bottomTriangle = "";
        for (int i = 0; i < 5; i++) {
            bottomTriangle += "\n";
            for (int j = 0; j <= i; j++) {
                bottomTriangle += " * ";
            }

        }

        // right triangle in top
        String topTriangle = "";
        for (int i = 5; i >= 0; i--) {
            topTriangle += "\n";
            for (int j = 0; j <= i; j++) {
                topTriangle += " * ";
            }
        }

        // isosceles triangle
        int height;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("height = ");
            height = sc.nextInt();
        } while (height <= 0);

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }


//        Scanner sc = new Scanner(System.in);
        System.out.println("Please select: ");
        System.out.println("""
                1: rectangle;
                2: bottomTriangle;
                3: topTriangle
                """);
        int select = sc.nextInt();

        if (select == 1) {
            System.out.println(rectangle);
        } else if (select == 2) {
            System.out.println(bottomTriangle);
        } else if (select == 3) {
            System.out.println(topTriangle);
        }
    }
}
