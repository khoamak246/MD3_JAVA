package findBiggestValueiInTwoDimensionalArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] currentArray = {{1,2,3},{4,5,6}};
        int[] compareArray = new int[currentArray.length];
        for (int i = 0; i < currentArray.length; i++) {
            compareArray[i] = Arrays.stream(currentArray[i]).max().getAsInt();
        }
        System.out.println("Biggest value is: " + Arrays.stream(compareArray).max().getAsInt());
    }
}
