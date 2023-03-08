package findBiggestValue;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input array length");
        int arrayLength = Integer.parseInt(sc.nextLine());
        int[] inputArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Input your " + i + " value");
            inputArray[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Gia tri lon nhat la: " + Arrays.stream(inputArray).max().getAsInt());

    }
}
