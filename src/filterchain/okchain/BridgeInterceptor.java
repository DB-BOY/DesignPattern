package filterchain.okchain;

/**
 * 初始化信息，添加请求头等，例如gzip，keep-alive，返回的response进行解压<br>
 * <p>
 * Created by DB_BOY on 2019/3/22.
 */
public class BridgeInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws Exception {
        RealInterceptorChain realChain = (RealInterceptorChain) chain;
        Request request = chain.request();
        request.req += "\n\t加 network 信息";
        System.out.println("BridgeInterceptor : " + request.req);
        return realChain.proceed(request);
    }
}
