package chain.leaveflow;

/**
 * 直接一级领导
 * Created by DB_BOY on 2019/3/22.
 */
public class BossLeader extends AbstractLeader {
    @Override
    public int getLimit() {
        return 30;
    }

    @Override
    public void handle(int leaveDay) {
        System.out.println("请求休假：" + leaveDay + " , " + getLimit() + " 内假期，boss领导批复");
    }
}
