package com.lxf.rpc;

/**
 * @author created by LXF on 2018/6/4 16:27
 */
public class IUserImpl implements IUser {
    @Override
    public String getStaffName(String userName) {
        return "hello " + userName;
    }
}
