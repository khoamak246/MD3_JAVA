package changeDecimalToBinary;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int decimal = 111;
        Stack<Integer> binary = new Stack<>();
        while (decimal / 2 != 0){
            binary.push(decimal % 2);
            decimal /= 2;
        }
        StringBuilder result = new StringBuilder();
        while (!binary.isEmpty())
            result.append(binary.pop());
        System.out.println("Ket qua nhi phan la: " + result);
    }
}
