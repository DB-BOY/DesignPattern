package single;

/**
 * 单例模式
 * 懒汉式，最常用的写法
 * Created by DB_BOY on 2018/9/8.
 */
public class LazySingleton {
    private LazySingleton() {
    }

    private static LazySingleton singleton;

    public static LazySingleton getSingleton() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
