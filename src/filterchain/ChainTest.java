package filterchain;

import filterchain.leaveflow.*;
import filterchain.okchain.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试类
 * Created by DB_BOY on 2019/3/22.
 */
public class ChainTest {
    public static void main(String[] args) {
        System.out.println("=======模拟请假流程=======");
        /*
         * 这种操作适用层级比较少的，每层都需要直接指明下一集领导。不够灵活
         */
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

        System.out.println();
        System.out.println("=======okhttp中使用的责任链形式=======");
        /*
         * okhttp中使用的责任链形式
         *
         */
        List<Interceptor> interceptors = new ArrayList<>();
        interceptors.add(new RetryAndFollowInterceptor());
        interceptors.add(new BridgeInterceptor());
        interceptors.add(new CacheInterceptor());
        interceptors.add(new ConnectInterceptor());
        interceptors.add(new NetworkInterceptor());
        interceptors.add(new CallServerInterceptor());

        Request request = new Request();
        request.req = "Base Request";
        System.out.println("开始请求： " + request.req);
        Interceptor.Chain chain = new RealInterceptorChain(interceptors, 0, request);
        String ss;
        try {
            ss = chain.proceed(request).res;
        } catch (Exception e) {
            e.printStackTrace();
            ss = "";
        }
        System.out.println("------------------");
        System.out.println("请求结束后结果: " + ss);

    }
}
