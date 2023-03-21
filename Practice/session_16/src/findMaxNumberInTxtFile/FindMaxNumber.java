package findMaxNumberInTxtFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;

public class FindMaxNumber {
    public static void main(String[] args) {
        File file = new File("src/findMaxNumberInTxtFile/maxNumber.txt");
        try {
            FileWriter writer = new FileWriter(file);
            for (int i = 0; i < 20; i++) {
                writer.write(new Random().nextInt(100) + "\n");
            }
            writer.close();
            findMax(file);
        } catch (Exception e) {
            System.err.println("OOP! co loi xay ra: " + e.getMessage());
        }
    }

    public static void findMax(File file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            LinkedList<Integer> listNumberInFile = new LinkedList<>();
            while (reader.readLine() != null) {
                listNumberInFile.add(Integer.parseInt(reader.readLine()));
            }

            System.out.println("Gia tri lon nhat la: " + listNumberInFile.stream().max(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1.compareTo(o2);
                }
            }).get());
        } catch (Exception e) {
            System.err.println("OOP! co loi xay ra: " + e.getMessage());
        }
    }
}
