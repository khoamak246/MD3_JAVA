package checkPalindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        boolean check = true;
        String needToCheckString = "Able was I ere I saw Elba";
        String convertLowerCase = needToCheckString.toLowerCase();
        Stack<Character> reverseCheckStringStack = new Stack<>();
        Queue<Character> reverseCheckStringCharQueue = new LinkedList<>();
        for (int i = 0; i < convertLowerCase.length(); i++) {
            reverseCheckStringStack.push(convertLowerCase.charAt(i));
            reverseCheckStringCharQueue.add(convertLowerCase.charAt(i));
        }
        while (!reverseCheckStringStack.isEmpty()) {
            Character compare = reverseCheckStringStack.pop();
            Character defaultChar = reverseCheckStringCharQueue.remove();
            if (defaultChar != compare){
                check = false;
                break;
            }
        }
        if (check)
            System.out.println("Day la chuoi Palidrome");
        else
            System.out.println("Day khong phai chuoi Palidrome");
    }
}
