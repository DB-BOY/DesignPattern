package proxy.game.dynamic;

import proxy.game.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by DB_BOY on 2018/11/30.
 */
public class MyInvocationHandler implements InvocationHandler {
    IGamePlayer player;

    public MyInvocationHandler(IGamePlayer player) {
        this.player = player;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        void login(String user,String password);
//        void killBoss();
//        void upgrade();
        if (method.getName().equals("login")) {
            System.out.println("调用登录: ");
        } else if (method.getName().equals("killBoss")) {
            System.out.println("调用打boss: ");
        } else {
            System.out.println("调用升级");
        }
        return method.invoke(player, args);
    }
}
