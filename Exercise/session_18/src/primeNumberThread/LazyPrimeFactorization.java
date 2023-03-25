package primeNumberThread;

public class LazyPrimeFactorization implements Runnable{
    public LazyPrimeFactorization() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        int count = 0;
        while (count < 20){
            count++;
            boolean check = true;
            if (count < 2){
                check = false;
            } else if (count == 2) {
                check = true;
            } else {
                for (int i = 2; i < count; i++) {
                    if (count % i == 0){
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                System.out.println("LZ " + count);
            }
        }
    }
}
