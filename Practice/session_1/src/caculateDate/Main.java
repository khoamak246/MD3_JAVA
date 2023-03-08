package caculateDate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thang:");
        int month = sc.nextInt();
       switch (month) {
           case 1:
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12:
               System.out.println("31");
               break;
           case 2:
               System.out.println("28 hoac 29");
           default:
               System.out.println("30");
               break;
       }
    }
}
