package sumNumberInTxtFile;

import java.io.*;

public class ReadFileExample {
    public static void readFileText(File file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        File file = new File("src/sumNumberInTxtFile/numbers.txt");
        try {
            FileWriter writer = new FileWriter(file);
            for (int i = 0; i < 6; i++) {
                writer.write(i + "\n");
            }
            writer.close();
            readFileText(file);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

}
