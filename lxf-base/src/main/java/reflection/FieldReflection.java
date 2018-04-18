package reflection;

import com.sun.org.apache.bcel.internal.generic.LSTORE;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FieldReflection {
    // final 反射也修改不了
    private String s = "d";
    private int b = 2;
    private ArrayList<String> list = new ArrayList();

    @Override
    public String toString() {
        return "FieldReflection{" +
                "s='" + s + '\'' +
                ", b=" + b +
                ", list=" + list +
                '}';
    }

    public static void main(String[] args) throws Exception {
        FieldReflection fieldReflection = new FieldReflection();
        System.out.println(fieldReflection);
        System.out.println("反射后的值");
        Class<?> clazz = fieldReflection.getClass();
        Field fields[] = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("字段名称 " + field.getName());
            System.out.println("字段类型 " + field.getType());
            System.out.println("=========分隔符============");
        }

        Field field = clazz.getDeclaredField("s");
        field.set(fieldReflection, "lxf修改了");

        Field field1 = clazz.getDeclaredField("list");
        List<String> list2 = new ArrayList<>();
        list2.add(1 + "");
        field1.set(fieldReflection, list2);
        System.out.println(fieldReflection);
//        System.out.println(Arrays.toString(field1.getType().getTypeParameters()));
    }
}
