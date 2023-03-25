package adapterPattern;

import rikkei.academy.chinhnd.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CollectionUtilsAdapter implements ICollectionOperations{
    @Override
    public int findMax(Set<Integer> numbers) {
        CollectionUtils collectionUtils = new CollectionUtils();
        List<Integer> mainList = new ArrayList<>(numbers);
        return collectionUtils.findMax(mainList);
    }
}
