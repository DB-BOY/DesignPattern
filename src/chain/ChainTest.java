package chain;

import chain.leaveflow.*;

/**
 * 测试类
 * Created by DB_BOY on 2019/3/22.
 */
public class ChainTest {
    public static void main(String[] args) {
        System.out.println("=======模拟请假流程=======");
        AbstractLeader worker = new Worker();
        AbstractLeader first = new FirstLevelLeader();
        AbstractLeader second = new SecondLevelLeader();
        AbstractLeader boss = new BossLeader();
        worker.nextLeader = first;
        first.nextLeader = second;
        second.nextLeader = boss;

        worker.askLeave(0);
        worker.askLeave(1);
        worker.askLeave(5);
        worker.askLeave(20);
        worker.askLeave(220);

        System.out.println("=======屏蔽关键字=======");

    }
}
