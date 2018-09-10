package single;

/**
 * 静态内部类
 * 优点： 加载时不会初始化静态变量，懒加载
 * Created by DB_BOY on 2018/9/8.
 */
public class InternalSingleton {
    private static class SingletonHolder{
        private final static InternalSingleton INSTANCE = new InternalSingleton();
    }
    private InternalSingleton(){}
    public static InternalSingleton getSingleton(){
        return SingletonHolder.INSTANCE;
    }
}
