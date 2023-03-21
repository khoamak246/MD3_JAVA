package reverseIntArrByStack;

import java.util.Random;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Reverse Int Arr: ");
        reverseIntArr();
        System.out.println("Reverse String: ");
        reverseString();
    }

    public static void reverseString(){
        StringBuilder needReverseString = new StringBuilder("ThisNeedReverse");
        Stack<Character> reverseStringArrStack = new Stack<>();
        for (int i = 0; i < needReverseString.length(); i++) {
            reverseStringArrStack.push(needReverseString.charAt(i));
        }
        System.out.println("Before--> " + needReverseString);
        needReverseString = new StringBuilder();
       while (!reverseStringArrStack.isEmpty())
           needReverseString.append(reverseStringArrStack.pop());
        System.out.println("After--> " + needReverseString);
        }

    public static void reverseIntArr(){
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(new Random().nextInt(10));
        }
        System.out.println("Before--> " + stack);
        while (!stack.isEmpty())
            temp.push(stack.pop());
        stack = temp;
        System.out.println("After--> " + stack);
    }
}
