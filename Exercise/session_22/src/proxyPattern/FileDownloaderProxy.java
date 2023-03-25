package proxyPattern;


public class FileDownloaderProxy implements Downloader{

    @Override
    public void download(String url, String userAgent ) {
        new FileDownloader().download(url, userAgent);
    }
}
