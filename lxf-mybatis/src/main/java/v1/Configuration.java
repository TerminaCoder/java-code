package v1;

import java.lang.reflect.Proxy;

public class Configuration {
    public <T> T getMapper(Class<T> clazz, Sqlsession sqlsession) {
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class<?>[]{clazz},
                new MapperProxy(sqlsession));
    }
}
