package readBinaryFile;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input source: ");
        String source = sc.nextLine();
        System.out.print("Input target: ");
        String target = sc.nextLine();
        File src = new File(source);
        File des = new File(target);
        copyFile(src, des);
    }

    public static void copyFile(File src, File des){
        try {
            InputStream is = new FileInputStream(src);
            OutputStream os = new FileOutputStream(des);
            byte[] buf = new byte[1024];
            int length;
            while ((length = is.read(buf)) > 0) {
                os.write(buf, 0, length);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
