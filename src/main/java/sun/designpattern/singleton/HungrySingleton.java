package sun.designpattern.singleton;

/**
 * @Author sun
 * @Data 2022/4/2 14:55
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
