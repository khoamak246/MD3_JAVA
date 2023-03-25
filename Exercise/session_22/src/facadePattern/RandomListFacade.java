package facadePattern;

public class RandomListFacade {
    public void printRandomEvenList(int size, int min, int max){
        new ListPrinter().printList(new ListFilter().filterOdd(new RandomList().generateList(size, min, max)));
    }
}
