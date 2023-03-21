package postorderBST;

public interface Tree<E> {
    boolean insert(E e);

    void postorder();

    int getSize();
    
}
