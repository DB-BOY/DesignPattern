package filterchain.okchain;

/**
 * 处理网络相关
 * Network Interceptors
 *
 * Registering a network interceptor is quite similar. Call addNetworkInterceptor() instead of addInterceptor():
 *
 * Created by DB_BOY on 2019/3/22.
 */
public class NetworkInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws Exception {
        RealInterceptorChain realChain = (RealInterceptorChain) chain;
        Request request = chain.request();
        request.req += "\n\t加 network 信息";
        System.out.println("NetworkInterceptor执行后: " + request.req);
        Response response = new Response();
        response.res = request.req;
        return realChain.proceed(request);
    }
}
