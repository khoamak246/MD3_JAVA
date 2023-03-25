package simpleThread;

public class NumberGenerator implements Runnable {
    private Thread thread;

    public NumberGenerator(String threadName) {
        this.thread = new Thread(this, threadName);
        thread.start();
    }

    @Override
    public void run() {

        try {
            for (Integer i = 0; i < 10; i++) {
                System.out.println("Number: " + i + " Hashcode: " + i.hashCode());
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
