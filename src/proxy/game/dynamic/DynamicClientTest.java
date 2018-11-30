package proxy.game.dynamic;

import proxy.game.GamePlayer;
import proxy.game.IGamePlayer;

import java.lang.reflect.Proxy;

/**
 * Created by DB_BOY on 2018/11/30.
 */
public class DynamicClientTest {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("Dynamic");
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(player);
        //代理对象
        IGamePlayer proxyClass = (IGamePlayer) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{IGamePlayer.class}, myInvocationHandler);

        proxyClass.login("dbboy","db_boy");

        proxyClass.killBoss();
        proxyClass.upgrade();
    }
}
