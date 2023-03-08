package caculateChar;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your string: ");
        String inputValue = sc.nextLine();
        System.out.println("Input your check char: ");
        char check = sc.nextLine().charAt(0);
        checkChar(inputValue, check);
    }
    public static void checkChar(String inputValue, char check){
        int count = 0;
        for (int i = 0; i < inputValue.length(); i++) {
           if (inputValue.charAt(i) == (check)){
               count++;
           }
        }
        System.out.println(count);
    }
}
