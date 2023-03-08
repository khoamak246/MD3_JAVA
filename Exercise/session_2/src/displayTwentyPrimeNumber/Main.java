package displayTwentyPrimeNumber;

public class Main {
    public static void main(String[] args) {
        int number = 1;
        int count = 0;
        while (count <= 20) {
            number++;
            boolean check = true;
            if (number == 2) {
                System.out.println(number);
                count++;
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
                count++;
            }

}
    }
}
