package sumDiagonalLineTwoDemensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your arrayLength: ");
        int arrayLength = Integer.parseInt(sc.nextLine());
        System.out.print("Input your subArrayLength");
        int subArrayLength = Integer.parseInt(sc.nextLine());
        double[][] caculateArr = new double[arrayLength][subArrayLength];
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < subArrayLength; j++) {
                System.out.println("Input " + i + "_" + j);
                caculateArr[i][j] = Double.parseDouble(sc.nextLine());
            }
        }
        caculateDiagonalLineValue(caculateArr);
    }
    public static void caculateDiagonalLineValue(double[][] caculateArr) {
        double total = 0.0;
        System.out.println("caculateArr = " + Arrays.deepToString(caculateArr));
        for (int i = 0; i < caculateArr.length; i++) {
            if (caculateArr[i].length > i) {
            total+=caculateArr[i][i];
            }
        }
        System.out.println("Your answer is: " + total);
    }
}
