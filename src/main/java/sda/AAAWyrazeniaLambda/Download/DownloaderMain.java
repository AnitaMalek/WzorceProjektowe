package sda.AAAWyrazeniaLambda.Download;

public class DownloaderMain {

    public static void main(String[] args) {
        downloadFile(new Downloader() {
            @Override
            public void download(String file) {
                System.out.println("załaduj plik");
            }
        });
        downloadFile((String file)-> {
            System.out.println("załaduj plik");
        });

    }

    public static void downloadFile(Downloader downloader){
        downloader.download("plik1");
    }
}
