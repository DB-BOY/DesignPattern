package filterchain.okchain;

/**
 * 做网络失败重连，但是并不是所有的请求都需要重连，根据响应码。<br>
 * MAX_FOLLOW_UPS=20最大重连次数<br>
 * 在intercept方法中创建了StreamAllocation对象，并调用chain.proceed方法，执行下一个拦截器，对request进行处理，并返回response。
 * <br>
 * Created by DB_BOY on 2019/3/22.
 */
public class RetryAndFollowInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws Exception {
        RealInterceptorChain realChain = (RealInterceptorChain) chain;
        Request request = chain.request();
        request.req += "\n\t加 retry 信息";
        System.out.println("RetryInterceptor 执行后" + request.req);
        Response response = new Response();
        response.res = request.req;
        return realChain.proceed(request);
    }
}
