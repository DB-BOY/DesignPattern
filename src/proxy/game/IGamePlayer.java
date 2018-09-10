package proxy.game;

/**
 * Created by DB_BOY on 2018/9/7.
 */
public interface IGamePlayer {

    /**
     * 进游戏之前你肯定要登录，这是一个必要条件
     * @param user
     * @param password
     */
    void login(String user,String password);
    void killBoss();
    void upgrade();

}
