package proxy.game;

import java.util.Date;

/**
 * Created by DB_BOY on 2018/9/7.
 */
public class ClientTest {
    public static void main(String[] args) {
        //定义一个痴迷的玩家
        IGamePlayer player = new GamePlayer("DB_BOY");
        //开始打游戏，记下时间
        System.out.println("开始游戏: " + new Date());
        player.login("db_boy", "db_boy");
        //开始杀怪
        player.killBoss();
        //升级
        player.upgrade();
        //记录结束游戏时间
        System.out.println("结束游戏: " + new Date());


        //
        //代理模式

        IGamePlayer proxy = new GameProxy(player);

        System.out.println("***************************************");
        System.out.println("****************代理模式****************");
        System.out.println("***************************************");
        System.out.println("开始游戏: " + new Date());
        proxy.login("db_boy", "db_boy");
        //开始杀怪
        proxy.killBoss();
        //升级
        player.upgrade();
        //记录结束游戏时间
        System.out.println("结束游戏: " + new Date());
    }
}
