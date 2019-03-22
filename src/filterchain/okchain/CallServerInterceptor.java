package filterchain.okchain;

/**
 * 发起真正的网络请求，解析返回的数据<br>
 * http写入网络IO流，从网络IO流中读取返回给客户端的数据。
 * <p>
 * <br>
 * Created by DB_BOY on 2019/3/22.
 */
public class CallServerInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws Exception {
        Request request = chain.request();
        request.req += "\n\t加 CallServer 信息";
        System.out.println("CallServerInterceptor 执行后: " + request.req);

        //最后一次加入信息，将结果作为Response模拟返回，
        //不用继续调用chain.proceed(request);
        Response response = new Response();
        response.res = request.req.replaceAll("加", "->")//
                .replaceAll("信息", "")//
                .replaceAll("\n\t", "")//
                .replaceAll(" ", "");
        return response;
    }
}
