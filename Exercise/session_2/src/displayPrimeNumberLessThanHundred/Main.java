package displayPrimeNumberLessThanHundred;

public class Main {
    public static void main(String[] args) {
        int number = 1;

        while (number < 100) {
            number++;
            boolean check = true;
            if (number == 2) {
                System.out.println(number);
                number++;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(number);
            }

        }
    }
}
