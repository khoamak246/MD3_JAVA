package findMinimumValueArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input array length");
        int arrayLength = sc.nextInt();
        int[] inputArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Please input your value: " + i);
            inputArray[i] = sc.nextInt();
        }

        System.out.println("Minimum is: " + Arrays.stream(inputArray).min().getAsInt());
    }
}
