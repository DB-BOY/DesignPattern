1. RetryAndFollowUpInterceptor
    >做网络失败重连，但是并不是所有的请求都需要重连，根据响应码。MAX_FOLLOW_UPS=20最大重连次数
     在intercept方法中创建了StreamAllocation对象，并调用chain.proceed方法，执行下一个拦截器，对request进行处理，并返回response。

2. BridgeInterceptor
    >初始化信息，添加请求头等，例如gzip，keep-alive，返回的response进行解压

3. CacheInterceptor
    >内部有Cache类，处理缓存操作，intercache内部类，disklrucache算法等
      重点是不缓存非get的请求。
      CacheStrategy缓存策略类，通过工厂模式获取

4. ConnectionInterceptor(建议重点阅读源码)
    >建立链接，使用之前创建好的StreamAllocation，初始化httpcodec，realConnection。内部使用了类似gc标记清理算法，对无用的connection进行标记，StramAlloction渐渐变成0，线程池检测并回收，保证多个健康的keep-alive链接
   
5. CallServerInterceptor
    >发起真正的网络请求，解析返回的数据
     http写入网络IO流，从网络IO流中读取返回给客户端的数据。
 
6. Network Interceptors
    >Application interceptors & Network Interceptors区别查看相关资料
     [okhttp wiki](https://github.com/square/okhttp/wiki/Interceptors)
