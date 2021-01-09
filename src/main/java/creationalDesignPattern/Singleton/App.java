package creationalDesignPattern.Singleton;

/**
 * restricts the instantiation of a class to 1 object
 * useful when only 1 object is needed to coordinate actions across system
 *
 */
public class App {
    public static void main(String[] args) {
        DownloaderNotThreadSafe d = DownloaderNotThreadSafe.getInstance();
        DownloaderNotThreadSafe d2 = DownloaderNotThreadSafe.getInstance();
        if (d == d2){
            System.out.println("same");
        }


        /**
         * best practice: thread safe :)
         * the enum can't be instantiated
         */
        SingletonClass.INSTANCE.setCounter(4);
        System.out.println(SingletonClass.INSTANCE.getCounter());
    }
}
