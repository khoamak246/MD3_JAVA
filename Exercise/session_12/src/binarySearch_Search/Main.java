package binarySearch_Search;

public class Main {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");

        System.out.println("Inorder (sorted): ");
        System.out.println("The number of nodes is: " + tree.getSize());
        System.out.println(tree.search("Adam"));
    }
}
