package adapterPattern;

import java.util.Set;

public class Client {
    private final ICollectionOperations collectionOperations;

    public Client(ICollectionOperations collectionOperations) {
        this.collectionOperations = collectionOperations;
    }

    public void printMaxValue(Set<Integer> numbers){
        int max = collectionOperations.findMax(numbers);
        System.out.println("Max value is: " + max);
    }
}
