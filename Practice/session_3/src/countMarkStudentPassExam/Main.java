package countMarkStudentPassExam;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input array length");
        int arrayLength = Integer.parseInt(sc.nextLine());
        double[] inputArray = new double[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Input your value " + i);
            inputArray[i] = Double.parseDouble(sc.nextLine());
        }
        for(double passValue : inputArray){
           if (passValue > 6.5) {
               System.out.print(passValue + " ");
           }
        }
    }
}
