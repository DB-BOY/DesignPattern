package filterchain.okchain;


/**
 * 缓存拦截器，负责加入缓存信息<br>
 * Created by DB_BOY on 2019/3/22.
 */
public class CacheInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws Exception {
        RealInterceptorChain realChain = (RealInterceptorChain) chain;
        Request request = chain.request();
        request.req += "\n\t加 cache 信息";
        System.out.println("CacheInterceptor执行后： " + request.req);

        return realChain.proceed(request);
    }
}
