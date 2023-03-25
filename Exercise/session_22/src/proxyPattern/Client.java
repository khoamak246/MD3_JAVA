package proxyPattern;

import java.util.Scanner;

public class Client {
    private static final String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.88 Safari/537.36";
    public static void main(String[] args) {
        // test link: https://filesamples.com/samples/document/txt/sample3.txt
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap link: ");
        String url = sc.nextLine();
        new FileDownloaderProxy().download(url, userAgent);
    }
}
