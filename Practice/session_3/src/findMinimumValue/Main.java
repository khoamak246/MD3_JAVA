package findMinimumValue;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your array length");
        int arrayLength = sc.nextInt();
        int[] inputArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Input value " + i);
            inputArray[i] = sc.nextInt();
        }
        findMinimum(inputArray);
    }
    public static void findMinimum(int[] inputArray){
        System.out.println("Minimum value is: " + Arrays.stream(inputArray).min().getAsInt());
    }
}
