package preorderBST;


public class BST<E extends Comparable<E>> extends AbstractTreePreoder<E> {
    private TreeNode<E> root;
    private int size;

    private TreeNode<E> createNewNode(E e) {
        return new TreeNode<E>(e);
    }


    @Override
    public boolean insert(E e) {
        if (root == null) {
            root = createNewNode(e);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return false;
                }
            }
            if (e.compareTo(parent.element) < 0) {
                parent.left = createNewNode(e);
            } else {
                parent.right = createNewNode(e);
            }
        }
        size++;
        return true;
    }


    @Override
    public void preOrder() {
        preOrder(root);
    }

    @Override
    public int getSize() {
        return size;
    }

    private void preOrder(TreeNode<E> root) {
        if (root == null) return;
        System.out.println(root.element + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    @Override
    public String toString() {
        return "BST{" +
                "root=" + root +
                ", size=" + size +
                "} " + super.toString();
    }
}
