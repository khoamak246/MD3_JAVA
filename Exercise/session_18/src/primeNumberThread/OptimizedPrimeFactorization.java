package primeNumberThread;

public class OptimizedPrimeFactorization implements Runnable {

    public OptimizedPrimeFactorization() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        int count = 0;
        while (count < 20) {
            count++;
            boolean check = true;
            if (count > 2 && count % 2 == 0 || count == 1) {
                check = false;
            }
            int top = (int) Math.sqrt(count) + 1;
            for (int i = 3; i < top; i += 2) {
                if (count % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("OP " + count);
            }
        }
    }
}
