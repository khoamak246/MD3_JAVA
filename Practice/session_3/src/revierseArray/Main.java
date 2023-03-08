package revierseArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length:");
        String arrayLength = sc.nextLine();
        String[] inputArray = new String[Integer.parseInt(arrayLength)];
        for (int i = 0; i < Integer.parseInt(arrayLength); i++) {
            System.out.println("Input value:" + i);
            inputArray[i] = sc.nextLine();
        }

        Collections.reverse(Arrays.asList(inputArray));
        System.out.println("Reversed Array:" + Arrays.toString(inputArray));
    }
}
