package equationOfTheFirstDegree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ax + b = 0
        Scanner sc = new Scanner(System.in);
        System.out.println("ax + b = 0");
        System.out.println("Input a:");
        float a = sc.nextFloat();
        System.out.println("Input b:");
        float b = sc.nextFloat();

        if (a == 0) {
            System.out.println("Vô số nghiệm");
        } else {
            System.out.println("Nghiệm là: " + ((b * -1)/a));
        }

    }
}
