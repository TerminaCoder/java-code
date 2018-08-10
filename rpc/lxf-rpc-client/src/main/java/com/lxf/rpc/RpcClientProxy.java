package com.lxf.rpc;

import java.lang.reflect.Proxy;

/**
 * @author created by LXF on 2018/6/4 15:34
 */
public class RpcClientProxy {

    public <T> T clientProxy(final Class<IUser> clz, final String host, final int port) {
        return (T) Proxy.newProxyInstance(clz.getClassLoader(), new Class[]{clz}, new RemoteInvocationHandler(host, port));
    }
}
