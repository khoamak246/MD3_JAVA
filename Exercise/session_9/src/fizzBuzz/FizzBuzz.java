package fizzBuzz;

public class FizzBuzz {
    public static String getFizzBuzz(int number) {
        String stringNumber = String.valueOf(number);
        boolean isContain3 = stringNumber.contains("3");
        boolean isContain5 = stringNumber.contains("5");
        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;
        if (isDivisibleBy3){
            if (isDivisibleBy5) {
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        } else if (isDivisibleBy5) {
            return "Buzz";
        } else if (isContain3) {
            return "Fizz";
        } else if (isContain5) {
            return "Buzz";
        } else {
            return stringNumber;
        }
    }
    public static String fizzBuzzTranslate(int number){
        String[] translateArr = {"muoi", "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin"};
        String numberString = String.valueOf(number).replace("-", "");
        StringBuilder translateStringBuild = new StringBuilder();
        boolean isEqual10 = number == 10;
        if (isEqual10){
            translateStringBuild.append(translateArr[0]);
        } else {
            for (int i = 0; i < numberString.length(); i++) {
                int translateIndex = Integer.parseInt(String.valueOf(numberString.charAt(i)));
                translateStringBuild.append(translateArr[translateIndex]);
                if (i != numberString.length() - 1)
                    translateStringBuild.append(" ");
            }
        }

        if (number > 0)
            return translateStringBuild.toString();
        else if (number < 0)
            return "am " + translateStringBuild;
        else
            return "khong";
    }
}
