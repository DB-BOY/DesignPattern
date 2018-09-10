package single;

/**
 * 恶汉式
 * 没有达到懒加载的效果
 * Created by DB_BOY on 2018/9/8.
 */
public class HungrySingleton {
    private HungrySingleton() {

    }

    private static HungrySingleton singleton = new HungrySingleton();

    public static HungrySingleton getSingleton() {
        return singleton;
    }
}
