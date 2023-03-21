package practiceArrayListAndLinkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProductManager pm = new ProductManager();
        pm.addProduct();
        System.out.println("List hien tai: ");
        pm.display();
        pm.sortASC();
        pm.display();
        pm.sortDES();
        pm.display();


    }
}
