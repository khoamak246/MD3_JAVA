package deleteSpecificValueInArray;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input array length");
        int arrayLength = Integer.parseInt(sc.nextLine());
        String[] inputArray = new String[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Please input your value: ");
            inputArray[i] = sc.nextLine();
        }
        System.out.println("Input your delete value");
        String deleteValue = sc.nextLine();
        deleteValueInArray(inputArray, deleteValue);
    }
    public static void deleteValueInArray(String[] inputArray, String value) {
        String[] currentArray = inputArray;
        int index = Arrays.asList(currentArray).indexOf(value);
        System.out.println("index: " + index);
        if (index >= 0) {
            System.out.println("Before array: " + Arrays.toString(inputArray));
            ArrayList<String> list = new ArrayList<>(Arrays.asList(currentArray));
            list.remove(index);
            System.out.println("After remove: " + list);
        } else {
            System.out.println("Not have value in your array");
        }
    }
}
