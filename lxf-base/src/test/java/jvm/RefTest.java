package jvm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RefTest {
    public static void main(String[] args) {
        List<String> aList = new ArrayList<>();
        final int[] a = {0};
        int b = 0;
        Test2 test2 = RefTest.newInstance(Test2.class);
        RefTest refTest = RefTest.newInstance(RefTest.class);
        refTest.getData(aList);
        List<String> collect = aList.stream().map(s -> s = "55555").collect(Collectors.toList());
        collect.stream().forEach(System.out::println);
        for (String s : aList) {
            if (s.equals("w")) {
                test2.setS(s);
                a[0] = 2;
            } else {
                refTest.getData(s);
                a[0] = 4;
            }
        }
    }

    private static <T> T newInstance(Class<T> clz) {
        T t = null;
        try {
            t = clz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    private void getData(final List<String> a) {
        a.add("d");
    }

    private void getData(int b) {
        b = 2;
        System.out.println(b);
    }

    private void getData(String s) {
        System.out.println("d" + s);
    }
}
