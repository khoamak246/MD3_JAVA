package copyFileText;

import java.io.*;
import java.nio.channels.FileChannel;

public class Main {
    public static void main(String[] args) {
        File sourceFile = new File("src/copyFileText/source.txt");
        File destFile = new File("src/copyFileText/dest.txt");
        try {
            if (!sourceFile.exists() || !destFile.exists()) {
                System.out.println("Khong ton tai file!");
            } else {
                System.out.println("File da duoc lien ket!");
            }
            FileWriter writer = new FileWriter(sourceFile);
            String testString = "Hello";
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < testString.length(); i++) {
                sb.append(testString.charAt(i));
                writer.write(sb + "\n");
            }
            writer.close();
            CopyFile(sourceFile, destFile);
        } catch (Exception e) {
            System.err.println("OOP! co loi xay ra: " + e.getMessage());
        }
    }

    public static void CopyFile(File source, File destFile) throws Exception {
        try {
            InputStream sourceChannel = new FileInputStream(source);
            OutputStream destChannel = new FileOutputStream(destFile);
            byte[] buffer = new byte[1024];
            int length;
            int maxLength = 0;
            while ((length = sourceChannel.read(buffer)) > 0) {
                destChannel.write(buffer, 0, length);
            }
            String line;
            BufferedReader reader = new BufferedReader(new FileReader(source));
            while ((line = reader.readLine()) != null){
                maxLength += line.length();
            }
            sourceChannel.close();
            destChannel.close();
            System.out.println("Tong do dai la: " + maxLength);
        } catch (Exception e) {
            throw new Exception("Co loi xay ra khi copy!");
        }
    }
}
