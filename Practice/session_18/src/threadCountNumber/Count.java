package threadCountNumber;

public class Count implements Runnable {
    private Thread thread;

    public Count() {
        this.thread = new Thread(this, "My runnable thread!");
        System.out.println("my thread created" + thread);
        thread.start();
    }



    public Thread getMyThread() {
        return thread;
    }


    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing the count " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");

    }
}
