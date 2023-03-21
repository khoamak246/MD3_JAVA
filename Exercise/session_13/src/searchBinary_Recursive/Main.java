package searchBinary_Recursive;

public class Main {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int result = searchBinaryByRecursive(list, 0, list.length - 1, 11);
        System.out.println(result);
    }

    public static int searchBinaryByRecursive(int[] list, int low, int high, int key) {
        int mid = (high + low)/2;
        if (high >= low){
            if (list[mid] > key){
               return searchBinaryByRecursive(list, low, mid - 1, 11);
            } else if (list[mid] == key) {
                return mid;
            } else {
                return searchBinaryByRecursive(list, mid + 1, high, 11);
            }
        }
        return -1;
    }
}
