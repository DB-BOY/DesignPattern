package proxy.game;

public class GamePlayer implements IGamePlayer {

    private String name;

    public GamePlayer(String _name) {
        this.name = _name;
    }

    public void killBoss() {
        System.out.println("--"+this.name + " 在打Boss！");
    }

    /**
     * @param user
     * @param password
     */
    public void login(String user, String password) {
        System.out.println("登录: " + user + " 用户 --- 用户名: " + this.name + " 登录成功！");
    }

    public void upgrade() {
        System.out.println("--"+this.name + " 升一级了！");

    }

}