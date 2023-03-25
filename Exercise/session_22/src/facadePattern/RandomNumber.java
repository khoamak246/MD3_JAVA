package facadePattern;

public class RandomNumber {
    public static int generateInteger(int min, int max){
        double randomDouble = Math.random();
        return (int) (randomDouble * (max - min + 1) + min);
    }
}
