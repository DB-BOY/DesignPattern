package filterchain.okchain;

/**
 * 网络请求拦截器，加入网络请求相关信息<br>
 * 使用之前创建好的StreamAllocation，初始化httpcodec，realConnection。<br>
 * 内部使用了类似gc标记清理算法，对无用的connection进行标记，StramAlloction渐渐变成0，<br>
 * 线程池检测并回收，保证多个健康的keep-alive链接<br>
 * Created by DB_BOY on 2019/3/22.
 */
public class ConnectInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws Exception {
        RealInterceptorChain realChain = (RealInterceptorChain) chain;
        Request request = chain.request();
        request.req += "\n\t加 connect信息";
        System.out.println("ConnectInterceptor 执行后" + request.req);
        Response response = new Response();
        response.res = request.req;
        return realChain.proceed(request);
    }
}
