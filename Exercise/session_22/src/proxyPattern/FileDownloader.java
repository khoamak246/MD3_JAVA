package proxyPattern;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;


public class FileDownloader implements Downloader{
    public URLConnection URLConnection;
    private static final int BUFFER_SIZE = 4096;

    @Override
    public void download(String url, String userAgent) {
        try {
            URLConnection = new URL(url).openConnection();
            URLConnection.setRequestProperty("User-Agent", userAgent);
            InputStream ips = URLConnection.getInputStream();
            FileOutputStream outputStream = new FileOutputStream("src/proxyPattern/sample.txt");
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead = -1;
            while ((bytesRead = ips.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            outputStream.close();
            ips.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
