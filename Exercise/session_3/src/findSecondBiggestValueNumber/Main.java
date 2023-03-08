package findSecondBiggestValueNumber;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input arrayLength: ");
        int arrayLength = sc.nextInt();
        int[] inputArr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Input value " + i);
            inputArr[i] = sc.nextInt();
        }
        findSecondBiggestNumber(inputArr);
    }
    public static void findSecondBiggestNumber(int[] inputArr){
        int result = 0;
       int biggestValue = Arrays.stream(inputArr).max().getAsInt();
       for (int i = 0; i < inputArr.length; i++) {
           if (inputArr[i] > result && inputArr[i] < biggestValue) {
               result = inputArr[i];
           }
       }
        System.out.println("Your second biggest value is: " + result);
    }}
