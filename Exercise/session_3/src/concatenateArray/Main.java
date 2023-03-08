package concatenateArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input array_1 length:");
        int arrayLength1 = Integer.parseInt(sc.nextLine());
        String[] inputArray1 = new String[arrayLength1];
        for (int i = 0; i < arrayLength1; i++) {
            System.out.println("Input value " + i);
            inputArray1[i] = sc.nextLine();
        }

        System.out.println("Please input array_2 length:");
        int arrayLength2 = Integer.parseInt(sc.nextLine());
        String[] inputArray2 = new String[arrayLength2];
        for (int i = 0; i < arrayLength2; i++) {
            System.out.println("Input value " + i);
            inputArray2[i] = sc.nextLine();
        }
        concatenateArray(inputArray1, inputArray2);
    }
    public static void concatenateArray(String[] arr1, String[] arr2) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Your first array: " + Arrays.toString(arr1));
        System.out.println("Your second array: " + Arrays.toString(arr2));
        Collections.addAll(list, arr1);
        Collections.addAll(list, arr2);
        System.out.println("Concatenate" + list);
    }
}
