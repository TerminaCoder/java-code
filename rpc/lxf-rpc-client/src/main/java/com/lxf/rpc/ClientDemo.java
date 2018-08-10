package com.lxf.rpc;

/**
 * @author created by LXF on 2018/6/4 16:13
 */
public class ClientDemo {
    public static void main(String[] args) {
        RpcClientProxy rpcClientProxy = new RpcClientProxy();
        IUser iUser = rpcClientProxy.clientProxy(IUser.class, "localhost", 8888);
        System.out.println(iUser.getStaffName("lxf"));
    }
}
