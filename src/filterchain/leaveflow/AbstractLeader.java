package filterchain.leaveflow;

/**
 * 抽象领导类
 * Created by DB_BOY on 2019/3/22.
 */
public abstract class AbstractLeader {
    //方便模拟, 设置为public
    public AbstractLeader nextLeader;

    /**
     * 防止子类继承修改方法
     *
     * @param leave ask leave days
     */
    public final void askLeave(int leave) {
        if (leave <= getLimit()) {
            handle(leave);
        } else {
            if (nextLeader != null) {
                nextLeader.askLeave(leave);
            } else {
                System.out.println(leave + "想休息这么久，不如离职吧！");
            }
        }
    }

    public abstract int getLimit();

    public abstract void handle(int leaveDay);
}
