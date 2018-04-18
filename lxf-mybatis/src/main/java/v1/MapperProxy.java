package v1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class MapperProxy implements InvocationHandler {
    private Sqlsession sqlsession;

    public MapperProxy(Sqlsession sqlsession) {
        this.sqlsession = sqlsession;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String className = method.getDeclaringClass().getName();
        if (className.equals("v1.TestMapper")) {
            List list = new ArrayList<String>();
            list.add("调用 TestMapper");
            return list;
        } else if (className.equals("v1.TestMapper2")) {
            List list = new ArrayList<String>();
            list.add("调用 TestMapper2");
            return list;
        }
        return method.invoke(this, args);
    }
}
