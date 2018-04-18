package reflection;

import java.lang.reflect.Method;
import java.util.Arrays;

public class MethodReflection {

    public <T> T getInt(Class<T> t) throws Exception {
        return t.newInstance();
    }

    public <T> T getInt2(Class<T> t) throws Exception {
        return t.newInstance();
    }

    public int getInt3(int t) {
        return t;
    }

    public void testInvoke(int i) {
        System.out.println("测试invoke");
    }

    public static void main(String[] args) throws Exception {
        Class<?> clazz = MethodReflection.class;
        Method methods[] = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("方法名称" + method.getName());
            System.out.println("返回类型" + method.getReturnType());
            System.out.println("参数列表" + Arrays.toString(method.getParameterTypes()));
            System.out.println("异常类型" + Arrays.toString(method.getExceptionTypes()));
            System.out.println("============分隔符============");
        }

        Method method = clazz.getDeclaredMethod("testInvoke", int.class);
        System.out.println("method " + method.getName());
        method.invoke(new MethodReflection(), 1);

    }
}
