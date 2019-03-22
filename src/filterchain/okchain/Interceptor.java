package filterchain.okchain;

/**
 * Created by gin on 2019/3/22.
 */
public interface Interceptor {
    Response intercept(Chain chain) throws Exception;

    interface Chain {
        Response proceed(Request request) throws Exception;

        Request request();
    }

}
