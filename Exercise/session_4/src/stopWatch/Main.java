package stopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        sw.start();
        System.out.println(sw.getStartTime());
        sw.stop();
        System.out.println(sw.getEndTime());
        sw.getElapsedTime();
    }
}
