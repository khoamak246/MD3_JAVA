package findValueinArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] currentArray = {"H", "E", "L", "O"};
        Scanner sc = new Scanner(System.in);
        int index = Arrays.asList(currentArray).indexOf(sc.nextLine());
        if (index >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
