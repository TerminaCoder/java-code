package com.lxf.rpc;

public class ServerDemo {
    public static void main(String[] args) {
        IUser iUser = new IUserImpl();
        RpcServer rpcServer = new RpcServer();
        rpcServer.publisher(iUser, 8888);
    }
}
