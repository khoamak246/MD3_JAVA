package changeCurrency;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float exchangeRate = 23000.0f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input USD:");
        System.out.println("VND: " + (sc.nextFloat()/exchangeRate));
    }
}
