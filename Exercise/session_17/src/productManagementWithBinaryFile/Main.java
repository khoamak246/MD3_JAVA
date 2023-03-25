package productManagementWithBinaryFile;

import java.awt.image.TileObserver;
import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static LinkedList<Product> product = new LinkedList<>();
    public static final String PATH = "src/productManagementWithBinaryFile/product.txt";

    public static void main(String[] args) {

        try {
            System.out.print("Input number product: ");
            int numberProduct = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < numberProduct; i++) {
                System.out.print("Input product name: ");
                String name = sc.nextLine();
                System.out.print("Input brand: ");
                String brand = sc.nextLine();
                System.out.print("Input price: ");
                float price = Float.parseFloat(sc.nextLine());
                System.out.print("Input descriptions: ");
                String descriptions = sc.nextLine();
                product.add(new Product(name, brand, price, descriptions));
            }
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }
        for (Product p : product) {
            System.out.println(p);
        }
        addProductToFile(PATH, product);
        System.out.print("Input name to search Product: ");
        String inputSearchName = sc.nextLine();
        Product searchResult = searchProductFromFile(PATH, inputSearchName);
        System.out.println("Search Result: " + searchResult);
    }

    public static Product searchProductFromFile(String path, String name) {
        LinkedList<Product> product;
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            product = (LinkedList<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        for (Product p : product) {
            if (p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }

    public static void addProductToFile(String path, LinkedList<Product> product) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(product);
            oos.close();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
