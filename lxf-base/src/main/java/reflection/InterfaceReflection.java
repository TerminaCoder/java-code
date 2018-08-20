package reflection;

import java.lang.reflect.Method;
import java.util.stream.Stream;

public interface InterfaceReflection {
    void getName(String name);

    static void main(String[] args) {
        Class<?> clazz = InterfaceReflection.class;
        try {
            Method[] methods = clazz.getDeclaredMethods();
            Stream.of(methods)
            .map(Method::getParameterTypes)
            .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
