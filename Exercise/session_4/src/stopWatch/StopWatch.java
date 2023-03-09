package stopWatch;

public class StopWatch {
    private double startTime;
    private double endTime;

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void start(){
        this.startTime = System.nanoTime();
    }

    public void stop() {
        this.endTime = System.nanoTime();
    }

    public void getElapsedTime(){
        double ElapsedTime = endTime - startTime;
        System.out.println("Thoi gian da troi qua la: " + ElapsedTime + " nano seconds");
    }
}
