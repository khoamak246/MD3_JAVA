package caculateProfit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap money:");
        float sentMoney = sc.nextFloat();
        System.out.println("Nhap thang:");
        float month= sc.nextFloat();
        System.out.println("Nhap lai suat hang nam");
        float interestRate = sc.nextFloat();
        float total = 0f;
        for (int i = 0; i < month; i++) {
            total += sentMoney * (interestRate/100)/12 * month;
        }
        System.out.println("Total interest: " + total);
    }
}
