package classFan;


public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setFanSpeed(Fan.FAST);
        fan1.setColor("Yellow");
        fan1.setFanRadius(10);
        Fan fan2 = new Fan();
        fan2.setFanSpeed(Fan.MEDIUM);
        fan2.setFanRadius(5);
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
