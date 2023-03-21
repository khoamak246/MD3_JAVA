package consecutiveCharacterString;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your content:");
        String inputString = sc.nextLine();
        LinkedList<Character> listMax = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < inputString.length(); i++) {
            if (list.size() != 0 && inputString.charAt(i) <= list.getLast())
                list.clear();
            list.add(inputString.charAt(i));

            if (list.size() > listMax.size()) {
                listMax.clear();
                listMax.addAll(list);
            }
        }
        System.out.println(listMax);
        System.out.println("Do phuc tap cua thuat toan la O(n)");
    }
}
