package adapterPattern;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(4);
        integerSet.add(2);
        ICollectionOperations collectionOperations = new CollectionUtilsAdapter();
        Client client = new Client(collectionOperations);
        client.printMaxValue(integerSet);
    }
}
