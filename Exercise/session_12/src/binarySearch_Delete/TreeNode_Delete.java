package binarySearch_Delete;

public class TreeNode_Delete<E> {
    public E element;
    public TreeNode_Delete<E> left;
    public TreeNode_Delete<E> right;

    public TreeNode_Delete(E element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "TreeNode_Delete{" +
                "element=" + element +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
