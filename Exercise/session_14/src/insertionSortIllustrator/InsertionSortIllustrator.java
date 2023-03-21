package insertionSortIllustrator;

import java.util.Arrays;

public class InsertionSortIllustrator {
    static int[] list = {1, 9, 4, 6, 5, -4};

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            System.out.println("Current element: " + list[i]);
            int k;
            for ( k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                System.out.println(list[k] + " > " + currentElement);
                System.out.println("begin swap " + list[k + 1] + " and " + list[k]);
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
            System.out.println("Arr after " + i + " sort" + Arrays.toString(list));
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
