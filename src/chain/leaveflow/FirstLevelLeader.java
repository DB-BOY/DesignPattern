package chain.leaveflow;

/**
 * 直接一级领导
 * Created by DB_BOY on 2019/3/22.
 */
public class FirstLevelLeader extends AbstractLeader {
    @Override
    public int getLimit() {
        return 3;
    }

    @Override
    public void handle(int leaveDay) {
        System.out.println("请求休假：" + leaveDay + " , " + getLimit() + " 内假期，直接领导批复");
    }
}
