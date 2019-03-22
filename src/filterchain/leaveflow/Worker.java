package filterchain.leaveflow;

/**
 * 普通员工
 * Created by DB_BOY on 2019/3/22.
 */
public class Worker extends AbstractLeader {
    @Override
    public int getLimit() {
        return 0;
    }

    @Override
    public void handle(int leaveDay) {
        System.out.println("努力工作，自己没有任何权限！");
    }
}
