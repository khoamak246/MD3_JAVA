package checkPrime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your number:");
        int inputNumber = sc.nextInt();
        if (inputNumber < 2) {
            check = false;
        }
        if (inputNumber == 2) {
            check = true;
        }
        for (int i = 2; i < inputNumber; i++) {
            if (inputNumber % i == 0) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("So nguyen to");
        } else {
            System.out.println("khong phai so nguyen to");
        }
    }
}
