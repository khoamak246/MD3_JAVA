package caculateBMI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your weight:");
        float weight = sc.nextFloat();
        System.out.println("Input your height:");
        float height = sc.nextFloat();
        float result = (float) (weight / (Math.pow(height, 2)));
        if (result < 18.5) {
            System.out.println("Under weight");
        } else if (18.5 <= result && result < 25.0) {
            System.out.println("Normal");
        } else if (25.0 <= result && result < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
