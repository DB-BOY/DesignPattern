package filterchain.okchain;

import java.util.List;

/**
 * 实际的拦截器链，将所有拦截器向下执行<br>
 * Created by DB_BOY on 2019/3/22.
 */
public final class RealInterceptorChain implements Interceptor.Chain {

    private final List<Interceptor> interceptors;
    private final int index;
    private final Request request;

    public RealInterceptorChain(List<Interceptor> interceptors, int index, Request request) {
        this.index = index;
        this.interceptors = interceptors;
        this.request = request;
    }

    @Override
    public Response proceed(Request request) throws Exception {
        if (index >= interceptors.size()) throw new Exception("xxxx");

        // 调用下一个
        RealInterceptorChain next = new RealInterceptorChain(interceptors, index + 1, request);
        Interceptor interceptor = interceptors.get(index);
        Response response = interceptor.intercept(next);
        return response;
    }

    @Override
    public Request request() {
        return request;
    }
}
