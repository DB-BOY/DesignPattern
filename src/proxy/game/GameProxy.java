package proxy.game;

/**
 * Created by DB_BOY on 2018/9/7.
 */
public class GameProxy implements IGamePlayer {
    IGamePlayer proxy;

    public GameProxy(IGamePlayer proxy) {
        this.proxy = proxy;
    }

    @Override
    public void login(String user, String password) {
        proxy.login(user, password);
    }

    @Override
    public void killBoss() {
        proxy.killBoss();
    }

    @Override
    public void upgrade() {
        proxy.upgrade();
    }
}
