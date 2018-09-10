package single;

/**
 * 双重锁校验
 * Created by DB_BOY on 2018/9/8.
 *
 * 双重检查锁定背后的理论是完美的。不幸地是，现实完全不同。双重检查锁定的问题是：并不能保证它会在单处理器或多处理器计算机上顺利运行。
 * 双重检查锁定失败的问题并不归咎于 JVM 中的实现 bug，而是归咎于 Java 平台内存模型。内存模型允许所谓的“无序写入”，这也是这些习语失败的一个主要原因。
 */
public class LockSingleton {
    private volatile static LockSingleton singleton;
    private LockSingleton(){}
    public static LockSingleton getSingleton(){
        if(singleton==null){
            synchronized (LockSingleton.class){
                if(singleton==null){
                    singleton = new LockSingleton();
                }
            }
        }
        return singleton;
    }
}
