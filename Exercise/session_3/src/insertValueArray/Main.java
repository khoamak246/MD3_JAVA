package insertValueArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input array length:");
        int arrayLength = Integer.parseInt(sc.nextLine());
        String[] inputArray = new String[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Input value " + i);
            inputArray[i] = sc.nextLine();
        }
        insertValue(inputArray);
    }
    public static void insertValue(String[] insertValue) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(insertValue));
        Scanner sc = new Scanner(System.in);
        System.out.println("Current array is: " + Arrays.toString(insertValue));
        System.out.println("Please select where to insert:");
        int selectedInsertIndex = Integer.parseInt(sc.nextLine());
        System.out.println("Please input your value: ");
        String value = sc.nextLine();
        list.add(selectedInsertIndex, value);
        System.out.println("Your array is: " + list);

    }
}
