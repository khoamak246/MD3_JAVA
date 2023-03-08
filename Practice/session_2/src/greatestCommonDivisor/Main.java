package greatestCommonDivisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dau tien:");
        float firstNumber = sc.nextFloat();
        System.out.println("Nhap so thu hai");
        float secondNumber = sc.nextFloat();
        float selectedNumber = 0;
        if (secondNumber < firstNumber) {
            selectedNumber = secondNumber;
        } else {
            selectedNumber = firstNumber;
        }
        float bestDivisor = 0f;
        for (int i = 0; i <= selectedNumber; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0 && firstNumber / i > bestDivisor) {

                bestDivisor = i;
}
        }
        System.out.println(bestDivisor);

    }
}

