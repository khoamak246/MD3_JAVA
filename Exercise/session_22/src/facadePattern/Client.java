package facadePattern;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size: ");
        int size = sc.nextInt();
        System.out.print("Input min: ");
        int min = sc.nextInt();
        System.out.print("Input max: ");
        int max = sc.nextInt();
        RandomListFacade randomListFacade = new RandomListFacade();
        randomListFacade.printRandomEvenList(size, min, max);
    }
}
