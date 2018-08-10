package com.lxf.rpc;

import java.io.Serializable;

/**
 * @author created by LXF on 2018/6/4 15:51
 */
public class RpcRequest implements Serializable {
    private static final long serialVersionUID = -9100893052391757993L;
    private String className;
    private String methodName;
    private Object[] parameters;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParameters() {
        return parameters;
    }

    public void setParameters(Object[] parameters) {
        this.parameters = parameters;
    }
}
