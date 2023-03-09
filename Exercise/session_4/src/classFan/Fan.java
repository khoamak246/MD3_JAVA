package classFan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private boolean on;
    private int fanSpeed;
    private double fanRadius;
    private String color;

    public Fan(){
        this.on = false;
        this.fanSpeed = SLOW;
        this.fanRadius = 5;
        this.color = "blue";
    }


    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getFanSpeed() {
        return fanSpeed;
    }

    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
    }

    public double getFanRadius() {
        return fanRadius;
    }

    public void setFanRadius(double fanRadius) {
        this.fanRadius = fanRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "on=" + on +
                ", fanSpeed=" + fanSpeed +
                ", fanRadius=" + fanRadius +
                ", color='" + color + '\'' +
                '}';
    }
}
