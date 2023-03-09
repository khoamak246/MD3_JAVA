package quadraticEquation;

public class QuadraticEquation {
    private int a;
    private int b;
    private int c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    private int getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    public void getRoot() {
        int delta = getDiscriminant();
        if (delta > 0) {
            double root1 = (-b + Math.pow(delta, 0.5)) / (2 * a);
            double root2 = (-b - Math.pow(delta, 0.5)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem la: " + root1 + " | " + root2);
        } else if (delta == 0) {
            double root1 = (-b/(2*a));
            System.out.println("Phuong trinh co 1 nghiem la: " + root1);
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }

    }
}
