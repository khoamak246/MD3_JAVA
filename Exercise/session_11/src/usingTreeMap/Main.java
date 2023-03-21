package usingTreeMap;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String testString = "thisisteststring";
        TreeMap<Character, Integer> countAppearWord = new TreeMap<>();
        for (int i = 0; i < testString.length(); i++) {
            char testStringEachChar = testString.charAt(i);
            if (countAppearWord.get(testStringEachChar) == null)
               countAppearWord.put(testStringEachChar, 1);
           else
               countAppearWord.replace(testStringEachChar, countAppearWord.get(testStringEachChar) + 1);
        }
        System.out.println(countAppearWord);
    }
}
