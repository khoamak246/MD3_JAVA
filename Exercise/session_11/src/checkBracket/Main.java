package checkBracket;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String[] expression = {"s * (s – a) * (s – b) * (s – c)",
                "(– b + (b2 – 4*a*c)^0.5) / 2*a",
                "s * (s – a) * (s – b * (s – c)",
                "s * (s – a) * s – b) * (s – c)",
                "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))"};
        Stack<Character> leftBracket;
        Stack<Character> rightBracket;
        for (String s : expression) {
            leftBracket = new Stack<>();
            rightBracket = new Stack<>();
            for (int j = 0; j < s.length(); j++)
                if (s.charAt(j) == '(')
                    leftBracket.push('(');
                else if (s.charAt(j) == ')')
                    rightBracket.push(')');
            if (leftBracket.size() == rightBracket.size())
                System.out.println( s + " la bieu thuc dung");
            else
                System.out.println(s + " khong phai bieu thuc dung");
        }
    }
}
