package sumInSameColInArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array length");
        int arrayLength = sc.nextInt();
        System.out.println("Input subArrayLength: ");
        int subArrLength = sc.nextInt();
        int[][] caculateArr = new int[arrayLength][subArrLength];
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < subArrLength; j++) {
                System.out.println("Input: " +
                        i + "_" + j);
                caculateArr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Please input col:");
        int selectedCol = sc.nextInt();
        sumCol(selectedCol, caculateArr);

    }
    public static void sumCol(int col, int[][] caculateArr) {
        System.out.println("Your array");
        int total = 0;
        for (int i = 0; i < caculateArr.length; i++) {
            System.out.println(Arrays.toString(caculateArr[i]));
            total += caculateArr[i][col];
        }
        System.out.println("Your answer is: " + total);


    }
}
