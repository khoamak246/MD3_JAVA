package preorderBST;

public interface TreePreoder<E> {
    boolean insert(E element);

    void preOrder();

    int getSize();
}
