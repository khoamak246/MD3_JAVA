package collectionArrayList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myListTest = new MyList<>();
        myListTest.add(5);
        myListTest.add(6);
        System.out.println(myListTest.size());
        System.out.println(myListTest.get(0));
        System.out.println(myListTest.contains(5));
        System.out.println(myListTest);
        System.out.println(myListTest.indexOf(6));
        myListTest.remove(1);
        System.out.println(myListTest);
    }
}
