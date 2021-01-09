package creationalDesignPattern.Singleton;

/**
 * not thread safe
 */
public class DownloaderNotThreadSafe {

    //eager version, make that instantiation whenever we create that class
    private static DownloaderNotThreadSafe downloader = new DownloaderNotThreadSafe();

    private DownloaderNotThreadSafe() {
    }

    public static DownloaderNotThreadSafe getInstance() {
/**
 * eager version:
 *         return Downloader.downloader;
 *
 */

        // lazy version, create downloader, instantiate when it's needed
        if (downloader == null) {
            downloader = new DownloaderNotThreadSafe();
        }
        return DownloaderNotThreadSafe.downloader;
    }

    public void startDownloading() {
        System.out.println("downloading");
    }


}
