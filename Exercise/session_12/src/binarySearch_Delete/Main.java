package binarySearch_Delete;

public class Main {
    public static void main(String[] args) {
        BST<String> tree = new BST<String>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");

        System.out.println("Inorder (sorted): ");
        System.out.println("The number of nodes is: " + tree.getSize());
        System.out.println(tree);
        System.out.println(tree.delete("Michael"));
        System.out.println(tree);
    }
}
