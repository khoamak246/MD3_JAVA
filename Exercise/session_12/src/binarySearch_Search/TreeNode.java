package binarySearch_Search;

public class TreeNode<E> {
    public E element;
    public TreeNode<E> left;
    public TreeNode<E> right;

    public TreeNode(E element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "element=" + element +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
