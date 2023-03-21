package TreeNode;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }

    public BST(E[] objects) {
        for (E object : objects) insert(object);
    }

    @Override
    public boolean insert(E e) {
        if (root == null)
            root = createNewNode(e);
        else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
//                    System.out.println("left Parent: " + parent);
//                    System.out.println("left current: " + current);
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
//                    System.out.println("Right Parent: " + parent);
//                    System.out.println("Right current: " + current);
                } else
                    return false;
            }
            if (e.compareTo(parent.element) < 0) {
//                System.out.println("left before Parent: " + parent);
                parent.left = createNewNode(e);
//                System.out.println("left after Parent: " + parent);
            }else {
//                System.out.println("Right before Parent: " + parent);
                parent.right = createNewNode(e);
//                System.out.println("Right after Parent: " + parent);
            }
        }
        size++;
        return true;
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }

    @Override
    public String toString() {
        return "BST{" +
                "root=" + root +
                ", size=" + size +
                "} " + super.toString();
    }
}
